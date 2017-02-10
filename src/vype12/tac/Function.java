package vype12.tac;

import vype12.DataTypes;
import vype12.SymbolTableLevel;
import vype12.ste.SymbolTableElement;

/**
 *
 * @author Milan
 */
public class Function extends TACElement {

	private String name;
	private SymbolTableLevel arguments;
	private DataTypes dataType;

	public Function(DataTypes dt, String name, SymbolTableLevel arguments)
	{
		this.name = name;
		this.arguments = arguments;
		this.dataType = dt;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("FUNCTION " + name + "["+ dataType +"]");
		for(SymbolTableElement el : this.arguments)
		{
			str.append(" ");
			str.append(el.getName());
			str.append("[");
			str.append(el.getType());
			str.append("]");
		}
		return str.toString();
	}



}
