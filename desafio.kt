// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

//Nível de complexidade da formação
enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

//Classe dos usuários inscritos em cada formação
class Usuario(var nome: String, val id: Int)

//Classe dos conteúdos que serão ministrados em cada formação
data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

//Classe que controla cada formação oferecida
data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {
	
    //Atributo que armazena os usuários que estão inscritos na formação
    val inscritos = mutableListOf<Usuario>()
    
    //Método que irá popular o atributo inscritos
    fun matricular(usuario: Usuario) {
        this.inscritos.add(usuario)
    }
}

fun main() {
    //Dados genéricos utilizados para testagem
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
    
    //Loop principal do programa
    while(true){
        break
    }
    
    print(0)  

    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}

