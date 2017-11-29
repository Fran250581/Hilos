package com.example.fran.hilos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var entrada: EditText? = null
    private var salida: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        entrada = findViewById<View>(R.id.entrada) as EditText?
        salida = findViewById<View>(R.id.salida) as TextView?
    }

    fun calcularOperacion(view: View) {
        val n = Integer.parseInt(entrada!!.text.toString())
        salida!!.append(n.toString() + "! = ")
        val res = factorial(n)
        salida!!.append(res.toString() + "\n")
    }

    fun factorial(n: Int): Int {
        var res = 1
        for (i in 1..n) {
            res *= i
            SystemClock.sleep(1000)
        }
        return res
    }
}

