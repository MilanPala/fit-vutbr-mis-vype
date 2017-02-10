/**
 * project: vype12
 * author: xpalam00
 */
package vype12;

/**
 *
 * @author xpalam00
 */
public class SemanticException extends RuntimeException {

	/**
	 * Creates a new instance of
	 * <code>SemanticException</code> without detail message.
	 */
	public SemanticException() {
	}

	/**
	 * Constructs an instance of
	 * <code>SemanticException</code> with the specified detail message.
	 *
	 * @param msg the detail message.
	 */
	public SemanticException(String msg) {
		super(msg);
	}
}
