/**
 * project: vype12
 * author: xpalam00
 */
package vype12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import vype12.ste.*;

/**
 * Hierarchic symbol table.
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public final class SymbolTable implements Iterable<SymbolTableLevel> {

	private static SymbolTable instance = new SymbolTable();
	private List<SymbolTableLevel> symbolTableStack;
	private STEFunction currentFunction;

	private SymbolTable() {
		this.symbolTableStack = new LinkedList<SymbolTableLevel>();
		this.symbolTableStack.add(new SymbolTableLevel());
	}

	/**
	 * Add variable to current level of symbol table
	 */
	public STEVariable addVariable(DataTypes dt, String name) {
		STEVariable v = new STEVariable(dt, this.symbolTableStack.size(), name);
		if( this.findDuplicate(name) ) {
			throw new SemanticException("Variable " + name + " has been already defined.");
		}
		this.symbolTableStack.get(0).add(v);
		return v;
	}

	public STEVariable addVariable(DataTypes dt) {
		STEVariable v = new STEVariable(dt, this.symbolTableStack.size());
		this.symbolTableStack.get(0).add(v);
		return v;
	}

	/**
	 * Create row for integer constant
	 *
	 * @param i
	 * @return STEVariable
	 */
	public STEVariable addInteger() {
		STEVariable v = new STEVariable(DataTypes.INT, this.symbolTableStack.size());
		this.symbolTableStack.get(0).add(v);
		return v;
	}

	/**
	 * Create row for string constant
	 *
	 * @param i
	 * @return STEVariable
	 */
	public STEVariable addString() {
		STEVariable v = new STEVariable(DataTypes.STRING, this.symbolTableStack.size());
		this.symbolTableStack.get(0).add(v);
		return v;
	}

	/**
	 * Create row for char constant
	 *
	 * @param i
	 * @return STEVariable
	 */
	public STEVariable addChar() {
		STEVariable v = new STEVariable(DataTypes.CHAR, this.symbolTableStack.size());
		this.symbolTableStack.get(0).add(v);
		return v;
	}

	/**
	 * Add function to symbol table. Top level has functions arguments.
	 *
	 * @param dataType
	 * @param name
	 * @return
	 */
	public STEFunction addFunctionDeclaration(DataTypes dataType, String name) {
		STEFunction f;
		SymbolTableLevel stl = this.popLevel();
		try {
			this.findFunctionAndReturn(name);
			throw new SemanticException("Function " + name + " has been already defined.");
		} catch (SymbolNotDeclaredException e) {
			f = new STEFunction(dataType, name, stl);
			this.symbolTableStack.get(0).add(f);
		}
		return f;
	}

	/**
	 * Add function to symbol table. Top level has functions arguments.
	 *
	 * @param dataType
	 * @param name
	 * @return
	 */
	public STEFunction addFunctionDefinition(DataTypes dataType, String name) {
		STEFunction f;
		SymbolTableLevel stl = this.popLevel();
		try {
			f = (STEFunction) this.findFunctionAndReturn(name);
			if (f.isDefined() == true) {
				throw new SemanticException("Function " + f.getName() + " has been already defined.");
			}
			f.setArguments(stl);
		} catch (SymbolNotDeclaredException e) {
			f = new STEFunction(dataType, name, stl);
			this.symbolTableStack.get(0).add(f);
		}
		this.currentFunction = f;
		this.pushLevel(f.getArguments());

		return f;
	}

	/**
	 * Create new symbol table on top of stack
	 */
	public void pushLevel() {
		this.symbolTableStack.add(0, new SymbolTableLevel());
	}

	/**
	 * Push symbol table on top of stack
	 */
	public void pushLevel(SymbolTableLevel stl) {
		this.symbolTableStack.add(0, stl);
	}

	/**
	 * Remove symbol table from top of stack
	 */
	public SymbolTableLevel popLevel() {
		return this.symbolTableStack.remove(0);
	}

	public boolean find(String name) {
		boolean finded = false;
		for (SymbolTableLevel stl : this.symbolTableStack) {
			finded = stl.find(name);

			if (finded == true) {
				break;
			}
		}
		return finded;
	}

	public SymbolTableElement findAndReturn(String name) throws SymbolNotDeclaredException {
		SymbolTableElement ste;
		for (SymbolTableLevel stl : this.symbolTableStack) {
			if ((ste = stl.findAndReturn(name)) != null) {
				return ste;
			}
		}
		throw new SymbolNotDeclaredException("Symbol " + name + " has not been defined.");
	}

	public STEFunction findFunctionAndReturn(String name) throws SymbolNotDeclaredException {
		SymbolTableElement ste;
		for (SymbolTableLevel stl : this.symbolTableStack) {
			if ((ste = stl.findAndReturn(name)) != null && ste instanceof STEFunction) {
				return (STEFunction) ste;
			}
		}
		throw new SymbolNotDeclaredException("Symbol " + name + " has not been defined.");
	}

	public static SymbolTable getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		String delimiter = "-------------------------------------------";

		str.append("Symbol table\n");
		str.append("+" + delimiter + "\n");
		for (SymbolTableLevel stl : this.symbolTableStack) {
			str.append(stl);
			str.append("+" + delimiter + "\n");
		}
		str.append("\n");

		return str.toString();
	}

	void addFunctionParam(STEFunction value, SymbolTableElement e) {
		value.addParam((STEVariable) e);
	}

	@Override
	public Iterator<SymbolTableLevel> iterator() {
		return this.symbolTableStack.iterator();
	}

	public STEFunction findLastFunction() {
		if(this.currentFunction != null) return this.currentFunction;
		throw new SemanticException("Any function was not defined.");
	}

	private boolean findDuplicate(String name) {
		return this.symbolTableStack.get(0).find(name);
	}

	public void clearCurrentFunction() {
		this.currentFunction = null;
	}
}
