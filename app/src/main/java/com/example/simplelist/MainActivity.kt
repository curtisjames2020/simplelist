package com.example.simplelist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Contacts
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var mContact:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContact = findViewById(R.id.mListContact)
        mContact.setOnItemClickListener { adapterView, view, i, l ->
            var name =adapterView.getItemAtPosition(i).toString()
            Toast.makeText(this,name, Toast.LENGTH_SHORT).show()
        }
    }
}