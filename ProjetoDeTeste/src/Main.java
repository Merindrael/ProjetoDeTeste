

public class Main {
    public static void main(String[] args) {

        /* int velocidadeOnibus = 80;
        final double PI = 3.14;

        */

        /* *** tipos primitivos **** */

        /* tabelas e valores máximos */
        /* **tipo** || descrição
           *
           * byte   || números entre -128 e 127,
           * short  || números entre -32.278 e 32.767,
           * int    || numeros entre -2.147.438.648 e 2.147.4863.647,
           * long   || números entre -9.223.372.036.854.775.808 e -9.223.372.036.854.775.807,
           * float  || números com até 15 casas decimais,
           * double || números com até 15 casas decimais,
           * boolean|| armazena valores verdadeiro ou falso,
           * char   || armazena apenas 1 caracter;
         */
        /*byte idade = 52;
        int numeroCasa = 1819;
        short numeroCadastro = 1345;
        float preco = 34.96f;
        double total = 456.9867;
        boolean itemVisivel = true; //true(verdadeiro) false(falso)*/

        /* **Classes wrapper*** */
        /*
        Byte idadePessoa = 52;
        Integer numeroDaCasa = 1820;
        Double totalCompra = 456.900;
        String meuNome = "Rodrigo Silva"; // <--- Será muito utilizado daqui pra frente

        */
        /*System.out.println("velocidade variável do ônibus é: " + velocidadeOnibus);
        System.out.println("PI = " + PI);
        System.out.println("meuNome = " + meuNome);
        System.out.println("total = " + total);
        System.out.println("itemVisivel = " + itemVisivel);
        System.out.println("idadePessoa = " + idadePessoa);
        System.out.println("numeroDaCasa = " + numeroDaCasa);
        System.out.println("preco = " + preco);
        System.out.println("totalCompra = " + totalCompra);
        System.out.println("meuNome = " + meuNome);
        System.out.println("itemVisivel = " + itemVisivel);*/

        /*Operadores básicos*/
        /*
        + Somar
        - Subtrair
        * Multiplicar
        / Dividir
        % Resto da divisão
         */

        /*
            Precedeência de Operadores
            o que é resolvido primeiro nas operações matemáticas
            1) Parênteses
            2) Multiplicação e divisão
            3) Soma e subtração

         */

        /*int n1 = 20;
        int n2 = 40;
        int total = (n1 + n2) * n1;


        System.out.println("total é: " + total);
        */

        /* Operadores Relacionais */
        /* tipo   || Descrição

        1)   ==   || Igual a
        2)   !=   || Diferente
        3)   >    || Maior que
        4)   <    || Menor que
        5)   >=   || Maior ou igual
        6)   <=   || Menor ou igual

         */
        /*
        boolean teste = 10 >= 10;
        System.out.println(teste);
        */

        /* Operadores lógicos */
        /*
           *                || = ou
           *
           * Somente será falso se as duas condições forem falso,
           * caso contrário, o resultado séra verdadeiro.
           *
           *                && = e
           * Somente será verdadeiro se as duas condições forem verdadeiras,
           * caso contrário, falso.
           *
         */

        /*
           * Promoção Amazon
           * Nas compras >= 300 ou idade >= 50
           * Não paga frete
           **/

        double compra = 100;
        int idade = 50;

        boolean teste = compra >= 300 && idade >=50;

        System.out.println(teste);

    }
}