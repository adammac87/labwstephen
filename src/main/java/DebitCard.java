public class DebitCard extends PaymentCard {

    private int accountNumber;
    private String sortCode;

    private int balance;


    public DebitCard(int cardNumber, String expiryDate, int ccv , int accountNumber, String sortCode, int balance){
        super(cardNumber,expiryDate,ccv);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;

    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getSortCode(){
        return sortCode;
    }
    public int getBalance(){
        return balance;
    }



}
