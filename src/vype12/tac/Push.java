package vype12.tac;

import vype12.ste.STEVariable;

/**
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public class Push extends TACElement {

	private STEVariable a;

	public Push(STEVariable a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "PUSH " + a.getName();
	}



}
