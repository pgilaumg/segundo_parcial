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
import model.Alumno;
import model.ResponseApi;
import service.inter.AlumnoSvcInt;

@Path("/alumno")
public class AlumnoController {
    @Inject
    AlumnoSvcInt svc;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get-all")
    public ResponseApi alumnoLst() {
        return svc.getAlumnos();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/create")
    public ResponseApi createAlumno(@RequestBody Alumno alumno) {
        return svc.createAlumno(alumno);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/update")
    public ResponseApi updateAlumno(@RequestBody Alumno alumno) {
        return svc.updateAlumno(alumno);
    }

    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/delete/{carnet}")
    public ResponseApi deleteAlumno(@PathParam("carnet") Integer carnet) {
        return svc.deleteAlumno(carnet);
    }

}
