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
    val names = arrayOf("ZZZZZZ", "BB", "A", "CCCC", "EEEEE")
    println(names.sorted())
    val namesByLength = names.sortedWith(compareBy {
        -it.length
    })
    println(namesByLength)
    val values = listOf(1, 2, 3, 4, 5, 6)
    values.forEach {
        println("$it: ${it * it}")
    }
    var prices = listOf(1.5, 10.0, 4.99, 2.30, 8.19)
    val largePrices = prices.filter {
        it > 5.0
    }
    println(largePrices)
    val userInput = listOf("0", "11", "haha", "42")
    val numbers = userInput.map {
        it.toIntOrNull()
    }
    println(numbers)
    val numbers2 = userInput.mapNotNull {
        it.toIntOrNull()
    }
    println(numbers2)
    var sum = prices.fold(0.0) { a, b ->
        a + b
    }
    println(sum)
    sum = prices.reduce { a, b ->
        a + b
    }
    println(sum)
    val stock = mapOf(1500 to 5, 10000 to 2, 4990 to 20, 2300 to 5, 8190 to 30)
    var stockSum = 0
    stock.forEach {
        stockSum += it.key * it.value
    }
    println(stockSum)
}