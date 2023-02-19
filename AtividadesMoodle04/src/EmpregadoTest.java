public class EmpregadoTest {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Jorginho", "Pedrovsky", 1500.80);
        Empregado e2 = new Empregado("Maracaí", "Totatin", 2580.50);

        System.out.println("Salário do Empregado 1 é de: " + "R$ " + e1.getSalMensal());
        System.out.println("Salário do Empregado 2 é de: " + "R$ " + e2.getSalMensal());

        e1.salAumento(10);
        System.out.println("\nSalário Anual do Empregado 1 com o Aumento de 10% é: " + "R$ " + e1.getSalAnual());

        e2.salAumento(10);
        System.out.println("Salário Anual do Empregado 2 com o Aumento de 10% é: " + "R$ " + e2.getSalAnual());
    }
}
