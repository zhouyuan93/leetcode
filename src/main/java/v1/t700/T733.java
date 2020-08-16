package v1.t700;

/**
 * @author yuan.zhou
 */
public class T733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int targetColor = image[sr][sc];

        if (targetColor == newColor) {
            return image;
        }

        floodFill(image, sr, sc, newColor, targetColor);

        return image;

    }

    public void floodFill(int[][] image, int sr, int sc, int newColor, int targetColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }

        if (image[sr][sc] != targetColor) {
            return;
        }

        image[sr][sc] = newColor;

        floodFill(image, sr + 1, sc, newColor, targetColor);
        floodFill(image, sr - 1, sc, newColor, targetColor);
        floodFill(image, sr, sc + 1, newColor, targetColor);
        floodFill(image, sr, sc - 1, newColor, targetColor);

    }
}
