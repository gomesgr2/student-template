package aulas.aula7.data;

public class Data {
    int dia;
    int mes;
    int ano;

    int[] meses31 = new int[]{1, 3, 5, 7, 8, 10, 12};


    boolean testames31(int mes) {
        for (int mes31 : meses31) {
            if (mes31 == mes) {
                return true;
            }
        }

        return false;
    }


    Data(int dia, int mes, int ano) {

        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("dia deve estar em [1, 31]");
        }

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("mes deve estar em [1, 12]");
        }

        if (ano < 0 || ano > 2999) {
            throw new IllegalArgumentException("mes deve estar em [0, 2999]");
            
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    boolean bissexto(int ano) {
        if (ano < 0 || ano > 2999) {

        }
    }

    boolean anterior(Data data) {

    }

    boolean posterior(Data data) {

    }
 




}
