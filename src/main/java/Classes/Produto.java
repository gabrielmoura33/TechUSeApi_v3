package Classes;

import java.io.Serializable;

public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String nomeProduto;
    private String dataCadastro;
    private String descricaoProduto;
    private String categoriaProduto;
    private String estadoProduto;
    private String cidadeProduto;
    private String telefoneContato;
    private double precoProduto;
    private int file_id;

    public Produto(int id, String nomeProduto, String dataCadastro, String descricaoProduto, String categoriaProduto, String estadoProduto, String cidadeProduto, String telefoneContato, double precoProduto, int file_id) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.dataCadastro = dataCadastro;
        this.descricaoProduto = descricaoProduto;
        this.categoriaProduto = categoriaProduto;
        this.estadoProduto = estadoProduto;
        this.cidadeProduto = cidadeProduto;
        this.telefoneContato = telefoneContato;
        this.precoProduto = precoProduto;
        this.file_id = file_id;
    }

    public Produto() {
        super();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public String getEstadoProduto() {
        return estadoProduto;
    }

    public void setEstadoProduto(String estadoProduto) {
        this.estadoProduto = estadoProduto;
    }

    public String getCidadeProduto() {
        return cidadeProduto;
    }

    public void setCidadeProduto(String cidadeProduto) {
        this.cidadeProduto = cidadeProduto;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getFile_id() {
        return file_id;
    }

    public void setFile_id(int file_id) {
        this.file_id = file_id;
    }

    public boolean equals(Object obj) {
		return this.getId() == ((Produto) obj).getId();
	}
}

