public class LeaderOfAnArray {

    public static void main(String[] args) {

        int arr1[] = {16, 17, 4, 3, 5, 2};
        int arr2[] = {1, 2, 3, 4, 5, 2};
        approachTwo(arr1);

    }

    static void approachOne(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    break;
                }
                if (j == arr.length - 1) {
                    System.out.println("Element : " + arr[i] + " is a leader");
                }
            }
        }
    }

    static void approachTwo(int arr[]) {

        int leader = arr[arr.length - 1];
        System.out.println("Element : " + leader + " is a leader");

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > leader) {
                leader = arr[i];
                System.out.println("Element : " + arr[i] + " is a leader");
            }
        }
    }
}
