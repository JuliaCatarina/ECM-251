import java.util.ArrayList;

public interface CarrinhoGenerico  {

         ArrayList<Produto> lista = new ArrayList<>();

         int adicionarALista(int p);

         void limparLista();

         String retornarResumo();

         int getRestantes();


         void removerUltimoDaLista();



}
