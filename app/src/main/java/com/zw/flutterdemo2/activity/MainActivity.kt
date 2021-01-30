package com.zw.flutterdemo2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.zw.flutterdemo2.R
import com.zw.flutterdemo2.activity.test1.MyFlutterActivity1
import io.flutter.embedding.android.FlutterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_flutter_1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_flutter_1 -> {
                var intent = Intent(this@MainActivity, MyFlutterActivity1::class.java)
                startActivity(intent)
            }
        }
    }
}