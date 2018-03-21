function solve(input){
    let objectsArr = [];
    for (let i = 0; i < input.length; i++) {
        let object = JSON.parse(input[i]);
        objectsArr.push(object);
    }

    for (let obj of objectsArr) {
        console.log('Name: ' + obj['name']);
        console.log('Age: ' + obj['age']);
        console.log('Date: ' + obj['date']);
    }
}