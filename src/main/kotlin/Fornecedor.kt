class Fornecedor(
    var nomeEmpresa: String,
    var cnpj: String,
    var telefone: String,
    var endereco: String,
    var produtoEstoque: String

) {
    override fun toString(): String {
        return "Fornecedor\n nomeEmpresa:$nomeEmpresa\n cnpj:$cnpj\n telefone:$telefone\n endereco:$endereco\n " +
                "produtoEstoque:$produtoEstoque\n"
    }
}