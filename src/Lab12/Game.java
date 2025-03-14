package Lab12;

public class Game {
    private final int ROWS = 20;
    private final int COLS = 10;
    private char[][] grid;

    public Game() {
        grid = new char[ROWS][COLS];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public void printGrid() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void placeBlock(Block block, int rotation, int x, int y) {
        for(int i=0; i<rotation; i++) {
            block.rotate();
        }

        char[][] shape = block.getShape();
        for(int i =0; i<shape.length; i++) {
            for(int j =0; j<shape[0].length; j++) {
                if(shape[i][j] == '*') {
                    grid[x+i][y+j] = '*';
                }
            }
        }

    }


}
