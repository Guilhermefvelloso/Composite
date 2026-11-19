package padroesestruturais.composite;

public class Arquivo extends ItemSistema {

    private int tamanho;

    public Arquivo(String descricao, int tamanho) {
        super(descricao);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getConteudo() {
        return "Arquivo: " + this.getDescricao() + " - tamanho: " + this.tamanho + " KB\n";
    }

}
