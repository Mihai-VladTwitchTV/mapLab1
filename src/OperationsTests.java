import org.junit.Test;

public class OperationsTests {
    @Test
    public void catchExceptions(){
        try{
            Operations opTest = new Operations(-1,new double[]{1});
            Operations opTest1 = new Operations(1,new double[]{-1});

        }
        catch(RuntimeException e){}
    }
    public void runTest(){
        Operations oper = new Operations( 9,new double[]{1,2.5,4.2,4.3,9,1.1,13,100.3,7.4});
        double[] arr = oper.array;
        double max = 100.3;
        double min = 1;
        double sum = 142.8;
        ///asserts
        assert(min == oper.getMin());
        assert(max == oper.getMax());
        assert(sum - oper.getMin() == oper.maxSum());
        assert(sum - oper.getMax() == oper.minSum());
        System.out.println("Operations Tests Passed!");
    }
}
