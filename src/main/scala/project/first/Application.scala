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

    // Function
    def add(a: Int, b: Int): Int = a + b
    println(add(2,3))

    // Function object
    val addFunction = (a: Int, b: Int) => a + b
    println(addFunction(5,4))
  }
}
