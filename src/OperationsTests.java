public class OperationsTests {
    public void runTest(){
        Operations oper = new Operations();
        double[] arr = oper.array;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0.0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
            sum = sum + arr[i];

        }
        ///asserts
        assert(min == oper.getMin());
        assert(max == oper.getMax());
        assert(sum - oper.getMin() == oper.maxSum());
        assert(sum - oper.getMax() == oper.minSum());
        System.out.println("Operations Tests Passed!");
    }
}
