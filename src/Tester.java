public class Tester {
    public static void main(String[] args){
        OperationsTests op = new OperationsTests();
        op.runTest();
        BigNumberTests bgnr = new BigNumberTests();
        bgnr.runTests();
        ElectroStoreTests elekf = new ElectroStoreTests();
        elekf.runTests();
    }

}
