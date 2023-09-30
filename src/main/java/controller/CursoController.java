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
import model.Curso;
import model.ResponseApi;
import service.inter.CursoSvcInt;

@Path("/curso")
public class CursoController {
    @Inject
    CursoSvcInt svc;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseApi alumnoLst() {
        return svc.getCurso();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/create")
    public ResponseApi createCurso(@RequestBody Curso curso) {
        return svc.createCurso(curso);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public ResponseApi updateCurso(@RequestBody Curso curso) {
        return svc.updateCurso(curso);
    }

    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/delete/{id_curso}")
    public ResponseApi deleteCurso(@PathParam("id_curso") Integer id_curso) {
        return svc.deleteCurso(id_curso);
    }
}
