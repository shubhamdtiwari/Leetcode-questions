'use strict';
// Question 2620 :-  Counter
var createCounter = function (n) {
  let x = -1;
  return function () {
    x++;
    return n + x;
  };
};

const counter = createCounter(10);
counter(); // 10
counter(); // 11
counter(); // 12
