// Desestruturação de objetos em JavaScript
// É uma forma conveniente de extrair valores de objetos e atribuí-los a variáveis.

const numeros = [1, 2, 3, 4, 5];

const usuario = {
    nome: 'Alexandre',
    sobrenome: 'Silva',
    idade: 16,
    endereco: {
        cidade: 'Lauro de Freitas',
        estado: 'Bahia'
    }
}

// Exemplo tradicional com arrays
const um = numeros[0];
const dois = numeros[1]
const tres = numeros[2];
const quatro = numeros[3];
const cinco = numeros[4];

console.log(um, dois, tres, quatro, cinco);

// Exemplo com desestruturação de arrays.
const [valorUm, valorDois, valorTres, valorQuatro, valorCinco] = numeros;

console.log(valorUm, valorDois, valorTres, valorQuatro, valorCinco);

// Exemplo tradicional com objetos
const nomeUsuario = usuario.nome;
const idadeUsuario = usuario.idade;
const enderecoUsuario = usuario.endereco.cidade.estado;

console.log(nomeUsuario, idadeUsuario, enderecoUsuario);

// Exemplo com desestruturação de objetos.
const { idade: age, nome: userName, sobrenome = 'Não informado' } = usuario;

// Função sem desestruturação (acesso direto às propriedades do objeto)
function mostrarIdade(usuario) {
    return usuario.idade;
}

// Função com desestruturação (no parâmetro da função). Nesse caso, extraindo apenas a propriedade 'idade' do objeto 'usuario'
function mostrarNome({ nome }) {
    return nome;
}

// Testando os exemplos
console.log(age, userName, sobrenome)
console.log(mostrarIdade(usuario));
console.log(mostrarNome(usuario));