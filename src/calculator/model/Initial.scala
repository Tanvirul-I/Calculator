package calculator.model

import calculator.model.LHS._
import calculator.model.RHS.{Add, Divide, Multiply, Subtract}

class Initial(calculator: Calculator) extends State(calculator) {

  calculator.LHSNum = 0.0
  calculator.RHSNum = 0.0

  override def displayNumber(): Double = {
    calculator.LHSNum
  }

  override def clearPressed(): Unit = {
    calculator.state = new Initial(calculator)
  }

  override def numberPressed(number: Int): Unit = {
    calculator.LHSNum = number
    calculator.state = new LHS(calculator)
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
    calculator.state = new LHS(calculator)
  }

  override def decimalPressed(): Unit = {
    calculator.state = new DecimalLHS(calculator)
  }

  override def negatePressed(): Unit = {

  }

  override def sinePressed(): Unit = {
    calculator.RD.LHSSinePressed()
  }

  override def cosinePressed(): Unit = {
    calculator.RD.LHSCosinePressed()
  }

}
