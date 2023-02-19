import java.lang.reflect.Array;
import  java.util.Arrays;

public class InteiroSet {
    private boolean[] conjunto;

    public InteiroSet() {
        this.conjunto = new boolean[100];
        Arrays.fill(conjunto, false);
    }

    public InteiroSet(boolean[] conjunto) {
        if (conjunto.length != 100) {
            throw new IllegalArgumentException("O conjunto precisa ter 100 elementos!");
        }
        this.conjunto = Arrays.copyOf(conjunto, 100);
    }

    public boolean[] getConjunto() {
        return Arrays.copyOf(conjunto, 100);
    }

    public void setConjunto(boolean[] conjunto) {
        if (conjunto.length != 100) {
            throw new IllegalArgumentException("O conjunto precisa ter 100 elementos!");
        }
        this.conjunto = Arrays.copyOf(conjunto, 100);
    }

    public InteiroSet uniao(InteiroSet outroConjunto) {
        boolean[] novoConjunto = new boolean[100];
        for (int i = 0; i < 100; i++) {
            novoConjunto[i] = this.conjunto[i] || outroConjunto.conjunto[i];
        }
        return new InteiroSet(novoConjunto);
    }

    public InteiroSet interseccao(InteiroSet outroConjunto) {
        boolean[] novoConjunto = new boolean[100];
        for (int i = 0; i < 100; i++) {
            novoConjunto[i] = this.conjunto[i] && outroConjunto.conjunto[i];
        }
        return new InteiroSet(novoConjunto);
    }

    public void insereElemento(int x) {
        if (x < 0 || x > 99) {
            throw new IllegalArgumentException("O número deve estar entre 0 e 99.");
        }
        this.conjunto[x] = true;
    }

    public void removeElemento(int x) {
        if (x < 0 || x > 99) {
            throw new IllegalArgumentException("O número deve estar entre 0 e 99.");
        }
        this.conjunto[x] = false;
    }

    public String converteEmString() {
        StringBuilder sb = new StringBuilder("{ ");
        boolean temElemento = false;
        for (int i = 0; i < 100; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
                temElemento = true;
            }
        }
        sb.append(" }");
        return temElemento ? sb.toString() : "-";
    }

    public boolean eIgualA(InteiroSet outroConjunto) {
        return Arrays.equals(this.conjunto, outroConjunto.conjunto);
    }
}
