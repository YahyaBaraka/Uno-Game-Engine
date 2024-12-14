import java.util.ArrayList;
import java.util.List;

public class WildValue implements Values{
    @Override
    public List<String> getValues() {
        List<String> values = new ArrayList<>();
        values.add("Wild");
        return values;
    }
}
