package state;

public class Selection implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Draw A Dotted Rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection Tool");
    }
}
