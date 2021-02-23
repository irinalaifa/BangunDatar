
fun segitiga (alas : Double=4.0, tinggi: Double=10.0) : Double {
    return (alas*tinggi)/2
}

fun persegi() {
    println("Masukkan nilai sisi : ")
    val sisi: Int = readLine()!!.toInt()

    val luasPersegi = sisi*sisi
    println("luas persegi = $luasPersegi")

}

fun persegiPanjang() {
    println("Masukkan nilai panjang : ")
    val panjang: Int = readLine()!!.toInt()
    println("Masukkan nilai lebar : ")
    val lebar: Int = readLine()!!.toInt()

    val luasPersegiPanjang = panjang*lebar
    println("luas persegi panjang= $luasPersegiPanjang")

}

fun main() {
    println("luas segitiga =1/2(alas*tinggi)= ${segitiga()}\n")
    println ("ketik keyword di bawah untuk cari luas bangun datar \nPersegi=P \nPersegi Panjang=PP")
    val cariLuas = readLine()!!.toLowerCase()
    if (cariLuas=="p")
    persegi()
    else if (cariLuas=="pp")
    persegiPanjang()
    else
        println("keyword salah")
}