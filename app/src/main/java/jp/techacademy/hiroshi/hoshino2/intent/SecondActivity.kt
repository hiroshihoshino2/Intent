package jp.techacademy.hiroshi.hoshino2.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)

    val value1 = intent.getIntExtra("VALUE1", 0)
    val value2 = intent.getIntExtra("VALUE2", 0)

    textView.text = "${value1 + value2}"
}
