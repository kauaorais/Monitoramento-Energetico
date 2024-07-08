 public class MonitorEnergetico extends EquipamentoEletronico {

    public MonitorEnergetico(String nome, double potencia, double horasUsoDiario) {
        super(nome, potencia, horasUsoDiario);
    }

    public double calcularConsumoMensal() {
        return calcularConsumoDiario() * 30; // Consumo mensal em Wh
    }

    public double calcularCustoMensal(double precoPorKWh) {
        double consumoMensalKWh = calcularConsumoMensal() / 1000; // Convertendo Wh para kWh
        return consumoMensalKWh * precoPorKWh; // Custo mensal em moeda local
    }
}
