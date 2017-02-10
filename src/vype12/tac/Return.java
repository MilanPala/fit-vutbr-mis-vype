package vype12.tac;

import vype12.ste.STEVariable;
import vype12.tac.TACElement;

/**
 *
 * @author Milan
 */
public class Return extends TACElement {

	private STEVariable a;

	public Return(STEVariable a) {
		this.a = a;
	}

	public Return() {
		this.a = null;
	}

	@Override
	public String toString() {
		if(this.a == null) return "RETURN";
		else return "RETURN " + a.getName();
	}



}
