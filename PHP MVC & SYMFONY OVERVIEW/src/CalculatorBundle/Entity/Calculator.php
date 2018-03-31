<?php
namespace CalculatorBundle\Entity;

class Calculator
{

    /**
     * @var float
     */
    private $leftOperand;

    /**
     * @var float
     */
    private $rightOperand;

    /**
     * @var string
     */
    private $operator;


    /**
     * Get operator
     *
     * @return string
     */
    public function getOperator(){
        return $this->operator;
    }

    /**
     * Set operator
     *
     * @param float $operator
     * @return Calculator
     */
    public function setOperator($operator){
        $this->operator = $operator;

        return $this;
    }


    /**
     * Get left operand
     *
     * @return float
     */
    public function getLeftOperand(){
        return $this->leftOperand;
}

    /**
     * Get right operand
     *
     * @return float
     */
    public function getRightOperand(){
        return $this->rightOperand;
    }

    /**
     * Set left operand
     *
     * @param float $operand
     * @return Calculator
     */
    public function setLeftOperand($operand){
        $this->leftOperand = $operand;

        return $this;
    }

    /**
     * Set right operand
     *
     * @param float $operand
     * @return Calculator
     */
    public function setRightOperand($operand){
        $this->rightOperand = $operand;

        return $this;
    }

}