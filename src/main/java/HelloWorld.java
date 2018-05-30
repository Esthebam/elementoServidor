import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorld {


    TestService testService = new TestService();
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media tyrpe "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        //return "Hello World";
        Runner.runInSession(() -> {
            this.testService.recuperarEntidad(Equipo.class, "Argentina").getNombre();
        });
        return null;
    }
}