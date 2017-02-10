package vype12.ste;

import vype12.DataTypes;

/**
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public class STEVariable extends SymbolTableElement {

	private DataTypes type;
	private String name;
	private String value = "";
	private int level;

	private static int tempIterator = 0;

	public STEVariable(DataTypes dt, int level, String name) {
		this.type = dt;
		this.name = name;
		this.level = level;
	}

	public STEVariable(DataTypes dt, int level) {
		this.type = dt;
		this.name = "#tmpVar" + STEVariable.tempIterator++;
		this.level = level;
		if(dt == DataTypes.INT) {
			this.value = "0";
		}
	}

	@Override
	public String getName()
	{
		return this.name+this.level;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setValue(int value) {
		this.value = Integer.toString(value);
	}

	@Override
	public DataTypes getType() {
		return this.type;
	}

	@Override
	public boolean find(String name)
	{
		return this.name.equals(name);
	}

}
