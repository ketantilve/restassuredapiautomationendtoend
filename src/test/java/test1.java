import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class test1 {

    @Test
    public void test() {

        given().
                when().
                get("http://localhost:8080/wishes").
                then().
                assertThat().
                statusCode(501);
    }

}
