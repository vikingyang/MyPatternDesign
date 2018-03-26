package lesson8;

public class Variable implements Expression {
	private String name;

	public Variable(String name) {
		this.name = name;
	}

	public boolean interpret(Context ctx) {
		try {
			return ctx.lookup(this);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean equals(Object o) {
		if (o != null && o instanceof Constant) {
			return this.name.equals(((Variable) o).name);
		}
		return false;
	}

	public int hashCode() {
		return (this.toString()).hashCode();
	}

	public String toString() {
		return name;
	}
}