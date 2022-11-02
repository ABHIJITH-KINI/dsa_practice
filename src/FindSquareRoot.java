/*
 Binary search approach is used to find nearest floor value

 */
public class FindSquareRoot {

    public static void main(String[] args) {

        int num = 25;

        int l = 0;
        int h = num / 2;
        int ans = 0;

        while (l <= h) {
            int mid = (l+h) / 2;
            System.out.println(mid);

            if (mid * mid == num) {
                ans = mid;
                System.out.println("Square of " + num + " is : " + ans);
                return;
            }

            if (mid * mid < num) {
                l = mid + 1;
                ans = mid;
            } else {
                h = mid - 1;
            }
        }
        System.out.println("Square of " + num + " is : " + ans);

    }

}
