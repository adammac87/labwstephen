import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    private DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard(123,"12/04",456,789,"12-34-56",10);

    }

    @Test
    public void hasCardNumber(){
        assertEquals(123, debitCard.getCardNumber());

    }

    @Test
    public void hasExpiryDate(){
        assertEquals("12/04", debitCard.getExpiryDate());
    }

    @Test
    public void hasCcv(){
        assertEquals(456, debitCard.getCcv());
    }

    @Test
    public void hasAccountNumber(){
        assertEquals(789,debitCard.getAccountNumber());
    }

    @Test
    public void hasSortCode(){
        assertEquals("12-34-56", debitCard.getSortCode());
    }

    @Test
    public void hasBalance(){
        assertEquals(10, debitCard.getBalance());
    }

}
