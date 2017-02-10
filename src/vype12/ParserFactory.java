/**
 * project: vype12
 * author: xpalam00
 */
package vype12;

import vype12.ste.*;
import vype12.tac.*;

/**
 *
 * @author xpalam00
 */
public class ParserFactory {

	public static SymbolTableElement addChar(String value) {
		STEVariable v = SymbolTable.getInstance().addChar();

		TACTable.getInstance().addVariable(v);
		TACTable.getInstance().addLoad(v, value);

		return v;
	}

	public static SymbolTableElement addString(String value) {
		STEVariable v = SymbolTable.getInstance().addString();

		TACTable.getInstance().addVariable(v);
		TACTable.getInstance().addLoad(v, value);

		return v;
	}

	public static SymbolTableElement addInt(int value) {
		STEVariable v = SymbolTable.getInstance().addInteger();

		TACTable.getInstance().addVariable(v);
		TACTable.getInstance().addLoad(v, value);

		return v;
	}

	public static void assignVariable(String name, SymbolTableElement value) {
		STEVariable v = (STEVariable) SymbolTable.getInstance().findAndReturn(name);

		if (v.getType() != value.getType()) {
			throw new IncompatibleTypesException();
		}

		TACTable.getInstance().add(new Mov(v, value));
	}

	public static SymbolTableElement orExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != DataTypes.INT || b.getType() != DataTypes.INT) {
			throw new IncompatibleTypesException("OR operator must have INT data types.");
		}

		TACTable.getInstance().addOr(c, a, b);

		return c;
	}

	public static SymbolTableElement andExpr(SymbolTableElement a, SymbolTableElement b) {
		if (a.getType() != DataTypes.INT || b.getType() != DataTypes.INT) {
			throw new IncompatibleTypesException("AND operator must have INT data types.");
		}

		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		TACTable.getInstance().addAnd(c, a, b);

		return c;
	}

	public static SymbolTableElement eqExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != b.getType()) {
			throw new IncompatibleTypesException("EQ operator must have same both data types.");
		}

		TACTable.getInstance().addEqual(c, a, b);

		return c;
	}

	public static SymbolTableElement notEqExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != b.getType()) {
			throw new IncompatibleTypesException("NotEQ operator must have same both data types.");
		}

		TACTable.getInstance().addNotEqual(c, a, b);

		return c;
	}

	public static SymbolTableElement lessExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != b.getType()) {
			throw new IncompatibleTypesException("LessThan operator must have same both data types.");
		}

		TACTable.getInstance().addLess(c, a, b);

		return c;
	}

	public static SymbolTableElement lessEqExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != b.getType()) {
			throw new IncompatibleTypesException("LessThanEq operator must have same both data types.");
		}

		TACTable.getInstance().addLessEqual(c, a, b);

		return c;
	}

	public static SymbolTableElement greaterExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != b.getType()) {
			throw new IncompatibleTypesException("GreaterThan operator must have same both data types.");
		}

		TACTable.getInstance().addGreater(c, a, b);

		return c;
	}

	public static SymbolTableElement greaterEqExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != b.getType()) {
			throw new IncompatibleTypesException("GreaterThanEq operator must have same both data types.");
		}

		TACTable.getInstance().addGreaterEqual(c, a, b);

		return c;
	}

	public static SymbolTableElement plusExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != DataTypes.INT || b.getType() != DataTypes.INT) {
			throw new IncompatibleTypesException("Plus operator must have INT both data types.");
		}

		TACTable.getInstance().addPlus(c, a, b);

		return c;
	}

	public static SymbolTableElement minusExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != DataTypes.INT || b.getType() != DataTypes.INT) {
			throw new IncompatibleTypesException("Minus operator must have INT both data types.");
		}

		TACTable.getInstance().addMinus(c, a, b);

		return c;
	}

	public static SymbolTableElement multExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != DataTypes.INT || b.getType() != DataTypes.INT) {
			throw new IncompatibleTypesException("Multiply operator must have INT both data types.");
		}

		TACTable.getInstance().addMult(c, a, b);

		return c;
	}

	public static SymbolTableElement divideExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != DataTypes.INT || b.getType() != DataTypes.INT) {
			throw new IncompatibleTypesException("Divide operator must have INT both data types.");
		}

		TACTable.getInstance().addDivide(c, a, b);

		return c;
	}

	public static SymbolTableElement moduloExpr(SymbolTableElement a, SymbolTableElement b) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != DataTypes.INT || b.getType() != DataTypes.INT) {
			throw new IncompatibleTypesException("Modulo operator must have INT both data types.");
		}

		TACTable.getInstance().addModulo(c, a, b);

		return c;
	}

	public static SymbolTableElement notExpr(SymbolTableElement a) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);

		if (a.getType() != DataTypes.INT) {
			throw new IncompatibleTypesException("Not operator must have INT data type.");
		}

		TACTable.getInstance().addNot(c, a);

		return c;
	}

	public static SymbolTableElement addGetAt(String a, SymbolTableElement i) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.CHAR);
		TACTable.getInstance().addVariable(c);

		if (i.getType() != DataTypes.INT) {
			throw new SemanticException("Second argument of getAt function must be INT.");
		}

		STEVariable v = (STEVariable) SymbolTable.getInstance().findAndReturn(a);

		TACTable.getInstance().addGetAt(c, v, (STEVariable) i);

		return c;
	}

	public static SymbolTableElement addSetAt(String a, SymbolTableElement i, String c) {
		STEVariable cv = SymbolTable.getInstance().addVariable(DataTypes.CHAR);
		TACTable.getInstance().addVariable(cv);
		TACTable.getInstance().addLoad(cv, c);

		if (i.getType() != DataTypes.INT) {
			throw new SemanticException("Second argument of setAt function must be INT.");
		}

		STEVariable av = (STEVariable) SymbolTable.getInstance().findAndReturn(a);

		TACTable.getInstance().addSetAt(av, (STEVariable) i, cv);

		return cv;
	}

	public static String addIf(STEVariable e) {
		if(e.getType() != DataTypes.INT) throw new SemanticException("Condition must be INT type.");
		String label = TACTable.createLabel();
		TACTable.getInstance().addIf(e, label);
		return label;
	}

	public static SymbolTableElement addStrcat(SymbolTableElement a, SymbolTableElement b) {
		STEVariable cv = SymbolTable.getInstance().addVariable(DataTypes.STRING);
		TACTable.getInstance().addVariable(cv);

		/*STEVariable bv = SymbolTable.getInstance().addVariable(DataTypes.STRING);
		 TACTable.getInstance().addVariable(bv);
		 TACTable.getInstance().addLoad(bv, b);*/

		/*STEVariable av = SymbolTable.getInstance().addVariable(DataTypes.STRING);
		 TACTable.getInstance().addVariable(av);
		 TACTable.getInstance().addLoad(av, a);*/

		TACTable.getInstance().addStrcat(cv, (STEVariable) a, (STEVariable) b);

		return cv;
	}

	public static SymbolTableElement reType(DataTypes dt, SymbolTableElement value) {
		if (dt == value.getType()) {
			return value;
		}

		if (value.getType() == DataTypes.CHAR && dt == DataTypes.STRING) {
			STEVariable cv = SymbolTable.getInstance().addVariable(dt);
			TACTable.getInstance().addVariable(cv);

			TACTable.getInstance().addCharToString(cv, (STEVariable) value);

			return cv;
		}
		if (value.getType() == DataTypes.CHAR && dt == DataTypes.INT) {
			STEVariable cv = SymbolTable.getInstance().addVariable(dt);
			TACTable.getInstance().addVariable(cv);

			TACTable.getInstance().addCharToInteger(cv, (STEVariable) value);

			return cv;
		}
		if (value.getType() == DataTypes.INT && dt == DataTypes.CHAR) {
			STEVariable cv = SymbolTable.getInstance().addVariable(dt);
			TACTable.getInstance().addVariable(cv);

			TACTable.getInstance().addIntegerToChar(cv, (STEVariable) value);

			return cv;
		}

		throw new SemanticException("Bad combination of reType expressions.");

	}

	static void outputControls() {
		STEFunction mainFunction;
		try {
			mainFunction = SymbolTable.getInstance().findFunctionAndReturn("main");
		} catch (SymbolNotDeclaredException e) {
			throw new SemanticException("Function main was not defined.");
		}

		if (mainFunction.getType() != DataTypes.INT) {
			throw new SemanticException("Main function must be defined as INT.");
		}

		/*if(mainFunction.getArguments().getList().size() != 1)
		{
			throw new SemanticException("Main function must have one argument.");
		}

		if(!mainFunction.getArguments().getList().get(0).getType().equals(DataTypes.VOID))
		{
			throw new SemanticException("Main function must have void argument.");
		}*/

		if(!mainFunction.getArguments().getList().isEmpty())
		{
			throw new SemanticException("Main function must have one void argument.");
		}

		//mainFunction.getArguments().getList().clear();

		for(SymbolTableLevel stl : SymbolTable.getInstance())
		{
			for(SymbolTableElement ste : stl)
			{
				if(ste instanceof STEFunction && ((STEFunction)ste).isDefined() == false)
				{
					throw new SemanticException("Function "+ste.getName()+" was declared and not defined.");
				}
			}
		}

	}

	public static STEVariable addReadChar() {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.CHAR);
		TACTable.getInstance().addVariable(c);
		TACTable.getInstance().addReadChar((STEVariable)c);
		return c;
	}

	public static STEVariable addReadString() {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.STRING);
		TACTable.getInstance().addVariable(c);
		TACTable.getInstance().addReadString((STEVariable)c);
		return c;
	}

	public static STEVariable addReadInt() {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		TACTable.getInstance().addVariable(c);
		TACTable.getInstance().addReadInt((STEVariable)c);
		return c;
	}

	public static void addEndFunction(STEFunction f)
	{
		TACTable.getInstance().add(new EndFunction());
		SymbolTable.getInstance().popLevel();
		SymbolTable.getInstance().clearCurrentFunction();
		f.setDefined(true);
	}

	public static void addReturn(STEVariable what) {
		SymbolTable instance = SymbolTable.getInstance();
		STEFunction stf = instance.findLastFunction();
		if(what != null) {
			if(stf.getType() != what.getType()) {
				throw new SemanticException("Function ("+stf.getName()+") was declared as "+stf.getType()+" but return value is "+what.getType()+" ("+what.getValue()+").");
			}
			TACTable.getInstance().addReturn(what);
		} else {
			if(stf.getType() != DataTypes.VOID && what == null) {
				throw new SemanticException("Function ("+stf.getName()+") was declared as "+stf.getType()+" and must return expression of same type, none given.");
			}
			if(stf.getType() == DataTypes.VOID && what != null) {
				throw new SemanticException("Function ("+stf.getName()+") was declared as "+stf.getType()+" and must return nothing.");
			}

			if(true || stf.getType() != DataTypes.VOID) {
				STEVariable r = instance.addVariable(stf.getType());
				TACTable.getInstance().addVariable(r);
				TACTable.getInstance().addReturn(r);
			} else {
				TACTable.getInstance().addReturn();
			}
		}
	}

}
