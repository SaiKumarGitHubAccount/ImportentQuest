let firstName: string = "Dylan"; // type string

console.log(typeof firstName);
let v: any = true;

v = "string"; // no error as it can be "any" type

// v.runANonExistentMethod(); 
// no type error in the editor, but will still throw an error if commented in

console.log(Math.round(v)); // no error as it can be "any" type

// define our tuple
let ourTuple: [number, boolean, string];

// initialize correctly
ourTuple = [5, false, 'Coding God was here'];

console.log(ourTuple);