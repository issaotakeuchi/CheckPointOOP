public class PessoaJuridica extends Customer {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    public PessoaJuridica(String email, String telephone, String dateOfBirth, String address, String cnpj, String razaoSocial, String nomeFantasia) {

        super(email, telephone, dateOfBirth, address);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}

