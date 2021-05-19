package com.example.laboratory1

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.laboratory1.databinding.ActivityThirdBinding
import com.example.laboratory1.utils.AppConstants.bottomNavigation


class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.goToListBtn.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            intent.putExtra("myName", binding.userName.text.toString())
            intent.putExtra("myPost", binding.yourTxtArea.text.toString())
            startActivity(intent)
        }
    }
}