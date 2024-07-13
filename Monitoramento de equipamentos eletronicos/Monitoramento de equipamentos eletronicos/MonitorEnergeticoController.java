 public class MonitorEnergeticoController {
    private MonitorEnergeticoView view;

    public MonitorEnergeticoController(MonitorEnergeticoView view) {
        this.view = view;
    }

    public void iniciar() {
        MonitorEnergetico equipamento = view.getDadosDoUsuario();
        double precoPorKWh = 0.50; // Pode ser solicitado ao usuário também
        view.exibirDados(equipamento, precoPorKWh);
    }

    public static void main(String[] args) {
        MonitorEnergeticoView view = new MonitorEnergeticoView();
        MonitorEnergeticoController controller = new MonitorEnergeticoController(view);
        controller.iniciar();
    }
}