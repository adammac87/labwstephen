import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(123,"12/03", 456, 4);
    }

    @Test
    public void hasCardNumber(){
        assertEquals(123,creditCard.getCardNumber());
    }

    @Test
    public void hasExpiryDate(){
        assertEquals("12/03", creditCard.getExpiryDate());
    }

    @Test
    public void hasCcv(){
        assertEquals(456, creditCard.getCcv());
    }

    @Test
    public void hasAvailableCredit(){
        assertEquals(4,creditCard.getAvailableCredit());
    }

}
