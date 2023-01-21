package iest.edu.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var tvGreeting: TextView? = null ///Lateinit solo var global de Visitas
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //var tvGreeting: TextView
        setContentView(R.layout.activity_main)
        //tvGreeting = findViewById(R.id.tvSaludo)
        cambiarMensaje()
        cambiarMensaje(1)
        //tvGreeting.text = getString(R.string.Despedida)
    }


    private fun cambiarMensaje(){
        val mensaje_original:String
        mensaje_original = tvGreeting?.text.toString()
        Toast.makeText(this,"Tu mensaje original era " + mensaje_original + " :) " ,Toast.LENGTH_LONG).show()
    }

    private fun cambiarMensaje(tipo: Int){
        if(tipo == 1){
            tvGreeting!!.text = getString(R.string.Despedida)
        }else{
            Toast.makeText(this , "El tipo es $tipo" , Toast.LENGTH_SHORT).show()
        }

    }


}

