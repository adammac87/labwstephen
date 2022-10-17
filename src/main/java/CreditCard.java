public class CreditCard extends PaymentCard {

    private int availableCredit;


    public CreditCard(int cardNumber, String expiryDate, int Ccv, int availableCredit){
        super(cardNumber , expiryDate ,Ccv);
        this.availableCredit = availableCredit;
    }


    public int getAvailableCredit(){
        return availableCredit;
    }

    public double Charge(){
        return 0.0;
    }


}
