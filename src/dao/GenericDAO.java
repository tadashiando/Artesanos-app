package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import enterpriseapp.hibernate.dto.Dto;


public class GenericDAO {

	protected EntityManager manager;

	public GenericDAO() {
		manager = JPAFactory.getEntityManager();
	}

	public Dto insert(Dto entity) {
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		return entity;
	}
 
	public Dto update(Dto entity) {
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		return entity;
	}

	public void remove(Dto entity) {
		entity = selectById(entity);
		manager.getTransaction().begin();
		manager.remove(entity);
		manager.getTransaction().commit();
	}

	public Dto selectById(Dto entity) {
		System.out.println("DAO selectById START ##############"+entity.getId());
		entity = manager.find(entity.getClass(), entity.getId());
		System.out.println("DAO selectById END ##############"+entity.getId());
		return entity;
	}

	public List<Dto> selectByNamedQuery(String namedQuery) {
		return selectByNamedQuery(namedQuery, new String[0], new Object[0]);
	}

	public List<Dto> selectByNamedQuery(String namedQuery,
			String[] parameterNames, Object... parameters) {
		try {
			Query query = manager.createNamedQuery(namedQuery);
			if (parameters != null && parameters.length > 0) {
				for (int i = 0; i < parameters.length; i++) {
					query.setParameter(parameterNames[i], parameters[i]);
				}
			}
			@SuppressWarnings("unchecked")
			List<Dto> list = query.getResultList();
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
