package com.example.android.gameui

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.game_ui.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_ui)


        //Setting countdown timer in seconds
        object : CountDownTimer(31000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                tv_timer.setText((millisUntilFinished / 1000).toString())
            }

            override fun onFinish() {
                tv_timer.setText("0")
            }
        }.start()
    }

}
