package one.digitalInovation.collections

fun main() {
    val joao = Funcionario("joão", 2000.0, "CLT")
    val pedro = Funcionario("pedro", 1500.0, "PJ")
    val maria = Funcionario("maria", 4000.0, "CLT")

    val Funcionarios1 = setOf(joao, pedro)
    val Funcionarios2 = setOf(maria)

    val resultUnion = Funcionarios1.union(Funcionarios2)
    resultUnion.forEach { println(it) }

    println("-------------------------")
    val Funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = Funcionarios3.subtract(Funcionarios2)
    resultSubtract.forEach { println(it) }

    println("-------------------------")
    val resultIntersect = Funcionarios3.intersect(Funcionarios2)
    resultIntersect.forEach { println(it) }

}