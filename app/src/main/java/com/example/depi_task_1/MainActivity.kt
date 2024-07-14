package com.example.depi_task_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnLinkedin: Button
    lateinit var btnFacebook: Button
    lateinit var btnGithub: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnLinkedin = findViewById(R.id.btn_linkedin)
        btnFacebook = findViewById(R.id.btn_face)
        btnGithub = findViewById(R.id.btn_github)

       btnLinkedin.setOnClickListener {
           val intent = Intent(Intent.ACTION_VIEW)
           intent.data= Uri.parse("https://www.facebook.com/lala.kemo.94")
           startActivity(intent)
       }
        btnFacebook.setOnClickListener{
val intentLinkedin = Intent(Intent.ACTION_VIEW)
intentLinkedin.data= Uri.parse("https://www.linkedin.com/in/mahmoud-kariem-097a34278/")
            startActivity(intentLinkedin)
        }
        btnGithub.setOnClickListener {
            val intentGithub = Intent(Intent.ACTION_VIEW)
            intentGithub.data= Uri.parse("https://github.com/mahmoudkarieem")
            startActivity(intentGithub)
        }
    }
}