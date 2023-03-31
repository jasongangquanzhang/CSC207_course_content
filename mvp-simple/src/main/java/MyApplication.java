import javax.swing.*;

public class MyApplication {
    public MyApplication() {
        final View view = new View();
        final Model model = new Model();
        new Presenter(view, model);
    }

    public static void main(String... args) {
        SwingUtilities.invokeLater(MyApplication::new);
    }
}
