package vype12.tac;

import vype12.tac.TACElement;
import vype12.ste.SymbolTableElement;

/**
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public class Load extends TACElement {

	private SymbolTableElement where;
	private String what;

	public Load(SymbolTableElement where, int what) {
		this.where = where;
		this.what = Integer.toString(what);
	}

	public Load(SymbolTableElement where, String what) {
		this.where = where;
		this.what = what;
	}

	@Override
	public String toString() {
		return "LOAD " + where.getName() + " " + what;
	}
}
