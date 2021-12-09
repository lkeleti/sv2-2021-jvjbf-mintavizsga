package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fishes = new ArrayList<>();
    public static final int CAPACITY = 20;

    public void addFish(Fish fish) {
        int numberOfFishes = fishes.size();
        if ((numberOfFishes + 1)* 5 > CAPACITY) {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
        else {
            fishes.add(fish);
        }
    }

    public void feed() {
        for (Fish fish : fishes) {
            fish.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> fishesToRemove = new ArrayList<>();
        for (Fish fish : fishes) {
            if (fish.getWeight() > maxWeight) {
                fishesToRemove.add(fish);
            }
        }
        deleteFish(fishesToRemove);
    }

    private void deleteFish(List<Fish> fishesToRemove) {
        for (Fish fish : fishesToRemove) {
            fishes.remove(fish);
        }
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        for (Fish fish : fishes) {
            status.add(fish.getStatus());
        }
        return status;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int count = 0;
        for (Fish fish : fishes) {
            if (fish.hasMemoryLoss()) {
                count++;
            }
        }
        return count;
    }

    public boolean isThereFishWithGivenColor(String color){
        for (Fish fish : fishes) {
            if (fish.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish smallest = fishes.get(0);
        for (Fish fish : fishes) {
            if (fish.getWeight() < smallest.getWeight()) {
                smallest = fish;
            }
        }
        return smallest;
    }
}
