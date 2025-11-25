// Módulos ES6 - Import e Export em JavaScript
// São arquivos externos que contém código reutilizável que podem ser importados para outros arquivos JS. Podem conter variáveis, classes, funções e muito mais

// Criando uma variável, três funções, e depois exportando-as
// Variável 'PI'
export const PI = 3.14159;

// Funções 'obterCircunferencia', 'obterArea' e 'obterVolume'
export const obterCircunferencia = raio => 2 * PI * raio; 
export const obterArea = raio => PI * raio * raio; 
export const obterVolume = raio => 4 * PI * raio * raio;