public class Fatura {
    String numeroItem;
    String descricaoItem;
    int qtdItem;
    double precoItem;

    public String getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public Fatura(String numeroItem, String descricaoItem, int qtdItem, double precoItem) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.qtdItem = qtdItem;
        this.precoItem = precoItem;
    }

    public double getTotalFatura() {
        double total = qtdItem * precoItem;
        if (total < 0) {
            total = 0;
        }
        return total;
    }
}
