package com.example.calculator_compose

sealed class CalculatorOperation(val symbole :String) {
    object Add:CalculatorOperation("+")
    object Substract:CalculatorOperation("-")
    object Mutiplie:CalculatorOperation("x")
    object Divise:CalculatorOperation("/")

}