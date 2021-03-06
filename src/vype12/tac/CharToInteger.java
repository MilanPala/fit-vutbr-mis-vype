package vype12.tac;

import vype12.ste.STEVariable;

/**
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public class CharToInteger extends TACElement {

	private STEVariable a;
	private STEVariable b;

	public CharToInteger(STEVariable a, STEVariable b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "CHAR_TO_INT " + a.getName() + " " + b.getName();
	}



}
