package TipoList;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefa {
	
	private List<Tarefa>tarefaList;
	
	public ListaDeTarefa() {
		this.tarefaList = new ArrayList<>();
	}	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	public void removerTarefa(String descricao) {
		List<Tarefa>tarefaParaRemover = new ArrayList<>();
		for (Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefaParaRemover);
	}
	public void obterDescricaoTarefa() {
		System.out.println(tarefaList);
	}
	public int obterNumeroTotalTarefa() {
		return tarefaList.size();		
	}
	public void obterdecricaoTarefa() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaDeTarefa listaTarefa = new ListaDeTarefa();
		System.out.println("O nº Total de elementos é "+ listaTarefa.obterNumeroTotalTarefa());
		
		listaTarefa.adicionarTarefa("Tarefa 1 ");
		listaTarefa.adicionarTarefa("Tarefa 2 ");
		listaTarefa.adicionarTarefa("Tarefa 3 ");
		listaTarefa.adicionarTarefa("Tarefa 4 ");
		System.out.println("O nº total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefa());
	}

}
