package state;

public class Brush implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Draw A Line");
    }

    @Override
    public void mouseDown() {
        System.out.println("Brush Tool");

    }
}
