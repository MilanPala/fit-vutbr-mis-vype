/**
 * project: vype12
 * author: xpalam00
 */
package vype12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import vype12.ste.STEFunction;
import vype12.ste.STEVariable;
import vype12.ste.SymbolTableElement;
import vype12.tac.*;

/**
 * Three address code class
 * @author xpalam00
 */
public class TACTable {

	private LinkedList<TACElement> table = new LinkedList<TACElement>();
	private static TACTable self = new TACTable();
	private static int labelIterator = 0;

	private TACTable() {
	}

	public static TACTable getInstance() {
		return TACTable.self;
	}

	public void add(TACElement el) {
		this.table.add(el);
	}

	public void addVariable(STEVariable el) {
		if (el.getType() == DataTypes.INT) {
			this.add(new AllocInt(el.getName()));
		} else if (el.getType() == DataTypes.CHAR) {
			this.add(new AllocChar(el.getName()));
		} else {
			this.add(new AllocString(el.getName()));
		}
	}

	public void addFunction(STEFunction el) {
		this.add(new Function(el.getType(), el.getName(), el.getArguments()));
	}

	public void addOr(SymbolTableElement c, SymbolTableElement a, SymbolTableElement b) {
		this.add(new Load(c, 0));
		String labelTrue = createLabel();
		String labelTrue2 = createLabel();
		String labelEndeq = createLabel();
		this.add(new Beq((STEVariable) a, (STEVariable) c, labelTrue));
		this.add(new Load(c, 1));
		this.add(new Goto(labelEndeq));
		this.add(new Label(labelTrue));
		this.add(new Beq((STEVariable) b, (STEVariable) c, labelTrue2));
		this.add(new Load(c, 0));
		this.add(new Goto(labelEndeq));
		this.add(new Label(labelTrue2));
		this.add(new Load(c, 1));
		this.add(new Goto(labelEndeq));
		this.add(new Label(labelEndeq));
	}

	public void addAnd(SymbolTableElement c, SymbolTableElement a, SymbolTableElement b) {
		this.add(new Load(c, 0));
		String labelFalse = createLabel();
		String labelEndeq = createLabel();
		this.add(new Beq((STEVariable) a, (STEVariable) c, labelFalse));
		this.add(new Beq((STEVariable) b, (STEVariable) c, labelFalse));
		this.add(new Load(c, 1));
		this.add(new Goto(labelEndeq));
		this.add(new Label(labelFalse));
		this.add(new Load(c, 0));
		this.add(new Goto(labelEndeq));
		this.add(new Label(labelEndeq));
	}

	public void addEqual(SymbolTableElement c, SymbolTableElement a, SymbolTableElement b) {
		String labelTrue = createLabel();
		String labelEndeq = createLabel();
		this.add(new Beq((STEVariable) a, (STEVariable) b, labelTrue));
		this.add(new Load(c, 0));
		this.add(new Goto(labelEndeq));
		this.add(new Label(labelTrue));
		this.add(new Load(c, 1));
		this.add(new Label(labelEndeq));
	}

	public void addNotEqual(SymbolTableElement c, SymbolTableElement a, SymbolTableElement b) {
		String labelTrue = createLabel();
		String labelEndeq = createLabel();
		this.add(new Beq((STEVariable) a, (STEVariable) b, labelTrue));
		this.add(new Load(c, 1));
		this.add(new Goto(labelEndeq));
		this.add(new Label(labelTrue));
		this.add(new Load(c, 0));
		this.add(new Label(labelEndeq));
	}

	public void addLess(SymbolTableElement c, SymbolTableElement a, SymbolTableElement b) {
		String labelTrue = createLabel();
		String labelEndeq = createLabel();
		this.add(new Ble((STEVariable) a, (STEVariable) b, labelTrue));
		this.add(new Load(c, 0));
		this.add(new Goto(labelEndeq));
		this.add(new Label(labelTrue));
		this.add(new Load(c, 1));
		this.add(new Label(labelEndeq));
	}

	public void addLessEqual(SymbolTableElement c, SymbolTableElement a, SymbolTableElement b) {
		String labelTrue = createLabel();
		String labelEndeq = createLabel();
		this.add(new Bleq((STEVariable) a, (STEVariable) b, labelTrue));
		this.add(new Load(c, 0));
		this.add(new Goto(labelEndeq));
		this.add(new Label(labelTrue));
		this.add(new Load(c, 1));
		this.add(new Label(labelEndeq));
	}

	public void addGreater(SymbolTableElement c, SymbolTableElement a, SymbolTableElement b) {
		String labelTrue = createLabel();
		String labelEndeq = createLabel();
		this.add(new Ble((STEVariable) b, (STEVariable) a, labelTrue));
		this.add(new Load(c, 0));
		this.add(new Goto(labelEndeq));
		this.add(new Label(labelTrue));
		this.add(new Load(c, 1));
		this.add(new Label(labelEndeq));
	}

	public void addGreaterEqual(SymbolTableElement c, SymbolTableElement a, SymbolTableElement b) {
		String labelTrue = createLabel();
		String labelEndeq = createLabel();
		this.add(new Bleq((STEVariable) b, (STEVariable) a, labelTrue));
		this.add(new Load(c, 0));
		this.add(new Goto(labelEndeq));
		this.add(new Label(labelTrue));
		this.add(new Load(c, 1));
		this.add(new Label(labelEndeq));
	}

	public void addPlus(SymbolTableElement a, SymbolTableElement b, SymbolTableElement c) {
		this.add(new Add((STEVariable) a, (STEVariable) b, (STEVariable) c));
	}

	public void addMinus(SymbolTableElement a, SymbolTableElement b, SymbolTableElement c) {
		this.add(new Sub((STEVariable) a, (STEVariable) b, (STEVariable) c));
	}

	public void addMult(SymbolTableElement a, SymbolTableElement b, SymbolTableElement c) {
		this.add(new Mult((STEVariable) a, (STEVariable) b, (STEVariable) c));
	}

	public void addDivide(SymbolTableElement a, SymbolTableElement b, SymbolTableElement c) {
		this.add(new Divide((STEVariable) a, (STEVariable) b, (STEVariable) c));
	}

	public void addModulo(SymbolTableElement a, SymbolTableElement b, SymbolTableElement c) {
		this.add(new Modulo((STEVariable) a, (STEVariable) b, (STEVariable) c));
	}

	public void addNot(SymbolTableElement a, SymbolTableElement c) {
		String labelTrue = createLabel();
		String labelEnd = createLabel();
		this.add(new Load(c, 0));
		this.add(new Beq((STEVariable) a, (STEVariable) c, labelTrue));
		this.add(new Load(c, 0));
		this.add(new Goto(labelEnd));
		this.add(new Label(labelTrue));
		this.add(new Load(c, 1));
		this.add(new Label(labelEnd));
	}

	public void addCharToString(STEVariable where, STEVariable what) {
		this.add(new CharToString(where, what));
	}

	public void addCharToInteger(STEVariable where, STEVariable what) {
		this.add(new CharToInteger(where, what));
	}

	public void addIntegerToChar(STEVariable where, STEVariable what) {
		this.add(new IntegerToChar(where, what));
	}

	public void addLoad(STEVariable where, String what) {
		this.add(new Load(where, what));
	}

	public void addLoad(STEVariable where, int what) {
		this.add(new Load(where, what));
	}

	public void addGetAt(STEVariable where, STEVariable from, STEVariable what) {
		this.add(new GetAt(where, from, what));
	}

	public void addSetAt(STEVariable where, STEVariable from, STEVariable what) {
		this.add(new SetAt(where, from, what));
	}

	public void addStrcat(STEVariable where, STEVariable from, STEVariable what) {
		this.add(new Strcat(where, from, what));
	}

	public void addReturn(STEVariable what) {
		this.add(new Return(what));
	}

	public void addReturn() {
		this.add(new Return());
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		String delimiter = "-------------------------------------------";

		str.append("3AC Table\n");
		str.append("+").append(delimiter).append("\n");
		for (TACElement el : this.table) {
			str.append("| ").append(el).append("\n");
		}
		str.append("+").append(delimiter).append("\n\n");

		return str.toString();
	}

	/**
	 * Export TAC table into back-end format
	 * @return String
	 */
	public String export() {
		StringBuilder str = new StringBuilder();

		for (TACElement el : this.table) {
			str.append(el).append("\n");
		}

		return str.toString();
	}

	public void addIf(STEVariable e, String label) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		this.addVariable(c);
		this.addLoad(c, 0);

		this.add(new Beq(e, c, label));
	}

	public String addElse(String elseLabel) {
		String endLabel = createLabel();

		this.add(new Goto(endLabel));
		this.add(new Label(elseLabel));

		return endLabel;
	}

	public void addIfElseEnd(String elseLabel) {
		this.add(new Label(elseLabel));
	}

	public STEVariable addWhileStart(String label) {
		STEVariable c = SymbolTable.getInstance().addVariable(DataTypes.INT);
		this.addVariable(c);
		this.addLoad(c, 0);
		this.add(new Label(label));
		return c;
	}

	public String addWhileCondition(STEVariable cond, STEVariable c) {
		if(cond.getType() != DataTypes.INT) throw new SemanticException("Condition must be INT type.");
		String label = createLabel();

		this.add(new Beq(cond, c, label));

		return label;
	}

	public void addWhileEnd(String startLabel, String endLabel) {
		this.add(new Goto(startLabel));
		this.add(new Label(endLabel));
	}

	public void addReadChar(STEVariable c) {
		this.add(new ReadChar(c));
	}

	public void addReadString(STEVariable c) {
		this.add(new ReadString(c));
	}

	public void addReadInt(STEVariable c) {
		this.add(new ReadInt(c));
	}

	void addPrint(STEVariable e) {
		this.add(new Print(e));
	}

	public static String createLabel() {
		return "@label" + labelIterator++;
	}

	public STEVariable addFunctionCall(STEFunction value) {

		if (value.passed != value.getArguments().getList().size()) {
			throw new SemanticException("Not all arguments function " + value.getName() + " were passed.");
		}

		Stack<SymbolTableElement> st = new Stack<SymbolTableElement>();
		Stack<SymbolTableElement> st2 = new Stack<SymbolTableElement>();
		if (value.getArguments().getList().size() > 0) {
			for (Iterator<SymbolTableElement> it = value.getParams().getList().iterator(); it.hasNext();) {
				st.add(it.next());

			}
		}
		while (!st.empty()) {
			STEVariable tmp = (STEVariable) st.pop();
			this.add(new Push(tmp));
			st2.push(tmp);
		}
		this.add(new Call(value));
		value.passed = 0;

		while (!st2.empty()) {
			STEVariable tmp = (STEVariable) st2.pop();
			this.add(new CleanStack(tmp));
		}

		STEVariable c = SymbolTable.getInstance().addVariable(value.getType());
		this.addVariable(c);
		this.add(new SaveResult(c));
		value.clearParams();
		return c;
	}

	public void addProcedureCall(STEFunction value) {

		if (value.passed != value.getArguments().getList().size()) {
			throw new SemanticException("Not all arguments function " + value.getName() + " were passed.");
		}

		Stack<SymbolTableElement> st = new Stack<SymbolTableElement>();
		Stack<SymbolTableElement> st2 = new Stack<SymbolTableElement>();
		if (value.getArguments().getList().size() > 0) {
			for (Iterator<SymbolTableElement> it = value.getParams().getList().iterator(); it.hasNext();) {
				st.add(it.next());

			}
		}
		while (!st.empty()) {
			STEVariable tmp = (STEVariable) st.pop();
			this.add(new Push(tmp));
			st2.push(tmp);
		}
		this.add(new Call(value));
		value.passed = 0;

		while (!st2.empty()) {
			STEVariable tmp = (STEVariable) st2.pop();
			this.add(new CleanStack(tmp));
		}

		value.clearParams();
	}
}
