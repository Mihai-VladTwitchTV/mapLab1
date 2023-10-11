public class ElektroKauf {
    public int[] keyboards;
    public int[] usb;
    public int maxKeyboards;
    public int maxUSB;
    public int keyboardAmmount = 0;
    public int usbAmmount = 0;
    ElektroKauf(int maxUSBS,int maxKeyboards_){
        keyboards = new int[maxKeyboards_];
        usb = new int[maxUSBS];
        keyboardAmmount = 0;
        usbAmmount = 0;
    }
    public void addKeyboards(int price){
        if(keyboardAmmount < maxKeyboards-1)
        { keyboards[keyboardAmmount] = price;
        keyboardAmmount++;}
    else{
        throw new RuntimeException("Not enough space left");
        }
    }

        public void addUSB(int price) {
            if (usbAmmount < maxUSB - 1) {
                usb[usbAmmount] = price;
                usbAmmount++;
            } else {
                throw new RuntimeException("Not enough space left");
            }
        }

    public int cheapestKeyboard(){
        int min = 44444444;
    for(int i = 0;i < keyboardAmmount-1;i++){
        if(keyboards[i] < min)
            min = keyboards[i];
        }
    return min;
    }

    public int expensiveItem(){
        int max = -1;
        for(int i = 0;i<usbAmmount;i++) {
            if (max < usb[i])
                max = usb[i];
            if(max < keyboards[i])
                max = keyboards[i];
        }
        return max;
    }

    public int  expensiveByBudget(int budget){
        int max = -1;
        for(int i=0;i < keyboardAmmount;i++){
            if(max < keyboards[i] && keyboards[i] <= budget)
                max = keyboards[i];
        }
        return max;
    }
}