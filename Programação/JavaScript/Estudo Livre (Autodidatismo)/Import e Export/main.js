// Módulos ES6 - Import e Export em JavaScript
// São arquivos externos que contém código reutilizável que podem ser importados para outros arquivos JS. Podem conter variáveis, classes, funções e muito mais

import { PI, obterCircunferencia, obterArea, obterVolume } from './modulos/matematica.js';
import { mostrarNome, mostrarIdade, mostrarCidade} from './modulos/pessoa.js';

// Usando os imports de matemática
const circunferencia = obterCircunferencia(10);
const area = obterArea(10);
const volume = obterVolume(10);

// Mostrando tudo no console
console.log(`PI: ${PI.toFixed(2)}`);
console.log(`Circunferência: ${circunferencia.toFixed(2)}cm`);
console.log(`Área: ${area.toFixed(2)}cm^2`);
console.log(`Volume: ${volume.toFixed(2)}cm^3`);

console.log('————————————————————————————————————————————————————————————');

// Usando os imports de pessoa
const nome = mostrarNome('Aleki');
const idade = mostrarIdade(16);
const cidade = mostrarCidade('Lauro de Freitas');

// Mostrando tudo no console
console.log(`O nome é: ${nome}`);
console.log(`A idade é: ${idade}`);
console.log(`A cidade é: ${cidade}`);