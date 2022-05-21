const fs = require('fs');
const input = fs.readFileSync(0, 'utf8').toString().trim();

const A = parseInt(input);

console.log(A - 543);