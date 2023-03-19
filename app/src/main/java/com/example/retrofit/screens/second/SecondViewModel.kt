package com.example.retrofit.screens.second

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.data.api.Repository
import com.example.retrofit.model.Weather.MainModel
import kotlinx.coroutines.launch

class SecondViewModel : ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<MainModel> = MutableLiveData()

    fun getBeznalMoney() {
        viewModelScope.launch {
            val vv = repo.getBezNal()
            Log.d("MyLogi", vv.toString())
            try {
                myMoneyList.value = repo.getBezNal()
            } catch (e: Throwable) {
                Log.e("MyLog", "Очень плохо", e)
            }
        }
    }
}