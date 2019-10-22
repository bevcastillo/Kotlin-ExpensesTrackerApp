package com.example.expensestrackerapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn



class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //
        var txtLastname = findViewById(R.id.txtLastname) as TextView
        var txtFirstname = findViewById(R.id.txtFirstname) as TextView
        var txtDisplayName = findViewById(R.id.txtDisplayName) as TextView
        var txtEmail = findViewById(R.id.txtEmail) as TextView
        var txtID = findViewById(R.id.txtID) as TextView
        var txtPhotoURL = findViewById(R.id.txtPhotoURL) as TextView

        val acct = GoogleSignIn.getLastSignedInAccount(this)
        if (acct != null) {
            txtID.text = acct.id
            txtDisplayName.text = acct.displayName
            txtLastname.text = acct.familyName
            txtFirstname.text = acct.givenName
            txtEmail.text = acct.email

        }
    }
}
