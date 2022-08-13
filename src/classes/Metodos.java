package classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class Metodos {

    public ArrayList<Cliente> lista = new ArrayList();

    public void gravar(Cliente c) {
        lista.add(c);
        System.out.println("Cliente Cadastrado com Sucesso! ☺");
    }

    public String listarAnimal() {
        String res = "Lista de Animais\n";
        if (lista.isEmpty()) {
            res = "Não há Animais Cadastrads no Momento...";
        } else {
            for (int i = 0; i < lista.size(); i++) {
                res += lista.get(i).getnAnimal() + " - "
                        + lista.get(i).getEspecie() + " - "
                        + lista.get(i).getCod() + "\n";

            }
        }
        return res;
    }

    public String listarAD() {
        String res = "Lista de Animais e Donos\n";
        if (lista.isEmpty()) {
            res = "Não há Animais ou Donos Cadastrads no Momento...";
        } else {
            for (int i = 0; i < lista.size(); i++) {
                res += lista.get(i).getnAnimal() + " - "
                        + lista.get(i).getEspecie() + " - "
                        + lista.get(i).getCod() + "\n"
                        + lista.get(i).getNome() + " - "
                        + lista.get(i).getsNome() + " - "
                        + lista.get(i).getRg() + " - "
                        + lista.get(i).getCpf() + " - "
                        + lista.get(i).getEmail() + "\n";
            }
        }
        return res;
    }

    public int encontrarDono(Cliente c) {
        int aux = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals(c.getNome())) {
                aux = i;
                System.out.println(listarAD());
            }
        }
        return aux;
    }

    public int encontrarAnimal(Cliente c) {
        int aux = - 1;
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Digite o Nome do Animal");
            if (lista.get(i).getnAnimal().equals(c.getnAnimal())) {
                aux = i;
                System.out.println(listarAnimal());
            }
        }
        return aux;
    }

    public void liberarNome(int i) {
        Scanner ler = new Scanner(System.in);
        int op;
        System.out.println("Tem erteza que Deseja Liberar o Animal? 1-- SIM   2 -- NÃO ");
        op = ler.nextInt();
        if (op == 1) {
            lista.remove(i);
            System.out.println("Animal Liberado com Sucesso");
        } else {
            System.out.println("Exclusão cancelada!");
        }

    }
    public void contador(){
        System.out.println("Há "+lista.size()+" Animal Cadastrados!");
    }
}