import java.util.ArrayList;


public class Carrinho extends ClasseAbstrataLista implements CarrinhoGenerico  {
    public ArrayList<Produto> listadecompras = new ArrayList<>();

    public  int adicionarALista(int p){
        if(listadecompras.size() < 12){
            listadecompras.add(Loja.produtos[p]);

        }
    }
    public void limparLista(){
        listadecompras.clear();
    }
    public String retornarResumo(){
        return listadecompras.toString();
    }
    public int getRestantes(){
        int a;
        a = 12 - listadecompras.size();
        return a;

    }
    public void removerUltimoDaLista(){
        listadecompras.remove( listadecompras.size());
    }

}

