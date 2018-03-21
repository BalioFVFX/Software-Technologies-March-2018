function solve(input){
    let object = {};
    for (let i = 0; i < input.length; i++) {
        object[input[i].split(' -> ')[0]] = input[i].split(' -> ')[1];
    }
    object['age'] = Number(object['age']);
    object['grade'] = Number(object['grade']);
    console.log(JSON.stringify(object));
}