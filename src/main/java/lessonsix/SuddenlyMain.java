package lessonsix;

import java.util.Arrays;

public class SuddenlyMain {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        try {
            FourExtractor fe = new FourExtractor();
            int[] finalArray = fe.afterFourExtractor(sourceArray);
            System.out.printf("Элементы массива после последней четвёрки: %s%n%n", Arrays.toString(finalArray));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        OneOrFourSearcher ofs = new OneOrFourSearcher();
        boolean isArrayContentsOneOrFour = ofs.oneFourFind(sourceArray);
        System.out.printf("Содержит ли массив 1 или 4: %b%n%n", isArrayContentsOneOrFour);
    }
}
