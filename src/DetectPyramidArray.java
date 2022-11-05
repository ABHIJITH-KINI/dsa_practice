/*
arrays [ 1,2,5,7,4,1,1 ] , [3,5,25,7,5,4,2,1] ,{1,2,5,7}  pyramid
arrays [ 1,2,5,7,4,8,1 ] , [3,1,25,7,5,4,2,1] ,{10,2,5,7} not pyramid

 */

public class DetectPyramidArray {

    public static void main(String[] args) {

        int arr[] = {1,2,5,7,4,8,1};

        int max_pos = findMaxPos(arr);

        for (int i = 0; i < arr.length -1 ; i++) {

            if(i < max_pos){

                if(arr[i] > arr[i+1]){
                    System.out.println("Array is not pyramid");
                    return;
                }

            } else {

                if(arr[i+1] > arr[i]){
                    System.out.println("Array is not pyramid");
                    return;
                }
            }

        }
        System.out.println("Array is pyramid");
    }

    static int findMaxPos(int arr[]) {
        int max_pos = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max_pos]) {
                max_pos = i;
            }
        }

        return max_pos;
    }
}
