/**
 * A main class to define Array operations without using Collections
 * Written without methods
 */

public class ArrayOperation {
    public static void main(String[] args) {
        int [] arrContainer = new int[]{10,30,5,79,32,53}; //Testing with integer

        /*Iterating Through Array*/
        for(int value : arrContainer){
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("-------------------");

        int targetValue = 100;
        /*Searching the target value within the array*/

        int i; // Counter left outside for evaluating condition
        for(i = 0; i < arrContainer.length; i++){
            if(targetValue == arrContainer[i]) {
                System.out.println("Value found. Index is: " + i);
                break;
            }
        }
        if(i == arrContainer.length)
            System.out.println("Value not found");

        /*Insertion at an index*/
        int[] copiedArray = new int[arrContainer.length + 1]; // Since these are not dynamic, making a new bigger array for test purposes
        System.arraycopy(arrContainer,0,copiedArray,0,arrContainer.length); // arraycopy method to copy the content from arrayContainer

        for(int val : copiedArray)// Testing to see if it shows the same data + extra 0
            System.out.print(val + " ");
        System.out.println();
        int insertIndex = 3;
        int value = 100;
        for(int count = arrContainer.length - 1; count >= insertIndex; count--){ //Start from end index of where data is and shift it right till the specified index
            copiedArray[count + 1] = copiedArray[count];
        }
        copiedArray[insertIndex] = value;
        for(int val : copiedArray)
            System.out.print(val + " ");
        System.out.println();
        /*Deletion*/
        int deleteIndex = 4;
        for(int count = deleteIndex; count < copiedArray.length - 1; count++){
            copiedArray[count] = copiedArray[count + 1];
        }
        copiedArray[copiedArray.length - 1] = 0;

        for(int val : copiedArray)
            System.out.print(val + " ");
    }
}
