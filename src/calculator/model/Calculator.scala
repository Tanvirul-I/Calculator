package calculator.model

import calculator.model.Expansion.Degrees
import calculator.model.Expansion.Radians

class Calculator() {

  var state: State = new Initial(this)
  var RD: RDState = new Degrees(this)
  var LHSNum: Double = 0.0
  var RHSNum: Double = 0.0

  def displayNumber(): Double = {
    this.state.displayNumber()
  }

  def clearPressed(): Unit = {
    this.state.clearPressed()
  }

  def numberPressed(number: Int): Unit = {
    this.state.numberPressed(number)
  }

  def dividePressed(): Unit = {
    this.state.dividePressed()
  }

  def multiplyPressed(): Unit = {
   this.state.multiplyPressed()
  }

  def subtractPressed(): Unit = {
    this.state.subtractPressed()
  }

  def addPressed(): Unit = {
    this.state.addPressed()
  }

  def equalsPressed(): Unit = {
    this.state.equalsPressed()
  }

  def decimalPressed(): Unit = {
    this.state.decimalPressed()
  }

  def negatePressed(): Unit = {
    this.state.negatePressed()
  }

  def sinePressed(): Unit = {
    this.state.sinePressed()
  }

  def cosinePressed(): Unit = {
    this.state.cosinePressed()
  }

  def RDPressed(): Unit = {
    this.RD.RDPressed()
  }

}
