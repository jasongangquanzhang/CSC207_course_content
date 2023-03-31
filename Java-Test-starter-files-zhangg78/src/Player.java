import java.util.List;

public class Player {
    private int num;
    private String name;

    public Player() {
        this.name = "X";
    }

    public Player(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public int countMoves(List<Board> lstBoard) {
        int count = 0;
        for (Board board : lstBoard) {
            for (String s : board.moves) {
                if (s.startsWith(name)) {
                    count++;
                }

            }

        }
        return count;
    }

    public static boolean hasLine(char[][] grid, char player) {
        int l = grid.length;
        for (char[] c : grid) {
            int j = 0;
            while (j < l && c[j] == player) {
                j++;
            }
            if (j == l) {
                return true;
            }
        }

        for (int i = 0; i < l; i++) {
            int j = 0;
            while (j < l && grid[j][i] == player) {
                j++;
            }
            if (j == l) {
                return true;
            }
        }

        int m = 0;
        while (m < l && grid[m][m] == player) {
            m++;
        }
        if (m == l) {
            return true;
        }

        int k = 0;
        while (k < l && grid[k][l - k - 1] == player) {
            k++;
        }
        return k == l;
    }


}
