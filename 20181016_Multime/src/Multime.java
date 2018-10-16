public class Multime {

    private int[]date;
    private int dim;
    private int n;

    public Multime() {
        date = new int[dim];
        this.dim = 10;
        this.n = n;
    }

    public Multime(int dim) {
        this.dim = 10;
        date = new int[dim];
        this.n = n;
    }

    public void adauga(int a) {
            if (n < dim) {
                int i = 0;
                while (date[i] != a && i < n) {
                    i++;
                }
                if (i == n) {
                    date[n] = a;
                    n = n + 1;
                }
            } else {
                System.out.println("Multimea nu mai accepta niciun element!");
            
        }
    }

    public void extrage(int a) {
        if (n != 0) {
            for (int i = 0; i < n - 1; i++) {
                if (date[i] == a) {
                    for (int j = i; j < n - 1; j++) {
                        date[j] = date[j + 1];
                        date[n - 1] = 0;
                        n = n - 1;
                    }
                }
            }
        }
    }

    public void afisare(){
        for (int i = 0; i < n; i++) {
            System.out.print(date[i] + " ");
        }
    }

    public static void main(String[] args) {
        Multime m = new Multime(10);
        m.adauga(4);
        m.adauga(3);
        m.afisare();
        m.extrage(4);
        m.extrage(4);
        m.afisare();
        m.adauga(9);
        m.adauga(2);
        m.adauga(2);
        m.afisare();
    }
}
