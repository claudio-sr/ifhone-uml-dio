public class Ifhone implements ReprodutorMusical, Celular, Navegador {

    private String cor;
    private String modelo;
    private double tamanho;

    @Override
    public void ligar() {
        System.out.println("Ligar Ifhone");
    }

    @Override
    public void desligar() {
        System.out.println("Desligar Ifhone");
    }

    @Override
    public void atender() {
        System.out.println("Atender Chamada");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciar correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrir navegador");
    }

    @Override
    public void addPagina() {
        System.out.println("Abrir nova página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música");
    }
}
