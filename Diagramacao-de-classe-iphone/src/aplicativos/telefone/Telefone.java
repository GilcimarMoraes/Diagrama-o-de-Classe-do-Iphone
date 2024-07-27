package aplicativos.telefone;

public interface Telefone {
	public boolean disponibilidadeDeRede();
	public void ligar(String numero);
	public void encerrarChamada();
	public void enviarMensagem(String numero, String mensagem);
}
