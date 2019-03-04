package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] retVal = new Integer[integerArray.length+1];
        for(int i = 0; i<integerArray.length; i++){
            retVal[i] = integerArray[i];

        }
        retVal[integerArray.length]=valueToBeAdded;

        return retVal;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        integerArray[indexToInsertAt] = valueToBeInserted;

        return integerArray;
/* ** did insert instead of overwrite below
        Integer[] retVal = new Integer[integerArray.length+1];
        for(int i = 0; i<indexToInsertAt; i++){
            retVal[i] = integerArray[i];

        }
        retVal[indexToInsertAt]=valueToBeInserted;
        for(int j = indexToInsertAt+1; j<integerArray.length; j++){
            retVal[j] = integerArray[j];

        }

        return retVal;
        */
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        for(int i  =0; i<integerArray.length; i++){
            if(integerArray[i] %2 ==0){
                integerArray = incrementEven(integerArray);
            }
            else {
                integerArray = decrementOdd(integerArray);
            }
        }

        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for(int i  =0; i<integerArray.length; i++){
            if(integerArray[i] %2 ==0){
                integerArray = replace(integerArray,i,integerArray[i]+1);
            }
        }

        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        for(int i  =0; i<input.length; i++){
            if(input[i] %2 !=0){
                input = replace(input,i,input[i]-1);
            }
        }

        return input;
    }
}
