package lessonone;

import java.util.ArrayList;
import java.util.Arrays;

class AsListGeneric<T> {
    private T[] array;
    ArrayList<T> listofT;

    AsListGeneric(T... array) {
        this.array = array;
    }

    void showType() {
        System.out.printf("Тип AsListGeneric<T>: %s%n", array.getClass().getName());
    }

    void asArrayLister() {
        listofT = new ArrayList<>(Arrays.asList(array));
    }

    void printer() {
        listofT.forEach(x -> System.out.println(x));
    }
}
