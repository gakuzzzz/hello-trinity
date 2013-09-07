package hello.trinity

import org.sisioh.trinity.application.TrinityApplication
import org.sisioh.trinity.domain.controller.SimpleController
import org.sisioh.trinity.view.scalate.{ScalateEngineContext, ScalateRenderer}

class GreetingController(implicit application: TrinityApplication, engineContext: ScalateEngineContext) extends SimpleController {

  get("/") { _ =>
    responseBuilder
      .withBodyRenderer(ScalateRenderer("scalate.mustache", Map("name" -> "world")))
      .toFinagleResponseFuture
  }

}
