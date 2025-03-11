package Lab12;

public abstract class Block {
    private char[][] shape;

    public void rotate(){
        int rows = shape.length;
        int cols = shape[0].length;
        char[][] newShape = new char[cols][rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                newShape[j][rows - 1 - i] = shape[i][j];
            }
        }
        shape = newShape;
    }

    public char[][] getShape() {
        return shape;
    }
}
