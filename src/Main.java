
public class Main {
    public static void main(String[] args) {
        /*Operations op = new Operations();
        System.out.println(op.getMax());
        System.out.println(op.getMin());
        System.out.println(op.minSum());
        System.out.println(op.maxSum());
        int[] nr1Array = {1,0,3,0,5,8,0,7,0,1};
        int[] nr2Array = {5,0,0,9,5,3,1,4,1,2};
        BigNumber nr1 = new BigNumber(10,nr1Array);
        BigNumber nr2 = new BigNumber(10,nr2Array);
        for(int i = 0;i < 10;i++)
        System.out.print(nr2.div(2).digitArray[i]);*/
        ElektroKauf magazin1 = new ElektroKauf(5,5);
        magazin1.addKeyboards(2);
        magazin1.addKeyboards(4);
        magazin1.addKeyboards(6);
        magazin1.addKeyboards(8);
        magazin1.addKeyboards(10);
        magazin1.addUSB(1);
        magazin1.addUSB(3);
        magazin1.addUSB(5);
        magazin1.addUSB(7);
        magazin1.addUSB(9);
        System.out.println(magazin1.budgetBuy(20)[0]);
        System.out.println(magazin1.budgetBuy(20)[1]);

        }


}