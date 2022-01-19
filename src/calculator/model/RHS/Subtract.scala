package calculator.model.RHS

import calculator.model.LHS._
import calculator.model._

class Subtract(calculator: Calculator) extends State(calculator) {

  override def displayNumber(): Double = {
    calculator.RHSNum
  }

  override def clearPressed(): Unit = {
    calculator.state = new Initial(calculator)
  }

  override def numberPressed(number: Int): Unit = {
    calculator.state = new NumberPressed(calculator, number, new Subtract(calculator))
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
    calculator.LHSNum = calculator.LHSNum - calculator.RHSNum
    calculator.RHSNum = 0.0
    calculator.state = new LHSConvert(calculator)
  }

  override def decimalPressed(): Unit = {
    calculator.state = new DecimalRHS(calculator, new Subtract(calculator))
  }

  override def negatePressed(): Unit = {

  }

  override def sinePressed(): Unit = {

  }

  override def cosinePressed(): Unit = {

  }
}
