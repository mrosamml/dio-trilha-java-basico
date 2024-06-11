public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    public String tocar;
    public String selecionarMusica;
    public String ligar;
    public boolean atender;
    public boolean iniciarCorreioVoz;
    public boolean exibirPagina;

    public String getTocar() {
        return tocar;
    }

    public void setTocar(String tocar) {
        this.tocar = tocar;
    }

    public String getSelecionarMusica() {
        return selecionarMusica;
    }

    public void setSelecionarMusica(String selecionarMusica) {
        this.selecionarMusica = selecionarMusica;
    }

    public String getLigar() {
        return ligar;
    }

    public void setLigar(String ligar) {
        this.ligar = ligar;
    }

    public boolean isAtender() {
        return atender;
    }

    public void setAtender(boolean atender) {
        this.atender = atender;
    }

    public boolean isIniciarCorreioVoz() {
        return iniciarCorreioVoz;
    }

    public void setIniciarCorreioVoz(boolean iniciarCorreioVoz) {
        this.iniciarCorreioVoz = iniciarCorreioVoz;
    }

    public boolean isExibirPagina() {
        return exibirPagina;
    }

    public void setExibirPagina(boolean exibirPagina) {
        this.exibirPagina = exibirPagina;
    }

    @Override
    public void ligar(String numero) {
        if (numero.equals("123-456-7890")) {
            System.out.println("ligando");
        } else {
            System.out.println("Ligação não completada");
        }
    }

    @Override
    public void atender() {
        if (atender = true){
            System.out.println("atender");
        } else {
            System.out.println("desligar");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (iniciarCorreioVoz = true){
            System.out.println("Grave sua ligação após o sinal");
        } else {
            System.out.println("finalizar");
        }
    }

    @Override
    public void exibirPagina(String url) {


    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }
}
