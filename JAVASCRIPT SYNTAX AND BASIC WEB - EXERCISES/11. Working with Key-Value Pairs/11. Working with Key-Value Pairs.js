function solve(input){
    let objects = {};
    for (let i = 0; i < input.length; i++) {
        let convertedInput = input[i].split(' ');
        if(convertedInput.length > 1){
            if(objects[convertedInput[0]] === undefined){
                objects[convertedInput[0]] = convertedInput[1];
            }
            else{
                objects[convertedInput[0]] = convertedInput[1];
            }
        }
        else{
            if(objects[convertedInput] !== undefined){
                console.log(objects[convertedInput]);
            }
            else{
                console.log('None');
            }
        }
    }
}