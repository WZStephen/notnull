package alibaba;

public class printMax_recursively {
    public int findMax(int[] arr, int index){
        if(index == arr.length-1){
            return arr[index];
        }
        return Math.max(arr[index], findMax(arr,index+1));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,3,2};
        printMax_recursively obj = new printMax_recursively();
        System.out.println(obj.findMax(arr, 0));
    }
}
