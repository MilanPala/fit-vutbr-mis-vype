/**
 * project: vype12
 * author: xpalam00
 */
package vype12;

/**
 *
 * @author xpalam00
 */
public class LexicalException extends RuntimeException {

	/**
	 * Creates a new instance of
	 * <code>SemanticException</code> without detail message.
	 */
	public LexicalException() {
	}

	/**
	 * Constructs an instance of
	 * <code>SemanticException</code> with the specified detail message.
	 *
	 * @param msg the detail message.
	 */
	public LexicalException(String msg) {
		super(msg);
	}
}
