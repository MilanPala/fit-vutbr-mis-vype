package vype12.tac;

import vype12.ste.SymbolTableElement;
import vype12.tac.TACElement;

/**
 *
 * @author Milan
 */
public class Mov extends TACElement {

	private SymbolTableElement where;
	private SymbolTableElement what;

	public Mov(SymbolTableElement where, SymbolTableElement what) {
		this.where = where;
		this.what = what;
	}

	@Override
	public String toString() {
		return "MOV " + where.getName() + " " + what.getName();
	}

}
