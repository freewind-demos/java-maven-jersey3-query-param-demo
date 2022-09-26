package example;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import org.eclipse.jetty.server.Server;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResourceTest {

    private static Server server;
    private static WebTarget target;

    @BeforeAll
    public static void beforeAllTests() {
        server = Main.startServer();
        Client c = ClientBuilder.newClient();
        target = c.target(Main.BASE_URI);
    }

    @AfterAll
    public static void afterAllTests() throws Exception {
        server.stop();
    }

    @Test
    public void testHelloUser() throws JSONException {
        Response response = target.path("/hello").queryParam("age", "abc").request().get();

        System.out.println("### response:" + response.getStatus());
        System.out.println("### response:" + response.readEntity(String.class));

//        // convert json string to JSONObject
//        JSONObject actual = new JSONObject(response);
//
//        String expected = """
//            {"name":"aaa","id":111}
//            """;
//        assertThat(actual).usingRecursiveComparison().isEqualTo(new JSONObject(expected));
    }

}
