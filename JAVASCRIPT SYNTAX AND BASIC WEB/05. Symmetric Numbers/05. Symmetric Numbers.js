function solve(number){
    for(var i = 1; i <= Number(number); i++){
        let numberStr = i.toString();
        let arrStr = numberStr.split('');
        arrStr.reverse();
        let reversedNum = Number(arrStr.join(''));
        if(i == reversedNum){
            console.log(i);
        }
    }
}

