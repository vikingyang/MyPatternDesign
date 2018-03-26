package lesson8;

public interface Expression {
	// ÓÃÓÚÅĞ¶Ï²Ù×÷
	public boolean interpret(Context ctx);

	public boolean equals(Object o);

	public int hashCode();

	public String toString();
}