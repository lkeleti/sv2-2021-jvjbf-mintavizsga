package aquarium;

public class Tang extends Fish{

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        setMemoryLoss(true);
    }

    @Override
    public void feed() {
        weight += 1;
    }
}
