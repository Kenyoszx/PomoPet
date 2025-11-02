package com.pomopet.data;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAmigos {
    // Instância Única (Singleton)
    private static GerenciadorAmigos instancia;
    
    // Armazenamento dos dados (Lista de Strings)
    private List<String> listaDeNomes;

    // Construtor 
    private GerenciadorAmigos() {
        listaDeNomes = new ArrayList<>(); 
    }

    // Método de Acesso Global (Retorna a instância)
    public static GerenciadorAmigos getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorAmigos();
        }
        return instancia;
    }

    // Métodos de Adicionar
    public void adicionarAmigo(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            listaDeNomes.add(nome.trim());
        }
    }
    
    // Métodos de Remover
public void removerAmigo(int index) {
    if (index >= 0 && index < listaDeNomes.size()) {
        listaDeNomes.remove(index);
    }
}

    // Método de Acesso (Obter Lista)
    public List<String> getListaDeNomes() {
        return listaDeNomes;
    }
}
