package conta.banco.zup.cadastrobancozup;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PessoaRequest {

    @NotEmpty(message = "O campo cpf nao pode estar vazio")
    @Size(max = 11, message = "O campo cpf deve ter no maximo 11 caracteres")
    private String cpf;

    @NotEmpty(message = "O campo nome nao pode estar vazio")
    private String nome;

    @NotEmpty(message = "O campo email nao pode estar vazio")
    private String email;

    @NotEmpty(message = "O campo dataNascimento nao pode estar vazio")
    private String dataNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
