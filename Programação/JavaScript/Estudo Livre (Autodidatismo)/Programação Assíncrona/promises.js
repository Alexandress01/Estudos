// Promises em JavaScript
// É um objeto que gerencia operações assíncronas, como consultar um banco de dados, buscar um arquivo etc
// "Eu prometo retornar um valor". Ficará pendente e será resolvida se a tarefa for concluída, ou rejeitada se falhar por algum motivo

// Tarefas em ordem 
function passearComCachorro() {
    return new Promise((resolver, rejeitar) => {
        setTimeout(() => {

            let passeou = true;

            if (passeou) {
                resolver('Você levou o cachorro para passear 🐕');
            } else {
                rejeitar('Você não passeou com o cachorro');
            }
        }, 1500);
    })
}

function limparCozinha() {
    return new Promise((resolver, rejeitar) => {
        setTimeout(() => {

            limpou = true;

            if (limpou) {
                resolver('Você limpou a cozinha 🧹');
            } else {
                rejeitar('Você não limpou a cozinha');
            }
        }, 2500);
    });
}

function tirarLixo() {
    return new Promise((resolver, rejeitar) => {
        setTimeout(() => {

            tirou = true;

            if (tirou) {
                resolver('Você tirou o lixo ♻️');
            } else {
                rejeitar('Você não tirou o lixo');
            }
        }, 500);
    })
}

// Chamando as funções com as Promises (callback hell)
passearComCachorro().then(value => {console.log(value); return limparCozinha()})
                    .then(value => {console.log(value); return tirarLixo()})
                    .then(value => {console.log(value); console.log('Você terminou todas as tarefas!')})
                    .catch(error => console.error(error));