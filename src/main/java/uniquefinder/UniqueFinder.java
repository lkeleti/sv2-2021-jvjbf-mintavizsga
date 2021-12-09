package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text is null.");
        }

        List<Character> chars = new ArrayList<>();
        for (char c: text.toCharArray()) {
            if (!chars.contains(c)) {
                chars.add(c);
            }
        }
        return chars;
    }
}
