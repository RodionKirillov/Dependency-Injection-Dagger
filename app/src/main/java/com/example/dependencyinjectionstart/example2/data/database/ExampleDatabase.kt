package com.example.dependencyinjectionstart.example2.data.database

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example2.di.ApplicationScope
import javax.inject.Inject

//@ApplicationScope
class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        Log.e(
            LOG_TAG,
            "ExampleDatabase ${context.getString(R.string.app_name) + " " + timeMillis.toString() + this}"
        )
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
