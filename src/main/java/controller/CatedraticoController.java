package controller;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import model.Catedratico;
import model.ResponseApi;
import service.inter.CatedraticoSvcInt;

@Path("/catedratico")
public class CatedraticoController {
    @Inject
    CatedraticoSvcInt svc;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseApi catedraticoLst() {
        return svc.getCatedratico();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/create")
    public ResponseApi createCatedratico(@RequestBody Catedratico catedratico) {
        return svc.createCatedratico(catedratico);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public ResponseApi updateCatedratico(@RequestBody Catedratico catedratico) {
        return svc.updateCatedratico(catedratico);
    }

    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/delete/{codigo_catedratico}")
    public ResponseApi deleteCatedratico(@PathParam("codigo_catedratico") Integer codigo_catedratico) {
        return svc.deleteCatedratico(codigo_catedratico);
    }
}
