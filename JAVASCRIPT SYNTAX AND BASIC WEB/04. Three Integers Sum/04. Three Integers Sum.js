function solve([nums]){
    let numbers = nums.split(' ');
    let num1 = Number(numbers[0]);
    let num2 = Number(numbers[1]);
    let num3 = Number(numbers[2]);

    if(num1 + num2 == num3){
        console.log(`${Math.min(num1, num2)} + ${Math.max(num1, num2)} = ${num3}`)
    }
    else if(num1 + num3 == num2){
        console.log(`${Math.min(num1, num3)} + ${Math.max(num1,num3)} = ${num2}`)
    }
    else if(num2 + num3 == num1){

        console.log(`${Math.min(num2, num3)} + ${Math.max(num2, num3)} = ${num1}`)
    }
    else if(num3 + num1 == num2){
        console.log(`${Math.min(num1, num3)} + ${Math.max(num1, num3)} = ${num2}`)
    }
    else{
        console.log("No")
    }
}

solve('20 10 30');

