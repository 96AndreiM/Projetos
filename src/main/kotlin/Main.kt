import java.util.*

fun main() {

    //Vendedor
    var vendedor = Vendedor(
        nome = "Joao Silva",
        email = "joaosilva@gmail.com",
        matricula = "2022",
        cpf = "525525858",
        setor = "roupas",
    )
    //cliente
    var cliente = Cliente(
        nome = "carlos",
        email = "carlos@gmail.com",
        cpf = "123456789",
        telefone = "55051993515577",

        )
    //fornecedor
    var fornecedor = Fornecedor(
        nomeEmpresa = "varejovarejo",
        cnpj = "07.522.689/0001-65",
        telefone = "5505133445566",
        endereco = "av. tcurusbango",
        produtoEstoque = "roupas",
    )
    //produto
    var produto = Produto(
        origem = "lojasVarejistas",
        peso = "1,2 kilos",
        tipo = "roupas",
    )

    //venda
    var venda = Venda(
        valor = "89,90",
        data = "10/11/2021",
        hora = "16:15:14",
        produto = "camiseta",
        matriculavendedor = "2022",
    )

    //Transportadora
    var transportadora = Transportadora(
        nome = "entregasEntregas",
        cnpj = "07.522.689/0001-65",
        endereco = "Av. Tangamandapio",
        responsavel = "Luciana Geruza"
    )

    println(vendedor)
    println(cliente)
    println(fornecedor)
    println(produto)
    println(venda)
    print(transportadora)
}