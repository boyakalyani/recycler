package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClassKalyani(private var AlhabetList:List<kalyaniDataClass>) : RecyclerView.Adapter<AdapterClassKalyani.viewItemStorage>(){
    override fun onCreateViewHolder(MainParentKalyni: ViewGroup, viewType: Int):viewItemStorage {//parent is parameter and viewgroup is object

        val visual_items_chat = LayoutInflater.from(MainParentKalyni.context)
            .inflate(R.layout.recycler_design_layout, MainParentKalyni, false)
        return viewItemStorage(visual_items_chat)
    }

    override fun onBindViewHolder(holderKalyani: viewItemStorage, position: Int) {
        val kalyaniDataClass=AlhabetList[position]
        holderKalyani.image.setImageResource(kalyaniDataClass.Img)

        holderKalyani.textview1.text=kalyaniDataClass.charText

        holderKalyani.textview2.text=kalyaniDataClass.WordText

    }

    override fun getItemCount(): Int {
        return AlhabetList.size
    }
    class  viewItemStorage(chatList: View) : RecyclerView.ViewHolder(chatList) {
        var image: ImageView = itemView.findViewById(R.id.img_id)
        var textview1:TextView = itemView.findViewById(R.id.txt1_id)
        var textview2:TextView = itemView.findViewById(R.id.txt2_id)
    }
}
