package ca.georgiancollege.ice1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by ID
        val greetingTextView = findViewById<TextView>(R.id.textViewGreeting)
        val greetButton = findViewById<Button>(R.id.buttonGreet)

        // Set onClickListener for the button
        greetButton.setOnClickListener {
            greetingTextView.text = "Hello"
        }
    }
}


