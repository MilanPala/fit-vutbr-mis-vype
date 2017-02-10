package vype12.tac;

import vype12.ste.STEFunction;
import vype12.ste.STEVariable;

/**
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public class Call extends TACElement {

	private STEFunction a;

	public Call(STEFunction a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "CALL " + a.getName();
	}



}
