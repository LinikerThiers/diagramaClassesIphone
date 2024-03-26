import devices.Iphone;

public class IphoneUsuario {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.ligar();
	    iphone.atender();
	    iphone.iniciarCorreioVoz();

	    iphone.tocar();
	    iphone.pausar();
	    iphone.selecionarMusica();

	    iphone.exibirPagina();
	    iphone.atualizarPagina();
	    iphone.adicionarNovaAba();

    }
}
