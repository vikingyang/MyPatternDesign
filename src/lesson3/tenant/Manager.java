package lesson3.tenant;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	public static Map<Integer, Manager> managers = new HashMap<>();

	private Manager() {
	}

	public static synchronized Manager getInstance(Integer tenantId) {
		if (!managers.containsKey(tenantId)) {
			managers.put(tenantId, new Manager());
		}
		return managers.get(tenantId);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			Tenant tenant = new Tenant();
			Manager instance = Manager.getInstance(tenant.getId());
		}
		System.out.println(managers.size());
	}
}
