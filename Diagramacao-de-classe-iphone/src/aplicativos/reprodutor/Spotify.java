package aplicativos.reprodutor;

public class Spotify implements ReprodutorMusical {
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
	
}
