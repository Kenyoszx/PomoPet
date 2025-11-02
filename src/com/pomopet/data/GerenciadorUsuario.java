package com.pomopet.data;

public class GerenciadorUsuario {
    
    //Atributos ->
    
    private static GerenciadorUsuario instancia;
    private User usuarioLogado;
    
    // Construtor ->
    
    private GerenciadorUsuario() {
    }
    
    // Método de Acesso Global (Retorna a instância)
    
    public static GerenciadorUsuario getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorUsuario();
        }
        return instancia;
    }
    // Getter e Setter
    
    public void setUsuarioLogado(User user) {
        this.usuarioLogado = user;
        GerenciadorAmigos.getInstance().adicionarAmigo(user.getName()); 
    }
    
    public User getUsuarioLogado() {
        return usuarioLogado;
    }
}
