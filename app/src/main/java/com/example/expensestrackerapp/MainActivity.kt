package com.example.expensestrackerapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

const val RC_SIGN_IN = 123

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()

        val mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        //get reference to all the views
        var btnGoogleSignin = findViewById(R.id.btnSigninGoogle) as Button
        var btnFacebookLogin = findViewById(R.id.btnLoginFacebook) as Button

        btnGoogleSignin.setOnClickListener {
            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }
//        val acct = GoogleSignIn.getLastSignedInAccount(this)
//        if (acct != null) {
//            btnSigninGoogle.visibility = View.GONE
//        }

//        btnGoogleSignin.setOnClickListener {
//            val signInIntent = mGoogleSignInClient.signInIntent
//            startActivityForResult(signInIntent, RC_SIGN_IN)
//        }
//
//        btnFacebookLogin.setOnClickListener {
//
//        }




    }


}
