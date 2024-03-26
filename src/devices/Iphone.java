package devices;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    @Override
	public void ligar() {
		// Aqui vai a implementacao do coodigo
		System.out.println("Fazendo ligação do iPhone");
	}
	
	@Override
	public void atender() {
		// Aqui vai a implementacao do coodigo
		System.out.println("Atendendo ligação do iPhone");
	}
	
	@Override
	public void iniciarCorreioVoz() {
		// Aqui vai a implementacao do coodigo
		System.out.println("Iniciando correio de voz do iPhone");
	}

	@Override
	public void exibirPagina() {
		// Aqui vai a implementacao do coodigo
		System.out.println("Exibindo pagina do iPhone");
	}

	@Override
	public void adicionarNovaAba() {
		// Aqui vai a implementacao do coodigo
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		// Aqui vai a implementacao do coodigo
		System.out.println("Atualizando pagina");
	}

	@Override
	public void tocar() {
		// Aqui vai a implementacao do coodigo
		System.out.println("Tocando musica via iPhone");
	}

	@Override
	public void pausar() {
		// Aqui vai a implementacao do coodigo
		System.out.println("Pausando musica");
	}

	@Override
	public void selecionarMusica() {
		// Aqui vai a implementacao do coodigo
		System.out.println("Selecionando musica");
	}
}
