function solution(n, lost, reserve) {

    const students = Array(n).fill(1);
    // n - lost.length + reserve.length - duplicate.length

    for (const l of lost) {
        students[l - 1] -= 1;
    }

    for (const r of reserve) {
        students[r - 1] += 1;
    }

    for (let i = 0; i < students.length; i++) {
        if (students[i] === 2 && students[i - 1] === 0) {
            students[i] -= 1;
            students[i - 1] += 1;
        } else if (students[i] === 2 && students[i + 1] === 0) {
            students[i] -= 1;
            students[i + 1] += 1;
        }
    }

    const result = students.filter(student => student >= 1);
    console.log(result.length);
    return result.length;

}


const inputCase = {n: 5, lost: [2, 4], reserve: [1, 3, 5]}; // 5
// const inputCase = {n: 5, lost: [2, 4], reserve: [3]};  // 4
// const inputCase = {n: 3, lost: [3], reserve: [1]}; // 2
solution(inputCase.n, inputCase.lost, inputCase.reserve);