package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var KalyaniRecyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recler_item_count_layout)
        KalyaniRecyclerView=findViewById(R.id.recycler_id)

        KalyaniRecyclerView.layoutManager=LinearLayoutManager(this)

        var alphbetData= ArrayList<kalyaniDataClass>()

        alphbetData.add(kalyaniDataClass(R.drawable.apl,"A","for apple"))
        alphbetData.add(kalyaniDataClass(R.drawable.baana,"B","for banana"))
        alphbetData.add(kalyaniDataClass(R.drawable.cat,"C","for cat"))
        alphbetData.add(kalyaniDataClass(R.drawable.dog,"D","dog"))
        alphbetData.add(kalyaniDataClass(R.drawable.ele,"E","for Elephant"))
        alphbetData.add(kalyaniDataClass(R.drawable.fis,"F","for fish "))
        alphbetData.add(kalyaniDataClass(R.drawable.gr,"G","for graps"))
        alphbetData.add(kalyaniDataClass(R.drawable.img_6,"H","for hen"))
        alphbetData.add(kalyaniDataClass(R.drawable.ice,"I","for ice cream"))
        alphbetData.add(kalyaniDataClass(R.drawable.jajika,"J","for jaji"))
        alphbetData.add(kalyaniDataClass(R.drawable.candyk,"K","for kriyansh"))
        alphbetData.add(kalyaniDataClass(R.drawable.loky,"L","for lokesh"))
        alphbetData.add(kalyaniDataClass(R.drawable.mangoes,"M","for mango"))
        alphbetData.add(kalyaniDataClass(R.drawable.next,"N","for nest"))
        alphbetData.add(kalyaniDataClass(R.drawable.orange,"O","for orange"))
        alphbetData.add(kalyaniDataClass(R.drawable.pen,"P","for pen"))
        alphbetData.add(kalyaniDataClass(R.drawable.que,"Q","for queen"))
        alphbetData.add(kalyaniDataClass(R.drawable.rat,"R","for rat"))
        alphbetData.add(kalyaniDataClass(R.drawable.shi,"S","for ship"))
        alphbetData.add(kalyaniDataClass(R.drawable.tiger,"T","for tiger"))
        alphbetData.add(kalyaniDataClass(R.drawable.umbr,"U","for umbrella"))
        alphbetData.add(kalyaniDataClass(R.drawable.van,"V","for van"))
        alphbetData.add(kalyaniDataClass(R.drawable.watch,"W","for watch"))
        alphbetData.add(kalyaniDataClass(R.drawable.xray,"X","x for X-Ray"))
        alphbetData.add(kalyaniDataClass(R.drawable.yeello,"Y","yellow color"))
        alphbetData.add(kalyaniDataClass(R.drawable.zoo,"Z","for zoo"))


        var kalyaniadapter=AdapterClassKalyani(alphbetData)
            KalyaniRecyclerView.adapter=kalyaniadapter
    }
}
