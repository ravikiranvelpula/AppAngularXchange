/**
 * 
 */
package org.avinash.demo.MessangerDemo.service;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.avinash.demo.MessangerDemo.model.PostEntity;
import org.avinash.demo.MessangerDemo.resources.PostResourceRepository;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author Avinash
 *
 */
@Path("/posts")
public class PostService {
	
	PostResourceRepository postResourceRepository = new PostResourceRepository();
	ObjectMapper mapper = new ObjectMapper();
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm a z");

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addPost")
	public PostEntity addPost(PostEntity post){
		post.setCreated(new Date());
		return postResourceRepository.addPost(post);
	}
	
	
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAllPosts")
	public String getAllposts() throws JsonGenerationException, JsonMappingException, IOException{
			return  mapper.writeValueAsString(postResourceRepository.getAllposts());
		}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getPost/{postId}")
	public String getpost(@PathParam("postId") String postId) throws JsonGenerationException, JsonMappingException, NumberFormatException, IOException{
		return  mapper.writeValueAsString(postResourceRepository.getPost(Long.valueOf(postId)));
		}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/updatePost/{postId}")
	public PostEntity Updatepost(@PathParam("postId") String postId,PostEntity post){

		PostEntity updatedpost = null;
		PostEntity presentPost = postResourceRepository.getPost(Long.valueOf(postId));
		return updatedpost;
		}
	
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/deletePost/{postId}")
	public String deletepost(@PathParam("postId") String postId) throws JsonGenerationException, JsonMappingException, IOException{

		PostEntity deletedpost = null;
		return mapper.writeValueAsString(postResourceRepository.deletePost(Long.valueOf(postId)));
		}
	

}
