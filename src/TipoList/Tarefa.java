package TipoList;

public class Tarefa {
	
	private String descricao;
	
	public Tarefa(String decricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString(){
		return "Tarefa{"+
	"decricao" + descricao+"\""
			+ '}';
		
	}
	

}
