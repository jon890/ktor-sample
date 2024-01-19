package bifos.com.plugins

import bifos.com.routes.customerRouting
import bifos.com.routes.getOrderRoute
import bifos.com.routes.listOrderRoute
import bifos.com.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        customerRouting()
        listOrderRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
