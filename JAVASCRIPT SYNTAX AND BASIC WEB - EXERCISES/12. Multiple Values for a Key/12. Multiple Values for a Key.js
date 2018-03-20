function solve(input){
    let arr = [];
    let output = [];
    for (let i = 0; i < input.length; i++) {
        let convertedInput = input[i].split(' ');
        if(convertedInput.length > 1){
                let object = {};
                object[convertedInput[0]] = convertedInput[1];
                arr.push(object);
        }
        else{

            for (let j = 0; j < arr.length; j++) {

                if(arr[j][convertedInput[0]] !== undefined) {
                    output.push(arr[j][convertedInput[0]]);
                }
            }
        }
    }

    if(output.length > 0){
        for (let i = 0; i < output.length; i++) {
            console.log(output[i]);
        }
    }
    else{
        console.log('None');
    }
}