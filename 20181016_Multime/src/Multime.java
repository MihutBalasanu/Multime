public class Multime {

    private int[] date;
    private int dim;
    private int n;

    public Multime() {
        date = new int[dim];
        this.dim = 10;
        this.n = 0;
    }

    public Multime(int dim) {
        this.dim = 10;
        date = new int[dim];
        this.n = 0;
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
            for (int i = 0; i < n; i++) {
                if (date[i] == a) {
                    for (int j = i; j < n; j++) {
                        date[j] = date[j + 1];
                        date[n - 1] = 0;
                        n = n - 1;
                    }
                }
            }
        }
    }

    public void afisare() {
        for (int i = 0; i < n; i++) {
            System.out.print(date[i] + " ");
        }
        System.out.println();
    }
}


