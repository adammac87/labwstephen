import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    private GiftCard giftCard;


    @Before
    public void before() {
        giftCard = new GiftCard(6);

    }

    @Test
    public void hasBalance(){
        assertEquals(6 , giftCard.getBalance());
    }

}
