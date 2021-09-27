public class Cow implements Domesticatable, Tradable {

    @Override
    public String sound() {
        return "Moo";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
