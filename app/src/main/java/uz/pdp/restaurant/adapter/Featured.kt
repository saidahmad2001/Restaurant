package uz.pdp.restaurant.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.pdp.restaurant.R

class Featured(private val features: ArrayList<Features>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolderFeatured(
            LayoutInflater.from(parent.context).inflate(R.layout.featured_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feature = features[position]
        if (holder is ViewHolderFeatured) {
            holder.apply {
                image.setImageResource(feature.image)
                textView.text = feature.description
                textView1.text = feature.locate
                textView2.text = feature.locate1
                textView3.text = feature.narh
            }
        }
    }

    override fun getItemCount(): Int = features.size

}

class ViewHolderFeatured(view: View) : RecyclerView.ViewHolder(view) {
    var image: ImageView = view.findViewById(R.id.featuredImage)
    var textView: TextView = view.findViewById(R.id.tv_textFeatured)
    var textView1: TextView = view.findViewById(R.id.locate)
    var textView2: TextView = view.findViewById(R.id.locate1)
    var textView3: TextView = view.findViewById(R.id.narh)
}