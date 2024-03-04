package com.montenegro.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.montenegro.horoscapp.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscpeViewModel @Inject constructor() : ViewModel() {
    private var _horscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horscope

    init {
        _horscope.value = listOf(HoroscopeInfo.Aries, HoroscopeInfo.Taurus, HoroscopeInfo.Gemini)
    }

}