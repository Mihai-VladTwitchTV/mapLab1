import java.util.Arrays;

public class ElectroStore {
    public int[] keyboards;
    public int[] usb;
    public int maxKeyboards;
    public int maxUSB;
    public int keyboardAmmount = 0;
    public int usbAmmount = 0;
    public ElectroStore(int maxUSBS,int maxKeyboards_){
        if(maxUSBS < 1 || maxKeyboards_ < 1)
            throw new RuntimeException("Cannot have a max smaller than 1");
        keyboards = new int[maxKeyboards_];
        usb = new int[maxUSBS];
        keyboardAmmount = 0;
        usbAmmount = 0;
        maxUSB = maxUSBS;
        maxKeyboards = maxKeyboards_;
    }

    public int[] sortArray(int[] array) {
        // Bubble sort implementation
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public void addKeyboards(int price){
        if(price < 0)
            throw new RuntimeException("Cannot add a negative price");
        if(keyboardAmmount < maxKeyboards){
        keyboards[keyboardAmmount] = price;
        keyboardAmmount++;}
    else{
        throw new RuntimeException("Not enough space left");
        }
    }

    public void addUSB(int price) {
        if(price < 0)
            throw new RuntimeException("Cannot add a negative price");
        if(usbAmmount < maxUSB) {
            usb[usbAmmount] = price;
            usbAmmount++;}
    else{
         throw new RuntimeException("Not enough space left");
        }
    }

    public int cheapestKeyboard(){
        int min = Integer.MAX_VALUE;
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
        int[] newArray = sortArray(keyboards);
        return newArray;
    }

    public int[] sortedUSB(){
        int[] newArray = sortArray(usb);
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