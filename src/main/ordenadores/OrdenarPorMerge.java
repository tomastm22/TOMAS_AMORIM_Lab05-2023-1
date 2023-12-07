package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    public int[] merge(int[] array1, int[] array2) {

        
        int tamanhoArray1 = array1.length;
        int tamanhoArray2 = array2.length;
        int[] arrayResultante = new int[tamanhoArray1 + tamanhoArray2];

        int indice_array1 = 0, indice_array2 = 0, indiceArrayResultante = 0;

        while (indice_array1 < tamanhoArray1 && indice_array2 < tamanhoArray2) {
            if (array1[indice_array1] <= array2[indice_array2]) {
                arrayResultante[indiceArrayResultante++] = array1[indice_array1++];
            } else {
                arrayResultante[indiceArrayResultante++] = array2[indice_array2++];
            }
        }

        while (indice_array1 < tamanhoArray1) {
            arrayResultante[indiceArrayResultante++] = array1[indice_array1++];
        }

        while (indice_array2 < tamanhoArray2) {
            arrayResultante[indiceArrayResultante++] = array2[indice_array2++];
        }

        return arrayResultante;

    }
    
}
