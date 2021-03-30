package systems.enji.ping.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public interface IPingService {

  /**
   * Calling ping returns... pong.
   */
  @Path("ping")
  @GET
  String ping();

}
