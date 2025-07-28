fun main() {
    
    var a = 15
    
    var b = 11
    
    a %= b
    
    println("a: ${a} - b: ${b}")
    
    a += b
    
    println("a: ${a} - b: ${b}")
    
    a -= b
    
    println("a: ${a} - b: ${b}")
    
    a *= b
    
    println("a: ${a} - b: ${b}")
    
    a /= b 
    
    println("a: ${a} - b: ${b}")
    
}

// a: 4 - b: 11
// a: 15 - b: 11
// a: 4 - b: 11
// a: 44 - b: 11
// a: 4 - b: 11
