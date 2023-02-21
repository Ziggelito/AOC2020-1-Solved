package AOC20201

import java.io.File


fun solveProblem(data : List<Int>)  :Int{

    for (i in 0 .. data.size) {
        for (j in i + 1 until data.size){

            println("i and j: $i $j")
            if (data[i]+data[j]==2020){
                return data[i]*data[j]
            }
        }
    }
    return -1
}
fun solveProblemB(data : List<Int>)  :Int{

    for (i in 0 .. data.size) {
        for (j in i + 1 until data.size){
            for (k in j + 1 until data.size){
                println("i and j and k: $i $j $k")
                if (data[i]+data[j]+data[k]==2020) {
                    return data[i] * data[j] * data[k]
                }

            }
        }
    }
    return -1
}


fun main(){

    val data: List<Int> = File("src/main/kotlin/AOC20201/input.txt").readLines().map{it.toInt()}
    println(solveProblem(data))
    println(solveProblemB(data))
}