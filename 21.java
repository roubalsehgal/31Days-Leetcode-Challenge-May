class Solution {
	public int countSquares(int[][] matrix) {
		int count = 0;
		int numRow = matrix.length;
		int numCol = matrix[0].length;

		for (int i = 0; i < numRow; ++i) {
			for (int j = 0; j < numCol; ++j) {
				if (i != 0 && j != 0 && matrix[i][j] != 0) {
					matrix[i][j] = Math.min(matrix[i - 1][j], Math.min(matrix[i][j - 1], matrix[i - 1][j - 1])) + 1;
				};
				count += matrix[i][j];
			}
		}
		return count;
	}
}