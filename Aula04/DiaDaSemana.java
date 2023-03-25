public class DiaDaSemana {
    public static void main(String[] args) {
        String dia = "Terça-feira";
        System.out.println(getInfDia(dia));
    }

    static String getInfDia(String dia) {
        return switch (dia) {
            case "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira" -> "Dia de semana";
            case "Sábado", "Domingo" -> "Final de semana";
            default -> "Dia informado inválido!";
        };
    }
}
