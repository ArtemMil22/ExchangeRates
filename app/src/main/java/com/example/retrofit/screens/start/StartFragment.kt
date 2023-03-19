package com.example.retrofit.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.R
import kotlinx.android.synthetic.main.fragment_start.view.*

class StartFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewModel = ViewModelProvider(this)
            .get(StartViewModel::class.java)
        val v = inflater
            .inflate(R.layout.fragment_start, container, false)
        recyclerView = v.rv_start // обращаем к своему вью
        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewModel.getNalMoney() // получение данных
        viewModel.myMoneyList.observe(viewLifecycleOwner) {
                list ->
            list.body()?.let { adapter.setList(it) }
        }
        return v
    }
}

// если запустить будет ошибка мы не сделали okHttp Dispatcher
// еще ошибка Permission мы не дали разрешение для работы с инетом в манифесте
/*Но еще не видим данные, снова ошибка EPERM
not permitted, она возникает чаще всего когда
мы получаем данные, первым делом, почему то
нужно удалить приложение из телефона и переустановить */