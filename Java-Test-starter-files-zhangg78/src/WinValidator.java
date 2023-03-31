public abstract class WinValidator {

    private int numToWin;

    public WinValidator(int n) {
        numToWin = n;
    }

    public abstract boolean validate(Board board);

    public int getNumToWin() {
        return numToWin;
    }

}
