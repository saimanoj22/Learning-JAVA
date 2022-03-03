
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        sort(array);
    }
    
    public static int smallest(int[] array){
        int small = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < small){
                small = array[i];
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        int small = Integer.MAX_VALUE;
        int indexOfSmall = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < small){
                small = array[i];
                indexOfSmall = i;
            }
        }
        return indexOfSmall;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int small = Integer.MAX_VALUE;
        int indexOfSmall = 0;
        for(int i = startIndex; i < array.length; i++){
            if(array[i] < small){
                small = array[i];
                indexOfSmall = i;
            }
        }
        return indexOfSmall;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
    
    public static void printArray(int[] array){
            String ans = "[";
            for(int i = 0; i < array.length; i++){
                if(i == 0){
                    ans += array[i] + ",";
                }
                else{
                    ans += " " + array[i] + ",";
                }
            }
            ans += "]";
            System.out.println(ans);
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array, i));
            printArray(array);
        }
    }
}
