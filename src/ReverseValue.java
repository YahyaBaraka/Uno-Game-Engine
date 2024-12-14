import java.util.ArrayList;
import java.util.List;

public class ReverseValue implements Values{
    @Override
    public List<String> getValues() {
        List<String> value = new ArrayList<>();
        value.add("Reverse");
        return value;
    }
}
