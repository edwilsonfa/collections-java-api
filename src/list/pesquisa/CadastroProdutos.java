package list.pesquisa;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicinarProduto(long cod, String nome, double preco, double quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicinarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicinarProduto(2L, "Produto 2", 20d, 4);
        cadastroProdutos.adicinarProduto(3L, "Produto 3", 30d, 5);
        cadastroProdutos.adicinarProduto(4L, "Produto 4", 40d, 15);
        cadastroProdutos.adicinarProduto(5L, "Produto 1", 12d, 25);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
