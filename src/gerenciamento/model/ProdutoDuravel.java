package gerenciamento.model;

public class ProdutoDuravel extends Produto {
    private int garantia;

    public ProdutoDuravel(int id, String nome, float preco, int quantidadeEstoque, int garantia) {
        super(id, nome, preco, quantidadeEstoque);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
