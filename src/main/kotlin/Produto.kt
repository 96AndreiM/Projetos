class Produto (
    var origem: String,
    var peso: String,
    var tipo: String,

) {
    override fun toString(): String {
        return "Produto\n origem:origem\n peso:$peso\n tipo:$tipo\n"
    }
}