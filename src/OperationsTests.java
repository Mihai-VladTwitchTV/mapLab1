public class OperationsTests {
    public void opTest(){
        Operations oper = new Operations();
        double[] arr = oper.array;
        double max = Double.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        assert(max == oper.getMax());
    }
}
