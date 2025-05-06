package br.edu.principal;
public class Principal {

    public static int calcularDuracaoEmMinutos(int horaInicio, int minutoInicio, int horaFim, int minutoFim) {
        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int fimEmMinutos = horaFim * 60 + minutoFim;

        if (fimEmMinutos <= inicioEmMinutos) {
            fimEmMinutos += 24 * 60;         }

        return fimEmMinutos - inicioEmMinutos;
    }

    public static void main(String[] args) {
        int duracao = calcularDuracaoEmMinutos(22, 30, 1, 15);
        System.out.println("Duração do jogo: " + duracao + " minutos");
    }
}
