import java.util.ArrayList;

public class Desejos extends ClasseAbstrataLista implements CarrinhoGenerico{
        public ArrayList<Produto> listadedesejos = new ArrayList<>();

        public int adicionarALista(int p){
            if(listadedesejos.size() < 5){
                listadedesejos.add(produtos[p]);
                return 1;
            }
        }
        public void limparLista(){
            listadedesejos.clear();
        }
        public  String retornarResumo(){
            System.out.println(listadedesejos);
        }
        public int getRestantes(){
            int a;
            a =  5 - listadedesejos.size();
            System.out.println(a);
        }
    public void removerUltimoDaLista(){
        listadedesejos.remove( listadedesejos.size());
    }
}








