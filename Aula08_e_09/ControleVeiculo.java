public class ControleVeiculo {
    public static void main(String[] args) {

        // Declarando um variável do tipo Veiculo
        Veiculo veiculo01;
        // Insntanciando (criando) um objeto (espaço na memória) do tipo Veiculo
        // e atribuindo na variavel veiculo01
        veiculo01 = new Veiculo();
        veiculo01 = new Veiculo("Fiat", "Uno", 2015);

        // Declarando nova variavel, instanciando novo objeto e atribuindo.
        Veiculo veiculo02 = new Veiculo("Volksvagem", "Fusca", 1995);

        int idade01 = veiculo01.calculaIdade();
        
        System.out.print("A idade do veículo " + veiculo01.getMarca() + "-" + veiculo01.getModelo() + " é: " + idade01);
        
        System.out.print("A idade do veículo " + veiculo02.getMarca() + "-" + veiculo02.getModelo() + " é: " + veiculo02.calculaIdade(2023));
        
    }
}
