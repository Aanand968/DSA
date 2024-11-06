package SearchingAndSorting;

public class LinearSearch {
    static int search(int[] arr, int target){
        //iterating the loop
        for (int i = 0; i <arr.length; i++) {
            //checking if the number is present in the array
            if (target == arr[i] ) {
                //if number found it will return the index number
               return i;
            }
        }
        //if number not found it will return -1
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("This is the linear search");
        int[] array = {23,4,24,5,6,7,43,8,99};
        int target =7;
        int num = search(array,target);
        System.out.println("The number is at " + (num+1) + " location.");
    }
}
