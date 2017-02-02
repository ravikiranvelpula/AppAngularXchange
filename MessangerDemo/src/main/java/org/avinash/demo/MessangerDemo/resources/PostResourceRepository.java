/**
 * 
 */
package org.avinash.demo.MessangerDemo.resources;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.avinash.demo.MessangerDemo.model.PostEntity;

/**
 * @author Avinash
 *
 */
public class PostResourceRepository {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("MessangerDemo");
	EntityManager em = emf.createEntityManager();
	
	
	public PostEntity addPost(PostEntity post) {
		em.getTransaction().begin();
		if(post.getPostId()==0)
		em.persist(post);
		else
		em.merge(post);
		em.getTransaction().commit();
		return getPost(post.getPostId());

	}


	public List<PostEntity> getAllposts() {
		List<PostEntity> posts = null;
		em.getTransaction().begin();
		TypedQuery<PostEntity> postQuery = em.createQuery("SELECT post FROM PostEntity post",PostEntity.class);
		posts = postQuery.getResultList();
		em.getTransaction().commit();
				return posts;
	}
	
	
	


	public PostEntity getPost(Long postId) {
		PostEntity post = null;
		em.getTransaction().begin();
		TypedQuery<PostEntity> postQuery = em.createQuery("SELECT post FROM PostEntity post where post.postId =:postId",PostEntity.class);
		postQuery.setParameter("postId", postId);
		post = postQuery.getSingleResult();
		em.getTransaction().commit();
		return post;
	}
	
	public PostEntity deletePost(Long postId) {
		PostEntity post = null;
		post = getPost(postId);
		em.getTransaction().begin();
		em.remove(post);
		em.getTransaction().commit();
		return post;
	}
	
	

}
