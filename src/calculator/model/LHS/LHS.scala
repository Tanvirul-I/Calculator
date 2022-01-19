package calculator.model.LHS

import calculator.model.RHS.{Add, Divide, Multiply, Subtract}
import calculator.model._

class LHS(calculator: Calculator) extends State(calculator) {

  override def displayNumber(): Double = {
    calculator.LHSNum
  }

  override def clearPressed(): Unit = {
    calculator.state = new Initial(calculator)
  }

  override def numberPressed(number: Int): Unit = {
    calculator.LHSNum = calculator.LHSNum * 10 + number
  }

  override def dividePressed(): Unit = {
    calculator.state = new Divide(calculator)
  }

  override def multiplyPressed(): Unit = {
    calculator.state = new Multiply(calculator)
  }

  override def subtractPressed(): Unit = {
    calculator.state = new Subtract(calculator)
  }

  override def addPressed(): Unit = {
    calculator.state = new Add(calculator)
  }

  override def equalsPressed(): Unit = {
  }

  override def decimalPressed(): Unit = {
    calculator.state = new DecimalLHS(calculator)
  }

  override def negatePressed(): Unit = {
    calculator.LHSNum = calculator.LHSNum * -1
  }

  override def sinePressed(): Unit = {
    calculator.RD.LHSSinePressed()
  }

  override def cosinePressed(): Unit = {
    calculator.RD.LHSCosinePressed()
  }
}
