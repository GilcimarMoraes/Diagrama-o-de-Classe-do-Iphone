package aplicativos.Iphone;

import aplicativos.navegador.NavegadorDeInternet;
import aplicativos.reprodutor.ReprodutorMusical;
import aplicativos.telefone.Telefone;

public class Iphone implements NavegadorDeInternet, ReprodutorMusical, Telefone {

	public void tocar() {
		System.out.println("Tocando música...");
	}
	
	public void pausar() {
		System.out.println("Pausando música...");
		
	}

	public void parar() {
		System.out.println("Parando música...");
	}

	public void proxima() {
		System.out.println("Próxima música...");
	}
	
	public void anterior() {
		System.out.println("Música anterior...");
	}
	
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

	public void navegar(String url) {
		System.out.println("Navegando para " +url +" no Google Chrome...");
		
	}
	public void adicionarFavoritos(String url) {
		System.out.println("Adicionando " +url + " aos favoritos no Google Chrome...");
		
	}
	public void atualizar() {
		System.out.println("Atualizando página no Google Chrome...");
		
	}
}
