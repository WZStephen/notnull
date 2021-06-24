package alibaba;

public class printMax_recursively {
    public int max(int[] arr, int n){
        if(n <= 0)
            return arr[0];
        if(arr[n] > arr[n-1]){
            return arr[n];
        } else{
            return max(arr, n-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,3,2};
        printMax_recursively obj = new printMax_recursively();
        System.out.println(obj.max(arr, 3));
    }
}
