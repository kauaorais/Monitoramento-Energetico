public class EquipamentoEletronico extends Dispositivo {
    private double horasUsoDiario;

    public EquipamentoEletronico(String nome, double potencia, double horasUsoDiario) {
        super(nome, potencia);
        this.horasUsoDiario = horasUsoDiario;
    }

    public double getHorasUsoDiario() {
        return horasUsoDiario;
    }

    public void setHorasUsoDiario(double horasUsoDiario) {
        this.horasUsoDiario = horasUsoDiario;
    }

    @Override
    public double calcularConsumoDiario() {
        return getPotencia() * horasUsoDiario; // Consumo em Wh (watt-hora)
    }
}
