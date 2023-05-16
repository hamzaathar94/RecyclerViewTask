package com.example.recyclerviewtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewtask.databinding.ActivityReceivinBinding

class ReceivinActivity : AppCompatActivity() {
    private var binding: ActivityReceivinBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityReceivinBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.textView2?.text=intent.getStringExtra("name")
    }
}