package com.example.abbyrproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        claseHerencia ()
        // claseInterface ()
        //modificadores de acceso ()

    }
    private fun claseHerencia(){

        val veh = VhToyota(Dueño:"Edward", Kilometraje 2400)
    }

}