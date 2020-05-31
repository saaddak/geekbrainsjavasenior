package lessonsix;

public class OneOrFourSearcher {
    public boolean oneFourFind(int[] array) {
        boolean isFound = false;
        for (int value : array) {
            if (value == 1 || value == 4) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}
