package com.example.lab1_simple_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.exp

class MainActivity : AppCompatActivity()/*, View.OnClickListener*/ {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var expres: String = ""
        var numOne: Int? = null
        var numTwo: Int? = null

        //Setting the listeners for the number buttons
        button0.setOnClickListener{
            newCheck(expres)
            expres = expres.plus("0")
            addEmUp("0", false)}
        button1.setOnClickListener{
            newCheck(expres)
            expres = expres.plus("1")
            addEmUp("1", false)}
        button2.setOnClickListener{
            newCheck(expres)
            expres =expres.plus("2")
            addEmUp("2", false)}
        button3.setOnClickListener{
            newCheck(expres)
            expres =expres.plus("3")
            addEmUp("3", false)}
        button4.setOnClickListener{
            newCheck(expres)
            expres =expres.plus("4")
            addEmUp("4", false)}
        button5.setOnClickListener{
            newCheck(expres)
            expres =expres.plus("5")
            addEmUp("5", false)}
        button6.setOnClickListener{
            newCheck(expres)
            expres =expres.plus("6")
            addEmUp("6", false)}
        button7.setOnClickListener{
            newCheck(expres)
            expres =expres.plus("7")
            addEmUp("7", false)}
        button8.setOnClickListener{
            newCheck(expres)
            expres =expres.plus("8")
            addEmUp("8", false)}
        button9.setOnClickListener{
            newCheck(expres)
            expres =expres.plus("9")
            addEmUp("9", false)}

//        button0.setOnClickListener(this)
//        button1.setOnClickListener(this)
//        button3.setOnClickListener(this)
//        button4.setOnClickListener(this)
//        button5.setOnClickListener(this)
//        button6.setOnClickListener(this)
//        button7.setOnClickListener(this)
//        button8.setOnClickListener(this)
//        button9.setOnClickListener(this)

//        Setting the listeners for the other buttons

//        buttonAdd.setOnClickListener(this)
//        buttonC.setOnClickListener(this)
        buttonAdd.setOnClickListener{
            if (numOne == null) {
                numOne = expres.toInt()
                addEmUp("+", true)
                expres = ""
            } else if (numOne!= null && numTwo == null){
                numTwo = expres.toInt()
                var result = numOne!! + numTwo!!
                textViewNumbers.text = result.toString()
                numOne = result
                numTwo = null
                expres = ""
            }
        }
        buttonC.setOnClickListener{
            textViewNumbers.text = ""
            expres = ""
            numOne = null
            numTwo = null
        }
        println(expres)
    }

//    override fun onClick(p0: View?) {
//        var value = ""
//        when (p0){
//            button0 -> value = "0"
//            button1 -> value = "1"
//            button2 -> value = "2"
//            button3 -> value = "3"
//            button4 -> value = "4"
//            button5 -> value = "5"
//            button6 -> value = "6"
//            button7 -> value = "7"
//            button8 -> value = "8"
//            button9 -> value = "9"
//        }
//        newCheck(expres)
//        expres =expres.plus(value)
//        addEmUp(value, false)
//    }


    fun addEmUp (string: String, canClear: Boolean) {

        if (canClear) {
            textViewNumbers.text = ""
        } else {
            textViewNumbers.append(string)
        }
    }
     fun newCheck (string:String){
         if (string == "") {
             textViewNumbers.text = ""
         }
     }
}
