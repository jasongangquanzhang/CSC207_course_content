public class ThreeInARowValidator extends WinValidator {

    public ThreeInARowValidator() {
        super(3);
    }

    @Override
    public boolean validate(Board board) {
        return true;
    }
}
