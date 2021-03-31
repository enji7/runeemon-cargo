package systems.enji.ping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import systems.enji.ping.api.IPingService;

/**
 * This test requires the ping service to be up and running.
 */
public class PingTest {

  private static IPingService _client;

  private static final String ENDPOINT = "http://localhost:8080/ping/";

  @BeforeAll
  static void beforeAll() {
    _client = RestClientBuilder.newBuilder().baseUri(URI.create(ENDPOINT)).build(IPingService.class);
  }

  @Test
  void whenPingThenPong() {
    assertEquals("pong", _client.ping());
  }

}
