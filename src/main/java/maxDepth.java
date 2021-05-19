public class maxDepth {
    public int maxDepth(String s){
        int count = 0, max = 0;
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == '(')
                count++;
            else if(s.charAt(i) == ')')
                count--;
            max = Math.max(count, max);
        }
        return max;
    }

    public static void main(String[] args) {
        maxDepth obj = new maxDepth();
        System.out.println(obj.maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}
