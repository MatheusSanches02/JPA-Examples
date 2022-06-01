package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.ContratoAluguel;
import br.com.fiap.entity.Estabelecimento;
import br.com.fiap.entity.TipoEstabelecimento;

public class Cadastro {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("relacionamentos").createEntityManager();
		
		TipoEstabelecimento tipo = new TipoEstabelecimento("Petshop", null);
		
		Cliente cliente = new Cliente("Matheus", null);
		Cliente cliente2 = new Cliente("Jose", null);
		
		ContratoAluguel contrato = new ContratoAluguel(2000.0, new GregorianCalendar(2015, Calendar.JANUARY, 10), null);
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		clientes.add(cliente);
		clientes.add(cliente2);
		
		Estabelecimento est1 = new Estabelecimento("Miau-au", null, tipo, clientes);
		Estabelecimento est2 = new Estabelecimento("Miau-au2", contrato, tipo, clientes);
		
		contrato.setEstabelecimento(est2);
		
		em.persist(est1);
		em.persist(est2);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
	}
}
