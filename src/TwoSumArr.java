import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSumArr {

    public static void main (String [] args){
        int arr [] = {1, 4, 45, 6, 10, -8};
        int sum = 16;

        int arr1 [] = {-8,1,4,6,10,45};

        // approachOne(arr , sum);

        approachTwo(arr1 , sum);

    }

    static void approachOne(int arr[], int sum){

        //n
        Set<Integer> s  = new HashSet();

        //O(n)
        for (int i = 0; i < arr.length;i++){
            s.add(arr[i]);
        }

        //O(n)
        for(int i = 0; i< arr.length; i++){
            int rem_sum = sum - arr[i];
            //O(1)
            if(s.contains(rem_sum)){
                System.out.println("Sum pairs are :"+rem_sum + " & "+arr[i]);
                break;
            }
        }

    }

    static void approachTwo(int arr[], int sum){
        int l = 0;
        int h = arr.length - 1;

        // O(n)
        while (l < h){

            if(arr[l]+arr[h] == sum){
                System.out.println("Sum pairs are :"+arr[l]+ " & "+arr[h]);
                break;
            }

            if(arr[l]+arr[h] < sum){
                l ++;
            } else {
                h--;
            }
        }

    }
}
