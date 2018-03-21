function solve(numbers){
    let oddNumbers = 0;
    for (let i = 0; i < numbers.length; i++) {
        if(Number(numbers[i]) < 0){
            oddNumbers++;
        }
    }
    if(oddNumbers % 2 != 0){
        console.log('Negative');
    }
    else{
        console.log('Positive');
    }
}