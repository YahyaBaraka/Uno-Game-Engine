import java.util.ArrayList;
import java.util.List;

public class ZeroCardValue implements Values{
    @Override
    public List<String> getValues() {
        List<String> values = new ArrayList<>();
        values.add("0");

        return values;
    }
}
