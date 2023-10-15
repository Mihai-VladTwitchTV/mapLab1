public class ElektroKaufTests {
    ElektroKauf kauf = new ElektroKauf(5,5);
    int budget_ = 20;

    public void runTests(){

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
        int minKeyb = 44444444;
        for(int i = 0;i < kauf.keyboardAmmount-1;i++){
            if(kauf.keyboards[i] < minKeyb)
                minKeyb = kauf.keyboards[i];
        }
        int maxItem = -1;
        for(int i = 0;i<kauf.usbAmmount;i++) {
            if (maxItem < kauf.usb[i])
                maxItem = kauf.usb[i];}
        for(int j = 0;j<kauf.keyboardAmmount;j++) {
            if(maxItem < kauf.keyboards[j])
                maxItem = kauf.keyboards[j];
        }

        int maxExpensiveByBudget = -1;
        for(int i=0;i < kauf.keyboardAmmount;i++){
            if(maxExpensiveByBudget < kauf.keyboards[i] && kauf.keyboards[i] <= budget_)
                maxExpensiveByBudget = kauf.keyboards[i];
        }

        int[] sortedKeybs = new int[5];
        int[] sortedUSBS = new int[5];
        sortedKeybs = kauf.sortedKeyboards();
        sortedUSBS = kauf.sortedUSB();
        int[] choices = new int[]{-1,-1};
        for(int i = 0;i < kauf.keyboardAmmount-1;i++){
            if(!(sortedKeybs[i] > budget_))
                for(int j = 0;j < kauf.usbAmmount;j++){
                    if(sortedUSBS[j]+sortedKeybs[i]<=budget_){
                        choices[0] = sortedKeybs[i];
                        choices[1] = sortedUSBS[j];
                    }
                }

        }
        assert(kauf.cheapestKeyboard() == minKeyb);
        assert(kauf.expensiveByBudget(budget_) == maxExpensiveByBudget);
        assert(kauf.budgetBuy(budget_) == choices);
        System.out.println("Electronic Store Tests Passed!");


    }
}
