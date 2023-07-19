package com.urahimli.phlccalculator

sealed class CalculatorAction {     //viewModel'a ne edileceyini eventlerle bildiririk
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()           //clear funksiyasi hec bir reqem goturmur
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}
