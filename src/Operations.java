public class Operations {
    public double[] array;
    public int length ;
    Operations(int size,double arr[]){
        if(size < 1)
            throw new RuntimeException("Cannot have 0 or less items");
        for(double i : arr)
            if(i < 0)
                throw new RuntimeException("Cannot have negative numbers");
        length = size;
        array = arr;

    }
    public double getMax(){
        double max = 0;
        for(int i = 0;i< length;i++){
            if(max < array[i])
                max = array[i];
        }
        return max;
    }

    public double getMin(){
        double min = Double.MAX_VALUE;
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
