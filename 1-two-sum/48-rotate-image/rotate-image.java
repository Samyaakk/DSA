class Solution {
    public void swap(int a,int b){
        int temp = a;
        a = b;
        b = a;
    }
    public void reverse(int arr[]){
        int a = 0;
        int b = arr.length-1;
        while(a<b){
            swap(arr[a],arr[b]);
            a++;
            b--;
        }
    }
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                // swap(matrix[i][j],matrix[j][i]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<matrix.length;i++){
            // reverse(matrix[i]);
            int a = 0;
            int b = matrix.length-1;
            while(a<b){
                int temp = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b] = temp;
                a++;
                b--;
            }
        }
        return;
    }
}