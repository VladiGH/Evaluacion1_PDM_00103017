package com.avgh.laboevaluado

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //ACA VAN LOS TEXT VIEWS DE CADA PRODUCTO
    private lateinit var p1View: TextView
    private lateinit var p2View: TextView
    private lateinit var p3View: TextView
    private lateinit var p4View: TextView
    private lateinit var p5View: TextView
    private lateinit var p6View: TextView
    private lateinit var p7View: TextView
    private lateinit var p8View: TextView
    private lateinit var p9View: TextView



    //los contadores
    private var contP1 = 0
    private var contP2 = 0
    private var contP3 = 0
    private var contP4 = 0
    private var contP5 = 0
    private var contP6 = 0
    private var contP7 = 0
    private var contP8 = 0
    private var contP9 = 0
    private var contTotal = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindView()
        buttonSend.setOnClickListener(){
            val username = user.text?.toString()
            val contrasenia = contrasenia.text?.toString()
            contTotal = (contP1 + contP2  + contP3 + contP4 + contP5 + contP6 + contP7 + contP8 + contP9).toString()
            val mIntent:Intent = Intent(this, Main2Activity::class.java)
            mIntent.putExtra("nameKey", username)
            mIntent.putExtra("contraKey", contrasenia)
            mIntent.putExtra("totalKey", contTotal)
            mIntent.putExtra("p1k",contP1)
            mIntent.putExtra("p2k",contP2)
            mIntent.putExtra("p3k",contP3)
            mIntent.putExtra("p4k",contP4)
            mIntent.putExtra("p5k",contP5)
            mIntent.putExtra("p6k",contP6)
            mIntent.putExtra("p7k",contP7)
            mIntent.putExtra("p8k",contP8)
            mIntent.putExtra("p9k",contP9)
            startActivity(mIntent)
        }
    }

    fun bindView(){
        p1View = findViewById(R.id.p1)
        p2View = findViewById(R.id.p2)
        p3View = findViewById(R.id.p3)
        p4View = findViewById(R.id.p4)
        p5View = findViewById(R.id.p5)
        p6View = findViewById(R.id.p6)
        p7View = findViewById(R.id.p7)
        p8View = findViewById(R.id.p8)
        p9View = findViewById(R.id.p9)
        p1View.setOnClickListener(){
            p1View.text = contP1++.toString()
        }
        p2View.setOnClickListener(){
            p2View.text = contP2++.toString()
        }
        p3View.setOnClickListener(){
            p3View.text = contP3++.toString()
        }
        p4View.setOnClickListener(){
            p4View.text = contP1++.toString()
        }
        p5View.setOnClickListener(){
            p5View.text = contP5++.toString()
        }
        p6View.setOnClickListener(){
            p6View.text = contP6++.toString()
        }
        p7View.setOnClickListener(){
            p7View.text = contP7++.toString()
        }
        p8View.setOnClickListener(){
            p8View.text = contP8++.toString()
        }
        p9View.setOnClickListener(){
            p9View.text = contP9    ++.toString()
        }
    }

}
