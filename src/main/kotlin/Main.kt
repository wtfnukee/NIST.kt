import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import io.blackmo18.kotlin.grass.dsl.grass
import java.io.File

@OptIn(ExperimentalStdlibApi::class)
fun main(args: Array<String>) {
	val file: File = File("data\\PeriodicTableofElements.csv")
	val csvContents = csvReader().readAllWithHeader(file)
	val elements = grass<Element>().harvest(csvContents)
}
