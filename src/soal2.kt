fun main (){
    var angka : Double = 5.0
    var pangkat : Int = 3
    var hasilpangkat : Double = 1.0
    var i = 1

    while(i <= pangkat){
        i++
        hasilpangkat*=angka
        if (i>pangkat){
            println("Jadi, hasil dari $angka ^ $pangkat = $hasilpangkat")
        }
    }
}
