package org.migus.web.content.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.migus.web.content.types.Content;
import org.migus.web.content.types.Contents;
import org.migus.web.content.types.Ids;
import org.migus.web.content.types.NewContent;

@Path("/")
@Produces({"application/json", "application/xml"})
public interface ContentServer {

	@GET
	@Path("/author/{author}")
	public Contents getByAuthor(@PathParam("author") String author);

	@PUT
	@Path("/{id}")
	public Content add(@PathParam("id") String id, NewContent newContent);

	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") String id);

	@GET
	@Path("/{id}")
	public Content get(@PathParam("id") String id);

	@GET
	public Ids getIds();

	@POST
	public Content add(NewContent newContent);

	@PUT
	@Path("/{id}/text")
	public String updateText(@PathParam("id") String id, String text);
	
	@PUT
	@Path("/{id}/title")
	public String updateTitle(@PathParam("id") String id, String title);
}
