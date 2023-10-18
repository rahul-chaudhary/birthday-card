package com.example.dream

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name";
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        val name = intent.getStringExtra(NAME_EXTRA);
        val greet = findViewById<TextView>(R.id.greetings);
        greet.text = "Happy birthday \n$name\uD83C\uDF82 !";
        // findViewById<EditText>(R.id.name_field).text.toString();
    }
}