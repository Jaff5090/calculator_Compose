package com.example.calculator_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator_compose.ui.theme.LightGray
import com.example.calculator_compose.ui.theme.Orange

@Composable
fun Calculator(
    state: CalculateState,
    buttomSpacing: Dp = 8.dp,
    modifier: Modifier = Modifier,
    onAction:(CalculatorActions) ->Unit
) {

    Box(modifier = modifier) {

        Column(

            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),

            verticalArrangement = Arrangement.spacedBy(buttomSpacing)

        ) {
            Text(
                text = state.number1 + (state.operation ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2


            )
            Row (
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttomSpacing)
            ){
                CalculatorButtom(symbole = "AC",
                    modifier = Modifier.background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f),

                    onClick =
                    {
                        onAction(CalculatorActions.Clear)
                    }
                )

                CalculatorButtom(symbole = "Del",
                    modifier = Modifier.background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Delete)
                    }
                )
                CalculatorButtom(symbole = "/",
                    modifier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Divise) )
                    }
                )
            }

            Row (
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttomSpacing)
            ){
                CalculatorButtom(symbole = "7",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Number(7))
                    }
                )
                CalculatorButtom(symbole = "8",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Number(8))
                    }
                )
                CalculatorButtom(symbole = "9",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Number(9))
                    }
                )

                CalculatorButtom(symbole = "x",
                    modifier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Mutiplie))
                    }
                )
            }
            Row (
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttomSpacing)
            ){
                CalculatorButtom(symbole = "4",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Number(4))
                    }
                )
                CalculatorButtom(symbole = "5",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Number(5))
                    }
                )
                CalculatorButtom(symbole = "6",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Number(6))
                    }
                )

                CalculatorButtom(symbole = "-",
                    modifier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Substract))
                    }
                )
            }

            Row (
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttomSpacing)
            ){
                CalculatorButtom(symbole = "1",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Number(1))
                    }
                )
                CalculatorButtom(symbole = "2",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Number(2))
                    }
                )
                CalculatorButtom(symbole = "3",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Number(3))
                    }
                )

                CalculatorButtom(symbole = "+",
                    modifier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Add))
                    }
                )
            }

            Row (
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttomSpacing)
            ){
                CalculatorButtom(symbole = "0",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),

                    onClick =
                    {
                        onAction(CalculatorActions.Number(0))
                    }
                )
                CalculatorButtom(symbole = ".",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Decimal)
                    }
                )
                CalculatorButtom(symbole = "=",
                    modifier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick =
                    {
                        onAction(CalculatorActions.Calculate)
                    }
                )

            }


        }
    }

}