package com.example.clientes.service;

import com.example.clientes.model.Cliente;
import com.example.clientes.repository.ClienteRepository;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ClienteService {

    @EJB
    private ClienteRepository repository;

    public void salvar(Cliente cliente) {
        repository.salvar(cliente);
    }

    public void excluir(Cliente cliente) {
        repository.remover(cliente);
    }

    public List<Cliente> listar(String filtro) {
        return filtro == null || filtro.isBlank() ? repository.listarTodos() : repository.filtrar(filtro);
    }
}
