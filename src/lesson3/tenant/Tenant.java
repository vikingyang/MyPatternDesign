package lesson3.tenant;

import java.util.Random;

public class Tenant {
	private Manager manager;
	private Integer id;

	public Tenant() {
		Random r = new Random();
		this.setId(r.nextInt());
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}
}
