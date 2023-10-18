package com.example.dream
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        fun createBdayCard(view: View) {
            val name: String = findViewById<EditText>(R.id.name_field).text.toString();
            Toast.makeText(this, "Happy birthday $name", Toast.LENGTH_LONG).show();
            val intent = Intent(this,BirthdayGreetingActivity::class.java);
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name);
            this.startActivity(intent);
        }
}