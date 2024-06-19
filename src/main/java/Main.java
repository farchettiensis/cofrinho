import controller.CofrinhoController;
import model.Cofrinho;
import view.MainView;

public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        CofrinhoController controller = new CofrinhoController(cofrinho);
        MainView view = new MainView(controller);

        view.iniciar();
    }
}
