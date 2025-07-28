fun main() {
    
    var userInput = "454xx"
    
    var num = userInput.toIntOrNull()
    
    if (num != null) {
        
        println("Number plus ten: ${num + 10}")
    }
    
    else {
        
        println("Check user input please")
    }
   
}

// Check user input please
