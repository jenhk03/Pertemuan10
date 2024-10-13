fun main()
{
    var mulLambda: (Int, Int) -> Int
    mulLambda = {
        a: Int, b: Int -> Int
        a * b
    }
    val lambdaResult = mulLambda(4, 2)
    println(lambdaResult)
    mulLambda = {a, b ->
        a * b
    }
    var doubleLambda = { a: Int ->
        2 * a
    }
    doubleLambda = { 2 * it }
    val square: (Int) -> Int = { it * it }
    fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int
    {
        val result = operation(a, b)
        return result
    }
    val addLambda = { a: Int, b: Int ->
        a + b
    }
    println(operateOnNumbers(4, 2, operation = addLambda))
    fun addFunction(a: Int, b: Int) = a + b
    println(operateOnNumbers(4, 2, operation = ::addFunction))
    println(operateOnNumbers(4, 2, operation = { a: Int, b: Int ->
        a + b
    }))
    println(operateOnNumbers(4, 2, { a, b ->
        a + b
    }))
    println(operateOnNumbers(4, 2, operation = Int::plus))
    println(operateOnNumbers(4, 2){ a, b -> a + b})
    var unitLambda: () -> Unit = {
        println("Ini hanya contoh!")
    }
    unitLambda()
    var nothingLambda: () -> Nothing = {
        throw NullPointerException()
    }
    var counter = 0
    val incrementCounter = {
        counter += 1
    }
    incrementCounter()
    incrementCounter()
    incrementCounter()
    incrementCounter()
    println(counter)
    fun countingLambda(): () -> Int
    {
        var counter = 0
        val incrementCounter: () -> Int = {
            counter += 1
            counter
        }
        return incrementCounter
    }
    val counter1 = countingLambda()
    val counter2 = countingLambda()
    println(counter1)
    println(counter2)
    println(counter1)
    println(counter1)
    println(counter2)
}