package com.asianaidt.edu.fragment_20220518.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.asianaidt.edu.fragment_20220518.R
import kotlinx.android.synthetic.main.fragment_first.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_log.setOnClickListener {

            Toast.makeText(requireContext(), "프래그먼트에서 토스트", Toast.LENGTH_SHORT).show()

            Log.d("프래그먼트", "프래그먼트2에서의 로그")

        }
    }

}