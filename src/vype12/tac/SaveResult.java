package vype12.tac;

import vype12.ste.STEFunction;
import vype12.ste.STEVariable;

/**
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public class SaveResult extends TACElement {

	private STEVariable a;

	public SaveResult(STEVariable a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "SAVE_RESULT " + a.getName();
	}



}
