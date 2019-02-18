const isPrime = (n) => {
  if (n<2) return false;

  const q = Math.floor(Math.sqrt(n));

  for (let i = 2; i <= q; i++) {
    if (n % i === 0) {
      return false
    }
  }
  return true;
};

const input = 10;
const list = [];

for (let i = 10; i <= input*2; i++) {
  list.push(i);
}

const filtered = list.filter((item) => {

  return isPrime(item);
});

console.log(filtered.length);

