import java.util.ArrayList;
import java.util.List;

public class SkipValue implements Values{
    @Override
    public List<String> getValues() {
        List<String> values = new ArrayList<>();
        values.add("Skip");
        return values;
    }
}
