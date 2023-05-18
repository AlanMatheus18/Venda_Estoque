package gerenciamento.model;
public class ProdutoNaoDuravel extends Produto {
    private String tipo;

    public ProdutoNaoDuravel(int id, String nome, float preco, int quantidadeEstoque, String tipo) {
        super(id, nome, preco, quantidadeEstoque);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}