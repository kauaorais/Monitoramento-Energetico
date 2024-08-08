import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MonitorEnergeticoController {
    private MonitorEnergeticoView view;

    public MonitorEnergeticoController(MonitorEnergeticoView view) {
        this.view = view;
    }

    private double[] obterConsumoPadrao(String nomeEquipamento) {
        double[] consumoPadrao = new double[2]; // [0] = consumoDiarioPadrao, [1] = consumoMensalPadrao
        String url = "jdbc:mysql://localhost:3306/eletrodomesticos";
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT consumoDiarioPadrao, consumoMensalPadrao FROM ConsumoPadrao WHERE nomeEquipamento = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, nomeEquipamento);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        consumoPadrao[0] = rs.getDouble("consumoDiarioPadrao");
                        consumoPadrao[1] = rs.getDouble("consumoMensalPadrao");
                    } else {
                        System.out.println("Equipamento não encontrado na tabela de consumo padrão.");
                        consumoPadrao[0] = 0;
                        consumoPadrao[1] = 0;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return consumoPadrao;
    }

    public void iniciar() {
        MonitorEnergetico equipamento = view.getDadosDoUsuario();
        double[] consumoPadrao = obterConsumoPadrao(equipamento.getNome());

        // Exibir dados e comparações
        view.exibirDados(equipamento, consumoPadrao[0], consumoPadrao[1]);
    }

    public static void main(String[] args) {
        MonitorEnergeticoView view = new MonitorEnergeticoView();
        MonitorEnergeticoController controller = new MonitorEnergeticoController(view);
        controller.iniciar();
    }
}