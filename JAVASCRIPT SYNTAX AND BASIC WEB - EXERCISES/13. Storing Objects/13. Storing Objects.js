function solve(input){
    let students = [];
    for (let i = 0; i < input.length; i++) {
        let student = {};
        let convertedInput = input[i].split(' -> ');
        student['Name'] = convertedInput[0];
        student['Age'] = convertedInput[1];
        student['Grade'] = convertedInput[2];
        students.push(student);
    }

    for (let student of students) {
        console.log('Name: ' + student['Name']);
        console.log('Age: ' + student['Age']);
        console.log('Grade: ' + student['Grade']);
    }
}