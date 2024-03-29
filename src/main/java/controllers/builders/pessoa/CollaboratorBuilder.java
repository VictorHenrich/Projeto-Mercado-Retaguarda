
package controllers.builders.pessoa;

import models.people.Collaborator;


public class CollaboratorBuilder extends AbstractPersonBuilder<Collaborator>{
    private String login;
    private String senha;

    public CollaboratorBuilder setLogin(String login) {
        this.login = login;
        
        return this;
    }

    public CollaboratorBuilder setSenha(String senha) {
        this.senha = senha;
        
        return this;
    }    
    
    @Override
    public Collaborator build() {
        return new Collaborator(
            this.login,
            this.senha,
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
