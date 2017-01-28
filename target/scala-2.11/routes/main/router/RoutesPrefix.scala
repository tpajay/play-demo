
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/example-app/conf/routes
// @DATE:Sat Jan 28 16:39:42 UTC 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
