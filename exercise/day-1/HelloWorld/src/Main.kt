//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val name = "Kotlin"
//    var world = "World"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + world + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }

    val day = 12

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result) // Outputs "Thursday" (day 4)

    var name = "John"      // String (text)
    val birthyear = 1975   // Int (number)

    println(name)          // Print the value of name
    println(birthyear)     // Print the value of birthyear

    var x = 10
    x += 5

    println(x)

    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)

    println('string')
    List<User> user = new ArrayList<>()
    user.add

}