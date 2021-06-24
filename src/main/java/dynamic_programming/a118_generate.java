package dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class a118_generate {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || i == j){
                    row.add(1);
                } else{
                    row.add(
                            res.get(i-1).get(j-1)
                            +
                            res.get(i-1).get(j)
                    );
                }
            }
            res.add(row);
        }
        return res;
    }
    public static void main(String[] args) {
        a118_generate obj = new a118_generate();
        System.out.println(obj.generate(5));
    }
}
