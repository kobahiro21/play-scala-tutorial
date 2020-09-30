// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mbuser1/Downloads/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Wed Sep 30 23:11:38 JST 2020


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
