package w3d2;

public class Amazon extends CanaraBank{

    public void cashOnDelivery(){
        System.out.println("cashOnDelivery in Amazon");
    };
    public void upiPayments(){
        System.out.println("upiPayments in Amazon");
    };
    public void cardPayments(){
        System.out.println("cardPayments in Amazon");
    };
    public void internetBanking(){
        System.out.println("internetBanking in Amazon");
    };

    public void recordPaymentDetails(){
        System.out.println("recordPaymentDetails in Amazon");
    };
    public static void main(String[] args)
    {
        Amazon az = new Amazon();
        az.cashOnDelivery();
        az.upiPayments();
        az.cardPayments();
        az.internetBanking();
        az.recordPaymentDetails();
    }

}
