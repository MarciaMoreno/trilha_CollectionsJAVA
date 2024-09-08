package TipoListPesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoDeLivros {

	private List<Livro> livroList;
	
	private CatalagoDeLivros() {
		this.livroList = new ArrayList<>();
	}
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo,autor,anoPublicacao));		
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livroPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livroPorAutor.add(l);
				}
			}
		}
		return livroPorAutor;
	}
	
	public List<Livro> pesquisarPoAno(int anoInicial, int anoFinal){
		List<Livro> livroPorAno = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livroPorAno.add(l);
				}
			}
		}
		return livroPorAno;
	}
	
	public List<Livro> pesquisarPorTitulo(String titulo){
		List<Livro> livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l:livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;		
	}
	
	public static void main(String[] args) {
		
		CatalagoDeLivros catalagoDeLivros = new CatalagoDeLivros();
		catalagoDeLivros.adicionarLivro("Título: O passaro de Fogo -", "Autor: Julio Feijó ", 2017);
		catalagoDeLivros.adicionarLivro("Título: Santuário -", "Autor: Mirtilo ", 2022);
		catalagoDeLivros.adicionarLivro("Título: Sussurros do Coração -", "Autor: Maria Carcará ", 2019);
		catalagoDeLivros.adicionarLivro("Título: Fuga Implacável -", "Autor: Fungini ", 1950);
		catalagoDeLivros.adicionarLivro("Título: O canto do amor -", "Autor: Mirtilo ", 1972);
		
		System.out.println(catalagoDeLivros);
	}
	
	
	
}
