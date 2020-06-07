import lessonsix.OneOrFourSearcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OneOrFourSearcherTest {
    @Test
    void oneOrFourSearcherTest1() {
        OneOrFourSearcher ofs = new OneOrFourSearcher();
        int[] sourceArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        Assertions.assertTrue(ofs.oneFourFind(sourceArray));
    }

    @Test
    void oneOrFourSearcherTest2() {
        OneOrFourSearcher ofs = new OneOrFourSearcher();
        int[] sourceArray = {0, 2, 3, 7, 2, 3, 9, 2, 7};
        Assertions.assertTrue(ofs.oneFourFind(sourceArray));
    }

    @Test
    void oneOrFourSearcherTest3() {
        OneOrFourSearcher ofs = new OneOrFourSearcher();
        int[] sourceArray = {0, 2, 3, 7, 2, 1, 9, 2, 7};
        Assertions.assertTrue(ofs.oneFourFind(sourceArray));
    }

    @Test
    void oneOrFourSearcherTest4() {
        OneOrFourSearcher ofs = new OneOrFourSearcher();
        int[] sourceArray = {};
        Assertions.assertTrue(ofs.oneFourFind(sourceArray));
    }

    @Test
    void oneOrFourSearcherTest5() {
        OneOrFourSearcher ofs = new OneOrFourSearcher();
        int[] sourceArray = {1, 4, 1, 4, 1, 4, 1, 4, 1, 4};
        Assertions.assertTrue(ofs.oneFourFind(sourceArray));
    }
}
