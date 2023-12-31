class Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0) {
                return false;
            }

        int start = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (matrix[mid / cols][mid % cols] == target) return true;
            if (matrix[mid / cols][mid % cols] < target ) start = mid + 1;
            else end = mid - 1;
        }

        return false;
        
    }

    public static void main(String[] args) throws Exception {
        Matrix m = new Matrix();
        int[][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        
        System.out.println(m.searchMatrix(matrix, 34));
    }
}