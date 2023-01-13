package exercicio;

import javax.swing.*;

public class ExercicioIdade {

/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Considere o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */
    public static void main(String[] args) {

        int diaData = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de hoje : "));
        int mesData = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês em que estamos : "));
        int anoData = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que estamos : "));

        int qntDias = 30;
        int qntMeses = 12;

        int escrevaDia = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o dia que você nasceu : "));
        int escrevaMes = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o mês que você nasceu : "));
        int escrevaAno = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o ano que você nasceu : "));

        int calcularAno = anoData - escrevaAno;



    }
}
