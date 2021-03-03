package com.deeps.hbdwish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_wish_screen.*

class BirthdayWishScreen : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wish_screen)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdaywish.text = "Happy Birthday\n$name!"
    }
}