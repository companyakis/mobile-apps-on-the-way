fun main() {
    
    var userInput = "454"
    
    var num = userInput.toIntOrNull()
    
	num?.let {
        
        println("Number plus ten: ${num + 10}")
    }
    
    var userInput2 = "454xx"
    
    var num2 = userInput2.toIntOrNull()
    
	num2?.let {
        
        println("Number plus ten: ${num2 + 10}")
    }
}

// Number plus ten: 464
