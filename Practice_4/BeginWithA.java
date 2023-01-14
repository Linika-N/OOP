package Practice_4;

public class BeginWithA implements IsGood<String> {

    public BeginWithA() {
    }

    @Override
    public boolean isGood(String item) {
        if (item.toLowerCase().startsWith("a"))return true;
        else return false;
    }
    
}
