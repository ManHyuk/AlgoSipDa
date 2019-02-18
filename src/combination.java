import java.util.Arrays;

public class combination {

    static int[] arr;
    static int[] combArr;

    public static void exce() throws Exception {

        arr = new int[49];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        int n = arr.length; // nCr
        int r = 2;


        combArr = new int[n];

        doCombination(n, r, 0, 0);
    }

    static void doCombination(int n, int r, int index, int target) {

        if (r == 0) {
            for (int i = 0; i < index; i++) {
                System.out.print(arr[combArr[i]]+ " ");
            }
            System.out.println();

        } else if (target == n) {
            return;
        } else {

            combArr[index] = target;

            doCombination(n, r - 1, index + 1, target + 1);
            doCombination(n, r, index, target + 1);

        }
    }
}
