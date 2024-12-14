import java.util.ArrayList;
import java.util.List;

public class WildColors implements Colors{
    @Override
    public List<String> getColors() {
        List<String> colors = new ArrayList<>();
        colors.add("Wild");
        return colors;
    }
}
