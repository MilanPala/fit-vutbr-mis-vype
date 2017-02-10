/**
 * project: vype12
 * author: xpalam00
 */
package vype12.ste;

import vype12.*;

/**
 *
 * @author xpalam00
 */
public class STEFunction extends SymbolTableElement {

	private DataTypes dataType;
	private String name;
	private SymbolTableLevel arguments;
	private SymbolTableLevel callArguments;
	public int passed = 0;
	private boolean defined = false;

	public boolean isDefined() {
		return defined;
	}

	public void setDefined(boolean declared) {
		this.defined = declared;
	}

	public STEFunction(DataTypes dataType, String name, SymbolTableLevel stl) {
		this.dataType = dataType;
		this.name = name;
		this.arguments = stl;
		this.callArguments = new SymbolTableLevel();
	}

	public void setArguments(SymbolTableLevel stl) {
		if (stl.getList().size() != arguments.getList().size()) {
			throw new SemanticException("Arguments count in definition and in declaration is not same.");
		}

		for (int i = 0; i < stl.getList().size(); i++) {
			if (stl.getList().get(i).getType() != this.arguments.getList().get(i).getType()) {
				throw new SemanticException("Argument " + stl.getList().get(i).getName() + " of function " + this.getName() + " has been declared as " + this.arguments.getList().get(i).getType() + " and now is " + stl.getList().get(i).getType() + ".");
			}
		}
		this.arguments = stl;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getValue() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public SymbolTableLevel getArguments() {
		return this.arguments;
	}

	public SymbolTableLevel getParams() {
		return this.callArguments;
	}

	@Override
	public DataTypes getType() {
		return this.dataType;
	}

	@Override
	public boolean find(String name) {
		return this.name.equals(name);
	}

	public void addParam(STEVariable v) {
		try {
			STEVariable argument = (STEVariable) this.arguments.getList().get(this.passed++);

			if (argument.getType() != v.getType()) {
				throw new IncompatibleTypesException("Argument " + argument.getName() + " has type " + argument.getType() + " but passed " + v.getType() + ".");
			}

			this.callArguments.add(v);
		} catch (java.lang.IndexOutOfBoundsException e) {
			throw new SemanticException("Function " + v.getName() + " does not have so many params.");
		}
	}

	public void clearParams()
	{
		this.callArguments.getList().clear();
	}
}
