package gerenciamento.util;

import gerenciamento.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> listaProdutos;

    public Estoque() {
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void removerProduto(Produto produto) {
        listaProdutos.remove(produto);
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}