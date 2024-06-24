package com.example.effmobapp0624.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.effmobapp0624.R
import com.example.effmobapp0624.data.api.RetrofitInstance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        CoroutineScope(Dispatchers.IO).launch {
//
//            val responseList = RetrofitInstance.apiService.getInfoFirstScreen()
//            withContext(Dispatchers.Main) {
//                Log.d("Retrofit", responseList.toString())
//            }
//        }
    }
}