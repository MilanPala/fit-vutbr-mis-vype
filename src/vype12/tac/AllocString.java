package vype12.tac;

import vype12.tac.TACElement;

/**
 *
 * @author Milan
 */
public class AllocString extends TACElement {

	private String variableName;

	public AllocString(String name)
	{
		this.variableName = name;
	}

	@Override
	public String toString() {
		return "ALLOCSTRING " + variableName;
	}



}
