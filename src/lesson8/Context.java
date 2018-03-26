package lesson8;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private Map<Variable, Boolean> map = new HashMap<Variable, Boolean>();

	public void assign(Variable var, boolean value) {
		map.put(var, new Boolean(value));
	}

	public boolean lookup(Variable var) throws IllegalAccessException {
		Boolean value = (Boolean) map.get(var);
		if (value == null) {
			throw new IllegalAccessException();
		}
		return value.booleanValue();
	}
}