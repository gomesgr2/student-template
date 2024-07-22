import aulas.aula7.bancos.ContaCorrente;

public class Main {
    
    public static void main(String[] args) throws Exception {
        ContaCorrente conta1 = new ContaCorrente("123-x", "fulano");
        ContaCorrente conta2 = new ContaCorrente("456-y", "ciclano");

        // creating a new object based on another
        ContaCorrente conta3 = new ContaCorrente(conta1.numeroDaConta, conta2.titular);

        System.out.println(System.identityHashCode(conta1));
        System.out.println(System.identityHashCode(conta2));
        System.out.println(System.identityHashCode(conta3));

    }
}
