import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultColors implements Colors{
    @Override
    public List<String> getColors() {
        List<String> colors = new ArrayList<>();
        colors.add("Yellow"); colors.add("Red"); colors.add("Green"); colors.add("Blue");
        return colors;
    }
}
