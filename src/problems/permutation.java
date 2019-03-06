package problems;

public class permutation {
    public static void exce() throws Exception {
        permutation ex = new permutation();
        int[] arr = { 1, 2, 3, 4 };
        ex.doPermutation(arr, 0);
    }

    public void doPermutation(int[] arr, int startIdx){
        int length = arr.length;
        if(startIdx == length-1){
            for(int n: arr) System.out.print(n + " ");
            System.out.println();
            return;
        }

        for(int i=startIdx; i<length; i++){
            swap(arr, startIdx, i);
            doPermutation(arr, startIdx+1);
            swap(arr, startIdx, i);
        }
    }

    public void swap(int[] arr, int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
