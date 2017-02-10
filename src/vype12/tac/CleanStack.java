package vype12.tac;

import vype12.ste.STEFunction;
import vype12.ste.STEVariable;

/**
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public class CleanStack extends TACElement {

	private STEVariable a;

	public CleanStack(STEVariable a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "CLEAN_STACK " + a.getName();
	}



}
