package kr.ac.kopo.listviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var imgv : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = findViewById<ListView>(R.id.list)
        imgv = findViewById<ImageView>(R.id.imgv)

        var items = arrayOf("최예나", "안유진", "윈터", "카리나", "가을", "이서", "레이")
        var imgRes = arrayOf(R.drawable.yn, R.drawable.an, R.drawable.win06, R.drawable.karina, R.drawable.ga05, R.drawable.lee03, R.drawable.ray04)

        var adaper = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        list.adapter = adaper

        list.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext, items[position] + "는(은) 정말 이뻐요", Toast.LENGTH_SHORT).show()
        }


    }
}