package vcmsa.ci.imada1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Retrieve UI elements from the layout by their IDs.
        // EditText for user to put the time o day.
        val mealTime: EditText = findViewById(R.id.mealTime)
        // Button that when clicked displays meal options.
        val displayButton: Button = findViewById(R.id.displayButton)
        // Button to reset for a different time of day.
        val resetButton: Button = findViewById(R.id.resetButton)
        //TextView to display the result.
        val resultText: TextView = findViewById(R.id.resultText)

        // Shows the text when the app starts
        resultText.text ="""
            Select the time of day from the options 
            given below, this will then provide you 
            with an appropriate meal for your selected time.
            - Morning
            - Mid-morning
            - Afternoon
            - Mid-afternoon
            - night
            """.trimIndent()

        //Allows displayButton to perform a function
        displayButton.setOnClickListener {
            val userinput: String =
                mealTime.text.toString()//This code was taken from Stack overflow "Mehran" (2017):https://stackoverflow.com/questions/44267572/edittext-get-text-kotlin

            //displays the results when correct input is given; This code was taken from W3schools (2025):https://www.w3schools.com/kotlin/kotlin_conditions.php
            if (userinput == "Morning" || userinput == "morning") {
                resultText.text = """
                    Your reccomened food is: cereal.
                """.trimIndent()


            } else if (userinput == "Mid-morning" || userinput == "mid-morning") {
                resultText.text ="""
                    Your reccomended food is: Avo on toast.
                """.trimIndent()

            }else if (userinput == "Afternoon" || userinput == "afternoon") {
                resultText.text ="""
                    Your reccomended food is: Pasta salad 
                """.trimIndent()

            }else if (userinput == "Mid-afternoon" || userinput == "mid-afternoon") {
                resultText.text ="""
                    Your reccomended food is: Protien Shake
                """.trimIndent()

            }else if (userinput == "Night" || userinput =="night") {
                resultText.text ="""
                    Your reccomended food is:Beef burger with sweet potatoe fries
                """.trimIndent()

                // error handling
            }else resultText.text ="""
                Not a valid option. please choose again for given options 
            """.trimIndent()

            // Gives the reset button a function
            resetButton.setOnClickListener {
                resultText.text ="""
            Select the time of day from the options 
            given below, this will then provide you 
            with an appropriate meal for your selected time.
            - Morning
            - Mid-morning
            - Afternoon
            - Mid-afternoon
            - night
            """.trimIndent()
                mealTime.setText(null)// this will clear the edit text box
            }

            //Title:OnClickListener in Android Studio
            //Author:stackOverflow
            //Date:30 March 2025
            //Version:1
            //Available:https://stackoverflow.com/questions/16927103/onclicklistener-in-android-studio

            //Title:Kotlin If...Else
            //Author:w3school.com
            //Date:30 March 2025
            //Version:1
            //Available:https://www.w3schools.com/kotlin/kotlin_conditions.php

            //Title:Exceptions
            //Author:Kotlin
            //Date:1 march 2025
            //Version:1
            //Available:https://kotlinlang.org/docs/exceptions.html#throw-exceptions-with-precondition-functions


        }
    }
}