package PaymentProcessingSystem.AbstractPayment;

public abstract class Credit1 implements MyCard {
	abstract void creditCardPayment();
}
class Payment1 extends Credit1{

	public void paymentProcess(double amount) {
		System.out.println("Payment completed\nAmount: "+amount);
		
	}

	@Override
	void creditCardPayment() {
		System.out.println("CreditCard Payment ");
	}
	
}
