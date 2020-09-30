
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Hello")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<section id="content">
        <div class="wrapper doc">
            <article>
                <h1>Hello """),_display_(/*7.28*/name),format.raw/*7.32*/("""!</h1>
            </article>
            <aside>
                """),_display_(/*10.18*/commonSidebar()),format.raw/*10.33*/("""
            """),format.raw/*11.13*/("""</aside>
        </div>
    </section>
""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-30T23:11:38.940745
                  SOURCE: /Users/mbuser1/Downloads/play-samples-play-scala-hello-world-tutorial/app/views/hello.scala.html
                  HASH: 9b1c728b418400d2f60e829031fd174c2e471b21
                  MATRIX: 729->1|837->16|864->18|885->31|924->33|955->38|1087->144|1111->148|1205->215|1241->230|1282->243
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|31->7|31->7|34->10|34->10|35->11
                  -- GENERATED --
              */
          