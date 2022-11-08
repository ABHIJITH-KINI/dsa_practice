/*
Sort an array of 0s, 1s and 2s
 */
public class DutchFlagProblem {

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int tmp;

        int l = 0;
        int h = arr.length - 1;
        int mid = 0;

        while (mid <= h) {

            switch (arr[mid]) {
                case 0: {
                    tmp = arr[mid];
                    arr[mid] = arr[l];
                    arr[l] = tmp;
                    l++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    tmp = arr[mid];
                    arr[mid] = arr[h];
                    arr[h] = tmp;
                    h--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


}
