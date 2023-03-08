public class Principal {

    public static void exibe(int[] vet, int TL)
    {
        for (int i = 0; i < TL; i++) {
            System.out.printf("[%d]", vet[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] vet = {9, 4, 18, 10, 2, 20, 6, 14, 8, 13, 17, 3, 7};
        int TL = 13;
        int dist = 4;
        int aux;

        exibe(vet, TL);
        while (dist > 0) {

            for (int i = 0; i < dist; i++) {
                for (int j = i; j + dist < TL; j += dist) {
                    if (vet[j + dist] < vet[j])
                    {
                        int k = j + dist;
                        do {
                            aux = vet[k];
                            vet[k] = vet[k - dist];
                            vet[k - dist] = aux;

                            k -= dist;
                        } while (k - dist >= i && vet[k] < vet[k - dist]);
                    }
                }
            }
            dist /= 2;
        }
        exibe(vet, TL);
    }
}
