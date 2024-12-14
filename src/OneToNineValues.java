import java.util.ArrayList;
import java.util.List;

public class OneToNineValues implements Values{
    @Override
    public List<String> getValues() {
        List<String> values = new ArrayList<>();
        values.add("1"); values.add("2"); values.add("3");
        values.add("4"); values.add("5"); values.add("6");
        values.add("7"); values.add("8"); values.add("9");
        return values;
    }
}
