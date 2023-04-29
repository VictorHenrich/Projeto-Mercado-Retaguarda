
package controllers.builders.pessoa;

import java.util.Date;
import models.people.Client;


public class ClientBuilder extends AbstractPersonBuilder<Client>{
    
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private char sexo;

    public ClientBuilder setCpf(String cpf) {
        this.cpf = cpf;
        
        return this;
    }

    public ClientBuilder setRg(String rg) {
        this.rg = rg;
        
        return this;
    }

    public ClientBuilder setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        
        return this;
    }

    public ClientBuilder setSexo(char sexo) {
        this.sexo = sexo;
        
        return this;
    }
    
    @Override
    public Client build() {
        return new Client(
            this.cpf, 
            this.rg,
            this.dataNascimento,
            this.sexo,
            this.nome,
            this.telefone1,
            this.telefone2,
            this.complementoEndereco,
            this.endereco,
            this.email,
            this.observacao,
            this.status,
            this.id
        );
    }
    
}
