package za.ac.iie.st10452222.lu2app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                val compareButton = findViewById<Button>(R.id.compareButton)

                val clearButton = findViewById<Button>(R.id.clearButton)

                val ageEditText = findViewById<EditText>(R.id.ageEditText)

                val resultTextView = findViewById<TextView>(R.id.resultTextView)



// add code to the button when it is clicked

                compareButton.setOnClickListener {

//assign the text in the ageEditText to variable userInput

                    val userInput = ageEditText.text.toString()

// Log the user input

                    Log.v("MainActivity", "User input: $userInput")

//check if the user typed in an age

                    if (userInput.isEmpty()) {

                        resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."}

//check if the age is a valid integer

//In Kotlin, toIntOrNull() is a function that belongs to the String class. It attempts to parse the string //representation of an integer and converts it into an Int value. If the string can be successfully //parsed as an integer, the function returns the corresponding Int value. If the string cannot be //parsed as an integer (for example, if it contains non-numeric characters or exceeds the range of //representable integers), the function returns null.



//Store age in a variable

                    val userAge = userInput.toIntOrNull()



//check if the age is not a valid integer

                    if (userAge == null) {

                        resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."

                    } else {

//check if the age is in the correct range

                        if (userAge < 20 || userAge > 100) {

                            resultTextView.text = "Please enter an age between 20 and 100."

                            ageEditText.text.clear()

                        } else {

//use when to check for age

                            val result = when (userAge) {

                                41 -> "Kobe Bryant, Was an American professional basketball player. A shooting guard, he spent his entire 20-year career with the Los Angeles Lakers in the National Basketball Association, died at 41."

                                74 -> "Muhammad Ali, Was an American professional boxer and activist. Nicknamed the Greatest, he is regarded as one of the most significant sports figures of the 20th century and is often regarded as the greatest heavyweight boxer of all time, died at 74."

                                39 -> "Martin Luther King Jr.,Was an American Christian minister, activist, and political philosopher who was one of the most prominent leaders in the civil rights movement from 1955 until his assassination in 1968, died at 39."

                                95 -> "Nelson Rolihlahla Mandela,Was a South African anti-apartheid activist and politician who served as the first president of South Africa from 1994 to 1999. He was the country's first black head of state and the first elected in a fully representative democratic election , died at 95."

                                96 -> "Elizabeth II,Was Queen of the United Kingdom and other Commonwealth realms from 6 February 1952 until her death in 2022. She was queen regnant of 32 sovereign states over the course of her lifetime and remained the monarch of 15 realms by the time of her death , died at 96."

                                56 -> "Adolf Hitler, Adolf Hitler was an Austrian-born German politician who was the dictator of Germany from 1933 until his suicide in 1945. He rose to power as the leader of the Nazi Party, becoming the chancellor in 1933 and then taking the title of Führer und Reichskanzler in 1934, died at 56."

                                25 -> "Tupac Amaru Shakur,2Pac and Makaveli, was an American rapper. He is widely considered one of the most influential and successful rappers of all time. , died at 25."

                                41 -> "King Shaka Zulu / Shaka kaSenzangakhona / Sgidi kaSenzangakhona,Was the king of the Zulu Kingdom from 1816 to 1828. One of the most influential monarchs of the Zulus, he ordered wide-reaching reforms that reorganised the military into a formidable force , died at 41."

                                73 -> ", Goodwill Zwelithini kaBhekuzulu was the King of the Zulu nation from 1968 to his death in 2021. He became King on the death of his father, King Cyprian Bhekuzulu, in 1968 aged 20 years, died at 73."

                                50 -> "Mansa Musa,Was the ninth Mansa of the Mali Empire, which reached its territorial peak during his reign. Musa's reign is often regarded as the zenith of Mali's power and prestige, died at 50."

                                else -> "Nobody known to me died at this age"

                            }

//show output to user

                            resultTextView.text = result

                        }

                    }

                }

//clear out the resultTextView and the ageEditText on the Clear button click

                clearButton.setOnClickListener {

                    ageEditText.text.clear()

                    resultTextView.text = ""

                }

            }

        }