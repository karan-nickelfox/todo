package com.android.todo.utils

import android.util.Patterns

val String.isNotValidEmail: Boolean
    get() = Patterns.EMAIL_ADDRESS.matcher(this).matches()