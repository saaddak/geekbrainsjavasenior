import java.util.ArrayList;
import java.util.Arrays;

class UniversalSoldierGeneric<T> {
    private T[] array;
    ArrayList<T> listofT;

    UniversalSoldierGeneric(T... array) {
        this.array = array;
    }

    void showType() {
        System.out.printf("Тип UniversalSoldierGeneric<T>: %s%n", array.getClass().getName());
    }

    void swapper(int firstPosition, int secondPosition) {
        try {
            T tmp = array[firstPosition];
            array[firstPosition] = array[secondPosition];
            array[secondPosition] = tmp;
        } catch(IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    void asArrayLister() {
        listofT = new ArrayList<>(Arrays.asList(array));
    }

    void arrayPrinter() {
        System.out.print("Состав массива T:");
        for(int i = 0; i < array.length; i++) {
            if(i != array.length - 1) {
                System.out.print(" " + array[i] + ",");
            } else {
                System.out.print(" " + array[i] + ".");
            }
        }
        System.out.println();
    }

    void listPrinter() {
        System.out.print("Состав ArrayList<T>: " + Arrays.toString(listofT.toArray()) + "\n");
    }
}
