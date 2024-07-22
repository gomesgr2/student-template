package aulas.aula9.universidade;

/**
 * Modelo de estudante de gradução da ufabc
 */

public class Estudante {
    private String nome;
    private String ra;
    private double[] notas;

    /**
     * Constrói um novo estudante
     * 
     * @param nome  O nome do estudante
     * @param ra    O RA no formato UFABC
     * @param notas as notas obtidas (de 0 a 10)
     */

    public Estudante(String nome, String ra, double[] notas) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
    }

    /**
     * Valida se o RA está no formato UFABC
     * 
     * @param ra o RA
     */
    private void validaRa(String ra) {
        if (!ra.matches("\\d{11}")) {
            throw new IllegalArgumentException("RA possui formato inválido");
        }
    }

    /**
     * Consulta o nome completo do estudante
     * 
     * @return O nome completo
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome do estudante
     * 
     * @param nome o novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Consulta o RA
     * 
     * @return o RA
     */
    public String getRa() {
        return ra;
    }

    /**
     * Altera o RA
     * 
     * @param ra o novo RA
     */
    public void setRa(String ra) {
        validaRa(ra);
        this.ra = ra;
    }

    /**
     * Obtém a referência para o array de notas do estudante
     * 
     * @return
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * Substitui o array de notas
     * 
     * @param notas O novo array de notas
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    private double somaNotas() {
        double soma = 0;
        for (var nota : notas) {
            soma += nota;
        }
        return soma;
    }

    public double getMedia() {
        if (notas.length == 0) {
            return 0;
        }

        return somaNotas() / notas.length;
    }

}