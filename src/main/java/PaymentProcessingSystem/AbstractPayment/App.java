package PaymentProcessingSystem.AbstractPayment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Payment1 pay1=new Payment1();
        pay1.creditCardPayment();
        pay1.paymentProcess(50000.00);
   
        Payment2 pay2=new Payment2();
        pay2.payPalPayment();
        pay2.paymentProcess(90000.00);

    }
}
