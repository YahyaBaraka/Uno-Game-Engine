public class NumberCard implements Card{
    private  String color;
    private String value;
    private Action action = new NoActionStrategy();

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public Action getAction() {
        return action;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setAction(Action action) {
        this.action = action;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public boolean isStackable(Card compare) {
        if(this.getColor().equalsIgnoreCase(compare.getColor()) ||
                this.getValue().equalsIgnoreCase(compare.getValue()) || compare.getColor().equalsIgnoreCase("Wild"))
            return true;
        return false;
    }
}
