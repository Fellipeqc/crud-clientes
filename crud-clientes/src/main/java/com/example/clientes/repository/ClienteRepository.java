package com.example.clientes.repository;

import com.example.clientes.model.Cliente;
import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

@Stateless
public class ClienteRepository {

    @PersistenceContext(unitName = "clientesPU")
    private EntityManager em;

    public void salvar(Cliente cliente) {
        if (cliente.getId() == null)
            em.persist(cliente);
        else
            em.merge(cliente);
    }

    public void remover(Cliente cliente) {
        em.remove(em.contains(cliente) ? cliente : em.merge(cliente));
    }

    public Cliente buscar(Long id) {
        return em.find(Cliente.class, id);
    }

    public List<Cliente> listarTodos() {
        return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
    }

    public List<Cliente> filtrar(String termo) {
        return em.createQuery(
                "SELECT c FROM Cliente c WHERE lower(c.nome) LIKE :termo OR lower(c.email) LIKE :termo OR lower(c.telefone) LIKE :termo",
                Cliente.class)
                .setParameter("termo", "%" + termo.toLowerCase() + "%")
                .getResultList();
    }

}
