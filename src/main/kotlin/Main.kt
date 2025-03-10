package uca.miage.donati.kotlin

import java.io.File
import java.io.FileReader
import java.io.IOException
import java.io.LineNumberReader

fun main() {

    //Version sans try/catch
    File("src/main/resources/fichier.txt").bufferedReader().use {
        it.lineSequence().forEach {
                line -> println(line)
        }
    }

    /*
    //Version avec flow et forEach
    try {
        File("src/main/resources/ficher.txt").bufferedReader().use {
            it.lineSequence().forEach {
                line -> println(line)
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
*/

    /*
    // Version avec File et BufferedReader (référencé par it)
    try {
        File("src/main/resources/fichier.txt").bufferedReader().use {
            var line = it.readLine()
            while (line != null) {
                println(line)
                line = it.readLine()
            }
        }
    }  catch (e: IOException) {
        e.printStackTrace()
    }
    */

    /*
    // Version kotlin avec use qui fait office de ARM
    try {
        FileReader("src/main/resources/fichier.txt").use {
            fileReader -> LineNumberReader(fileReader).use {
                reader ->
                    var line = reader.readLine()
                    while (line != null) {
                        println(line)
                        line = reader.readLine()
                    }
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    */

    /*
    //Version Java Like sans ARM
    try {
        val fileReader = FileReader("src/main/resources/fichier.txt")
        val reader = LineNumberReader(fileReader)
        var  line = reader.readLine()
        while (line != null) {
            println(line)
            line = reader.readLine()
        }
        reader.close()
    }
    catch (e: IOException) {
        e.printStackTrace()
    }
    */
}