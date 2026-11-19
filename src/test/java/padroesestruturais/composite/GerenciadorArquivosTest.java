package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenciadorArquivosTest {

    @Test
    void deveRetornarDiretorioGerenciador() {
        Pasta pasta1 = new Pasta("Documentos");

        Pasta pasta2 = new Pasta("Imagens");
        Arquivo arquivo21 = new Arquivo("Foto.png", 250);
        pasta2.addItem(arquivo21);

        Pasta pasta3 = new Pasta("Projetos");
        Arquivo arquivo31 = new Arquivo("ProjetoJava.java", 15);
        Arquivo arquivo32 = new Arquivo("README.md", 5);
        pasta3.addItem(arquivo31);
        pasta3.addItem(arquivo32);

        Pasta diretorio = new Pasta("Meus Arquivos");
        diretorio.addItem(pasta1);
        diretorio.addItem(pasta2);
        diretorio.addItem(pasta3);

        GerenciadorArquivos gerenciador = new GerenciadorArquivos();
        gerenciador.setDiretorio(diretorio);

        assertEquals("Pasta: Meus Arquivos\n" +
                "Pasta: Documentos\n" +
                "Pasta: Imagens\n" +
                "Arquivo: Foto.png - tamanho: 250 KB\n" +
                "Pasta: Projetos\n" +
                "Arquivo: ProjetoJava.java - tamanho: 15 KB\n" +
                "Arquivo: README.md - tamanho: 5 KB\n", gerenciador.getDiretorio());
    }

    @Test
    void deveRetornarExcecaoGerenciadorSemDiretorio() {
        try {
            GerenciadorArquivos gerenciador = new GerenciadorArquivos();
            gerenciador.getDiretorio();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Gerenciador sem diretório", e.getMessage());
        }
    }
}
