package com.calseto.pizzassas.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.calseto.pizzassas.R


class CustomerFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_customer, container, false)

        val btnGoMenu = root.findViewById<Button>(R.id.btnGoMenu)
        val btnGoOrden = root.findViewById<Button>(R.id.btnGoOrden)
        val btnExit = root.findViewById<Button>(R.id.btnExit)


        btnGoMenu.setOnClickListener{
            findNavController().navigate(R.id.action_customerFragment_to_pizzasMenuFragment)
        }

        btnGoOrden.setOnClickListener{
            findNavController().navigate(R.id.action_customerFragment_to_ingresarOrderFragment)
        }

        btnExit.setOnClickListener {
            findNavController().navigate(R.id.action_customerFragment_to_principalMenuFragment)
        }


        return root
    }


}