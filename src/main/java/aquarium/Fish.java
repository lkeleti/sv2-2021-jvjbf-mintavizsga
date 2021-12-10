package aquarium;

public abstract class Fish {

    private String name;
    protected int weight;
    private String color;
    private boolean memoryLoss = false;

    protected Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getStatus() {
        return name + ", weight: " + weight + ", color: " + color + ", short-term memory loss: " + memoryLoss;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    protected void setMemoryLoss(boolean memoryLoss) {
        this.memoryLoss = memoryLoss;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    public abstract void feed();

}
