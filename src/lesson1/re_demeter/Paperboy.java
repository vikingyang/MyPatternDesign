package lesson1.re_demeter;

public class Paperboy {
	private ICustomer myCustomer = new Customer();

	public void doPay(float payment) {
		if ("success".equals(myCustomer.pay(payment))) {
			// logic to pay successful.
		} else {
			// logic pay failed.
		}
	}
}
