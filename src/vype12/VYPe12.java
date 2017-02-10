/**
 * project: vype12
 * author: xpalam00
 */
package vype12;

import java.io.*;
import org.antlr.runtime.*;

/**
 *
 * @author xpalam00
 */
public class VYPe12 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		try {
			CharStream input = null;
			if (args.length == 0) {
				throw new OtherError("File name is not set.");
				//input = new ANTLRFileStream("c:/Users/Milan/Documents/VUT/VYPe/projekt/VYP01/tests/test_conditions/src.c");
			} else {
				input = new ANTLRFileStream(args[0]);
			}

			// Create lexical analysator
			Lexer lex = new VYPe12Lexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lex);

			// Create parser
			VYPe12Parser parser = new VYPe12Parser(tokens);
			parser.vype12(); // launch parsing

			ParserFactory.outputControls();

			//System.out.print(SymbolTable.getInstance());
			//System.out.print(TACTable.getInstance());

			// export instruction table to back-end
			System.out.print(TACTable.getInstance().export());

			System.exit(0);
		} catch (RecognitionException e) {
			System.exit(1);
		}
		catch(LexicalException e)
		{
			System.err.println(e.getMessage());
			System.exit(1);
		}
		catch(SyntaxException e)
		{
			System.err.println(e.getMessage());
			System.exit(2);
		}
		catch(SemanticException e)
		{
			System.err.println(e.getMessage());
			System.exit(3);
		}
		catch(OtherError e)
		{
			System.err.println(e.getMessage());
			System.exit(5);
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
			System.exit(5);
		}
	}
}
