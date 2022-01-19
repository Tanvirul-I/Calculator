package calculator.model.RHS

import calculator.model.LHS._
import calculator.model._

class DecimalRHS(calculator: Calculator, operator: State) extends State(calculator) {

  var returnNumber: String = calculator.RHSNum.toString.slice(0, calculator.RHSNum.toString.length - 1)

  override def displayNumber(): Double = {
    calculator.RHSNum
  }

  override def clearPressed(): Unit = {
    calculator.state = new Initial(calculator)
  }

  override def numberPressed(number: Int): Unit = {
    this.returnNumber += number.toString
    calculator.RHSNum = this.returnNumber.toDouble
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
    calculator.state = new LHS(calculator)

  }

  override def decimalPressed(): Unit = {
  }

  override def negatePressed(): Unit = {
    calculator.RHSNum = this.returnNumber.toDouble * -1
  }

  override def sinePressed(): Unit = {
    calculator.RD.RHSSinePressed()
  }

  override def cosinePressed(): Unit = {
    calculator.RD.RHSCosinePressed()
  }

}
