package vype12.tac;

import vype12.ste.STEVariable;

/**
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public class Print extends TACElement {

	private STEVariable a;

	public Print(STEVariable a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "PRINT " + a.getName();
	}



}
