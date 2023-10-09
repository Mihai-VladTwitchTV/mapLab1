public class ElektroKauf {
    public int[] keyboards;
    public int[] usb;
    public int maxKeyboards;
    public int maxUSB;
    public int keyboardAmmount;
    public int usbAmmount;
    ElektroKauf(int maxUSBS,int maxKeyboards_){
        keyboards = new int[maxKeyboards_];
        usb = new int[maxUSBS];
        keyboardAmmount = 0;
        usbAmmount = 0;
    }
    public void addKeyboards(int price){
        if(keyboardAmmount)
        keyboards[keyboardAmmount] = price;
        keyboardAmmount++;
    }
    public void addUSB(int price){
        usb[usbAmmount] = price;
        usbAmmount++;
    }

}
