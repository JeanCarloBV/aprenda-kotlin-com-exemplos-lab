// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(var nome: String, val id: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        this.inscritos.add(usuario)
    }
}

fun main() {
    val usrs = listOf(Usuario("Usuário 1", 1001),
    	Usuario("Usuário 2", 1002),
    	Usuario("Usuário 3", 1003),
    	Usuario("Usuário 4", 1004),
    	Usuario("Usuário 5", 1005),
    	Usuario("Usuário 6", 1006))
    
    val form1 = Formacao("Métodos Ágeis", Nivel.BASICO, listOf(
    	ConteudoEducacional("Introdução à Métodos Ágeis", 4),
    	ConteudoEducacional("Metodologias Ágeis", 20),
    	ConteudoEducacional("Ferramentas Ágeis", 6)))
    
    val form2 = Formacao("Linguagem Kotlin", Nivel.INTERMEDIARIO, listOf(
    	ConteudoEducacional("Introdução ao Kotlin", 10),
    	ConteudoEducacional("Funções em Kotlin", 10),
    	ConteudoEducacional("POO com Kotlin", 20),
    	ConteudoEducacional("Projetos com Kotlin", 20)))
    
    form1.matricular(usrs[0])
    println(form1.inscritos[0].id)

    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}