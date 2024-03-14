package com.example.calculator_compose

 sealed class CalculatorActions {

  data class Number(val number: Int) :CalculatorActions()
  data class Operation(val operation: CalculatorOperation) :CalculatorActions()
  object Clear :CalculatorActions()
  object Delete :CalculatorActions()
  object Decimal :CalculatorActions()
  object Calculate :CalculatorActions()




}