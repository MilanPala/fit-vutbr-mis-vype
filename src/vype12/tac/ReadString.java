package vype12.tac;

import vype12.ste.STEVariable;
import vype12.tac.TACElement;

/**
 *
 * @author Milan
 */
public class ReadString extends TACElement {

	private STEVariable where;

	public ReadString(STEVariable c) {
		this.where = c;
	}

	@Override
	public String toString() {
		return "READ_STRING " + where.getName();
	}

}
