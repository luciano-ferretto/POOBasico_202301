//Declaração da Classe - Public -> Outras classes de outros pacotes tenham acesso 

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Veiculo {
    private static int anoMinimo = 1900;
    private static int anoMaximo = 2024;
    //Atributos - Acesso direto somente dentro da classe (encapsulamento)
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    // Métodos Getters and Setters - Métodos específicos para acessar os atributos.
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        if (marca.equals("Peugeot"))
            this.marca = "Nem a pau";
        else
            this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //Métodos construtores - São executados quando o objeto é instanciado
    Veiculo() {
        this("Sem marca definida");
    }
    Veiculo(String marca){
        this(marca, "Sem modelo definido");
    }
    Veiculo(String marca, String modelo) {
        this(marca, modelo, -1);
    }
    Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Sobrecarga de métodos - o identificador (nome) igual e os números e/ou tipos de parametros diferentes
    int calculaIdade() {
        return calculaIdade(2023);
    }
    int calculaIdade(int anoBase) {
        return anoBase - this.ano;
    }
    


    public static boolean verificaAno(int ano) {
        return ano >= anoMinimo && ano <= anoMaximo;
    }

    public static void inserirVeiculo(Veiculo veiculo) throws SQLException {
        String sql = "INSERT INTO veiculo (marca, modelo, ano) VALUES (?, ?, ?)";
        PreparedStatement stmt = DataBase.conexao.prepareStatement(sql);
        stmt.setString(1, veiculo.getMarca());
        stmt.setString(2, veiculo.getModelo());
        stmt.setInt(3, veiculo.getAno());
        //insere os dados no BD
        stmt.executeUpdate();

        
        PreparedStatement stmtt = DataBase.conexao.prepareStatement("select id from veiculo order by id desc limit 1");
        var registro = stmtt.executeQuery();
        registro.next();
        veiculo.setId(Integer.parseInt(registro.getString("id")));
    
}


    static {
        System.out.println("Iniciou Classe Veiculo");
    }
}
