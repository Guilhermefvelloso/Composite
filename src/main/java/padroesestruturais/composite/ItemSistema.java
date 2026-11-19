package padroesestruturais.composite;

public abstract class ItemSistema {

    private String descricao;

    public ItemSistema(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getConteudo();
}
