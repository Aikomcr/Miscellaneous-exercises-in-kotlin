import kotlin.math.pow
import kotlin.math.PI

class Exercises {

    fun  calculateTheAreaOfAtriangle(){


        println("Calculate the area of a triangle")
        println("input the base")
        val base = readln().toInt()
        println("input the height")
        val height = readln().toInt()
        val area = (base * height) / 2
        println("the area is: $area")
    }

    fun   enterTwoNumbersAndAddThem(){
        println("Enter two numbers and add them")
        println("input thr first number ")
        val number1 = readln().toDouble()
        println("input the second number")
        val number2 = readln().toDouble()
        val total = number1 + number2
        println("the add is:  $total")
    }

    fun   enterANumberAndShowItsSquare(){

        println("Enter a number and show its square")
        println("input the number to square")
        val number  = readln().toDouble()
        val total = number.pow(2)
        println("the number to square is:   $total")
    }

    fun convertEurosToDollars(){

        println("write a algoritmo Convert euros to dollars")
        println("input a quantity dollars")
        val dolar = readln().toDouble()
        val euro = dolar * 1.12
        println("the convert is : $euro ")
    }

    fun areaAndPerimeterOfAsquare(){
        println("Input the side to square: ")
        val side = readLine()?.toDoubleOrNull() ?:0.0

        val area =  side * side
        val perimeter = side + side + side + side

        println("the area to square is to: $area")
        println("the perimeter to squear is: $perimeter")
    }

    fun areaAndVolumeOfAcylinder(){
        println( "input the radius of the cylinder: ")
        val radio = readLine()?.toDoubleOrNull() ?:0.0

        println("input he height of the cylinder: ")
        val height = readLine()?.toDoubleOrNull() ?:0.0

        val area = 2 * PI * radio * (radio + height)
        val volume = PI * radio.pow(2) * height

        println("the area of the cylinder is : $area")
        println("the volumen of the cylinder is : $volume")
    }

    fun  lengthAndAreaOfTheInscribedCircle(){
        print("Input the radio of the circumference: ")
        val radio = readLine()?.toDoubleOrNull() ?:0.0

        val length = 2 * PI * radio
        val area = PI * radio.pow(2)

        println("The length of the circle is: $length")
        println("The area of the inscribed circle is: $area")
    }

    fun  averageOfThreeNumbers(){
        println("Input the first number: ")
        val num1 = readLine()?.toDoubleOrNull() ?:0.0

        println("Input the second number: ")
        val num2 = readLine()?.toDoubleOrNull() ?:0.0

        println("Input the third number: ")
        val num3 = readLine()?.toDoubleOrNull() ?:0.0

        val everage = (num1 + num2 + num3) / 3
        println("The everage of the three umber is : $everage")
    }

    fun menuOperators() {
        var option: Int

        do {
            println("Operators :)")
            println("1.Calculate the area of a triangle")
            println("2.Enter two numbers and add them")
            println("3.Enter a number and show its square")
            println("4.Convert euros to dollars")
            println("5.Calculate the area and perimeter of a square")
            println("6.Calculate the area and volume of a cylinder")
            println("7.Calculate the length and area of the inscribed circle")
            println("8.Calculate the average of three numbers")
            println("99. back to menu")
            print("Input the option")
            option = readLine()?.toIntOrNull() ?: 0

            when (option) {

                1 ->calculateTheAreaOfAtriangle()

                2 ->enterTwoNumbersAndAddThem()

                3 ->enterANumberAndShowItsSquare()

                4 ->convertEurosToDollars()

                5 ->areaAndPerimeterOfAsquare()

                6 ->areaAndVolumeOfAcylinder()

                7 ->lengthAndAreaOfTheInscribedCircle()

                8 ->averageOfThreeNumbers()

                99 ->println("Go to menu principal ")

                else -> {
                    println("Option invalide, please enter a corret number")
                }
            }

        } while (option != 99)

        fun multiplesOfThree(){

            print("Print multiples of 3 between 1 and 100 ")
            val num = 0
            for (num in 1.. 100)
                if((num% 3)==0){
                    println("$num is multiples of 3")
                }
        }

        fun oddNumbers() {
            println("Print odd numbers between 0 and 100")
            val num = 0
            for (num in 1..100){
                if((num%2)!=0){
                    println("the number is odd")
                }
            }

        }

        fun pairNumbers(){
            print("Print even numbers from 1 to 100")

            val num= 0
            for (num in 1..100)
                if((num%2 )==0){
                    println("$num the number is even")
                }
        }

        fun squaresFromOneToThirty(){
            print("Print squares of numbers from 1 to 30")
            val num =0
            for (num in 1..30){
                val square = num*num
                println("the square of $num is $square")
            }
        }

        fun addSquaresOneHundredFirstNumbers(){
            print("Add squares of the first hundred natural numbers")

            val num = 0
            var result = 0

            for (num in 1..100){

                result += num * num
            }

            println(" the total of the add of square 100 first numbers natural is $result")
        }

        fun ascendingNumbers(){
            print("Generate and display numbers between two values in ascending sequence")

            val num=0
            println("input a number")
            val num1= readLine()?.toIntOrNull() ?:0

            println("Input a major number the before number")
            val num2 =readLine()?.toIntOrNull() ?:0


            for (num in num1..num2){
                println("$num")
            }
        }

        fun addNumbersToZero(){
            print("Add numbers entered by keyboard until it is zero")

            var add = 0
            var option =0

            do{
                println("input a number")
                val num =readLine()?.toIntOrNull() ?:0
                add += num

                println("You want input other number \n yes: 1  \n No: 0")

                val option = readLine()?.toIntOrNull() ?:0

            } while (option!==0)
            println("The add of all numbers is : $add")
        }

        fun menuCycles() {
            var option: Int

            do {
                println(" Cycles")
                println("1.Print multiples of 3 between 1 and 100")
                println("2.Print odd numbers between 0 and 100")
                println("3.Print even numbers from 1 to 100")
                println("4.Print squares of numbers from 1 to 30")
                println("5.Add squares of the first hundred natural numbers")
                println("6.Generate and display numbers between two values in ascending sequence")
                println("7.Add numbers entered by keyboard until it is zero")
                println("99. back to menu")
                print("input the option: ")
                option = readLine()?.toIntOrNull() ?: 0

                when (option) {
                    1 -> multiplesOfThree()
                    2 -> oddNumbers()
                    3 -> pairNumbers()
                    4 -> squaresFromOneToThirty()
                    5 -> addSquaresOneHundredFirstNumbers()
                    6 -> ascendingNumbers()
                    7 -> addNumbersToZero()
                    99 -> println("back to menu")
                    else -> println("Option invalide, please enter a corret number")
                }

                println()
            } while (option != 99)

        }


    }

    fun positiveNegative(){
        println("input thhe number: ")
        val number = readLine()?.toDoubleOrNull() ?:0.0

        val results = if (number > 0) "positive" else " negative"
        println("the number is:  $results.")

    }

    fun majorMinorTwoNumbers(){

        println("input the firts number: ")
        val num1 = readLine()?.toDoubleOrNull() ?:0.0

        println("Input the second number: ")
        val num2 = readLine()?.toDoubleOrNull() ?:0.0

        val major = if (num1 > num2 ) num1 else num2
        val minor = if (num1 < num2 ) num1 else num2

        println("The Major number is: $major")
        println("The minor number is: $minor")

    }

    fun majorMinorThreeNumbers(){

        println("input the firts number :")
        val num1 = readLine()?.toDoubleOrNull() ?:0.0

        println("input the second number :")
        val num2 = readLine()?.toDoubleOrNull() ?:0.0

        println("input the third number :")
        val num3 = readLine()?.toDoubleOrNull() ?:0.0

        val minor = if (num1 <num2 && num1 < num3)
            num1 else if (num2 < num3) num2 else num3

        val major = if (num1 >num2 && num1 > num3)
            num1 else if (num2 > num3) num2 else num3


        println("The Major number is the three numbers: $major")
        println("The minor number is the three numbers: $minor")


    }

    fun  addORsubtractCondition(){
        println("input the first number (A)")
        val numA = readLine()?.toDoubleOrNull() ?:0.0

        println("input the first second (B)")
        val numB = readLine()?.toDoubleOrNull() ?:0.0

        val result = if (numA < numB){numA + numB

        }else numA - numB


        println("The result is : $result")
    }

    fun quotientBetweenTwoNumbers(){

        print("input the first quotient (A)")
        val qA =readLine()?.toDoubleOrNull() ?:0.0


        print("input the second  quotient (B)")
        val qB =readLine()?.toDoubleOrNull() ?:0.0

        if (qB !=0.0){
            val quotient = qA / qB
            println("the quotient between $qA and $qB is: quotient")

        }else {
            println("error the divisor is 0 ")
        }


    }

    fun addOrMultiplyCondition(){
        print("Input the first number (A)")
        val nA =readLine()?.toDoubleOrNull() ?:0.0


        print("Input the second number (B)")
        val nB = readLine()?.toDoubleOrNull() ?:0.0

        val result = if (nA < 0 || nB < 0) nA + nB else nA * nB

        println("the resul is : $result")


    }

    fun leapYear(){

        print("input a year")
        val year = readLine()?.toIntOrNull()?:0

        val isLeap = (year % 4 ==0 && year % 100 !=0) || (year % 400 ==0 )

        if(isLeap){
            println("$year is a leap year")

        }else {
            println("$year it's not a elap year ")
        }
    }



    fun  menuConditionals() {
        var option: Int

        do {
            println("Conditionals :) ")
            println("1.kno if a number is positive or negative")
            println("2.Find the greater and lesser of two numbers ")
            println("3.Find the largest and smallest of three numbers")
            println("4.Add or subtract two numbers according to condition")
            println("5.Calculate quotient between two numbers")
            println("6.Add or multiply two numbers according to condition")
            println("7.Determining if a year is a leap year")
            println("99.back to menu ")
            print("input the option : ")
            option = readLine()?.toIntOrNull() ?: 0

            when (option) {
                1 -> positiveNegative()
                2 -> majorMinorTwoNumbers()
                3 -> majorMinorThreeNumbers()
                4 -> addORsubtractCondition()
                5 -> quotientBetweenTwoNumbers()
                6 -> addOrMultiplyCondition()
                7 -> leapYear()
                99 -> println("back to menu")
                else -> println("Option invalide, please enter a corret number")
            }
            println()
        } while (option != 99)

    }

    fun multiplesOfThree(){

        print("Print multiples of 3 between 1 and 100 ")
        val num = 0
        for (num in 1.. 100)
            if((num% 3)==0){
                println("$num is multiples of 3")
            }
    }

    fun oddNumbers() {
        println("Print odd numbers between 0 and 100")
        val num = 0
        for (num in 1..100){
            if((num%2)!=0){
                println("the number is odd")
            }
        }

    }

    fun pairNumbers(){
        print("Print even numbers from 1 to 100")

        val num= 0
        for (num in 1..100)
            if((num%2 )==0){
                println("$num the number is even")
            }
    }

    fun squaresFromOneToThirty(){
        print("Print squares of numbers from 1 to 30")
        val num =0
        for (num in 1..30){
            val square = num*num
            println("the square of $num is $square")
        }
    }

    fun addSquaresOneHundredFirstNumbers(){
        print("Add squares of the first hundred natural numbers")

        val num = 0
        var result = 0

        for (num in 1..100){

            result += num * num
        }

        println(" the total of the add of square 100 first numbers natural is $result")
    }

    fun ascendingNumbers(){
        print("Generate and display numbers between two values in ascending sequence")

        val num=0
        println("input a number")
        val num1= readLine()?.toIntOrNull() ?:0

        println("Input a major number the before number")
        val num2 =readLine()?.toIntOrNull() ?:0


        for (num in num1..num2){
            println("$num")
        }
    }

    fun addNumbersToZero(){
        print("Add numbers entered by keyboard until it is zero")

        var add = 0
        var option =0

        do{
            println("input a number")
            val num =readLine()?.toIntOrNull() ?:0
            add += num

            println("You want input other number \n yes: 1  \n No: 0")

            val option = readLine()?.toIntOrNull() ?:0

        } while (option!==0)
        println("The add of all numbers is : $add")
    }

    fun menuCycles() {
        var option: Int

        do {
            println(" Cycles")
            println("1.Print multiples of 3 between 1 and 100")
            println("2.Print odd numbers between 0 and 100")
            println("3.Print even numbers from 1 to 100")
            println("4.Print squares of numbers from 1 to 30")
            println("5.Add squares of the first hundred natural numbers")
            println("6.Generate and display numbers between two values in ascending sequence")
            println("7.Add numbers entered by keyboard until it is zero")
            println("99. back to menu")
            print("input the option: ")
            option = readLine()?.toIntOrNull() ?: 0

            when (option) {
                1 -> multiplesOfThree()
                2 -> oddNumbers()
                3 -> pairNumbers()
                4 -> squaresFromOneToThirty()
                5 -> addSquaresOneHundredFirstNumbers()
                6 -> ascendingNumbers()
                7 -> addNumbersToZero()
                99 -> println("back to menu")
                else -> println("Option invalide, please enter a corret number")
            }

            println()
        } while (option != 99)

    }


}

fun  main(){

    var option: Int

    var ob1 = Exercises()

        do{
            println("Menu")
            println("1) Operators")
            println("2) Conditionals")
            println("3) cycles")
            println("99) leave")

            print("Input the option")
            option = readLine()?.toIntOrNull()?:0

            when (option){
                1-> ob1.menuOperators()
                2-> ob1.menuConditionals()
                3-> ob1.menuCycles()
                4-> println("Got out of the program")
                else -> println("option invalide, try again :(")

            }

            println()
        } while (option != 99)
}
