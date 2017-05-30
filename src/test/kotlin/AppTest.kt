/**
 * Created by gabriel on 29/05/17.
 */

import akka.http.javadsl.testkit.JUnitRouteTest
import akka.http.javadsl.testkit.TestRoute
import com.themobilelife.kotlintest.App
import org.junit.Test
import kotlin.test.assertEquals;

class AppTest : JUnitRouteTest() {
    private val appRoute : TestRoute = testRoute(App.route())

    // Expression bodied functions can be used for simple use cases
    @Test fun addThreePlusThreeShouldEqualSix() =
            assertEquals(3 + 3, 6)

//    @Test fun getHelloShouldReturn200() : Unit {
//        appRoute.run(HttpRequest.GET("/hello")).
//                assertStatusCode(200)
//    }
}