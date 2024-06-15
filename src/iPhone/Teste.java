package iPhone;

public class Teste {

	public static void main(String[] args) {
		Iphone meuIphone = new Iphone("iPhone 1", 2007);

      
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

       
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

      
        meuIphone.exibirPagina("www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

	
