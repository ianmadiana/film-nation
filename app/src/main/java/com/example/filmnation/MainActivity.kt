package com.example.filmnation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnation.adapter.ItemAdapter
import com.example.filmnation.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi data
        val myDataset = Datasource().loadFilmNation()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        //meningkatkan performa aplikasi jika mengetahui bahwa perubahan dalam isi tidak mengubah ukuran tata letak RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}