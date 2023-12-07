package ordenadores;
public class OrdenarPorInsercao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

            int tamanhoArray = array.length;
            for (int i = 1; i < tamanhoArray; ++i) {
                int chave = array[i];
                int j = i - 1;
    
                while (j >= 0 && array[j] > chave) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = chave;
            }
        

        return array;
    }

}
