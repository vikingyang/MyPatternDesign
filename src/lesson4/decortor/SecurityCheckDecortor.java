package lesson4.decortor;

class SecurityCheckDecortor extends CacheDecortor {

	public SecurityCheckDecortor(IDbOperator dbOperator) {
		super(dbOperator);
	}

	@Override
	public void crud() {
		renewCheck();
		preSecurityCheck();
		dbOperator.crud();
	}

	private void renewCheck() {
		System.out.println("do the update.");

	}

	private void preSecurityCheck() {
		System.out.println("do pre check.");

	}

}