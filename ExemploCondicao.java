public class ExemploCondicao {

    public static void main(String[] args) {


        boolean verdadeiro = true;
        if (verdadeiro) {

            System.out.println("A condicao é verdadeira");
        } else {
            System.out.println("A condicao é falsa");
        }


        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        int numero4 = 40;

        if (numero1 != 10) {
            System.out.println("O primeiro número é diferente de 10");
        } else if (numero2 == 30) {
            System.out.println("O segundo número é igual a 30");
        } else if (numero3 < 20) {
            System.out.println("O terceiro número é menor que 20");
        } else if (numero4 > 40) {
            System.out.println("O quarto número é maior que 40");
        } else {
            System.out.println("Nenhuma condição foi atendida");
        }

    }
}
