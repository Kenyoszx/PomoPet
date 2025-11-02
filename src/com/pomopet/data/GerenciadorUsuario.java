package com.pomopet.data;

public class GerenciadorUsuario {
    private static GerenciadorUsuario instancia;
    private User usuarioLogado;

    private GerenciadorUsuario() {
        // Inicializações, se necessário
    }

    public static GerenciadorUsuario getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorUsuario();
        }
        return instancia;
    }
    
    public void setUsuarioLogado(User user) {
        this.usuarioLogado = user;
        GerenciadorAmigos.getInstance().adicionarAmigo(user.getName()); 
    }
    
    public User getUsuarioLogado() {
        return usuarioLogado;
    }
}
