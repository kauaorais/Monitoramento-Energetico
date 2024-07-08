import java.util.Scanner;

public class MonitorEnergeticoView {
    private Scanner scanner;

    public MonitorEnergeticoView() {
        scanner = new Scanner(System.in);
    }

    public MonitorEnergetico getDadosDoUsuario() {
        System.out.print("Nome do equipamento: ");
        String nome = scanner.nextLine();
        System.out.print("Potência do equipamento (em watts): ");
        double potencia = scanner.nextDouble();
        System.out.print("Horas de uso diário: ");
        double horasUsoDiario = scanner.nextDouble();
        return new MonitorEnergetico(nome, potencia, horasUsoDiario);
    }

    public void exibirDados(MonitorEnergetico equipamento, double precoPorKWh) {
        System.out.println("Equipamento: " + equipamento.getNome());
        System.out.println("Consumo diário: " + equipamento.calcularConsumoDiario() + " Wh");
        System.out.println("Consumo mensal: " + equipamento.calcularConsumoMensal() + " Wh");
        System.out.println("Custo mensal: R$ " + equipamento.calcularCustoMensal(precoPorKWh));
    }
}
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