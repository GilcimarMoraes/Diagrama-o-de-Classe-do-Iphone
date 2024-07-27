package aplicativos.telefone;

public class AplicativoTelefonico implements Telefone {

	public boolean disponibilidadeDeRede() {
		System.out.println("Verificando disponibilidade de rede...");
		return true;
	}

	public void ligar(String numero) {
		System.out.println("Ligando para " +numero +"...");
		
	}

	public void encerrarChamada() {
		System.out.println("Encerrando chamada...");
		
	}

	public void enviarMensagem(String numero, String mensagem) {
		System.out.println("Enviando mensagem para " +numero +": " +mensagem);
		
	}

}
