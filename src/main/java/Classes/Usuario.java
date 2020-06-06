package Classes;

import java.io.Serializable;

public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Boolean vendedor;

    public Usuario(int id, String nome, String cpf, String email, String telefone, Boolean vendedor) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.vendedor = vendedor;
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
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getVendedor() {
        return vendedor;
    }

    public void setVendedor(Boolean vendedor) {
        this.vendedor = vendedor;
    }

    @Override
	public boolean equals(Object obj) {
		return (this.getId() == ((Usuario) obj).getId());
	}
}
