package vype12;

/**
 *
 * @author Milan
 */
public class SyntaxException extends RuntimeException {

	/**
	 * Creates a new instance of
	 * <code>SemanticException</code> without detail message.
	 */
	public SyntaxException() {
	}

	/**
	 * Constructs an instance of
	 * <code>SemanticException</code> with the specified detail message.
	 *
	 * @param msg the detail message.
	 */
	public SyntaxException(String msg) {
		super(msg);
	}
}
