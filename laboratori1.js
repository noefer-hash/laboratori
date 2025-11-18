console.log("Hola, món!");

// 4 y 5 - Variables básicas
let nom = "Maria";
let edat = 20;
let esEstudiant = true;
let valorBuit = null;

const ciutat = "Barcelona"; // const = no canvia

console.log(nom);
console.log(edat);
console.log(esEstudiant);
console.log(valorBuit);
console.log("Visc a " + ciutat);
console.log(`${nom} té ${edat} anys`); // les dues maneres

// 6 - Números i operacions
let a = 10;
let b = 3;

console.log(a + b);   // suma → 13
console.log(a - b);   // resta → 7
console.log(a * b);   // multiplicació → 30
console.log(a / b);   // divisió → 3.333...
console.log(a % b);   // residu → 1

console.log(a > b);   // true
console.log(a < b);   // false
console.log(a == b);  // false

// 7 - Si el número és positiu, negatiu o zero
let numero = -5;

if (numero > 0) {
    console.log("és positiu");
} else if (numero < 0) {
    console.log("és negatiu");
} else {
    console.log("és zero");
}

// 8 - Números de l'1 al 10
for (let i = 1; i <= 10; i = i + 1) {
    console.log(i);
}

// 9 - Array d'estudiants
let alumnes = ["Joan", "Laia", "Pere", "Anna"];

for (let i = 0; i < 4; i = i + 1) {
    console.log(alumnes[i]);
}

// 10 - Números parells del 2 al 20 amb while
let parell = 2;
while (parell <= 20) {
    console.log(parell);
    parell = parell + 2;
}

// 11 - Funció suma
function suma(x, y) {
    return x + y;
}

console.log(suma(7, 9));
console.log(suma(100, 200));

// 12 - El número més gran (molt bàsic)
function elMesGran(array) {
    let gran = array[0];
    for (let i = 0; i < array.length; i = i + 1) {
        if (array[i] > gran) {
            gran = array[i];
        }
    }
    return gran;
}

let llista = [5, 12, 8, 25, 3];
console.log("El més gran és " + elMesGran(llista));

// 13 - Comptar parells
function quantsParells(array) {
    let contador = 0;
    for (let i = 0; i < array.length; i = i + 1) {
        if (array[i] % 2 === 0) {
            contador = contador + 1;
        }
    }
    return contador;
}

console.log("Números parells: " + quantsParells(llista));

// 14 - Invertir text (molt senzill)
function inverteixText(texte) {
    let resultat = "";
    for (let i = texte.length - 1; i >= 0; i = i - 1) {
        resultat = resultat + texte[i];
    }
    return resultat;
}

console.log(inverteixText("hola"));

// 15 - És primer? (molt bàsic)
function esPrimer(num) {
    if (num < 2) {
        return false;
    }
    for (let i = 2; i < num; i = i + 1) {
        if (num % i === 0) {
            return false;
        }
    }
    return true;
}

console.log("13 és primer?", esPrimer(13));
console.log("20 és primer?", esPrimer(20));

// 16 - Filtrar parells
function nomésParells(array) {
    let nous = [];
    for (let i = 0; i < array.length; i = i + 1) {
        if (array[i] % 2 === 0) {
            nous.push(array[i]);
        }
    }
    return nous;
}

let números = [1, 2, 3, 4, 5, 6, 7, 8];
console.log(nomésParells(números));

console.log("Fi del laboratori!");