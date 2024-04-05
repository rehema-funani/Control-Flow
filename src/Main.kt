fun main() {
    numbers()
    returnName(arrayOf("mercy","halima","rose","wanjiku"))
    guestsWelcoming(6)
    myNumbers()

}
fun numbers() {
    for (numbers in 1..100) {
        if (numbers % 2 != 0) {
            println(numbers)
        }
    }
}
fun returnName(names:Array<String>){

    for (element in names) {
        if (element.length > 5){
            println(element)


        }
    }

}

fun guestsWelcoming(age:Int){
    if (age<6){
        println("milk")
    }
    else if(age<15){
        println("fanta orange")

    }
    else if(age>6){
        println("fanta orange")
    }
    else{
        println("cocacola")
    }

}

fun myNumbers(){
    for (numbers in 1..100){
        if(numbers%3==0){
            println("Fizz")
        }
        if(numbers%5==0){
            println("Buzz")
        }
        if(numbers % 3==0 && numbers % 5 ==0){
            println("fizzbuzz")
        }

    }
}







