package io.github.janezhangoo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public static void main(String[] args){
        SpiralOrder spiralOrder = new SpiralOrder();
        int[][] a = new int[3][4];
        System.out.println(spiralOrder.spiralOrder(a));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        List<Integer> newList = new ArrayList<>();
        for (int i = 0, j = 0; i < row && j < column; ) {
            System.out.println(i + " " + j);
            newList.add(matrix[i][j]);
            if (j < column -1) {
                j++;
            } else {
                i++;
            }
            if (i < row -1) {
                i++;
            } else {
                j++;
            }
        }
        return newList;

    }

}
