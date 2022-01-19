package calculator.model.RHS

import calculator.model.LHS._
import calculator.model._

class NumberPressed(calculator: Calculator, num: Int, operator: State) extends State(calculator) {

  calculator.RHSNum = calculator.RHSNum * 10 + num

  override def displayNumber(): Double = {
    calculator.RHSNum
  }

  override def clearPressed(): Unit = {
    calculator.state = new Initial(calculator)
  }

  override def numberPressed(number: Int): Unit = {
    calculator.RHSNum = calculator.RHSNum * 10 + number
  }

  override def dividePressed(): Unit = {
    calculator.state = operator
    operator.equalsPressed()
    calculator.state = new Divide(calculator)
  }

  override def multiplyPressed(): Unit = {
    calculator.state = operator
    operator.equalsPressed()
    calculator.state = new Multiply(calculator)
  }

  override def subtractPressed(): Unit = {
    calculator.state = operator
    operator.equalsPressed()
    calculator.state = new Subtract(calculator)
  }

  override def addPressed(): Unit = {
    calculator.state = operator
    operator.equalsPressed()
    calculator.state = new Add(calculator)
  }

  override def equalsPressed(): Unit = {
    calculator.state = operator
    operator.equalsPressed()
    calculator.RHSNum = 0.0
    calculator.state = new LHSConvert(calculator)
  }

  override def decimalPressed(): Unit = {
    calculator.state = new DecimalRHS(calculator, operator)
  }

  override def negatePressed(): Unit = {
    calculator.RHSNum = calculator.RHSNum * -1
  }

  override def sinePressed(): Unit = {
    calculator.RD.RHSSinePressed()
  }

  override def cosinePressed(): Unit = {
    calculator.RD.RHSCosinePressed()
  }

}

