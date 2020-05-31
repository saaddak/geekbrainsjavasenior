package lessonsix;

public class FourExtractor {
    public int[] afterFourExtractor(int[] array) {
        int indexOfFour = 0;
        int newArrayLength;
        boolean isFourContains = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 4) {
                isFourContains = true;
                indexOfFour = i;
            }
        }
        if(!isFourContains) {
            throw new RuntimeException();
        }
        newArrayLength = array.length - (indexOfFour + 1);
        int[] finalArray = new int[newArrayLength];
        int newStepCounter = indexOfFour + 1;
        for(int j = 0; j < finalArray.length; j++) {
            finalArray[j] = array[newStepCounter];
            newStepCounter++;
        }
        return finalArray;
    }
}
