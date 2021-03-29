package one.digitalInovation.collections

fun main(){
    val joao = Funcionario("joão", 2000.0, "CLT" )
    val pedro = Funcionario("pedro", 1500.0, "PJ" )
    val maria = Funcionario("maria", 4000.0, "CLT" )

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("------------------------")
    println(funcionarios.find { it.nome == "maria" })

    println("------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }


}
