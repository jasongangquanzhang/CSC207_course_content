public class FourInARowValidator extends WinValidator {

    public FourInARowValidator() {
        super(4);
    }

    @Override
    public boolean validate(Board board) {
        //TO DO: implement a proper check to see if the board has four X's or O's in a row
        return true;
    }
}
