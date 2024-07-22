package aulas.aula7.bancos;
public class ContaCorrente {
    public String numeroDaConta;
    public String titular;
    public float saldo;

    public ContaCorrente(String numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = 0;    
    }
}
