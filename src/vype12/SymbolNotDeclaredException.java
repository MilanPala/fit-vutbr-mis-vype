/**
 * project: vype12
 * author: xpalam00
 */
package vype12;

/**
 *
 * @author xpalam00
 */
public class SymbolNotDeclaredException extends SemanticException {

	/**
	 * Creates a new instance of
	 * <code>SymbolNotDeclaredException</code> without detail message.
	 */
	public SymbolNotDeclaredException() {
	}

	/**
	 * Constructs an instance of
	 * <code>SymbolNotDeclaredException</code> with the specified detail
	 * message.
	 *
	 * @param msg the detail message.
	 */
	public SymbolNotDeclaredException(String msg) {
		super(msg);
	}
}
