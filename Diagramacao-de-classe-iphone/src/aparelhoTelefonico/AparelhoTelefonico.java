package aparelhoTelefonico;

import aplicativos.navegador.*;
import aplicativos.reprodutor.*;
import aplicativos.telefone.*;
import aplicativos.Iphone.*;

public class AparelhoTelefonico {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		NavegadorDeInternet navegador = iphone;
		ReprodutorMusical reprodutor = iphone;
		Telefone telefone = iphone;
		
		//Ligar
		telefone.disponibilidadeDeRede();
		telefone.ligar("(xx)9xxxx-xxxx");
		
		//Navegar
		navegador.navegar("www.google.com");
		
		//Repodução musical
		reprodutor.tocar();
	}

}
