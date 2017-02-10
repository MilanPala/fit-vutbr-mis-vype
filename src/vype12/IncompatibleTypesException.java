/**
 * project: vype12
 * author: xpalam00
 */
package vype12;

/**
 *
 * @author xpalam00
 */
public class IncompatibleTypesException extends SemanticException {

	/**
	 * Creates a new instance of
	 * <code>SymbolNotDeclaredException</code> without detail message.
	 */
	public IncompatibleTypesException() {
		super("Variables has bad data types.");
	}

	/**
	 * Constructs an instance of
	 * <code>SymbolNotDeclaredException</code> with the specified detail
	 * message.
	 *
	 * @param msg the detail message.
	 */
	public IncompatibleTypesException(String msg) {
		super(msg);
	}
}
