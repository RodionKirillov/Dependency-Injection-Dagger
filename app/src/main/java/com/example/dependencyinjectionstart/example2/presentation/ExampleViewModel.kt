package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.di.IdQualifier
import com.example.dependencyinjectionstart.example2.di.NameQualifier
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
) : ViewModel() {

    fun method() {
        useCase.invoke()
        Log.e(LOG_TAG, this.toString() + id + name)
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}