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


// Question :- 2667 Create Hello World Function

var createHelloWorld = () => {
  return (...args) => {
    console.log('Hello World');
  };
};

const f = createHelloWorld();
f(); // "Hello World"
*/

// Question :- 2704 To Be Or Not To Be

var expect = function (val) {
  return {
    toBe: function (expected) {
      if (val === expected) {
        return true;
      } else {
        throw new Error('Not Equal');
      }
    },
    notToBe: function (unexpected) {
      if (val !== unexpected) {
        return true;
      } else {
        throw new Error('Equal');
      }
    },
  };
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */
