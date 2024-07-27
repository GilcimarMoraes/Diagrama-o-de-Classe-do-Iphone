package aplicativos.navegador;

public class GoogleChrome implements NavegadorDeInternet {
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
