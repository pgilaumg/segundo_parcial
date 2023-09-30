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
import model.Asignacion;
import model.ResponseApi;
import service.inter.AsignacionSvcInt;

@Path("/asignacion")
public class AsignacionController {
    @Inject
    AsignacionSvcInt svc;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseApi asignacionLst() {
        return svc.getAsignacion();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/create")
    public ResponseApi createAsignacion(@RequestBody Asignacion asignacion) {
        return svc.createAsignacion(asignacion);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public ResponseApi updateAsignacion(@RequestBody Asignacion asignacion) {
        return svc.updateAsignacion(asignacion);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/delete/{id_asignacion}")
    public ResponseApi deleteAsignacion(@PathParam("id_asignacion") Integer id_asignacion) {
        return svc.deleteAsignacion(id_asignacion);
    }
}
