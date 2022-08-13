package classes;

import java.util.Scanner;

/**
 *
 * @author Murilo Fernandes Mello
 */
public class Main {

    public static void main(String[] args) {
        int op = 1;
        Scanner ler = new Scanner(System.in);
        Metodos banco = new Metodos();
        while (op != 8) {
            System.out.println("♥♥♥PET SHOP AUAU MIAU MIAU♥♥♥");
            System.out.println("------------------\n");
            System.out.println("CADASTRO DE CLIENTES");
            System.out.println("------------------");
            System.out.println("1 - CADASTRAR CLIENTE");
            System.out.println("2 - LIBERAR ANIMAL");
            System.out.println("3 - BUSCAR DONO");
            System.out.println("4 - BUSCAR ANIMAL");
            System.out.println("5 - LISTAR ANIMAIS CADASTRADOS");
            System.out.println("6 - LISTAR ANIMAIS E DONOS CADASTRADOS");
            System.out.println("7 - MOSTRAR QUANTIDADE DE ANIMAIS CADASTRADOS");
            System.out.println("------------------");
            System.out.println("8 - SAIR");
            System.out.println("DIGITE SUA OPÇÃO\n");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    Cliente c = new Cliente();
                    ler.nextLine();
                    System.out.println("Insira o Nome do Dono");
                    c.setNome(ler.nextLine());
                    System.out.println("Insira o Sobrenoe do Dono");
                    c.setsNome(ler.nextLine());
                    System.out.println("Insira o RG");
                    c.setRg(ler.nextLine());
                    System.out.println("Insira o CPF");
                    c.setCpf(ler.nextLine());
                    System.out.println("Insira o E-mail");
                    c.setEmail(ler.nextLine());
                    System.out.println("Insira o Nome do Animal");
                    c.setnAnimal(ler.nextLine());
                    System.out.println("Insira a Espécie do Animal");
                    c.setEspecie(ler.nextLine());
                    System.out.println("Insira o Código do Animal");
                    c.setCod(ler.nextInt());
                    banco.gravar(c);
                    break;

                case 2:
                    ler.nextLine();
                    Cliente cl = new Cliente();
                    System.out.println("Informe o Animal a ser Liberado");
                    cl.setnAnimal(ler.nextLine());
                    int i = banco.encontrarAnimal(cl);
                    if (i != -1) {
                        banco.liberarNome(i);
                    } else {
                        System.out.println("Este animal não existe!");
                    }
                    break;

                case 3:
                    ler.nextLine();
                    Cliente cli = new Cliente();
                    System.out.println("Informe o Nome do Cliente");
                    cli.setNome(ler.nextLine());
                    int ii = banco.encontrarDono(cli);
                    if (ii != -1) {
                        banco.listarAD();
                    } else {
                        System.out.println("Este Contato não Existe!");
                    }
                    break;
                    
                case 4:
                    ler.nextLine();
                    Cliente animal = new Cliente();
                    System.out.println("Informe o Nome do Animal");
                    animal.setnAnimal(ler.nextLine());
                    int ind = banco.encontrarAnimal(animal);
                    if (ind != -1) {
                        banco.listarAnimal();
                    } else {
                        System.out.println("Este Animal não Existe!");
                    }
                    break;
                    
                case 5:
                    System.out.println(banco.listarAnimal());
                    break;

                case 6:
                    System.out.println(banco.listarAD());
                    break;

                case 7:
                    banco.contador();

            }
        }
    }
}
        
