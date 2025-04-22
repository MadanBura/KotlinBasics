package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

class Solution{

    public void setZeros(int[][] arr){

        //first take row and col
        //then add to new array
        List<int[]> zeroArr = new ArrayList<>();

        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                if(arr[row][col]==0){
                    zeroArr.add(new int[]{row, col});
                }
            }
        }

        for (int[] a : zeroArr){
            int row = a[0];
            int col = a[1];


            for (int i=0; i<arr.length; i++){
                arr[row][i] = 0;
            }

            for (int j=0; j<arr[1].length; j++){
                arr[j][col] = 0;
            }

        }
    }



    public static void main(String args[]){

        Solution solution = new Solution();
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        solution.setZeros(matrix);

        // Print the result
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}