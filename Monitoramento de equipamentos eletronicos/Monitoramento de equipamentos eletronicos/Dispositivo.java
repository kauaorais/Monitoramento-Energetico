public abstract class Dispositivo {
    private String nome;
    private double potencia;

    public Dispositivo(String nome, double potencia) {
        this.nome = nome;
        this.potencia = potencia;
    }

    public String getNome() {
        return nome;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
      public abstract double calcularConsumoDiario();
}
