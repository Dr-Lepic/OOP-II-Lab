package Lab12;

public  class BlockFactory {
    public static char[][] createBlock(String type) {
        switch (type) {
            case "L":
                return new char[][] {
                        {'*', ' '},
                        {'*', ' '},
                        {'*', '*'}
                };
            case "O":
                return new char[][] {
                        {'*', '*', '*'},
                        {'*', '*', '*'},
                        {'*', '*', '*'}
                };
            case "I":
                return new char[][] {
                        {'*'},
                        {'*'},
                        {'*'}
                };
            case "j":
                return new char[][] {
                        {' ', '*'},
                        {' ', '*'},
                        {'*', '*'}
                };
            case "T":
                return new char[][] {
                        {'*', '*', '*'},
                        {' ', '*', ' '},
                        {' ', '*', ' '}
                };
            default:
                System.out.println("Unrecognized block type: " + type);

        }
        return new char[0][];
    }
}
