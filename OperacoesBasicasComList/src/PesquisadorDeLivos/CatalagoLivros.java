package PesquisadorDeLivos;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

	//atributo
	private List<Livro>livroList;

	public CatalagoLivros() { 
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivors(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
	return livrosPorIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalagoLivros catalogoLivros = new CatalagoLivros();
		catalogoLivros.adicionarLivors("\nO amor das Camélias", "Crispin Azevedo", 2001);
		catalogoLivros.adicionarLivors("\nO Sol da Meia Noite", "estephany Meyer", 2003);
		catalogoLivros.adicionarLivors("\nCada buraco no seu quadrado", "Giovannis", 2011);
		catalogoLivros.adicionarLivors("\nO casarão de Monte Carlo", "Crispin Azevedo", 2007);
		catalogoLivros.adicionarLivors("\nCarmezim", "Sophia Carlo", 2001);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Crispin Azevedo"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2001, 2005));
		System.out.println(catalogoLivros.pesquisarPorTitulo("O amor das Camélias"));
	}
}
