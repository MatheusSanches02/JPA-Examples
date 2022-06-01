package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;

public class TesteBusca {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("smartcities");
		EntityManager em = factory.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 1);
		
		System.out.println(cliente.getCodigo() + " " + cliente.getNome());
		
		//merge()
		
		//Cliente cliente = em.find(1, "Matheus");
		//em.merge(cliente);
		
		//"reinsere" o cliente
		
		//update de cliente
		//cliente.setNome("Jose");
		
		//em.getTransaction().begin();
		//em.getTransaction().commit();
		
		em.close();
		factory.close();
	}
}
