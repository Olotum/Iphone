classDiagram
    ReprodutorMusica ..|> Iphone
    AparelhoTelefonico ..|> Iphone
    NavegadorInternet ..|> Iphone

    class ReprodutorMusica {
      <<interface>>
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }

    class AparelhoTelefonico{
      <<interface>>
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class NavegadorInternet{
      <<interface>>
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
