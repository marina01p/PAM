package com.example.laboratory1.login.presenter

import com.example.laboratory1.login.model.LoginModel
import com.example.laboratory1.login.view.ILoginView

class LoginPresenter(internal var iLoginView: ILoginView): ILoginPresenter {

    override fun onLogin(email: String, password: String) {
        val user = LoginModel(email, password)
        val loginStatus = user.isDataValid()
        if(loginStatus == 0)
            iLoginView.onLoginFail("Complete email field")
        else if(loginStatus == 2)
            iLoginView.onLoginFail("Password must be greater than 6")
        else
            iLoginView.onLoginSuccess("Login Success")


    }

}