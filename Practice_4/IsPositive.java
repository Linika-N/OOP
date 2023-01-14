package Practice_4;

public class IsPositive implements IsGood<Integer>{

    public IsPositive() {
    }

    @Override
    public boolean isGood(Integer item) {
        if (item >0) return true;
        else return false;
    }
    
}
