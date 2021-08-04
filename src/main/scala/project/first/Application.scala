package project.first

object Application {

  def main(args: Array[String]): Unit = {
    // variable mit text
    var text: String = "Bonjour tout le monde!"
    println(text)
    var var1 = 2

    // variable, which the content is evaluated before the use
    lazy val var2 = var1
    var1 += 1
    println(var1)
    println(var2)

    // constant
    val constant = 2
  }
}
