package vype12.tac;

import vype12.ste.STEVariable;
import vype12.tac.TACElement;

/**
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public class Modulo extends TACElement {

	private STEVariable a;
	private STEVariable b;
	private STEVariable c;

	public Modulo(STEVariable a, STEVariable b, STEVariable c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "MOD " + a.getName() + " " + b.getName() + " " + c.getName();
	}



}
