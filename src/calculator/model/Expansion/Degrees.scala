package calculator.model.Expansion

import calculator.model.LHS.LHS
import calculator.model.{Calculator, RDState}

class Degrees(calculator: Calculator) extends RDState(calculator) {

  def LHSCosinePressed(): Unit = {
    calculator.LHSNum = math.cos(math.toRadians(calculator.displayNumber()))
  }

  def RHSCosinePressed(): Unit = {
    calculator.RHSNum = math.cos(math.toRadians(calculator.displayNumber()))
  }

  def LHSSinePressed(): Unit = {
    calculator.LHSNum = math.sin(math.toRadians(calculator.displayNumber()))
  }

  def RHSSinePressed(): Unit = {
    calculator.RHSNum = math.sin(math.toRadians(calculator.displayNumber()))
  }

  override def RDPressed(): Unit = {
    calculator.RD = new Radians(calculator)
  }

}
