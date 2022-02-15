class Transportadora (
    var nome: String,
    var cnpj: String,
    var endereco: String,
    var responsavel: String,

) {
    override fun toString(): String {
        return "\nTransportadora\n nome:$nome\n cnpj:$cnpj\n endereco:$endereco\n responsavel:$responsavel\n"
    }
}