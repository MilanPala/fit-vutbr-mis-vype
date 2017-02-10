package vype12.tac;

import vype12.tac.TACElement;

/**
 *
 * @author Milan
 */
public class AllocInt extends TACElement {

	private String variableName;

	public AllocInt(String name)
	{
		this.variableName = name;
	}

	@Override
	public String toString() {
		return "ALLOCINT " + variableName;
	}



}
