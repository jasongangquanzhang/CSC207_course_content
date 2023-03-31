public class XOGame {

    public static void main(String[] args) {

        //NOTE: this code is not fully functional and will not produce meaningful output.
        Board board = new Board();

        WinValidator validator1 = new ThreeInARowValidator();

        WinValidator validator2 = new FourInARowValidator();

        board.moveX(0, 0);
        board.moveO(1, 2);
        board.moveX(0, 2);
        board.moveO(1, 1);
        board.moveX(0, 1);
        if (validator1.validate(board)) System.out.println("Three in a row are the same.");
        if (validator2.validate(board)) System.out.println("Four in a row are the same.");

    }
}