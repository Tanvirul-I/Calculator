package calculator.model.Expansion

import calculator.model.LHS.LHS
import calculator.model.{Calculator, RDState}

class Radians(calculator: Calculator) extends RDState(calculator) {

  def LHSCosinePressed(): Unit = {
    calculator.LHSNum = math.cos(calculator.displayNumber())
  }

  def RHSCosinePressed(): Unit = {
    calculator.RHSNum = math.cos(calculator.displayNumber())
  }

  def LHSSinePressed(): Unit = {
    calculator.LHSNum = math.sin(calculator.displayNumber())
  }

  def RHSSinePressed(): Unit = {
    calculator.RHSNum = math.sin(calculator.displayNumber())
  }

  override def RDPressed(): Unit = {
    calculator.RD = new Degrees(calculator)
  }

}
