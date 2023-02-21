package AOC20201

import java.io.File
// Lösning av användare wace001 på reddit hittad i tråden https://www.reddit.com/r/adventofcode/comments/k4e4lm/2020_day_1_solutions/
//Jag uppskattar denna lösning för att den är så ren och tydlig.
fun main(){
    val data: List<Int> = File("src/main/kotlin/AOC20201/input.txt").readLines().map{it.toInt()}
    for (a in data) for (b in data) if(a+b==2020) println(  " Part one: ${a*b}")
    for(a in data) for (b in data)for (c in data) if(a+b+c==2020) println("part two: ${a*b*c}")

}