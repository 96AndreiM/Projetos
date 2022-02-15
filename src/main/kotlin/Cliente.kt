class Cliente (

    var nome: String,
    var email: String,
    var cpf: String,
    var telefone: String,

) {
    override fun toString(): String {
        return "\nCliente\n nome: $nome\n email: $email\n cpf: $cpf\n telefone: $telefone\n"
    }
}
