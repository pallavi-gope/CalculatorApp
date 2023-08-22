package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.btnDivide
import kotlinx.android.synthetic.main.activity_main.btnMinus
import kotlinx.android.synthetic.main.activity_main.btnMultiply
import kotlinx.android.synthetic.main.activity_main.btnPlus
import kotlinx.android.synthetic.main.activity_main.txtInput1
import kotlinx.android.synthetic.main.activity_main.txtInput2
import kotlinx.android.synthetic.main.activity_main.txtResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener {
            val input1 = txtInput1.text.toString().toInt()
            val input2 = txtInput2.text.toString().toInt()
            txtResult.text = (input1 + input2).toString()
        }
        btnMinus.setOnClickListener {
            val input1 = txtInput1.text.toString().toInt()
            val input2 = txtInput2.text.toString().toInt()
            txtResult.text = (input1 - input2).toString()
        }
        btnMultiply.setOnClickListener {
            val input1 = txtInput1.text.toString().toInt()
            val input2 = txtInput2.text.toString().toInt()
            txtResult.text = (input1 * input2).toString()
        }
        btnDivide.setOnClickListener {
            val input1 = txtInput1.text.toString().toInt()
            val input2 = txtInput2.text.toString().toInt()
            txtResult.text = (input1/input2).toString()
        }
    }
}