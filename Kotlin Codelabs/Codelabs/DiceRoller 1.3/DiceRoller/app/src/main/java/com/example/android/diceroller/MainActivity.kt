package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener { clearDice() }
        /*val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countUp() }
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDice() }*/
    }
    private fun rollDice() {
        //Toast.makeText(this, "button clicked",
          //  Toast.LENGTH_SHORT).show()
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun clearDice() {
        //Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)  
    }

    private fun getRandomDiceImage() : Int{
        val randomInt = Random().nextInt(6) + 1
        /*val diceImage: ImageView = findViewById(R.id.dice_image)*/
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

   /* private fun resetDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = 0.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        // If text is the default "Hello World!" set that text to 1.
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }*/
}
