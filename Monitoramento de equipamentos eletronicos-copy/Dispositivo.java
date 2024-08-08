import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public abstract class Dispositivo {
    private String nome;
    private double potencia; // Em watts (W)

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
