package mx.edu.tecmm.moviles.a05spiner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    lateinit var textTitulo: TextView
    lateinit var textView2: TextView
    lateinit var textDescripcion: TextView
    lateinit var spLenguajes: Spinner
    val lenguajes = arrayOf("Vamos! Selecciona Algo","Java","PHP","C#","Ruby","SWIFT")

    val selecciona= arrayOf("Antonio López Prado","Este Es Java, Podemos Programar Y Crear Cosas Divertidas Sigue!",
        "Seleccionaste PHP Podemos Programar Paginas Web Vamos!","Seleccionaste c#, Programemos Y Creemos Aplicaciones! Sigue!",
            "Seleccionaste RUBY Podemos Hacer paginas web Y Mas Cosas Sigue!","Este Es SWIFT El Ultimo Programemos en iOS Y MacOS!")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textTitulo = findViewById(R.id.lenguajes)
        textDescripcion = findViewById(R.id.textDescripcion)
        spLenguajes = findViewById(R.id.spLenguajes)
        //textDescripcion.text="Antonio López"
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,lenguajes)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spLenguajes.adapter = adaptador
        spLenguajes.onItemSelectedListener= this
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
    Log.e("SPINNER","Se selecciono: $position")
        val lenguajes: String = lenguajes[position]
        textTitulo.text = lenguajes
        val selecciona: String = selecciona[position]
        textDescripcion.text = selecciona

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
       // val selecciona: String = selecciona
        //textDescripcion.text="Antonio López"

    }
}