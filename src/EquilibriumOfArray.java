/*
Find index element in array such that sum of left array is equal to sum of right array
 */
public class EquilibriumOfArray {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 4, 5};

        int l = 0;
        int h = arr.length - 1;
        int left_sum = arr[l];
        int right_sum = arr[h];

        while (l < h) {

            if (left_sum == right_sum && l == h - 2) {
                System.out.println("Equilibrium point is : "+ (l + 1));
                break;
            } else if (left_sum < right_sum) {
                l++;
                left_sum = left_sum + arr[l];
            } else if (right_sum < left_sum) {
                h--;
                right_sum = right_sum + arr[h];
            } else {
                h--;
                right_sum = right_sum + arr[h];
            }
        }
    }
}
