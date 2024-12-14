public class Director {
    public void constructDraw4Card(Builder builder) {
        builder.setCardAction(new Draw4Strategy());
        builder.setCardColors(new DefaultColors());
        builder.setCardFactory(new Draw4Factory());
        builder.setCardQuantity(2);
        builder.setCardValues(new Draw4Value());
    }

    public void constructDraw2Card(Builder builder) {
        builder.setCardAction(new Draw2Strategy());
        builder.setCardColors(new DefaultColors());
        builder.setCardFactory(new Draw2Factory());
        builder.setCardQuantity(2);
        builder.setCardValues(new Draw2Value());
    }
    public void constructSkipCard(Builder builder) {
        builder.setCardAction(new SkipStrategy());
        builder.setCardColors(new DefaultColors());
        builder.setCardFactory(new SkipFactory());
        builder.setCardQuantity(2);
        builder.setCardValues(new SkipValue());
    }
    public void constructWildCard(Builder builder) {
        builder.setCardAction(new WildStrategy());
        builder.setCardColors(new WildColors());
        builder.setCardFactory(new WildFactory());
        builder.setCardQuantity(4);
        builder.setCardValues(new WildValue());
    }
    public void constructWildDraw4Card(Builder builder) {
        builder.setCardAction(new WildAndDraw4Strategy());
        builder.setCardColors(new WildColors());
        builder.setCardFactory(new WildAndDraw4Factory());
        builder.setCardQuantity(4);
        builder.setCardValues(new WildAndDraw4Value());
    }
    public void constructReverseCard(Builder builder) {
        builder.setCardAction(new ReverseCardStrategy());
        builder.setCardColors(new DefaultColors());
        builder.setCardFactory(new ReverseFactory());
        builder.setCardQuantity(2);
        builder.setCardValues(new ReverseValue());
    }

    public void constructNumberCard(Builder builder) {
        builder.setCardAction(new NoActionStrategy());
        builder.setCardColors(new DefaultColors());
        builder.setCardFactory(new NumberFactory());
        builder.setCardQuantity(2);
        builder.setCardValues(new OneToNineValues());
    }

    public void constructZeroNumberCard(Builder builder) {
        builder.setCardAction(new NoActionStrategy());
        builder.setCardColors(new DefaultColors());
        builder.setCardFactory(new NumberFactory());
        builder.setCardQuantity(1);
        builder.setCardValues(new ZeroCardValue());
    }

}
