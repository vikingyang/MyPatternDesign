package lesson1.re_demeter;

public class Customer implements ICustomer {
	private String firstName;
	private String lastName;
	private Wallet myWallet;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Wallet getWallet() {
		return myWallet;
	}

	@Override
	public String pay(float payment) {
		Wallet theWallet = this.myWallet;
		if (theWallet.getTotalMoney() > payment) {
			theWallet.subtractMoney(payment);
			return "success";
		} else {
			// money not enough
			return "fail";
		}
	}
}
