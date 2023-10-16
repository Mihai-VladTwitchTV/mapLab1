public class BigNumber {
    public int size;
    public int[] digitArray;

    BigNumber(int size_, int[] array){
        for(int i:array){
            if (i < 0)
                throw new RuntimeException("Cannot have a negative number in the digit array");
        }
        size = size_;
        digitArray = new int[size];
        digitArray = array;
    }
    public BigNumber sum(BigNumber other){
        int[] resultingArray = new int[size+1];
        int overLoad = 0;
        for(int i = size-1;i >= 0;i --){
            int digitSum = digitArray[i] + other.digitArray[i];
            resultingArray[i] = (digitSum + overLoad)%10;
            overLoad = (int)(digitSum+overLoad)/10; ///we check if it goes above 10 and save the overload
        }
        if(overLoad !=0)
            resultingArray[0] = 1;//check if we have one more unit to add at the beginning of the number
        if(size >= other.size)
            return new BigNumber(size+1,resultingArray);
        else
            return new BigNumber(other.size+1,resultingArray);
    }

    public BigNumber sub(BigNumber other){
        int[] resultingArray = new int[size];
        int underLoad = 0;
        int digitSub = 0;
        for(int i = size-1;i >= 0;i --){
            if(digitArray[i] - underLoad < other.digitArray[i]){
                digitSub = 10+(digitArray[i] - other.digitArray[i]) - underLoad;
                underLoad = 1;
            }else{
            digitSub = digitArray[i] - other.digitArray[i] - underLoad;
            underLoad = 0;}
            resultingArray[i] = digitSub;

        }
        if(size >= other.size)
        return new BigNumber(size+1,resultingArray);
        else
            return new BigNumber(other.size+1,resultingArray);
    }
    public BigNumber mul(int factor){
        int newSize = size + 1;
        int[] resultingArray = new int[newSize];
        int overLoad = 0;
        for(int i = size-1;i >= 0;i --){
            int digitProd = digitArray[i] * factor;
            resultingArray[i] = (digitProd + overLoad)%10;
            overLoad = (int)(digitProd+overLoad)/10;
        }
        if(overLoad != 0)
            resultingArray[0] = overLoad;

        return new BigNumber(newSize,resultingArray);
        }

    public BigNumber div(int divisor) {
        if (divisor == 0) {
            throw new RuntimeException("Division by zero");
        }

        int newSize = size;  // The size of the resulting BigNumber
        int[] resultingArray = new int[newSize];
        long remainder = 0; // Initialize the remainder as a long

        for (int i = 0; i < size; i++) {
            long currentDigit = digitArray[i] + remainder * 10; // Include previous remainder
            int quotientDigit = (int) (currentDigit / divisor);
            remainder = currentDigit % divisor;

            resultingArray[i] = quotientDigit;
        }

        // Handle leading zeros in the result
        int leadingZeros = 0;
        while (leadingZeros < newSize && resultingArray[leadingZeros] == 0) {
            leadingZeros++;
        }

        if (leadingZeros > 0) {
            newSize -= leadingZeros;
            int[] trimmedResult = new int[newSize];
            System.arraycopy(resultingArray, leadingZeros, trimmedResult, 0, newSize);
            resultingArray = trimmedResult;
        }

        return new BigNumber(newSize, resultingArray);
    }




}
