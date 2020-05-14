package lessonone;

import java.util.ArrayList;
import java.util.Arrays;

class Box<T> {
    ArrayList<T> listOfFruits;

    @SafeVarargs
    Box(T... fruits) {
        listOfFruits = new ArrayList<>(Arrays.asList(fruits));
    }
}
