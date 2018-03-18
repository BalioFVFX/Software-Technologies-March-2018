function solve(arr) {

    let input = arr.map(JSON.parse); // Make an array of an objects

    let towns = {}; // Make the objects

    // Iterate through the input array objects
    for (let town of input) {
        if(towns[town.town] == undefined){
            towns[town.town] = town.income;
        }
        else{
            towns[town.town] += town.income;
        }

    }

    // Get the keys of the towns and sort them
    let townKeys = Object.keys(towns).sort();


    // Iterate the towns with the sorted townKeys
    for (let town of townKeys) {
        console.log(`${town} -> ${towns[town]}`);
    }

}
