package modulo9;

import CriandoClasseOO.Aluno;

public class PuxarObjeto {

    public static void main(String[] args) {
            /*O objeto ainda não existe na memoria */
        Aluno aluno1;
            /*agora temos um objeto real na memoria*/
        Aluno aluno2 = new Aluno();

        Aluno aluno3 = new Aluno(); /* Aqui sera o joão*/

        Aluno aluno4 = new Aluno("Maria");/*Aqui será o Alex*/

        Aluno aluno5 = new Aluno("Balcks", 19);


    }

}
