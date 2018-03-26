const Calculator = require('../models/Calculator');
module.exports = {
    indexGet: (req, res) => {
        res.render('home/index', {'leftOperandPlaceholder':'Left operand', 'rightOperandPlaceholder':'Right operand', 'resultPlaceholder':'Result', 'leftOperandColor':'#ffffff', 'rightOperandColor':'#ffffff'});
    },

    indexPost: (req, res) => {
        let calculatorBody = req.body;

        let calculatorParams = calculatorBody['calculator'];
        let calculator = new Calculator();

        if(calculatorParams.leftOperand != '' && calculatorParams.rightOperand != '') {

            calculator.leftOperand = Number(calculatorParams.leftOperand);
            calculator.operator = calculatorParams.operator;
            calculator.rightOperand = Number(calculatorParams.rightOperand);
            let result = calculator.calculateResult();

            res.render('home/index', {'calculator': calculator, 'result': result, 'leftOperandColor':'#ffffff', 'rightOperandColor':'#ffffff'});
        }
        else if(calculatorParams.leftOperand == ''){
            calculator.rightOperand = Number(calculatorParams.rightOperand);
            res.render('home/index', {'calculator': calculator,'leftOperandPlaceholder':'Enter a number', 'resultPlaceholder':'Result', 'leftOperandColor':'#ff0000', 'rightOperandColor':'#ffffff'});
        }
        else if(calculatorParams.rightOperand == ''){
            calculator.leftOperand = Number(calculatorParams.leftOperand);
            res.render('home/index', {'calculator': calculator,'rightOperandPlaceholder':'Enter a number', 'resultPlaceholder':'Result', 'rightOperandColor':'#ff0000', 'leftOperandColor':'#ffffff'});
        }
    }
};