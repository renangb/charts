package br.com.renan.charts.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.renan.charts.models.Grafico;

@Repository
@Transactional
public class GraficoDAO {
	
	@PersistenceContext
	private EntityManager manager;
		
	public void gravar(Grafico grafico){
		
		manager.persist(grafico);
	}

}
