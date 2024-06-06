import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusica;
import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {

    private boolean correioDeVozAtivo = false;

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        int opcao;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Tocar música");
                System.out.println("2 - Pausar música");
                System.out.println("3 - Selecionar música");
                System.out.println("4 - Ligar para um número");
                System.out.println("5 - Atender chamada");
                System.out.println("6 - Desligar chamada");
                System.out.println("7 - Iniciar correio de voz");
                System.out.println("8 - Exibir página");
                System.out.println("9 - Adicionar nova aba");
                System.out.println("10 - Atualizar página");
                System.out.println("0 - Sair");
                
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> iphone.tocarMusica();
                    case 2 -> iphone.pausarMusica();
                    case 3 -> {
                        System.out.println("Digite o nome da música:");
                        String musica = scanner.next();
                        iphone.selecionarMusica(musica);
                    }
                    case 4 -> {
                        System.out.println("Digite o número para ligar:");
                        String numero = scanner.next();
                        iphone.ligar(numero);
                    }
                    case 5 -> iphone.atender();
                    case 6 -> iphone.desligar();
                    case 7 -> iphone.iniciarCorreioVoz();
                    case 8 -> {
                        System.out.println("Digite a URL:");
                        String url = scanner.next();
                        iphone.exibirPagina(url);
                    }
                    case 9 -> iphone.adicionarNovaAba();
                    case 10 -> iphone.atualizarPagina();
                    case 0 -> System.out.println("Saindo do menu.");
                    default -> System.out.println("Opção inválida.");
                }
            } while (opcao != 0);
        }
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Selecionando música: " + nomeMusica);
    }

    @Override
    public void ligar(String numeroDeTelefone) {
        System.out.println("Ligando para: " + numeroDeTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        if (correioDeVozAtivo) {
            System.out.println("Correio de voz já está ativo.");
        } else {
            correioDeVozAtivo = true;
            System.out.println("Correio de voz iniciado.");
        }
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
