package aio.app.toastlibrary

import android.content.Context
import android.widget.Toast

class MyLibraryUtils{
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, ""+message, Toast.LENGTH_SHORT).show()
    }
}