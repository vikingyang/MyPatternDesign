package lesson1.re_demeter;

public interface ICustomer {
	public String getFirstName();

	public String getLastName();

	public Wallet getWallet();
	
	public String pay(float payment);
}
