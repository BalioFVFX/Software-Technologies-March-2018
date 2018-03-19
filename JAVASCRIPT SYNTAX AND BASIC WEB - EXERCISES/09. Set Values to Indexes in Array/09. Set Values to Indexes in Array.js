function solve(input){
    let arr = [];
    arr.length = input[0];

    for (let i = 1; i < input.length; i++) {
        let nums = input[i].split(' - ');
        let index = Number(nums[0].trim());
        let number = Number(nums[1].trim());

        arr[index] = number;
    }

    for (let i = 0; i < arr.length; i++) {
        if(arr[i] == undefined){
            arr[i] = 0;
        }
        console.log(arr[i]);
    }
}