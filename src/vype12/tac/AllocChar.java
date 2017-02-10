package vype12.tac;

/**
 *
 * @author Milan
 */
public class AllocChar extends TACElement {

	private String variableName;

	public AllocChar(String name)
	{
		this.variableName = name;
	}

	@Override
	public String toString() {
		return "ALLOCCHAR " + variableName;
	}



}
