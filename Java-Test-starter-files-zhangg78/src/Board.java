import java.util.ArrayList;
import java.util.List;

public class Board {

    public List<String> moves = new ArrayList<>();

    public Board() {
    }

    public Board(List<String> moves) {
        this.moves = moves;
    }

    public void moveX(int x, int y) {
        moves.add("X to " + x + "," + y);
    }

    public void moveO(int x, int y) {
        moves.add("O to " + x + "," + y);
    }
}
