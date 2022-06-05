package br.com.caelum.livraria.livro;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LivroBean {
    
    private LivroForm livroForm = new LivroForm();
    
    public void gravar() {
        System.out.println("Gravar dados do Usuário.");
        System.out.println(livroForm);
    }

    public LivroForm getLivroForm() {
        return livroForm;
    }

    public void setLivroForm(LivroForm livroForm) {
        this.livroForm = livroForm;
    }
    
    
}
