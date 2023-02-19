public class Empregado {
    String nome, sobrenome;
    double salMensal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalMensal() {
        return salMensal;
    }

    public void setSalMensal(double salMensal) {
        this.salMensal = salMensal;
    }

    public Empregado(String nome, String sobrenome, double salMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salMensal = salMensal;
    }

    public double getSalAnual() {
        return salMensal * 12;
    }

    public void salAumento (double percentualAumento) {
        salMensal = salMensal * ((percentualAumento / 10) + 1);
    }
}
