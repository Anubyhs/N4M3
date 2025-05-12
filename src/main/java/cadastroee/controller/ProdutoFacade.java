package cadastroee.controller;

import cadastroee.model.Produto;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ProdutoFacade {

    @PersistenceContext(unitName = "CadastroEE-ejbPU")
    private EntityManager em;

    public void create(Produto produto) {
        em.persist(produto);
    }

    public void edit(Produto produto) {
        em.merge(produto);
    }

    public void remove(Produto produto) {
        em.remove(em.merge(produto));
    }

    public Produto find(Integer id) {
        return em.find(Produto.class, id);
    }

    public List<Produto> findAll() {
        return em.createQuery("SELECT p FROM Produto p", Produto.class)
                .getResultList();
    }
}