package com.calseto.pizzassas.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel : ViewModel() {
    val listaOrdenes = MutableLiveData<MutableList<String>>(mutableListOf())
    val listadoOrdenes: LiveData<MutableList<String>> get() = listaOrdenes
    fun agregarOrden(orden: String) {
        listaOrdenes.value = listaOrdenes.value?.apply { add(orden) }
    }
}
