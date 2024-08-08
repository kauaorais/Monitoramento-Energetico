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

    public void exibirDados(MonitorEnergetico equipamento, double consumoDiarioPadrao, double consumoMensalPadrao) {
        double consumoDiario = equipamento.calcularConsumoDiario();
        double consumoMensal = equipamento.calcularConsumoMensal();
        System.out.println("Equipamento: " + equipamento.getNome());
        System.out.println("Consumo diário: " + consumoDiario + " Wh");
        System.out.println("Consumo mensal: " + consumoMensal + " Wh");
        
        // Comparando com o consumo padrão
        System.out.println("Comparação com consumo padrão:");
        System.out.println("Consumo diário padrão: " + consumoDiarioPadrao + " Wh");
        System.out.println("Consumo mensal padrão: " + consumoMensalPadrao + " Wh");
        
        if (consumoDiario > consumoDiarioPadrao) {
            System.out.println("O consumo diário é maior que o padrão.");
        } else if (consumoDiario < consumoDiarioPadrao) {
            System.out.println("O consumo diário é menor que o padrão.");
        } else {
            System.out.println("O consumo diário é igual ao padrão.");
        }
        
        if (consumoMensal > consumoMensalPadrao) {
            System.out.println("O consumo mensal é maior que o padrão.");
        } else if (consumoMensal < consumoMensalPadrao) {
            System.out.println("O consumo mensal é menor que o padrão.");
        } else {
            System.out.println("O consumo mensal é igual ao padrão.");
        }
    }
}
