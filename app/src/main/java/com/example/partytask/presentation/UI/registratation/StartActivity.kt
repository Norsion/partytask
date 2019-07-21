package com.example.partytask.presentation.UI.registratation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.partytask.R

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


        supportFragmentManager.beginTransaction()
            .replace(R.id.container, StartFragment())
            .addToBackStack(null)
            .commit()
    }



}
