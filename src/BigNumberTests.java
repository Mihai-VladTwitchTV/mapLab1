import org.junit.Test;

public class BigNumberTests {

    BigNumber nr1 = new BigNumber(10, new int[]{1,7,4,7,3,0,5,1,8,0});
    BigNumber nr2 = new BigNumber(10, new int[]{3,5,9,2,6,9,2,5,9,3});
    int[] sum= new int[]{5,3,3,9,9,9,7,7,7,3};
    int[] subtr=new int[]{1,8,4,5,3,8,7,4,1,3};
    int[] prod= new int[]{5,2,4,1,9,1,5,5,4,0};
    int[] result= new int[]{0,8,7,3,6,5,2,5,9,0};


    @Test
    public void catchExceptions(){
        try{
        BigNumber tester = new BigNumber(1,new int[]{-1});}
        catch (RuntimeException e){}
    }

    public void runTests(){
    catchExceptions();

    assert(sum == nr1.sum(nr2).digitArray);
    assert(subtr == nr2.sub(nr1).digitArray);
    assert(prod == nr1.mul(3).digitArray);
    assert(result == nr1.div(2).digitArray);
        System.out.println("Big Number Tests Passed!");

    }


}
