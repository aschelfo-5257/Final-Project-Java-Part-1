package BrickBreakerGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
    public int[][] map;
    public int brickWidth;
    public int brickHeight;
    private static final int BRICK_ACTIVE = 1;
    private static final int BRICK_INACTIVE = 0;
    private static final int HORIZONTAL_OFFSET = 80;
    private static final int VERTICAL_OFFSET = 50;
    // Use these in the draw method for clarity

    public MapGenerator(int row, int col) {
        map = new int[row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = 1;
            }
        }

        brickWidth = 540 / col;
        brickHeight = 150 / row;
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == BRICK_ACTIVE) {
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth + HORIZONTAL_OFFSET, i * brickHeight + VERTICAL_OFFSET, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + HORIZONTAL_OFFSET, i * brickHeight + VERTICAL_OFFSET, brickWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int col) {
        map[row][col] = value;
    }
    // Getters if needed...
}
