package nick.dev.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        val btnStart :Button = findViewById(R.id.btn_Start)
        val etName:EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener{
            if(etName.text.isEmpty()){
                Toast.makeText(this, "Please enter your name...",Toast.LENGTH_LONG).show()
            }
            else{
                // moving to another activity
                val intent :Intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}