package com.example.laboratory1.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.laboratory1.MainActivity
import com.example.laboratory1.databinding.ActivityLoginBinding
import com.example.laboratory1.login.presenter.ILoginPresenter
import com.example.laboratory1.login.presenter.LoginPresenter
import com.example.laboratory1.login.view.ILoginView

class LoginActivity : AppCompatActivity(), ILoginView {


    private lateinit var binding: ActivityLoginBinding
    private lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.inputButton.setOnClickListener {
            loginPresenter.onLogin(binding.inputEmail.text.toString(),
                binding.inputPassword.text.toString())
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        loginPresenter = LoginPresenter(this)
    }

    override fun onLoginSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()

    }

    override fun onLoginFail(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}