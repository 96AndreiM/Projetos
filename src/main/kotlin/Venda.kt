class Venda (
    var valor: String,
    var data: String,
    var hora: String ,
    var produto: String,
    var matriculavendedor: String,
) {
    override fun toString(): String {
        return "Venda\n valor:$valor\n data:$data\n hora:$hora\n produto:$produto\n matriculavendedor:$matriculavendedor"
    }
}