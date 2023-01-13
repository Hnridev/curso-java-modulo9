package modulo9;

import CriandoClasseOO.Aluno;

public class PuxarObjeto {

    public static void main(String[] args) {

        /* new aluno() é uma instancia (criação de objeto) */
        /* aluno1 é uma referencia para o objeto aluno */

            /*O objeto ainda não existe na memoria */
        Aluno aluno1 = new Aluno();

            /*agora temos um objeto real na memoria*/
        Aluno aluno2 = new Aluno();

        Aluno aluno3 = new Aluno(); /* Aqui sera o joão*/
        aluno3.nome = "joão";

        Aluno aluno4 = new Aluno("Maria");/*Aqui será o Alex*/

        Aluno aluno5 = new Aluno("Balcks", 19);


    }

}
