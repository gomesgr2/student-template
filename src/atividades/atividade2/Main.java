package atividades.atividade2;

public class Main {
    public static void main(String[] args) {
        Complexo numero1 = new Complexo(1, -2);
        Complexo numero2 = new Complexo(3, 4);

        System.out.println("c1 = " + numero1.converteParaString());
        System.out.println("c2 = " + numero2.converteParaString());

        Complexo soma = numero1.adiciona(numero2);
        System.out.println("c1 + c2 = " + soma.converteParaString());

        Complexo subtracao = numero1.subtrai(numero2);

        System.out.println("c1 - c2 = " + subtracao.converteParaString());

        Complexo multiplicacao = numero1.multiplica(numero2);

        System.out.println("c1 * c2 = " + multiplicacao.converteParaString());

        Complexo divisao = numero1.divide(numero2);

        System.out.println("c1 / c2 = " + divisao.converteParaString());

        Complexo c1 = new Complexo(1, 2); // c1 = 1 + 2i
        Complexo c2 = new Complexo(3, 4); // c2 = 3 + 4i

        Complexo c3 = c1.divide(c2); // c3 = 0.44 + 0.08i

        System.out.println("c3 " + c3.converteParaString());

    }
}
