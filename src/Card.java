public interface Card {
    String getColor();
    String getValue();
    Action getAction();

    void setValue(String action);
    void setColor(String color);
    void setAction(Action action);
    boolean isStackable(Card compare);
}
