class Solution {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		floodFill2(image, sr, sc, newColor, image[sr][sc]);
		return image;
	}
	private void floodFill2(int[][] image, int sr, int sc, int newColor, int oldColor) {
		if (image[sr][sc] != oldColor || image[sr][sc] == newColor) {
			return;
		}
		image[sr][sc] = newColor;
		if (sr - 1 >= 0) {
			floodFill2(image, sr - 1, sc, newColor, oldColor);
		}
		if (sr + 1 < image.length) {
			floodFill2(image, sr + 1, sc, newColor, oldColor);
		}
		if (sc - 1 >= 0) {
			floodFill2(image, sr, sc - 1, newColor, oldColor);
		}
		if (sc + 1 < image[0].length) {
			floodFill2(image, sr, sc + 1, newColor, oldColor);
		}
	}
}