/*
Largest Sum Contiguous Subarray (Kadane’s Algorithm)
 */
public class LargestSumContiguousSubarray {

    public static void main (String args []){

        int arr [] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int current_max = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int i = 0 ; i < arr.length ; i++){

            current_max = current_max + arr[i];

            if(max < current_max){
                max = current_max;
                end = i;
            }

            if(current_max < 0){
                current_max = 0;
                start = i;
            }
        }

        System.out.println("Largest sum : "+ max);
        System.out.println(" Start pos : "+ (start+1) + " End pos : "+end);

    }
}
