package com.example.android.gameui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.game_ui.*
import androidx.databinding.adapters.TextViewBindingAdapter.setText



class MainActivity : AppCompatActivity() {
    var timeInMilliseconds : Long = 60000
    val timeRunning = true
    internal lateinit var countDownTimer :CountDownTimer


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
