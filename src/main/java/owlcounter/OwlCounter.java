package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {
    private List<String> numberOfOwl = new ArrayList<>();

    public void readFromFile(Path path) {
        List<String> lines;
        try {
            lines = Files.readAllLines(path);
            processLines(lines);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.");
        }
    }

    private void processLines(List<String> lines) {
        for (String line: lines) {
            numberOfOwl.add(line);
        }
    }

    public int getNumberOfOwls(String county) {
        return countNumberOfOwls(county);
    }

    public int getNumberOfAllOwls() {
        return countNumberOfOwls("");
    }

    public int countNumberOfOwls(String county) {
        int sum = 0;
        for (String actual: numberOfOwl) {
            if (!county.isEmpty()) {
                if (actual.split("=")[0].equals(county)) {
                    sum += Integer.parseInt(actual.split("=")[1]);
                }
            }
            else {
                sum += Integer.parseInt(actual.split("=")[1]);
            }
        }
        if (sum == 0) {
            throw new IllegalArgumentException("No such county in Hungary!");
        }
        return sum;
    }
}
