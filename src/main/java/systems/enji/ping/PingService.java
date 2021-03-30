package systems.enji.ping;

import systems.enji.ping.api.IPingService;

/**
 * Ping service.
 * 
 * See interface for sophisticated documentation.
 */
public class PingService implements IPingService {

  
  @Override
  public String ping() {
    return "pong";
  }
  
}
