class Vendedor (
    var nome: String,
    var email: String,
    var matricula: String,
    var cpf: String,
    var setor: String,

) {
    override fun toString(): String {
        return "Vendedor\n nome: $nome\n  cpf: $cpf\n email: $email\n matricula :$matricula\n setor: $setor."
    }
}