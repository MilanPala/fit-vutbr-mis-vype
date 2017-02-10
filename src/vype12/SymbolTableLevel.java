/**
 * project: vype12
 * author: xpalam00
 */
package vype12;

import java.util.Iterator;
import java.util.LinkedList;
import vype12.ste.STEFunction;
import vype12.ste.SymbolTableElement;

/**
 * One level of symbol table
 * @author xpalam00
 */
/**
 * One level of symbol table. Contains data.
 */
public class SymbolTableLevel implements Iterable<SymbolTableElement> {

	private LinkedList<SymbolTableElement> symbolTable;

	public SymbolTableLevel() {
		this.symbolTable = new LinkedList<SymbolTableElement>();
	}

	public void add(SymbolTableElement ste) {
		symbolTable.add(ste);
	}

	public boolean find(String name) {
		boolean finded = false;
		for (SymbolTableElement ste : symbolTable) {
			finded = ste.find(name);
			if(finded == true) break;
		}
		return finded;
	}

	public SymbolTableElement findAndReturn(String name) {
		for (SymbolTableElement ste : symbolTable) {
			if (ste.find(name)) {
				return ste;
			}
		}
		return null;
	}

	public STEFunction findLastFunction() {
		for (SymbolTableElement ste : symbolTable) {
			if(ste instanceof STEFunction) return (STEFunction) ste;
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (SymbolTableElement ste : symbolTable) {
			str.append("| " + ste.getName() + "\n");
		}

		return str.toString();
	}

	@Override
	public Iterator<SymbolTableElement> iterator() {
		return this.symbolTable.listIterator(0);
	}

	public LinkedList<SymbolTableElement> getList()
	{
		return this.symbolTable;
	}
}
