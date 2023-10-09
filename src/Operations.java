public class Operations {
    public double[] array = {1,2.5,4.2,4.3,9,1.1,13,100.3,7.4};
    public int length = array.length;
    public double getMax(){
        double max = 0;
        for(int i = 0;i< length;i++){
            if(max < array[i])
                max = array[i];
        }
        return max;
    }

    public double getMin(){
        double min = 100000;
        for(int i = 0;i< length;i++){
            if(min > array[i])
                min = array[i];
        }
        return min;
    }

    public double maxSum(){
        double sum=0;
        for(int i = 0;i< length;i++){
            if(array[i]!=getMin())
                sum = sum+array[i];
        }
        return sum;
    }

    public double minSum(){
        double sum=0;
        for(int i = 0;i< length;i++){
            if(array[i]!=getMax())
                sum = sum+array[i];
        }
        return sum;
    }
}
