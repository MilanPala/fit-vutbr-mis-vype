package vype12.tac;

import vype12.ste.STEVariable;
import vype12.tac.TACElement;

/**
 *
 * @author Milan
 */
public class Label extends TACElement {

	private String label;

	public Label(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "LABEL " + label;
	}
}
