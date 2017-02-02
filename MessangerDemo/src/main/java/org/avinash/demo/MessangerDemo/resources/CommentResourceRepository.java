package org.avinash.demo.MessangerDemo.resources;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.avinash.demo.MessangerDemo.model.CommentEntity;

public class CommentResourceRepository {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("MessangerDemo");
	EntityManager em = emf.createEntityManager();
	
	public List<CommentEntity> getAllComment(){
		
		List<CommentEntity>comments = null;
		em.getTransaction().begin();
		//TypedQuery<CommentEntity> commentQuery = em.createQuery("CommentEntity.getAllComments",CommentEntity.class);
		TypedQuery<CommentEntity> commentQuery = em.createQuery("SELECT comment FROM CommentEntity comment",CommentEntity.class);
		comments = commentQuery.getResultList();
		em.getTransaction().commit();
		return comments;
	}
	
public CommentEntity getComment(Long id){
		CommentEntity comment =null;
		try {
			em.getTransaction().begin();
			TypedQuery<CommentEntity> commentQuery = em.createQuery("SELECT comment FROM CommentEntity comment where comment.commentId = :commentId",CommentEntity.class);
			commentQuery.setParameter("commentId", id);
			comment = commentQuery.getSingleResult();
			em.getTransaction().commit();
			return comment;
		} catch (NoResultException e) {
			return null;
		}
	}

public boolean addComment(CommentEntity comment){
	try {
		em.getTransaction().begin();
		em.persist(comment);
		em.getTransaction().commit();
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
	
}

public CommentEntity updateComment(CommentEntity comment)  {
	em.getTransaction().begin();
	em.merge(comment);
	em.getTransaction().commit();
	return comment;
}
public CommentEntity removeComment(CommentEntity comment){
	em.getTransaction().begin();
	em.remove(comment);
	em.getTransaction().commit();
	return comment;
	
}

	
}
