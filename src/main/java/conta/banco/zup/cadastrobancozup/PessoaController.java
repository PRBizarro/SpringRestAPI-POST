package conta.banco.zup.cadastrobancozup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity consomeHttp(@Valid @RequestBody PessoaRequest pessoaRequest) {

        String mensagem = pessoaService.createNewPessoa(pessoaRequest);

        if(mensagem == "sucesso"){
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        } else {
            return ResponseEntity.unprocessableEntity().body("Ja existe um cadastro com o mesmo CPF ou EMAIL");
        }

    }


}
