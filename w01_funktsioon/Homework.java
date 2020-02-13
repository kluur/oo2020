import java.util.Random;

public class Homework {
    private static int[] randomArray() {
        int minArray = 1;
        int maxArray = 50;
        int min = 10;
        int max = 10000;
        Random r = new Random();
        int arrayNumber = r.nextInt(maxArray-minArray+1)+minArray;
        int[] myArray = new int[arrayNumber];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = r.nextInt(max-min+1)+min;
        
            System.out.println(myArray[i]);
        }
        return myArray;    
        
    }

    private static void bubbleSort(int[] arr) {
        int temp = 0;
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < (arr.length); j++){
                if(arr[j - 1] > arr[j]){
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    cnt++;
                }
            }
        }
        System.out.println("Loopide arv: " + cnt);
    }

    public static void main(final String[] args) {
        int[] arr = randomArray();
        
        //sorteerimata array
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        bubbleSort(arr);
        //sorteeritud array
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}   
