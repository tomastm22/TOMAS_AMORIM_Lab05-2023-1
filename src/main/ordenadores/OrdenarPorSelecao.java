package ordenadores;

public class OrdenarPorSelecao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        
        int tamanhoArray = array.length;

        for (int i = 0; i < tamanhoArray - 1; i++) {

            int indiceMenor = i;

            for (int j = i + 1; j < tamanhoArray; j++) {

                if (array[j] < array[indiceMenor]) {

                    indiceMenor = j;

                }
            }

            int temp = array[indiceMenor];
            array[indiceMenor] = array[i];
            array[i] = temp;
        }

        return array;

    }
    
}
