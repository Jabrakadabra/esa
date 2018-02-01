package org.dieschnittstelle.jee.esa.wsv.client.service;

import org.dieschnittstelle.jee.esa.entities.crm.AbstractTouchpoint;
import org.dieschnittstelle.jee.esa.entities.crm.StationaryTouchpoint;

import javax.ws.rs.*;
import java.util.List;

@Path("/touchpoints")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public interface ITouchpointCRUDService {
	//StationaryTouchpoint = AbstractTouchpoint
	@GET
	public List<StationaryTouchpoint> readAllTouchpoints();

	@GET
	@Path("/{touchpointId}")
	public AbstractTouchpoint readTouchpoint(@PathParam("touchpointId") long id);

	@POST
	public AbstractTouchpoint createTouchpoint(StationaryTouchpoint touchpoint);
	
	@DELETE
	@Path("/{touchpointId}")
	public boolean deleteTouchpoint(@PathParam("touchpointId") long id);

	@PUT
	@Path("/{touchpointId}")
	public AbstractTouchpoint updateTouchpoint(@PathParam("touchpointId") long id,AbstractTouchpoint touchpoint);

}
