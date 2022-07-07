package nick.dev.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
        val tvName:TextView = findViewById(R.id.tv_name)
        val tvScore:TextView = findViewById(R.id.tv_score)
        val btnFinish:Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        val total = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correct = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        tvScore.text = "Your score is $correct out of $total"

        btnFinish.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java )
            )
        }

    }
}