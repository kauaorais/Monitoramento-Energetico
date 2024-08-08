#Relatório Individual Trabalho de POO

Aluno: Felype Hipólito Vieira Silva
Responsabilidades: Introdução e Banco de Dados

## Introdução
A energia elétrica é um recurso fundamental na economia moderna, essencial para o funcionamento de todos os setores: industrial, comercial e residencial. O aumento do consumo energético está diretamente ligado ao desenvolvimento econômico, resultando em maior produtividade e conforto doméstico. Contudo, a necessidade de monitorar o consumo de energia é crucial para promover a eficiência energética, reduzir custos operacionais e minimizar impactos ambientais. Monitorar e avaliar o consumo em tempo real permite que empresas e consumidores tomem decisões conscientes e sustentáveis.
Segundo o Ministério do Planejamento (2014), a demanda de energia elétrica no Brasil deve triplicar até 2050, com cada habitante consumindo cerca de 7.100 kWh por ano. Sistemas tradicionais de monitoramento de energia muitas vezes não fornecem dados detalhados e em tempo real, dificultando a identificação de padrões de consumo e potenciais economias energéticas.
Desafios Identificados
1.	Consumo Excessivo de Energia: Sem sistemas eficazes de monitoramento, identificar e corrigir regiões de alto consumo é complicado, gerando altos custos e maior impacto ambiental.
2.	Ausência de Avisos e Notificações: Muitos sistemas não alertam os usuários sobre picos de consumo ou falhas, levando a desperdícios e possíveis falhas no sistema.
3.	Dificuldade na Visualização de Dados: A apresentação complexa dos dados de consumo dificulta a compreensão e impede decisões informadas sobre a eficiência energética.
4.	Incapacidade de Analisar a História de Consumo: A falta de análise histórica impede a detecção de tendências e padrões ao longo do tempo, inviabilizando melhorias sustentáveis.
5.	Falta de Integração com Outros Sistemas: Dificuldades na integração com ferramentas de gestão e automação restringem a utilização eficaz dos dados energéticos.
6.	Escalabilidade Limitada: Sistemas de monitoramento muitas vezes não são escaláveis, não atendendo às demandas de crescimento das empresas.
## Motivação
A necessidade deste projeto é superar essas limitações e fornecer uma solução de monitoramento de eletricidade precisa, eficiente e fácil de usar. Abordando essas questões, espera-se reduzir custos operacionais, melhorar a sustentabilidade e fornecer ferramentas para melhor gerenciamento do consumo de energia. A monitorização em tempo real pode auxiliar na comunicação e resolução de problemas, promovendo a eficiência energética.
Objetivo Geral
Criar um sistema de monitoramento eficaz de energia que permita uma análise minuciosa do consumo, apresente sugestões para otimização e informe os clientes sobre o funcionamento do sistema, seus pontos positivos e negativos, além de fornecer dicas para aprimoramento.
Dados de Entrada
Televisor (LED, 42") Potência: 100 W Consumo diário: 0,5 kWh (100 W x 5 h / 1000) Custo diário: R$ 0,35 (0,5 kWh x R$ 0,70)
Computador Desktop Potência: 250 W Consumo diário: 1,25 kWh (250 W x 5 h / 1000) Custo diário: R$ 0,88 (1,25 kWh x R$ 0,70)
Monitor de Computador Potência: 40 W Consumo diário: 0,2 kWh (40 W x 5 h / 1000) Custo diário: R$ 0,14 (0,2 kWh x R$ 0,70) 
Geladeira Potência: 150 W Consumo diário: 3,6 kWh (150 W x 24 h / 1000) Custo diário: R$ 2,52 (3,6 kWh x R$ 0,70)
Micro-ondas Potência: 1000 W Consumo diário: 0,5 kWh (1000 W x 0,5 h / 1000) Custo diário: R$ 0,35 (0,5 kWh x R$ 0,70)
Máquina de Lavar Roupas Potência: 500 W Consumo diário: 0,5 kWh (500 W x 1 h / 1000) Custo diário: R$ 0,35 (0,5 kWh x R$ 0,70)
Secadora de Roupas Potência: 2000 W Consumo diário: 1,0 kWh (2000 W x 0,5 h / 1000) Custo diário: R$ 0,70 (1,0 kWh x R$ 0,70)
Aspirador de Pó Potência: 1500 W Consumo diário: 0,75 kWh (1500 W x 0,5 h / 1000) Custo diário: R$ 0,53 (0,75 kWh x R$ 0,70)
Ar Condicionado (2 kW) Potência: 2000 W Consumo diário: 10 kWh (2000 W x 5 h / 1000) Custo diário: R$ 7,00 (10 kWh x R$ 0,70)
Ventilador Potência: 50 W Consumo diário: 0,25 kWh (50 W x 5 h / 1000) Custo diário: R$ 0,18 (0,25 kWh x R$ 0,70)

Banco de Dados
Para a Classe Banco de Dados, fiz primeiro um SQL no MySQL. Utilizando os seguintes códigos:
-- Criar o banco de dados 
CREATE DATABASE eletrodomesticos;
 -- Selecionar o banco de dados 
USE eletrodomesticos;
 -- Criar a tabela
 CREATE TABLE aparelhos (
 id INT AUTO_INCREMENT PRIMARY KEY,
 nome VARCHAR(50),
 potencia_watts INT, 
consumo_diario_kwh DECIMAL(5, 2),
 custo_diario DECIMAL(5, 2)
 );
 -- Inserir dados na tabela 
INSERT INTO aparelhos (nome, potencia_watts, consumo_diario_kwh, custo_diario) VALUES
 ('Televisor (LED, 42")', 100, 0.5, 0.35), ('Computador Desktop', 250, 1.25, 0.88), ('Monitor de Computador', 40, 0.2, 0.14), ('Geladeira', 150, 3.6, 2.52), ('Micro-ondas', 1000, 0.5, 0.35), ('Máquina de Lavar Roupas', 500, 0.5, 0.35), ('Secadora de Roupas', 2000, 1.0, 0.70), ('Aspirador de Pó', 1500, 0.75, 0.53), ('Ar Condicionado (2 kW)', 2000, 10.0, 7.00), ('Ventilador', 50, 0.25, 0.18), ('Lâmpadas (10 lâmpadas de 10 W cada)', 100, 0.5, 0.35), ('Chuveiro Elétrico', 5000, 3.0, 2.10), ('Forno Elétrico', 2000, 1.0, 0.70), ('Torradeira', 1200, 0.3, 0.21), ('Cafeteira', 1000, 0.5, 0.35), ('Celular (Carregador)', 10, 0.05, 0.04), ('Carregador de Notebook', 60, 0.3, 0.21), ('Home Theater', 200, 1.0, 0.70), ('Roteador de Internet', 10, 0.24, 0.17), ('Desumidificador', 300, 1.5, 1.05); 
-- Consultar dados 
SELECT * FROM aparelhos;




E também:
CREATE TABLE IF NOT EXISTS ConsumoPadrao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomeEquipamento VARCHAR(50),
    consumoDiarioPadrao DOUBLE,
    consumoMensalPadrao DOUBLE
);
INSERT INTO ConsumoPadrao (nomeEquipamento, consumoDiarioPadrao, consumoMensalPadrao) VALUES
('Televisor (LED, 42")', 0.5, 15.0),
('Computador Desktop', 1.25, 37.5),
('Monitor de Computador', 0.2, 6.0),
('Geladeira', 3.6, 108.0),
('Micro-ondas', 0.5, 15.0),
('Máquina de Lavar Roupas', 0.5, 15.0),
('Secadora de Roupas', 1.0, 30.0),
('Aspirador de Pó', 0.75, 22.5),
('Ar Condicionado (2 kW)', 10.0, 300.0),
('Ventilador', 0.25, 7.5),
('Lâmpadas (10 lâmpadas de 10 W cada)', 0.5, 15.0),
('Chuveiro Elétrico', 3.0, 90.0),
('Forno Elétrico', 1.0, 30.0),
('Torradeira', 0.3, 9.0),
('Cafeteira', 0.5, 15.0),
('Celular (Carregador)', 0.05, 1.5),
('Carregador de Notebook', 0.3, 9.0),
('Home Theater', 1.0, 30.0),
('Roteador de Internet', 0.24, 7.2),
('Desumidificador', 1.5, 45.0);
Assim, fiz a conexão do SQL com o BlueJ e projetei a Classe ‘BancoDeDados’ com os seguintes comandos: 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class BancoDeDados {
    public static void main(String[] args) {
        // Parâmetros de conexão
        String jdbcURL = "jdbc:mysql://localhost:3306/eletrodomesticos";
        String username = "root
        String password = "root"; 

        try {
            // Registrando o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabelecendo conexão
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Conectado ao banco de dados com sucesso!");
            // Criando uma declaração
            Statement statement = connection.createStatement();
            // Criando tabela aparelhos
            String createTableSQL = "CREATE TABLE IF NOT EXISTS aparelhos ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "nome VARCHAR(50), "
                    + "potencia_watts INT, "
                    + "consumo_diario_kwh DECIMAL(5, 2), "
                    + "custo_diario DECIMAL(5, 2)"
                    + ")";
            statement.executeUpdate(createTableSQL);
            System.out.println("Tabela aparelhos criada com sucesso!");

            // Inserindo dados na tabela aparelhos
            String insertDataSQL = "INSERT INTO aparelhos (nome, potencia_watts, consumo_diario_kwh, custo_diario) VALUES "
                    + "('Televisor (LED, 42\")', 100, 0.5, 0.35), "
                    + "('Computador Desktop', 250, 1.25, 0.88), "
                    + "('Monitor de Computador', 40, 0.2, 0.14), "
                    + "('Geladeira', 150, 3.6, 2.52), "
                    + "('Micro-ondas', 1000, 0.5, 0.35), "
                    + "('Máquina de Lavar Roupas', 500, 0.5, 0.35), "
                    + "('Secadora de Roupas', 2000, 1.0, 0.70), "
                    + "('Aspirador de Pó', 1500, 0.75, 0.53), "
                    + "('Ar Condicionado (2 kW)', 2000, 10.0, 7.00), "
                    + "('Ventilador', 50, 0.25, 0.18), "
                    + "('Lâmpadas (10 lâmpadas de 10 W cada)', 100, 0.5, 0.35), "
                    + "('Chuveiro Elétrico', 5000, 3.0, 2.10), "
                    + "('Forno Elétrico', 2000, 1.0, 0.70), "
                    + "('Torradeira', 1200, 0.3, 0.21), "
                    + "('Cafeteira', 1000, 0.5, 0.35), "
                    + "('Celular (Carregador)', 10, 0.05, 0.04), "
                    + "('Carregador de Notebook', 60, 0.3, 0.21), "
                    + "('Home Theater', 200, 1.0, 0.70), "
                    + "('Roteador de Internet', 10, 0.24, 0.17), "
                    + "('Desumidificador', 300, 1.5, 1.05)";
            statement.executeUpdate(insertDataSQL);
            System.out.println("Dados inseridos na tabela aparelhos com sucesso!");

            // Criando tabela ConsumoPadrao
            String createConsumoPadraoTableSQL = "CREATE TABLE IF NOT EXISTS ConsumoPadrao ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "nomeEquipamento VARCHAR(50), "
                    + "consumoDiarioPadrao DOUBLE, "
                    + "consumoMensalPadrao DOUBLE)";
            statement.executeUpdate(createConsumoPadraoTableSQL);
            System.out.println("Tabela ConsumoPadrao criada com sucesso!");

            // Inserindo dados na tabela ConsumoPadrao
            String insertConsumoPadraoSQL = "INSERT INTO ConsumoPadrao (nomeEquipamento, consumoDiarioPadrao, consumoMensalPadrao) VALUES "
                    + "('Televisor (LED, 42\")', 0.5, 15.0), "
                    + "('Computador Desktop', 1.25, 37.5), "
                    + "('Monitor de Computador', 0.2, 6.0), "
                    + "('Geladeira', 3.6, 108.0), "
                    + "('Micro-ondas', 0.5, 15.0), "
                    + "('Máquina de Lavar Roupas', 0.5, 15.0), "
                    + "('Secadora de Roupas', 1.0, 30.0), "
                    + "('Aspirador de Pó', 0.75, 22.5), "
                    + "('Ar Condicionado (2 kW)', 10.0, 300.0), "
                    + "('Ventilador', 0.25, 7.5), "
                    + "('Lâmpadas (10 lâmpadas de 10 W cada)', 0.5, 15.0), "
                    + "('Chuveiro Elétrico', 3.0, 90.0), "
                    + "('Forno Elétrico', 1.0, 30.0), "
                    + "('Torradeira', 0.3, 9.0), "
                    + "('Cafeteira', 0.5, 15.0), "
                    + "('Celular (Carregador)', 0.05, 1.5), "
                    + "('Carregador de Notebook', 0.3, 9.0), "
                    + "('Home Theater', 1.0, 30.0), "
                    + "('Roteador de Internet', 0.24, 7.2), "
                    + "('Desumidificador', 1.5, 45.0)";
            statement.executeUpdate(insertConsumoPadraoSQL);
            System.out.println("Dados inseridos na tabela ConsumoPadrao com sucesso!");

            // Consultando e imprimindo dados da tabela aparelhos
            String selectAparelhosSQL = "SELECT * FROM aparelhos";
            ResultSet resultSetAparelhos = statement.executeQuery(selectAparelhosSQL);

            System.out.println("Dados da tabela 'aparelhos':");
            while (resultSetAparelhos.next()) {
                int id = resultSetAparelhos.getInt("id");
                String nome = resultSetAparelhos.getString("nome");
                int potencia = resultSetAparelhos.getInt("potencia_watts");
                double consumo = resultSetAparelhos.getDouble("consumo_diario_kwh");
                double custo = resultSetAparelhos.getDouble("custo_diario");

                System.out.println("ID: " + id + ", Nome: " + nome + ", Potência: " + potencia + " W, Consumo Diário: " + consumo + " kWh, Custo Diário: R$ " + custo);
            }
            // Fechando a conexão
            resultSetAparelhos.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
