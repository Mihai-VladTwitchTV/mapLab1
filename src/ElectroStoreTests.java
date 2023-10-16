import org.junit.Test;

public class ElectroStoreTests {
    ElectroStore kauf = new ElectroStore(5,5);
    int budget_ = 20;

    @Test
    public void catchExceptions(){
        ElectroStore tester1 = new ElectroStore(1,1);
        try{
            ElectroStore tester = new ElectroStore(-3,-3);
            tester1.addKeyboards(-1);
            tester1.addUSB(-1);
    }
        catch (RuntimeException e){}
    }



    public void runTests(){
        catchExceptions();
        kauf.addKeyboards(2);
        kauf.addKeyboards(4);
        kauf.addKeyboards(6);
        kauf.addKeyboards(8);
        kauf.addKeyboards(10);
        kauf.addUSB(1);
        kauf.addUSB(3);
        kauf.addUSB(5);
        kauf.addUSB(7);
        kauf.addUSB(9);

        assert(kauf.cheapestKeyboard() == 2);
        assert(kauf.expensiveByBudget(budget_) == 10);
        assert(kauf.budgetBuy(budget_) == new int[]{10,9});
        System.out.println("Electronic Store Tests Passed!");


    }
}
