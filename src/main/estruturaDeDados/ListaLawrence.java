package estruturaDeDados;

public class ListaLawrence implements Lista {
    int[] lista = new int [20];

    @Override
    public boolean buscaElemento(int valor) {
       for(int i = 0; i < lista.length; i++){
        if(lista[i] == valor){
            return true;
        }
       }return false;
    }

    @Override
    public int minimo() {
        int min = lista [0]; 
        for(int i = 1; i < lista.length; i++){
            if(min > lista[i]){
                min = lista[i];
            }
        } return min;
    }

    @Override
    public int maximo() {
        int max = lista [0]; 
        for(int i = 1; i < lista.length; i++){
            if(max < lista[i]){
                max = lista[i];
            }
        } return max;
    }

    @Override
    public int predecessor(int valor) {
        for(int i = 1; i < lista.length; i++){
            if(lista[i] == valor){
                if(i - 1 >= 0){
                    return lista[i - 1];
                } else {
                    return -1;
                }
            }
        } return valor;
    }
    

    @Override
    public int sucessor(int valor) {
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == valor){
                if(i + 1 < lista.length){
                    valor = lista[i + 1];
                    return valor;
                }
            }
        }
        return -1;
    }

    @Override
    public void insereElemento(int valor) {
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == 0){
                lista[i] = valor;
                return;
            }
        }
        }

    @Override
    public void remove(int valor) {
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == valor){
                lista[i] = 0;
            }
        }
    }

    @Override
    public int buscaIndice(int valor) {
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == valor){
                return i;
            }
        } return -1;
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        if(buscaIndice >= lista.length || buscaIndice < 0){
            System.out.println("A lista é menor que o tamanho desejado");
            return;
        } 
        lista[buscaIndice] = valor;
        }

    @Override
    public void insereInicio(int valor) {
        for(int i = lista.length -1; i > 0; i--){
            lista[i] = lista[i - 1];
            }
            lista[0] = valor;
        }

    @Override
    public void insereFim(int valor) {
        for(int i = lista.length - 1; i > 0; i--){
            lista[i] = lista[i - 1];
            }
            lista[lista.length - 1] = valor;
        }

    @Override
    public void removeIndice(int indice) {
        if(indice >= lista.length || indice < 0){
            System.out.println("A lista é menor que o tamanho desejado");
            return;
        }
        lista[indice] = 0;
    }

    @Override
    public void removeInicio() {
        if(lista.length == 0){
            System.out.println("Lista vazia.");
            return;
        }
        for(int i = 0; i < lista.length - 1; i++){
            lista[i] = lista[i + 1];
            }
        lista[lista.length - 1] = 0;
    }

    @Override
    public void removeFim() {
        if(lista.length == 0){
            System.out.println("Lista vazia.");
            return;
        }
        lista[lista.length -1] = 0;
    }
}
