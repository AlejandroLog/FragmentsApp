package com.calseto.pizzassas.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.calseto.pizzassas.R
import com.calseto.pizzassas.viewmodel.OrderViewModel

class OrderCustomerFragment : Fragment() {
    private lateinit var orderViewModel: OrderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_order_customer, container, false)

        val tvPedidos = root.findViewById<TextView>(R.id.tvPedidos)
        val btnExit = root.findViewById<Button>(R.id.btnExit)

            orderViewModel = ViewModelProvider(requireActivity())
                .get(OrderViewModel::class.java)

            orderViewModel.listadoOrdenes.observe(viewLifecycleOwner, Observer { lista ->
                if (lista.isNullOrEmpty()) {
                    tvPedidos.text = "No hay ordenes disponibles"
                } else {
                    tvPedidos.text = lista.joinToString(separator = "\n")
                }
            })

        btnExit.setOnClickListener {
            findNavController().navigate(R.id.action_orderCustomerFragment_to_principalMenuFragment)
        }

        return root
    }
}
