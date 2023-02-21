fun main() {
    anyStrings("One","Two", "Three", "Four")
    grammaticall()
    number()
    println(names("Maria", "Esther", "Marion").contentToString())

}
//prints out an array of strings
fun anyStrings(one:String, two:String, three:String, four:String){
    var outputQ1 = arrayOf("$one, $two, $three, $four")
    println(outputQ1.contentToString())
}
// prints correct grammer
fun grammaticall(){
    var cities = arrayOf("harare", "mumbai", "dodoma","jakarta")
    println("${cities[0].replaceFirstChar { "H" }}, ${cities[1].replaceFirstChar { "M" }}, ${cities[2].replaceFirstChar { "D" }}, ${cities[3].replaceFirstChar { "J" }}")

}
// integer function,different outputs
fun number(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,73,11,158,62)
    println(numbers[1] + numbers[4])
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
//returns a string array containing all three
fun names(name1:String, name2: String, name3: String):Array<String>{
    var output = arrayOf(name1, name2, name3)
    return output


}

