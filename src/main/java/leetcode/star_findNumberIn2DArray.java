package leetcode;

/**
 在⼀个⼆维数组中，每⼀⾏都按照从左到右递增的顺序排序，每⼀列都按照从上到下递增的顺序
 排序。请完成⼀个函数，输⼊这样的⼀个⼆维数组和⼀个整数，判断数组中是否含有该整数。
 */
public class star_findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rows = matrix.length - 1;
        int columns = 0;
        while((rows >= 0) && columns < matrix[0].length){
            if(matrix[rows][columns] > target)
                rows--;
            else if(matrix[rows][columns] < target)
                columns++;
            else
                return true;
        }
        return false;
    }
    /**
     * data_type[][] array_name = {
     *                              {valueR1C1, valueR1C2, ....},
     *                              {valueR2C1, valueR2C2, ....}
     *                            };
     */
}
