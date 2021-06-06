/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author cleid
 */
public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro=" + bairro + ", localidade=" + localidade + ", uf=" + uf + '}';
    }
    
    public String getDados(){
        StringBuilder sb = new StringBuilder();
        sb.append("CEP............: ").append(this.cep).append("\n");
        sb.append("Logradouro.....: ").append(this.logradouro).append("\n");
        sb.append("Complemento....: ").append(this.complemento).append("\n");
        sb.append("Bairro.........: ").append(this.bairro).append("\n");
        sb.append("Localidade.....: ").append(this.localidade).append("\n");
        sb.append("UF.............: ").append(this.uf).append("\n");
        return sb.toString();
    }
    
}
