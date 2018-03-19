function solve(input){
    let arr = [];
    for (let i = 0; i < input.length; i++) {
        let convertedInput = input[i].split(' ');
        let command = convertedInput[0];
        let command2 = Number(convertedInput[1]);

        if(command == 'add'){
            arr.push(command2);
        }
        else if(command == 'remove'){
            if(command2 < arr.length){
                arr.splice(command2, 1);
            }
        }
    }

    for (let i = 0; i < arr.length; i++) {
        console.log(arr[i]);
    }
}

solve(['add 3', 'add 5', 'remove 2', 'remove 0', 'add 7']);