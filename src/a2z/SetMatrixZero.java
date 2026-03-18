package a2z;

import java.util.HashSet;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};

        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col= new HashSet<>();



        for (int[] value : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(value[j] + " ");

            }
            System.out.println();

        }

        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++){
               if(matrix[i][j]==0){
                   row.add(i);
                   col.add(j);
               }

            }

        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++){
                if(row.contains(i) || col.contains(j)){
                  matrix[i][j] = 0;
                }

            }

        }

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");

            }
            System.out.println();

        }




    }
}
