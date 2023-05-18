package gerenciamento.model;
import java.util.ArrayList;
import java.util.List;
public class Venda {
    private int id;
    private String data;
    private List<Produto> listaProdutos;

    public Venda(int id, String data) {
        this.id = id;
        this.data = data;
        this.listaProdutos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void removerProduto(Produto produto) {
        listaProdutos.remove(produto);
    }
}