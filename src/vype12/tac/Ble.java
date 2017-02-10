package vype12.tac;

import vype12.ste.STEVariable;

/**
 *
 * @author Milan Pála <xpalam00@stud.fit.vutbr.cz>
 */
public class Ble extends TACElement {

	private STEVariable a;
	private STEVariable b;
	private String label;

	public Ble(STEVariable a, STEVariable b, String label) {
		this.a = a;
		this.b = b;
		this.label = label;
	}

	@Override
	public String toString() {
		return "BLE " + a.getName() + " " + b.getName() + " " + this.label;
	}



}
