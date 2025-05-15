package edu.igor.primeirasemana;
public class operadores {
    public static void main(String[] args) {
        String concatencao = "?";

        concatencao = 1 + 1 + 1 + "1";
        System.out.println(concatencao);

        concatencao = 1 + 1 + "1" + 1;

        System.out.println(concatencao);

        concatencao = "1" + 1 + 1 + "1";

        System.out.println(concatencao);

        concatencao = 1 + "1" + 1 + 1;

        System.out.println(concatencao);

        concatencao = "1" + (1 + 1 + 1);

        System.out.println(concatencao);

        int numero = -5;

        numero = -numero;
        System.out.println(numero);

        String nome1 = "Igor";
        String nome2 = new String("Igor");
        // Metodo equals compara o conteudo
        System.out.println(nome1.equals(nome2));
        // && = E
        // || = OU

    }

}
