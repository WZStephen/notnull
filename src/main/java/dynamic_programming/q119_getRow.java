package dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class q119_getRow {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
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
        return res.get(rowIndex);
    }
    public static void main(String[] args) {
        q119_getRow obj = new q119_getRow();
        System.out.println(obj.getRow(3));
    }
}
