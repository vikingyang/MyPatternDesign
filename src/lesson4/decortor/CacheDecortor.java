package lesson4.decortor;

class CacheDecortor implements IDbOperator {
	protected IDbOperator dbOperator;

	public CacheDecortor(IDbOperator dbOperator) {
		super();
		this.dbOperator = dbOperator;
	}

	@Override
	public void crud() {
		hitCache();
		dbOperator.crud();
	}

	public void hitCache() {
		System.out.println("attach hit cache logic.");
	}

}