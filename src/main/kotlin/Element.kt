import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import io.blackmo18.kotlin.grass.dsl.grass
import java.io.File

data class Element(
	val AtomicNumber: Int,
	val Element: String,
	val Symbol: String,
	val AtomicMass: Double,
	val NumberofNeutrons: Int,
	val NumberofProtons: Int,
	val NumberofElectrons: Int,
	val Period: Int,
	val Group: Int?,
	val Phase: String,
	val Radioactive: Boolean,
	val Natural: Boolean,
	val Metal: Boolean,
	val Metalloid: Boolean,
	val Type: String?,
	val AtomicRadius: Double?,
	val Electronegativity: Double?,
	val FirstIonization: Double?,
	val Density: Double?,
	val MeltingPoint: Double?,
	val BoilingPoint: Double?,
	val NumberofIsotopes: Int?,
	val SpecificHeat: Double?,
	val NumberofShells: Int?,
	val NumberofValence: Int?,
)

// FIXME: 06.08.2022 I guess, there is a better way to do get elements
private val file: File = File("data\\PeriodicTableofElements.csv")
private val csvContents = csvReader().readAllWithHeader(file)
@OptIn(ExperimentalStdlibApi::class)
val elements = grass<Element>().harvest(csvContents)