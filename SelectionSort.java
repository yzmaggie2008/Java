public class SelectionSort {
    public static void main (String arg[]){
        SelectionSort test = new SelectionSort();
        int[] array = {90,5,35,22,89,66};
        test.selection(array);
        test.printArr(array);

    }
    void selection(int[] array){
        int length = array.length;
        for(int i = 0; i < length; i ++){
            int min_index = i;
            for(int j = i + 1; j< length; j++){
                if(array[j] < array[min_index]){
                    min_index = j;
                }
                int temp = array[min_index];
                array[min_index] = array[i];
                array[i] = temp;
            }
        }
    }
    void printArr(int[] array){
        for(int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }

}
