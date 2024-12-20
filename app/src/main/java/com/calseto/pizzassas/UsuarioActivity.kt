package com.calseto.pizzassas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit

class UsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_usuario)


        val etUsuario: EditText = findViewById(R.id.etUsuario)
        val etContraseña: EditText = findViewById(R.id.etContraseña)
        val btnEntrar: Button = findViewById(R.id.btnEntrar)
        val btnSalir: Button = findViewById(R.id.btnSalir)
        val usuarios = arrayOf("vilchis", "chava", "alex")
        val contraseñas = arrayOf("siu", "siu2", "siu3")


        btnEntrar.setOnClickListener {

            val usu = etUsuario.text.toString()
            val con = etContraseña.text.toString()

            var accesoPermitido = false



            for (i in usuarios.indices) {
                if (usu == usuarios[i] && con == contraseñas[i]) {
                    accesoPermitido = true
                    break
                }
            }

            if (accesoPermitido) {
                val item = Intent(this, ManejoFragmentsActivity::class.java)
                startActivity(item)
                finish()
            } else {
                etUsuario.text.clear()
                etContraseña.text.clear()
                Toast.makeText(this, "contraseña o usuario incorrecta", Toast.LENGTH_SHORT).show()
            }

        }

        btnSalir.setOnClickListener {
            finish()
        }


    }
}