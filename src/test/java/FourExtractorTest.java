import lessonsix.FourExtractor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FourExtractorTest {
    @Test
    void fourExtractorTest1() {
        FourExtractor fe = new FourExtractor();
        int[] sourceArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expectations = {1, 7};
        Assertions.assertArrayEquals(expectations, fe.afterFourExtractor(sourceArray));
    }

    @Test
    void fourExtractorTest2() {
        FourExtractor fe = new FourExtractor();
        int[] sourceArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expectations = {4, 4, 2, 3, 4, 1, 7};
        Assertions.assertArrayEquals(expectations, fe.afterFourExtractor(sourceArray));
    }

    @Test
    void fourExtractorTest3() {
        FourExtractor fe = new FourExtractor();
        int[] sourceArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expectations = {4, 2, 3, 4, 1, 7};
        Assertions.assertArrayEquals(expectations, fe.afterFourExtractor(sourceArray));
    }

    @Test
    void fourExtractorTest4() {
        FourExtractor fe = new FourExtractor();
        int[] sourceArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expectations = {4, 1, 7};
        Assertions.assertArrayEquals(expectations, fe.afterFourExtractor(sourceArray));
    }

    @Test
    void fourExtractorTestException() {
        FourExtractor fe = new FourExtractor();
        int[] sourceArray = {1, 2, 1, 0, 2, 3, 5, 1, 7};
        int[] expectations = {1, 7};
        Assertions.assertArrayEquals(expectations, fe.afterFourExtractor(sourceArray));
    }
}
