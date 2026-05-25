'use strict';
/*
// Question 2620 :-  Counter

var createCounter = function (n) {
  return () => {
    console.log(n);
    return n++;
  };
};

const counter = createCounter(10);
counter(); // 10
counter(); // 11
counter(); // 12


///////////////////////////////////
// Other way

// var createCounter = function (n) {
//   let x = -1;
//   return function () {
//     x++;
//     return n + x;
//   };
// };

// const counter = createCounter(10);
// counter(); // 10
// counter(); // 11
// counter(); // 12
*/

// Question :- 2667 Create Hello World Function

var createHelloWorld = function () {
  return function (...args) {
    return 'Hello World';
  };
};

const f = createHelloWorld();
f(); // "Hello World"
