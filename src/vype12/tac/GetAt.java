package vype12.tac;

import vype12.ste.STEVariable;
import vype12.tac.TACElement;

/**
 *
 * @author Milan
 */
public class GetAt extends TACElement {

	private STEVariable a;
	private STEVariable b;
	private STEVariable c;

	public GetAt(STEVariable a, STEVariable b, STEVariable c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "GET_AT " + a.getName() + " " + b.getName() + " " + c.getName();
	}



}
