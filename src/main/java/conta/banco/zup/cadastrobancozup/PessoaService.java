package conta.banco.zup.cadastrobancozup;

import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;


@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public String createNewPessoa(PessoaRequest pessoaRequest) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaRequest.getNome());
        pessoa.setCpf(pessoaRequest.getCpf());
        pessoa.setEmail(pessoaRequest.getEmail());
        pessoa.setDataNascimento(pessoaRequest.getDataNascimento());

        try {
            pessoa = pessoaRepository.save(pessoa);
        } catch (DataIntegrityViolationException e) {
            return "duplicado";
        }

        return "sucesso";
    }
}
