import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.io.*;

public class Main {
    ArrayList<Produto> listaProduto = new ArrayList();
    ArrayList<Cliente> listaCliente = new ArrayList();
    ArrayList<Funcionario> listaFuncionario = new ArrayList();

    public void inicializar(){
        //Produto:
        Produto p1 = new Produto();
        p1.setDescricao("Tiramisu");
        p1.setPreco(45.35);
        p1.setCategoria("Doce");
        p1.setValidade("2024");

        Produto p2 = new Produto();
        p2.setDescricao("Palha italiana");
        p2.setPreco(34.10);
        p2.setCategoria("Doce");
        p2.setValidade("2024");

        Produto p3 = new Produto();
        p3.setDescricao("Focaccia");
        p3.setPreco(37.77);
        p3.setCategoria("Salgado");
        p3.setValidade("2024");

        Produto p4 = new Produto();
        p4.setDescricao("Filone");
        p4.setPreco(20);
        p4.setCategoria("Salgado");
        p4.setValidade("2024");

        Produto p5 = new Produto();
        p5.setDescricao("Martine");
        p5.setPreco(78.89);
        p5.setCategoria("Bebida");
        p5.setValidade("2025");

        Produto p6 = new Produto();
        p6.setDescricao("Rossini");
        p6.setPreco(60);
        p6.setCategoria("Bebida");
        p6.setValidade("2025");



        listaProduto.add(p1);
        listaProduto.add(p2);
        listaProduto.add(p3);
        listaProduto.add(p4);
        listaProduto.add(p5);
        listaProduto.add(p6);

        //Cliente:
        Cliente c1 = new Cliente();
        c1.setNome("Mariana");
        c1.setIdade(23);
        c1.setTelefone("99999999");
        c1.setCpf("2222222222");
        c1.setCartaoLeoni(false);
        Cliente c2 = new Cliente();
        c2.setNome("Carlos");
        c2.setIdade(54);
        c2.setTelefone("99999999");
        c2.setCpf("2222222222");
        c2.setCartaoLeoni(true);
        Cliente c3 = new Cliente();
        c3.setNome("Sofia");
        c3.setIdade(15);
        c3.setTelefone("99999999");
        c3.setCpf("2222222222");
        c3.setCartaoLeoni(true);
        Cliente c4 = new Cliente();
        c4.setNome("Max");
        c4.setIdade(45);
        c4.setTelefone("99999999");
        c4.setCpf("2222222222");
        c4.setCartaoLeoni(false);
        Cliente c5 = new Cliente();
        c5.setNome("Vitor");
        c5.setIdade(78);
        c5.setTelefone("99999999");
        c5.setCpf("2222222222");
        c5.setCartaoLeoni(false);
        Cliente c6 = new Cliente();
        c6.setNome("Laura");
        c6.setIdade(19);
        c6.setTelefone("99999999");
        c6.setCpf("2222222222");
        c6.setCartaoLeoni(true);

        listaCliente.add(c1);
        listaCliente.add(c2);
        listaCliente.add(c3);
        listaCliente.add(c4);
        listaCliente.add(c5);
        listaCliente.add(c6);

        //Funcionario:
        Funcionario f1 = new Funcionario();
        f1.setNome("Pedro Leoni");
        f1.setIdade(46);
        f1.setTelefone("9999999999");
        f1.setCpf("44444444444");
        f1.setSalario(2000);
        Funcionario f2 = new Funcionario();
        f2.setNome("Maria");
        f2.setIdade(35);
        f2.setTelefone("9999999999");
        f2.setCpf("44444444444");
        f2.setSalario(2000);
        Funcionario f3 = new Funcionario();
        f3.setNome("Vanessa");
        f3.setIdade(21);
        f3.setTelefone("9999999999");
        f3.setCpf("44444444444");
        f3.setSalario(2000);
        Funcionario f4 = new Funcionario();
        f4.setNome("Ricardo");
        f4.setIdade(67);
        f4.setTelefone("9999999999");
        f4.setCpf("44444444444");
        f4.setSalario(2000);
        Funcionario f5 = new Funcionario();
        f5.setNome("Manuela");
        f5.setIdade(23);
        f5.setTelefone("9999999999");
        f5.setCpf("44444444444");
        f5.setSalario(2000);
        Funcionario f6 = new Funcionario();
        f6.setNome("Joaquim");
        f6.setIdade(80);
        f6.setTelefone("9999999999");
        f6.setCpf("44444444444");
        f6.setSalario(2000);

        listaFuncionario.add(f1);
        listaFuncionario.add(f2);
        listaFuncionario.add(f3);
        listaFuncionario.add(f4);
        listaFuncionario.add(f5);
        listaFuncionario.add(f6);
    }

    public static void main(String[] args) {
        System.out.println(ConsoleColors.GREEN_BACKGROUND + "           " + ConsoleColors.WHITE_BACKGROUND + "           " + ConsoleColors.RED_BACKGROUND + "           " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN_BACKGROUND + "           " + ConsoleColors.WHITE_BACKGROUND + "           " + ConsoleColors.RED_BACKGROUND + "           " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN_BACKGROUND + "           " + ConsoleColors.WHITE_BACKGROUND + "           " + ConsoleColors.RED_BACKGROUND + "           " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN_BACKGROUND + "           " + ConsoleColors.WHITE_BACKGROUND + "           " + ConsoleColors.RED_BACKGROUND + "           " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN_BACKGROUND + "           " + ConsoleColors.WHITE_BACKGROUND + "           " + ConsoleColors.RED_BACKGROUND + "           " + ConsoleColors.RESET + "\n");
        System.out.println("====  LA PANETTERIA FAMIGLIA LEONE   ====");
        System.out.println("========      Desde 1964         ========");

        Main m = new Main();
        m.inicializar();
        Scanner teclado = new Scanner(System.in);
        int teclado1=3;
        do {
            System.out.println("Digite 1 para realizar um cadastro, ou 2 para fazer uma pesquisa, ou 3 para fazer uma exclusão. Ou digite 0 para encerrar.");
            try {
                teclado1 = teclado.nextInt();
            }
            catch (InputMismatchException ex){
                System.out.printf("Digite uns dos valores especificados! \n");
               teclado.nextLine();
            }
            switch (teclado1) {
                case 1:
                    System.out.println("\n========      CADASTRO!       ======== \n");
                    int cadastro1 = 4;
                    do {
                        System.out.println("Digite 1 para cadastrar cliente, 2 para cadastrar funcionario, e 3 para cadastrar produto. Ou digite 0 para encerrar.");
                        Scanner cadastro = new Scanner(System.in);
                        try {
                            cadastro1 = cadastro.nextInt();
                        }
                        catch (InputMismatchException ex){
                            System.out.printf("Digite uns dos valores especificados! \n");
                            teclado.nextLine();
                        }
                        switch (cadastro1) {
                            case 1:
                                m.cadastrarCliente();
                                break;
                            case 2:
                               m.cadastrarFuncionario();
                                break;
                            case 3:
                                m.cadastrarProduto();
                                break;
                            default:
                                break;
                        }
                    }
                    while (cadastro1 != 0);
                case 0:
                    break;
                case 2:
                    System.out.println("\n========      PESQUISA!       ======== \n");
                    int pesquisa1 = 4;
                    do {
                        System.out.println("Digite 1 para pesquisar cliente, 2 para pesquisar funcionario, e 3 para pesquisar produto. Ou digite 0 para encerrar.");
                        Scanner pesquisa = new Scanner(System.in);
                        try {
                            pesquisa1 = pesquisa.nextInt();
                        }
                        catch (InputMismatchException ex){
                            System.out.printf("Digite uns dos valores especificados! \n");
                            pesquisa.nextLine();
                        }
                        switch (pesquisa1) {
                            case 1:
                                m.buscaCliente();
                                break;
                            case 2:
                                m.buscaFuncionario();
                                break;
                            case 3:
                                m.buscaProduto();
                                break;
                            default:
                                break;
                        }
                    }
                    while (pesquisa1 !=0);
                default:
                    break;

                case 3:
                    System.out.println("\n========      EXCLUSÃO!       ======== \n");
                    int pesquisa2 = 4;
                    do {
                    System.out.println("Digite 1 para excluir cliente, 2 para excluir funcionário, e 3 para excluir produto. Ou digite 0 para encerrar.");
                        Scanner pesquisa = new Scanner(System.in);
                        try {
                            pesquisa2 = pesquisa.nextInt();
                        }
                        catch (InputMismatchException ex){
                            System.out.printf("Digite uns dos valores especificados! \n");
                            pesquisa.nextLine();
                        }
                        switch (pesquisa2) {
                            case 1:
                                m.removerCliente();
                                break;
                            case 2:
                                m.removerFuncionario();
                                break;
                            case 3:
                                m.removerProduto();
                                break;
                            default:
                                break;
                        }
                    } while (pesquisa2 !=0);
            }
        }
        while (teclado1 != 0);
    }

    public void cadastrarProduto() {
        Produto p1 = new Produto();
        boolean precoValido=false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a descrição do produto:");
        p1.setDescricao(teclado.nextLine());
        do {
            System.out.println("Digite o preço do produto:");
            try {
                p1.setPreco(teclado.nextDouble());
                precoValido = true;

            } catch (PrecoNegativoException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException ex) {
                System.out.printf("Digite um valor numérico! \n");
                teclado.nextLine();
            }
        }
        while (!precoValido);
        teclado.nextLine();
        System.out.println("Digite a categoria do produto:");
        p1.setCategoria(teclado.nextLine());
        System.out.println("Digite a validade do produto:");
        p1.setValidade(teclado.nextLine());
        System.out.println("\n --- Produto cadastrado com sucesso! Confira suas informaçãoes a baixo: ---");
        p1.exibir();
        listaProduto.add(p1);
    }

    public void removerProduto() {
        int idExcluido=0;
        boolean idValido=false;
        System.out.println("========== LISTA DE PRODUTO: ==========");
        for (Produto p : listaProduto){
            p.exibir();
        }
        System.out.println("Digite o id do produto a ser excluido: \n");
        Scanner teclado = new Scanner(System.in);
        do {
        try {
            idExcluido=teclado.nextInt();
            idValido=true;
        }catch (InputMismatchException ex){
            System.out.println("Digite um valor inteiro!");
            teclado.nextLine();
        }
        }
        while (!idValido);


        for (Produto p : listaProduto) {
            if (p.getIdProduto() == idExcluido) {
                listaProduto.remove(p);
                break;
            }
        }
    }

    public String produtoMaisCaro() {
        double maisCaro = 0;
        int idCaro = 0;
        String retorno = " ";
        for (Produto p : listaProduto) {
            if (p.getPreco() > maisCaro) {
                maisCaro = p.getPreco();
                idCaro = p.getIdProduto();
            }
        }
        for (Produto p : listaProduto) {
            if (p.getIdProduto() == idCaro) {
                retorno = ("O produto mais caro é " + p.getDescricao() + ", cujo preço é " + p.getPreco());
            }
        }
        return retorno;
    }

    public String produtoMaisBarato() {
        double maisBarato = 1000000000;
        int idBarato = 0;
        String retorno = " ";
        for (Produto p : listaProduto) {
            if (p.getPreco() < maisBarato) {
                maisBarato = p.getPreco();
                idBarato = p.getIdProduto();
            }
        }
        for (Produto p : listaProduto) {
            if (p.getIdProduto()== idBarato) {
                retorno = ("O produto mais barato é " + p.getDescricao() + ", cujo preço é " + p.getPreco());
            }
        }
        return retorno;
    }

    double media = 0;

    public double mediaProduto() {
        String retorno = " ";
        double numerador = 0;
        int denominador = 0;
        for (Produto p : listaProduto) {
            denominador++;
            numerador += p.getPreco();
            media = numerador / denominador;
        }
        return media;
    }

    public String quantidadeDeProdutosAcimaDaMedia() {
        String retorno = " ";
        int cont = 0;
        for (Produto p : listaProduto) {
            if (p.getPreco() > media) {
                cont++;
            }
        }
        retorno = ("A quantidade de produtos acima da média:" +cont);
        return retorno;
    }

    public void buscaProduto() {
        int digitado = 4;
        int opcao = 6;
        String descricaoDigitada=" ";
        String categoriaDigitada=" ";
        int precoDigitado=0;
        Scanner teclado = new Scanner(System.in);
        Scanner consulta = new Scanner(System.in);
        do {
            System.out.println("====== PESQUISA DE PRODUTOS ======");
        System.out.println("  - Digite 1 para pesquisar produtos \n  - 2 para descobrir qual é o produto mais caro \n  - 3 para descobrir qual é o produto mais barato \n  - 4 para descobrir qual é a média de preços \n  - 5 para saber a quantidade de produtos acima do preço médio. \n  - Ou digite 0 para encerrar.");
        try {
            opcao = consulta.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.printf("Digite uns dos valores especificados! \n");
            consulta.nextLine();
        }

           switch (opcao) {
               case 1:
                   do {
                   System.out.println(" - Digite 1 para pesquisar produto pela descrição (ou parte desta) \n - 2 para pesquisar produto pela categoria (ou parte desta) \n - 3 para pesquisar produto pelo preço. \n - Ou digite 0 para encerrar.");
                   try {
                       digitado = teclado.nextInt();
                   }
                   catch (InputMismatchException ex){
                       System.out.printf("Digite uns dos valores especificados! \n");
                       teclado.nextLine();
                   }
                       switch (digitado) {
                           case 0:
                               break;

                           case 1:
                               do {
                                   System.out.println("Digite a descrição (ou parte desta): \n Ou 0 para encerrar");
                                   boolean encontrado = false;
                                   Scanner descricao = new Scanner(System.in);
                                   descricaoDigitada = descricao.nextLine();
                                   for (Produto p : listaProduto) {
                                       if (p.getDescricao().contains(descricaoDigitada)) {
                                           System.out.println("Produto encontrado! \n");
                                           p.exibir();
                                           encontrado = true;
                                       }
                                   }
                                   if (!encontrado) {
                                       System.out.printf("Produto nao encontrado\n");
                                   }
                               }
                               while (!Objects.equals(descricaoDigitada, string0));
                               break;

                           case 2:
                               do {
                                   System.out.println("Digite a categoria (ou parte desta): \n ou 0 para encerrar");
                                   boolean encontrado = false;
                                   Scanner categoria = new Scanner(System.in);
                                   categoriaDigitada = categoria.nextLine();
                                   for (Produto p : listaProduto) {
                                       if (p.getCategoria().contains(categoriaDigitada)) {
                                           System.out.println("Produto encontrado!\n");
                                           p.exibir();
                                           encontrado = true;
                                       }
                                   }
                                   if (!encontrado) {
                                       System.out.printf("Produto nao encontrado\n");
                                   }
                               }
                               while (!Objects.equals(categoriaDigitada, string0));
                               break;

                           case 3:
                               boolean precoValido = false;
                               do {
                                   boolean encontrado = false;
                                   do {
                                       System.out.println("Digite o preço: \nOu 0 para encerrar");
                                       try {
                                           Scanner preco = new Scanner(System.in);
                                           precoDigitado = preco.nextInt();
                                           precoValido = true;
                                       } catch (InputMismatchException ex) {
                                           System.out.printf("Digite um valor numérico! \n");
                                           teclado.nextLine();
                                       }
                                   }while (!precoValido);
                                   for (Produto p : listaProduto) {
                                       if (p.getPreco() == precoDigitado) {
                                           System.out.println("Produto encontrado!\n");
                                           p.exibir();
                                           encontrado = true;
                                       }
                                   }
                                   if (!encontrado) {
                                       System.out.printf("Produto nao encontrado\n");
                                   }
                               }
                               while (precoDigitado!=0);
                               break;
                       }
                   } while (digitado!=0);
               case 0:
                   break;

               case 2:
                   System.out.println(produtoMaisCaro() + "\n");
                   break;

               case 3:
                   System.out.println(produtoMaisBarato() + "\n");
                   break;

               case 4:
                   mediaProduto();
                   System.out.printf("A mádia de preços é: %.2f\n", media);
                   break;

               case 5:
                   System.out.println(quantidadeDeProdutosAcimaDaMedia() + "\n");
                   break;

           }
       } while (opcao!=0);

    }

    public void cadastrarCliente() {
        boolean valido=false;
        boolean cartaoValido=false;
        Cliente c1 = new Cliente();
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o nome do cliente: ");
        c1.setNome(teclado.nextLine());
        do {
            System.out.printf("Digite a idade do cliente: ");
            try {
                c1.setIdade(teclado.nextInt());
                valido = true;
            } catch (IdadeNegativaException i) {
                System.out.printf(i.getMessage());
            } catch (InputMismatchException ex) {
                System.out.println("Digite um valor numérico! \n");
                teclado.nextLine();
            }
        } while (!valido);
        teclado.nextLine();
        System.out.printf("Digite o telefone do cliente: ");
        c1.setTelefone(teclado.nextLine());
        System.out.printf("Digite o cpf do cliente: ");
        c1.setCpf(teclado.nextLine());
        do {
            System.out.printf("Possui Cartão Leoni?(true/false): ");
            try {
                c1.setCartaoLeoni(teclado.nextBoolean());
               cartaoValido = true;
            } catch (InputMismatchException ex) {
                System.out.printf("Digite 'true' ou 'false'! \n");
                teclado.nextLine();
            }
            listaCliente.add(c1);
        } while (!cartaoValido);
    }

    public void removerCliente() {
        int idExcluido=0;
        boolean idValido=false;
        System.out.println("========== LISTA DE CLIENTE: ==========");
        for (Cliente p : listaCliente){
            p.exibir();
        }
        System.out.println("Digite o id do cliente a ser excluido: \n");
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                idExcluido=teclado.nextInt();
                idValido=true;
            }catch (InputMismatchException ex){
                System.out.println("Digite um valor inteiro!");
                teclado.nextLine();
            }
        }
        while (!idValido);


        for (Cliente p : listaCliente){
            if (p.getIdCliente() == idExcluido) {
                listaCliente.remove(p);
                break;
            }
        }

    }

    public void buscaCliente() {
        String digitado;
        int opcao =7;
        boolean encontrado=false;
        Scanner teclado = new Scanner(System.in);
        Scanner consulta = new Scanner(System.in);
        do {
            System.out.println("====== PESQUISA DE CLIENTES ======");
            System.out.printf(" - Digite 1 para pesquisar cliente pelo nome \n - 2 para consultar o mais velho \n - 3 para o mais jovem \n - 4 para a quantidade de clientes maiores que 60 anos \n - 5 para a quantidade de clientes menores de 18 anos \n - 6 para consultar a média de idade dos clientes\n - Ou digite 0 para encerrar. \n");
            try {
                opcao = consulta.nextInt();
            }
            catch (InputMismatchException ex){
                System.out.printf("Digite uns dos valores especificados! \n");
                consulta.nextLine();
            }

            switch (opcao) {
                case 1:
                    System.out.printf("Digite o nome ou parte do nome do cliente: ");
                    digitado = teclado.nextLine();
                    for (Cliente c : listaCliente) {
                        if (c.nome.contains(digitado)) {
                            System.out.printf("Cliente(s) encontrado(s) \n");
                            c.exibir();
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                            System.out.println("Cliente não encontrado! \n");
                        }
                    break;

                case 2:
                    clienteMaisVelho();
                    break;

                case 3:
                    clienteMaisJovem();
                    break;

                case 4:
                    clientesMaiores60();
                    break;

                case 5:
                    clientesMenores18();
                    break;
                case 6:
                    System.out.printf("Idade media dos clientes: " + idadeMedia() + "\n");
                    break;
                default:
                    break;

            }
        } while (opcao!=0);
    }

    public void clienteMaisVelho() {
        int maiorIdade = 0;
        for (Cliente c : listaCliente) {
            if (c.idade > maiorIdade) {
                maiorIdade = c.idade;
            }
        }
        for (Cliente c : listaCliente) {
            if (c.idade == maiorIdade) {
                System.out.printf("O cliente mais velho é: \n");
                c.exibir();
            }
        }
    }

    public void clienteMaisJovem() {
        int menorIdade = 120;
        for (Cliente c : listaCliente) {
            if (c.idade < menorIdade) {
                menorIdade = c.idade;
            }
        }
        for (Cliente c : listaCliente) {
            if (c.idade == menorIdade) {
                System.out.printf("O cliente mais jovem é: \n");
                c.exibir();
            }
        }
    }

    public void clientesMaiores60() {

        for (Cliente c : listaCliente) {
            if (c.idade > 60) {
                System.out.printf("Clientes maiores de 60 anos: \n");
                c.exibir();
            }
        }
    }

    public void clientesMenores18() {

        for (Cliente c : listaCliente) {
            if (c.idade < 18) {
                System.out.printf("Cliente menores de 18 anos: \n");
                c.exibir();
            }
        }
    }

    public int idadeMedia() {
        int soma = 0, cont = 0;
        for (Cliente c : listaCliente) {
            soma = soma + c.idade;
            cont++;
        }
        return soma / cont;
    }

    public void cadastrarFuncionario() {
        boolean valido=false;
        boolean valido1=false;
        Funcionario f1 = new Funcionario();
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o nome do funcionario: ");
        f1.setNome(teclado.nextLine());
        System.out.printf("Digite a idade do funcionario: ");
        do {
        try {
            f1.setIdade(teclado.nextInt());
            valido1=true;
        } catch (IdadeNegativaException i) {
            System.out.printf(i.getMessage());
        }
        catch (InputMismatchException ex) {
            System.out.printf("Digite um valor numérico! \n");
            teclado.nextLine();
        }
        } while (!valido1);
        teclado.nextLine();
        System.out.printf("Digite o telefone do funcionario: ");
        f1.setTelefone(teclado.nextLine());
        System.out.printf("Digite o cpf do funcionario: ");
        f1.setCpf(teclado.nextLine());
        do {
            System.out.printf("Digite o salario do funcionario: ");
            try {
                f1.setSalario(teclado.nextDouble());
                valido = true;
            } catch (SalarioNegativoException s) {
                s.getMessage();
            } catch (InputMismatchException ex) {
                System.out.printf("Digite um valor numérico! \n");
                teclado.nextLine();
            }
        } while (!valido);
        listaFuncionario.add(f1);
    }

    public void removerFuncionario() {
        int idExcluido=0;
        boolean idValido=false;
        System.out.println("========== LISTA DE FUNCIONÁRIO: ==========");
        for (Funcionario p : listaFuncionario){
            p.exibir();
        }
        System.out.println("Digite o id do funcionário a ser excluido: \n");
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                idExcluido=teclado.nextInt();
                idValido=true;
            }catch (InputMismatchException ex){
                System.out.println("Digite um valor inteiro!");
                teclado.nextLine();
            }
        }
        while (!idValido);

        for (Funcionario p : listaFuncionario){
            if (p.getIdFuncionario() == idExcluido) {
                listaFuncionario.remove(p);
                break;
            }
        }
    }
    String string0 = "0";
    public void buscaFuncionario() {
        boolean encontrado=false;
        String digitado;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("====== PESQUISA DE FUNCIONÁRIOS ======");
            System.out.printf(" - Digite o nome ou parte do nome do funcionario: \n - Ou digite 0 para encerrar. \n");
            digitado = teclado.nextLine();
            for (Funcionario f : listaFuncionario) {
                if (f.nome.contains(digitado)) {
                    System.out.printf("Funcionario(s) encontrado(s) \n");
                    f.exibir();
                    encontrado=true;
                }
            }
            if (!encontrado){
                System.out.println("Funcionário não encontrado! \n");
            }
        } while (digitado.contentEquals(string0)==false);
    }

}









