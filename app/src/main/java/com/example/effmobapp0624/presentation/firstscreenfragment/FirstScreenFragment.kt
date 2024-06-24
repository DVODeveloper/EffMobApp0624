package com.example.effmobapp0624.presentation.firstscreenfragment

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.effmobapp0624.data.api.RetrofitInstance
import com.example.effmobapp0624.databinding.FragmentFirstScreenBinding
import com.example.effmobapp0624.presentation.rvadapter.ItemListAdapterForFirstScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FirstScreenFragment : Fragment() {

    private lateinit var listAdapter: ItemListAdapterForFirstScreen

    private var _binding: FragmentFirstScreenBinding? = null
    private val binding: FragmentFirstScreenBinding
        get() = _binding ?: throw RuntimeException("FragmentFirstScreenBinding == null")


    private val viewModel: FirstScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstScreenBinding.inflate(inflater, container, false)

        setupAdapter()

        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    private fun setupAdapter() {
        listAdapter = ItemListAdapterForFirstScreen()
        _binding?.rvItemsForFirstScreen?.adapter = listAdapter

        CoroutineScope(Dispatchers.IO).launch {
            val responseList = RetrofitInstance.apiService.getInfoFirstScreen()

            withContext(Dispatchers.Main) {

                _binding?.apply {
                    listAdapter.submitList(responseList.offers)
                }
            }
        }
    }


    companion object {
        fun newInstance() = FirstScreenFragment()
    }
}