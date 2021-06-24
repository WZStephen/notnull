package leetcode;

/**
 请实现⼀个函数，将⼀个字符串中的每个空格替换成“%20”。例如，当字符串为
    We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
        */
public class replaceSpace {
    public String replaceSpaceMethod1(StringBuffer str){
        int len = str.length();
//        System.out.println(len);
        StringBuffer res = new StringBuffer();
        for(int i = 0; i < len; i++){
            char index = str.charAt(i);
            if(String.valueOf(index).equals(" "))
                res.append("%20");
            else
                res.append(index);
        }
        return res.toString();
    }
    public String replaceSpaceMethod2(StringBuffer str){
        return str.toString().replaceAll("\\s", "%20");
    }
    public static void main(String[] args) {
        replaceSpace obj = new replaceSpace();
        System.out.println(obj.replaceSpaceMethod1(new StringBuffer("We Are Happy")));
        System.out.println(obj.replaceSpaceMethod2(new StringBuffer("We Are Happy")));
    }
}
