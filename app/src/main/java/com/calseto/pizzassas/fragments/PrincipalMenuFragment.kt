package com.calseto.pizzassas.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.calseto.pizzassas.R

class PrincipalMenuFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_principal_menu, container, false)

        val btnCustomer = root.findViewById<Button>(R.id.btnCustomer)
        val btnEmployed = root.findViewById<Button>(R.id.btnEmployed)
        val btnExit = root.findViewById<Button>(R.id.btnExit)

        btnEmployed.setOnClickListener{
            findNavController().navigate(R.id.action_principalMenuFragment_to_orderCustomerFragment)
        }


        btnCustomer.setOnClickListener{
            findNavController().navigate(R.id.action_principalMenuFragment_to_customerFragment)
        }


        btnExit.setOnClickListener {
            activity?.finish()
        }

        return root
    }


}