package com.avgh.laboevaluado

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import java.lang.Exception

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val getIntentMain: Intent = intent
        val username = getIntentMain.getStringExtra("nameKey")
        val contr = getIntentMain.getStringExtra("contraKey")
        val total = getIntentMain.getStringExtra("totalKey")
        val p1total = getIntentMain.getStringExtra("p1k")
        val p2total = getIntentMain.getStringExtra("p2k")
        val p3total = getIntentMain.getStringExtra("p3k")
        val p4total = getIntentMain.getStringExtra("p4k")
        val p5total = getIntentMain.getStringExtra("p5k")
        val p6total = getIntentMain.getStringExtra("p6k")
        val p7total = getIntentMain.getStringExtra("p7k")
        val p8total = getIntentMain.getStringExtra("p8k")
        val p9total = getIntentMain.getStringExtra("p9k")



        usuario2.text ="Usuario: "+ username
        contra2.text = "Correo: "+ contr
        totalShow.text ="Total de productos: "+ total

        p1t.text = p1total
        p2t.text = p2total
        p3t.text = p3total
        p4t.text = p4total
        p5t.text = p5total
        p6t.text = p6total
        p7t.text = p7total
        p8t.text = p8total
        p9t.text = p9total

        ShareButton.setOnClickListener(){
            var concat = "Usuario: "+username+"\n\n"+ "Correo: "+ contr+"\n\n"+ "Total de productos: "+ total+
                    "\n\n"+"Producto 1: "+ p1total + "\n\n"+"Producto 2: "+ p2total +"\n\n"+"Producto 3: "+ p3total + "\n\n"+"Producto 4: "+ p4total +
                    "\n\n"+"Producto 5: "+ p5total +"\n\n"+"Producto 6: "+ p6total + "\n\n"+"Producto 7: "+ p7total +
                    "\n\n"+"Producto 8: "+ p8t + "\n\n"+"Producto 9: "+ p9total
            val intent2: Intent = Intent()
            intent2.type = "text/plain"
            intent2.action=Intent.ACTION_SEND

            intent2.putExtra(Intent.EXTRA_TEXT,concat)
            startActivity(intent2)
        }

    }
}
