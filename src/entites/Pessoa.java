package entites;

import javax.swing.JOptionPane;

public class Pessoa {

    private int id;
    private String nome;
    private String telefone;
    private String email;
    public boolean validarNome, validarEmail, validarTelefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String telefone) {
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        boolean val = nome.matches("[a-zA-Z ]*+");
        if (val == true) {
            this.nome = nome;
            validarNome = true;
        } else {
            JOptionPane.showMessageDialog(null, "Erro! Nome inválido! Somente Letras ou números",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
            validarNome = false;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        boolean val = telefone.matches("[()\\d]+");
        if (val == true && telefone.length() >= 22) {
            this.telefone = telefone;
            validarTelefone = true;
        } else {
            JOptionPane.showMessageDialog(null, "Erro! Telefone inválido! Digite somente números, ou até 13 números",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
            validarTelefone = false;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        boolean val = email.matches("[a-zA-Z*._@\\d]+");
        if (val == true) {
            this.email = email;
            validarEmail = true;
        } else {
            JOptionPane.showMessageDialog(null, "Erro! Email inválido!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
            validarEmail = false;
        }
    }
}
