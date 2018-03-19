function solve(numbers){
    let number1 = Number(numbers[0]);
    let number2 = Number(numbers[1]);

    if(number2 >= number1){
        console.log(number1 * number2);
    }
    else{
        console.log(number1 / number2);
    }
}