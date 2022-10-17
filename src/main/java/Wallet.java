import java.lang.reflect.Array;
import java.util.ArrayList;

public class Wallet implements IChargeable {


    private String name;

    private ArrayList<IChargeable> cards;

    public Wallet(String name){
        this.name = name;
        this.cards = new ArrayList<IChargeable>();
    }

    public String getName(){
        return name;
    }


    @Override
    public void Charge(double purchaseAmount) {

    }
}
