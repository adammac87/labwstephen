public abstract class PaymentCard {

    private int cardNumber;
    private String expiryDate;
    private int ccv;

    public PaymentCard(int cardNumber, String expiryDate,int ccv){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.ccv = ccv;
    }


    public int getCardNumber(){
        return cardNumber;
    }

    public String getExpiryDate(){
        return expiryDate;
    }

    public  int getCcv(){
        return ccv;
    }


}


