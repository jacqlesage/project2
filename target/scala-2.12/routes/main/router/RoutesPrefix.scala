
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/james/projectV2/project2/conf/routes
// @DATE:Tue Jul 18 05:38:49 NZST 2017


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
