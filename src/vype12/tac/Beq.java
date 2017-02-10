package vype12.tac;

import vype12.TACTable;
import vype12.ste.STEVariable;
import vype12.tac.TACElement;

/**
 *
 * @author Milan
 */
public class Beq extends TACElement {

	private STEVariable a;
	private STEVariable b;
	private String label;

	public Beq(STEVariable a, STEVariable b, String label) {
		this.a = a;
		this.b = b;
		this.label = label;
	}

	@Override
	public String toString() {
		return "BEQ " + a.getName() + " " + b.getName() + " " + this.label;
	}



}
