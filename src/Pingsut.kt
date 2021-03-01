class Pingsut {
    val data = arrayOf("BATU", "GUNTING", "KERTAS")
    val komputer = pilihanKomputer(data)
    val pemain = pilihanPemain(data)
    val result = printResult(pemain, komputer)

}

fun pilihanKomputer(optionsParam: Array<String>): String =
    optionsParam[((Math.random() * optionsParam.size).toInt())]

fun pilihanPemain(optionsParam: Array<String>): String {
    var salahPilih = false
    var pemain = ""

    while (!salahPilih) {
        println("pilihlah dan tuliskan dengan benar 3 pilihan dibawah ini")
        for (item in optionsParam) println(" $item")
        print(" Masukkan Pemain 1: ")

        val pemain1 = readLine()

        if (pemain1 != null && pemain1 in optionsParam) {
            salahPilih = true
            pemain = pemain1
        }
        if (!salahPilih) println("Pilih dengan benar!!!")
    }
    return pemain
}

fun printResult(pemain: String, komputer: String) {
    val result: String

    result = if (pemain == komputer) "DRAW!"
    else if ((pemain == "BATU" && komputer == "GUNTING") ||
        (pemain == "GUNTING" && komputer == "KERTAS") ||
        (pemain == "KERTAS" && komputer == "BATU")) "Pemain 1 MENANG!!"
    else "Pemain 2 MENANG!!"

    println(" Masukkan Pemain 2: $komputer")
    println(" $result")
}