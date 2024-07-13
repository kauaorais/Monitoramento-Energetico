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
   