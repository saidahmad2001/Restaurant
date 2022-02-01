package uz.pdp.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.pdp.restaurant.adapter.Featured
import uz.pdp.restaurant.adapter.Features

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var featured:Featured
    private lateinit var features:ArrayList<Features>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)
        features = addFeature()
        refreshAdapter()



    }
    private fun refreshAdapter() {
    featured = Featured(features)
    recyclerView.adapter = featured
}

    private fun addFeature(): ArrayList<Features> {
        return  ArrayList<Features>().apply {
            this.add(Features(R.drawable.first,"Besh Qozon","Toshkent","Shayhontoxur","$14"))
            this.add(Features(R.drawable.second,"Sarbon","Qashqadaryo","Shahrisabz","$25"))
            this.add(Features(R.drawable.third,"Garden","Turkiya","Istanbul","$45"))
            this.add(Features(R.drawable.four,"Halal","Amerika","New York","$125"))
            this.add(Features(R.drawable.five,"Besh Barmaq","Chimkent","Istanbul","$35"))
            this.add(Features(R.drawable.first,"Besh Qozon","Toshkent","Shayhontoxur","$14"))
            this.add(Features(R.drawable.second,"Sarbon","Qashqadaryo","Shahrisabz","$25"))
            this.add(Features(R.drawable.third,"Garden","Turkiya","Istanbul","$45"))
            this.add(Features(R.drawable.four,"Halal","Amerika","New York","$125"))
            this.add(Features(R.drawable.five,"Besh Barmaq","Chimkent","Istanbul","$35"))
        }
    }

}
