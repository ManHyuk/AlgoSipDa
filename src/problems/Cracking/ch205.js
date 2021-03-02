const _ = require('fxjs/Strict')


const addList = (list1, list2) => {
    const size1 = list1.length;
    const size2 = list2.length;

    let sum1 = 0;
    for (let i = size1 - 1; i >= 0; i--) {

        sum1 += list1[i] * Math.pow(10, i);
    }

    let sum2 = 0;
    for (let i = size2 - 1; i >= 0; i--) {
        sum2 += list2[i] * Math.pow(10, i);
    }

    console.log(sum1, sum2)
    return sum1 + sum2;
}

const input1 = [3, 2, 1];
const input2 = [5, 1];
// console.log('result', addList(input1, input2))

const add = (a, b) => a + b;

const sum1 = input1.reverse()
    .map((item, i) => item * Math.pow(10, input1.length - i - 1))
    .reduce((a, b) => a + b);
const sum2 = input2.reverse()
    .map((item, i) => item * Math.pow(10, input2.length - i - 1))
    .reduce(add)

console.log(add(sum1, sum2))