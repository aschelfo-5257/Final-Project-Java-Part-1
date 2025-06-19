package brickBreaker;

public class MapGenerator {
  private int map[][];
  private int brickWidth;
  private double brickHeight;
  public MapGenerator(int row, int col) {
    map = new int[row][col];
    for(int i = 0; i < map.length; i++) {
      for(int j=0; j < map[0].length; j++) {
        map[i][j] = 1;
      }
    }
    
    brickWidth = 540/col;
    brickHeight = 150.0/row;
  }
  /**
   * Draws the bricks on the game board using the provided Graphics2D object.
   * 
   * @param g the Graphics2D object used for rendering the bricks
   */
  public void draw(Graphics2D g) {
    g.setStroke(new BasicStroke(3));
    for(int i = 0; i < map.length; i++) {
      for(int j=0; j < map[0].length; j++) {
        if(map[i][j] > 0) {
          g.setColor(Color.white);
          g.fillRect(j * brickWidth + 80, (int)(i * brickHeight + 50), brickWidth, (int)brickHeight);

          g.setColor(Color.black);
          g.drawRect(j * brickWidth + 80, (int)(i * brickHeight + 50), brickWidth, (int)brickHeight);
        }
        
      }
    }
  }

  public void setBrickValue(int value, int row, int col) {
    map[row][col] = value;
  }

  public int[][] getMap() {
    return map;
  }

  public int getBrickWidth() {
    return brickWidth;
  }

  public double getBrickHeight() {
    return brickHeight;
  }
}
