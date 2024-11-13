package PaymentProcessingSystem.AbstractPayment;

public abstract class Credit2 implements MyCard {
	abstract void payPalPayment();
}
class Payment2 extends Credit2{

	public void paymentProcess(double amount) {
		System.out.println("Payment completed\nAmoount: "+amount);
		
	}

	@Override
	void payPalPayment() {
		System.out.println("PayPal Payment");
		
	}
	
}
