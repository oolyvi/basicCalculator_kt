package com.urahimli.phlccalculator

data class CalculatorState(         //deyisebilenleri yeni state'leri yaziriq bura
    val number1: String = "",       //ilk input
    val number2: String = "",       //ikinci input
    val operation: CalculatorOperation ?= null    //operation
)
