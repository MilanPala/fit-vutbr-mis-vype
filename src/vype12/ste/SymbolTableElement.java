/**
 * project: vype12
 * author: xpalam00
 */
package vype12.ste;

import vype12.DataTypes;

/**
 *
 * @author xpalam00
 */
abstract public class SymbolTableElement {

	abstract public String getName();
	abstract public String getValue();
	abstract public DataTypes getType();
	abstract public boolean find(String name);

}
