package hello.trinity

import org.sisioh.trinity.domain.config.Config
import org.sisioh.trinity.application.TrinityApplication
import org.sisioh.trinity.view.scalate.ScalateEngineContext

object Bootstrap extends App {

  implicit val config = Config.fromFile()
  implicit val application = TrinityApplication(config)
  implicit val scalate = ScalateEngineContext()

  application.registerController(new GreetingController)
  application.start()

}
