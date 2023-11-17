package com.example.ucp2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FormViewModel : ViewModel(){
    private val _stateUI = MutableStateFlow(FormViewModel())
    val stateUI: StateFlow<FormViewModel> = _stateUI.asStateFlow()

    fun setForm(listData: MutableList<String>){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = listData[0],
                nim = listData[1],
                konsentrasi = listData[2],
                judul = listData[3]
            )
        }
    }
}