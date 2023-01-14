package Practice_4;

public class BeginWith implements IsGood<String>{
    private String start;
    
    public BeginWith(String start) {
        this.start = start;
    }

    @Override
    public boolean isGood(String item) {
        if (item.toLowerCase().startsWith(this.start)) return true;
        else return false;
    }
    
}
