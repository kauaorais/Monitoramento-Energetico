public class MonitorEnergetico extends EquipamentoEletronico {

    public MonitorEnergetico(String nome, double potencia, double horasUsoDiario) {
        super(nome, potencia, horasUsoDiario);
    }

    public double calcularConsumoMensal() {
        return calcularConsumoDiario() * 30; // Consumo mensal em Wh
    }
}
