function solve(arr){
    let input = arr.join(', ');
    input = input.split(/\W+/);
    input = input.filter(w => w.length > 0);
    let output = [];
    for (let word of input) {
        if(word == word.toUpperCase()){
            output.push(word);
        }
    }
    console.log(output.join(', '));
}