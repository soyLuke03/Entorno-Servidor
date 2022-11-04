package com.jacaranda.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class pruebaDAO {

	private StandardServiceRegistry sr;
	private SessionFactory sf;
	private Session session;
	
	public pruebaDAO() {
		sr = new StandardServiceRegistryBuilder().configure().build();
		sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
		session = sf.openSession();
	}
	
	
	public boolean addOrUpdateDB(int id, String nombre) {
		boolean added = false;
		session.getTransaction().begin();
		/*Aqui ponemos la operación a realizar*/
			Usuario user2 = new Usuario(id,nombre);
			session.saveOrUpdate(user2);
		/*------------------------------------*/
		session.getTransaction().commit();
		return added;
	}
	
	/**
	 * SE SUPONE QUE AÑADE EL PRODUCTO
	 * @param pr
	 * @return
	 */
	public boolean addOrUpdateProducto(String id, String nombre) {
		boolean added = false;
		session.getTransaction().begin();
		/*Aqui ponemos la operación a realizar*/
			session.saveOrUpdate(id,nombre);
		/*------------------------------------*/
		session.getTransaction().commit();
		return added;
	}
	
	public String readDB(int id) {
		session.getTransaction().begin();
		/*Aqui ponemos la operación a realizar*/
			
		Usuario user1 = (Usuario) session.get(Usuario.class,id);
		
		/*------------------------------------*/
		session.getTransaction().commit();
		return user1.toString();
	}
	
	public boolean deleteDB(int id) {
		boolean added = false;
		session.getTransaction().begin();
		/*Aqui ponemos la operación a realizar*/
		Usuario user2 = new Usuario(id);
			session.delete(user2);
		/*------------------------------------*/
		session.getTransaction().commit();
		return added;
	}
	
	public void cerrarConexion() {
		session.close();
		sf.close();
	}
	
	
}
