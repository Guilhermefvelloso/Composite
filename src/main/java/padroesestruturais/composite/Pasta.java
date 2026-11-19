package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends ItemSistema {

    private List<ItemSistema> itens;

    public Pasta(String descricao) {
        super(descricao);
        this.itens = new ArrayList<ItemSistema>();
    }

    public void addItem(ItemSistema item) {
        this.itens.add(item);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Pasta: " + this.getDescricao() + "\n";
        for (ItemSistema item : itens) {
            saida += item.getConteudo();
        }
        return saida;
    }
}
