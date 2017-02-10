package vype12.tac;

import vype12.ste.STEVariable;

/**
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public class IntegerToChar extends TACElement {

	private STEVariable a;
	private STEVariable b;

	public IntegerToChar(STEVariable a, STEVariable b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "INT_TO_CHAR " + a.getName() + " " + b.getName();
	}



}
