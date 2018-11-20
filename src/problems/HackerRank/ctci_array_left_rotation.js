const rotLeft = (a, d)  => {
    while (d-- !== 0) a.push(a.shift());
    return a;
};

const a = [1,2,3,4,5];
const d = 4;
console.log(rotLeft(a,d));