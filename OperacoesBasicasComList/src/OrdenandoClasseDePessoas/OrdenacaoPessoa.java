package OrdenandoClasseDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



	public class OrdenacaoPessoa{
		
		private List<Pessoa> pessoaList;

		public OrdenacaoPessoa() {
			this.pessoaList = new ArrayList<>();
		}
		
		public void adicionarPessoa(String nome, int idade, double altura) {
			pessoaList.add(new Pessoa(nome, idade, altura));
		}	
		
		public List<Pessoa> ordenarPorIdade(){
			List<Pessoa>pessoaPorIdade = new ArrayList<>(pessoaList);
			Collections.sort(pessoaPorIdade);
			return pessoaPorIdade;
		}
		
		public List<Pessoa> ordenarPorAltura(){
			List<Pessoa>pessoaPorAltura = new ArrayList<>(pessoaList);
			Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
			return pessoaPorAltura;
			
		}
		
		public static void main(String[] args) {
			OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
			ordenacaoPessoa.adicionarPessoa("\nMariana Munhoz de Faria", 21, 1.72);
			ordenacaoPessoa.adicionarPessoa("\nMariana Castro de Souza", 25, 1.62);
			ordenacaoPessoa.adicionarPessoa("\nMariana Sanches de Almeida", 18, 1.82);
			ordenacaoPessoa.adicionarPessoa("\nMariana Almeida de Paiva ", 28, 1.64);
			
			System.out.println(ordenacaoPessoa.pessoaList);
			System.out.println("-------------------------------------------------------");
			System.out.println(ordenacaoPessoa.ordenarPorIdade());
			System.out.println("-----------------------------------");
			System.out.println(ordenacaoPessoa.ordenarPorAltura());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	



