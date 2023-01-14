package Practice_4;

public class IsEven implements IsGood<Integer>{


    public IsEven() {
    }

    @Override
    public boolean isGood(Integer item) {
        if (item%2==0) return true;
        else return false;
    }
    
}
