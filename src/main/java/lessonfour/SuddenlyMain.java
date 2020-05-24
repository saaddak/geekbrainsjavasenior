package lessonfour;

public class SuddenlyMain {
    public static void main(String[] args) {
        final char firstLetter = 'A';
        final char secondLetter = 'B';
        final char thirdLetter = 'C';
        final int REPEAT_COUNT = 5;

        FreeThreader frTr1 = new FreeThreader(firstLetter, secondLetter, REPEAT_COUNT);
        FreeThreader frTr2 = new FreeThreader(secondLetter, thirdLetter, REPEAT_COUNT);
        FreeThreader frTr3 = new FreeThreader(thirdLetter, firstLetter, REPEAT_COUNT);

        frTr1.start();
        frTr2.start();
        frTr3.start();
    }
}
