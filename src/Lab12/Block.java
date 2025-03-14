package Lab12;

public class Block {
    protected char[][] shape;

    public Block(String  type) {
        shape = BlockFactory.createBlock(type);
    }
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

    public void print(){
        for (char[] chars : shape) {
            for (int j = 0; j < shape[0].length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }

    public char[][] getShape() {
        return shape;
    }
}
