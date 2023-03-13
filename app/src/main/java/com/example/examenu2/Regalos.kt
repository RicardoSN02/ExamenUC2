package com.example.examenu2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class Regalos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        var adapter:RegalosAdapter? = null
        var regalos = ArrayList<Regalos>()
        val gridview: GridView = findViewById(R.id.gridview)

        fun cargarRegalos(){

        }

        cargarRegalos()

        adapter= RegalosAdapter(regalos,this)
        gridview.adapter = adapter



    }

    class RegalosAdapter: BaseAdapter {

        var regalos = ArrayList<Regalos>()
        var context: Context? = null

        constructor(Regalos: ArrayList<Regalos>,context: Context?) : super() {
            this.regalos = peliculas
            this.context = context
        }


        override fun getCount(): Int {
            return regalos.size
        }

        override fun getItem(position: Int): Any {
            return regalos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var regalo= regalos[position]
            var inflator =
                context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflator.inflate(R.layout.regalos,null)





            return vista
        }

    }

    }
}