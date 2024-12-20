package com.calseto.pizzassas.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.navigation.fragment.findNavController
import com.calseto.pizzassas.R
import com.calseto.pizzassas.viewmodel.OrderViewModel


class IngresarOrderFragment : Fragment() {
    private lateinit var orderViewModel: OrderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_ingresar_order, container, false)
        orderViewModel = ViewModelProvider(requireActivity()).get(OrderViewModel::class.java)

        val spinnerType = root.findViewById<Spinner>(R.id.spinnerType)
        val spinnerSize = root.findViewById<Spinner>(R.id.spinnerSize)
        val spinnerNumPizzas = root.findViewById<Spinner>(R.id.spinnerNumPizzas)
        val btnSave = root.findViewById<Button>(R.id.btnSave)
        val btnExit = root.findViewById<Button>(R.id.btnExit)


        btnSave.setOnClickListener {
            val typePizza = spinnerType.selectedItem.toString()
            val sizePizza = spinnerSize.selectedItem.toString()
            val NumPizza = spinnerNumPizzas.selectedItem.toString()
            val orden = "Type: $typePizza, Size: $sizePizza, Num Pizzas: $NumPizza"

            orderViewModel.agregarOrden(orden)

            Toast.makeText(requireContext(), "Pedido guardado", Toast.LENGTH_SHORT).show()

        }

        btnExit.setOnClickListener {
            findNavController().navigate(R.id.action_ingresarOrderFragment_to_principalMenuFragment)
        }




        return root
    }


}