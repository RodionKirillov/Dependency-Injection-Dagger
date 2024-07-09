package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    private val id: String
): ViewModel() {

    fun method() {
        useCase.invoke()
        Log.e(LOG_TAG, this.toString() + id)
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
