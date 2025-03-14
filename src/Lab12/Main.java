package Lab12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Block block = new Block('L');
//        block.print();
//        Game game = new Game();
//        game.placeBlock(block, 2, 0, 0);
//        game.placeBlock(new Block('O'), 2, 0, 3);
//        game.printGrid();

        Scanner input = new Scanner(System.in);
        Game game = new Game();

        while (true) {
            System.out.println("Block: ");
            String block = input.nextLine();
            if (block.equals("-")) break;

            System.out.println("Rotation: ");
            int rotation = Integer.parseInt(input.nextLine());

            System.out.println("X, Y: ");
            String[] temp = input.nextLine().split(" ");


            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);

            Block block1 = new Block(block);
            game.placeBlock(block1, rotation, x, y);
        }
        input.close();
        game.printGrid();
    }
}
