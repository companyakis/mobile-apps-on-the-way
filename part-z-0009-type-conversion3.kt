fun main() {
    
    var userInput = "454"
    
    var num: Int 
    
    try {
        
        num = userInput.toInt()
        
        println("Number plus ten: ${num + 10}")
        
    } catch(nfe: NumberFormatException) {
        
        println("Type conversion error!")
    }
    
}

// Number plus ten: 464
