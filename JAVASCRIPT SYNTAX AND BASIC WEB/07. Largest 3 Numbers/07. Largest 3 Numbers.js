function solve(arr){
    // Convert the string input to numbers
    let numbers = arr.map(n => Number(n));
    let endIndex = 3;
    if(numbers.length < 3){
        endIndex = numbers.length;
    }
    for(let i = 0; i < endIndex; i++){
        // Get the biggest number from the array
        let biggestNumber = Math.max.apply(Math, numbers);

        console.log(biggestNumber);

        // Remove the biggest number from the array
        numbers.splice(numbers.indexOf(biggestNumber), 1);
    }
}