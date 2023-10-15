import java.util.Arrays;

public class ElektroKauf {
    public int[] keyboards;
    public int[] usb;
    public int maxKeyboards;
    public int maxUSB;
    public int keyboardAmmount = 0;
    public int usbAmmount = 0;
    public ElektroKauf(int maxUSBS,int maxKeyboards_){
        keyboards = new int[maxKeyboards_];
        usb = new int[maxUSBS];
        keyboardAmmount = 0;
        usbAmmount = 0;
        maxUSB = maxUSBS;
        maxKeyboards = maxKeyboards_;
    }
    public void addKeyboards(int price){
        if(keyboardAmmount < maxKeyboards){
        keyboards[keyboardAmmount] = price;
        keyboardAmmount++;}
    else{
        throw new RuntimeException("Not enough space left");
        }
    }

    public void addUSB(int price) {
        if(usbAmmount < maxUSB) {
            usb[usbAmmount] = price;
            usbAmmount++;}
    else{
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
                max = usb[i];}
        for(int j = 0;j<keyboardAmmount;j++) {
            if(max < keyboards[j])
                max = keyboards[j];
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

    public int[] sortedKeyboards(){
        int[] newArray = keyboards;
        Arrays.sort(newArray);
        return newArray;
    }

    public int[] sortedUSB(){
        int[] newArray = usb;
        Arrays.sort(newArray);
        return newArray;
    }

    public int[] budgetBuy(int budget){
        int[] choices = new int[2];
        choices[0] = -1;
        choices[1] = -1;
        int[] usbsSort = sortedUSB();
        int[] keybdsSort = sortedKeyboards();
        for(int i = 0;i <= keyboardAmmount-1;i++){
            if(!(keybdsSort[i] > budget))
                for(int j = 0;j <= usbAmmount-1;j++){
                    if(usbsSort[j]+keybdsSort[i]<=budget){
                        choices[0] = keybdsSort[i];
                        choices[1] = usbsSort[j];
                    }
                }

        }
        return choices;

    }
}