package com.calseto.pizzassas.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.calseto.pizzassas.R


class PizzasMenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_pizzas_menu, container, false)

         val btnExit = root.findViewById<Button>(R.id.btnExit)

        btnExit.setOnClickListener {
            findNavController().navigate(R.id.action_pizzasMenuFragment_to_principalMenuFragment)
        }

        return root
    }


}

