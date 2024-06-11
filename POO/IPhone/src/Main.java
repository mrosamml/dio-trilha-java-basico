public class Main extends Iphone {
    public static void main(String[] arg) {
        Iphone meuIphone = new Iphone();

        // Teste do ReprodutorMusical
        System.out.println("Teste do ReprodutorMusical:");
        meuIphone.selecionarMusica("Minha Música Favorita");
        meuIphone.tocar();
        meuIphone.pausar();

        // Teste do AparelhoTelefonico
        System.out.println("Número tefonico:");
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste do NavegadorInternet
        System.out.println("Teste do NavegadorInternet:");
        meuIphone.exibirPagina("http://www.exemplo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

    }

}
