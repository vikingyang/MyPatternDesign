package lesson8;

public class Client {
	public static void main(String[] args) {
		Context ctx = new Context();
		Variable a = new Variable("a");
		Variable b = new Variable("b");
		ctx.assign(a, true);
		ctx.assign(b, false);

		Constant c = new Constant(true);
		Constant d = new Constant(false);

		System.out.println(new And(a, b).interpret(ctx));
		System.out.println(new And(c, new Not(d)).interpret(ctx));

		Expression exp = new Or(new And(a, b), new And(c, new Not(d)));
		System.out.println(exp.interpret(ctx));
	}
}