class FaturaTeste {
    public static void main(String[] args) {
        Fatura f1 = new Fatura("008", "Mouse Gamer de Última Geração", 4, 140.0);

        System.out.println("Número do Item: " + f1.getNumeroItem());
        System.out.println("Descrição do Item: " + f1.getDescricaoItem());
        System.out.println("Quantidade: " + f1.getQtdItem());
        System.out.println("Preço por Item: " + "R$ " + f1.getPrecoItem());

        double total = f1.getTotalFatura();
        System.out.println("\nFatura Total é de: " + "R$ " + total);
    }
}
