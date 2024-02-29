package com.montenegro.horoscapp.ui.palmistry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.montenegro.horoscapp.R
import com.montenegro.horoscapp.databinding.FragmentHoroscopeBinding
import com.montenegro.horoscapp.databinding.FragmentPalmistryBinding


class PalmistryFragment : Fragment() {
    private var _binding: FragmentPalmistryBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPalmistryBinding.inflate(inflater, container, false)
        return binding.root
    }
}