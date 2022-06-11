public class PessoaFisica extends Customer {
    private String cpf;
    private String firstName;
    private String lastName;

    public PessoaFisica(String email, String telephone, String dateOfBirth, String address, String cpf, String firstName, String lastName) {
        super(email, telephone, dateOfBirth, address);
        this.cpf = cpf;
        this.firstName = firstName;
        this.lastName =lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}