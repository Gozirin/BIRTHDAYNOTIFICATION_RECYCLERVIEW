package com.example.week4taskprecoius

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Carditems: RecyclerView.Adapter<Carditems.ViewHolder>(){

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var celebrantImage: ImageView
        var celebrantName: TextView
        var celebrantBday: TextView
        var daysRemaining: TextView
        var strawColor : ImageView

        init{
            celebrantImage = itemView.findViewById(R.id.event_img)
            celebrantName = itemView.findViewById(R.id.event_title)
            celebrantBday = itemView.findViewById(R.id.event_date)
            daysRemaining = itemView.findViewById(R.id.event_days_left)
            strawColor = itemView.findViewById(R.id.event_straw)
        }

    }

    private var names = arrayOf("Ola Marchiavelli", "Samuel Garfield", "Kome Holmes", "Omolade Rogers")
    private var bdays = arrayOf("20.10.2022", "20.10.2022", "20.10.2022", "20.10.2022")
    private var hmdays = arrayOf("30 days left", "30 days left", "30 days left", "30 days left")
    private  var images = arrayOf(R.drawable.ola, R.drawable.samuel, R.drawable.kome, R.drawable.omolade,)
    private var straws = arrayOf(R.drawable.flowers, R.drawable.flowers, R.drawable.flowers, R.drawable.flowers,)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Carditems.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cele_carditems, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.celebrantImage.setImageResource(images[position])
        holder.celebrantName.text = names[position]
        holder.celebrantBday.text = bdays[position]
        holder.daysRemaining.text = hmdays[position]
        holder.strawColor.setImageResource(straws[position])
    }

    override fun getItemCount(): Int {
        return names.size
    }



//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        holder.celebrantImage.setImageResource(images[position])
//        holder.celebrantName.text = names[position]
//        holder.celebrantBday.text = bdays[position]
//        holder.daysRemaining.text = hmdays[position]
//        holder.strawColor.setImageResource(straws[position])
//    }
}
