package mock;

public class Mock extends DoorPanel {
    @Override
    public void close() {
        System.out.println("it's close!");
    }
}
