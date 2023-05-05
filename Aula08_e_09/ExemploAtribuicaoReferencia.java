public class ExemploAtribuicaoReferencia {
    public static void main(String[] args) {
        Veiculo veiculo01, veiculo02;
        veiculo01 = new Veiculo();
        veiculo01.setAno(2015);
        
        veiculo02 = veiculo01;
        veiculo02.setAno(1995);

        System.out.println("Ano Veiculo01: " + veiculo01.getAno());
        System.out.println("Ano Veiculo02: " + veiculo02.getAno());
    }
}
