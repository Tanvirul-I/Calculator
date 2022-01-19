package calculator.model.RHS

import calculator.model.LHS._
import calculator.model._

class RHS(calculator: Calculator) extends State(calculator) {

  override def displayNumber(): Double = {
    calculator.LHSNum
  }

  override def clearPressed(): Unit = {
    calculator.state = new Initial(calculator)
  }

  override def numberPressed(number: Int): Unit = {
    calculator.RHSNum = calculator.RHSNum * 10 + number
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
