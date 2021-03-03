package com.deeps.hbdwish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {


        val name = edt_name.editableText.toString()
        val intent = Intent(this,BirthdayWishScreen::class.java)
        intent.putExtra(BirthdayWishScreen.NAME_EXTRA, name)
        startActivity(intent)
    }
}