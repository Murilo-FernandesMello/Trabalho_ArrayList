package classes;

/**
 *
 * @author Murilo Fernandes Mello
 */
public class Cliente {

    private String nome;
    private String sNome;
    private String rg;
    private String cpf;
    private String email;
    private String especie;
    private int cod;
    private String nAnimal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        if (rg.length() == 9) {
            this.rg = rg;
        } else {
            System.out.println("RG Inválido");
        }

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF Inválido");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("E-ail Inválido");
        }

    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getnAnimal() {
        return nAnimal;
    }

    public void setnAnimal(String nAnimal) {
        this.nAnimal = nAnimal;
    }

}
