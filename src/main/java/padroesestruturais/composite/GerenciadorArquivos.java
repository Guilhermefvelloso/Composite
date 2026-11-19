package padroesestruturais.composite;

public class GerenciadorArquivos {

    private ItemSistema diretorio;

    public void setDiretorio(ItemSistema diretorio) {
        this.diretorio = diretorio;
    }

    public String getDiretorio() {
        if (this.diretorio == null) {
            throw new NullPointerException("Gerenciador sem diretório");
        }
        return this.diretorio.getConteudo();
    }
}
