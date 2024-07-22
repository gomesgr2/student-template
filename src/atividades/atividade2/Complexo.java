package atividades.atividade2;

public class Complexo {
    double real;
    double imaginario;


    String converteParaString() {
        return String.format("%.2f + %.2fi", real, imaginario);
    }

    Complexo(double r, double i) {
        real = r;
        imaginario = i;
    }

    Complexo adiciona(Complexo c) {
        return new Complexo(real + c.real, imaginario + c.imaginario);
    }

    Complexo subtrai(Complexo c) {
        return new Complexo(real - c.real, imaginario - c.imaginario);
    }

    Complexo multiplica(Complexo c) {
        double resultadoReal = ((real * c.real) - (imaginario * c.imaginario));
        double resultadoImaginario = ((real * c.imaginario) + (imaginario * c.real));
        return new Complexo(resultadoReal, resultadoImaginario);
    }

    Complexo divide(Complexo c) {
        double resultadoReal = ((real * c.real) + (imaginario * c.imaginario))/(c.real*c.real + c.imaginario*c.imaginario) ;
        double resultadoImaginario = ((imaginario * c.real) - (real * c.imaginario))/((c.real*c.real + c.imaginario*c.imaginario));
        return new Complexo(resultadoReal, resultadoImaginario);
    }
}
