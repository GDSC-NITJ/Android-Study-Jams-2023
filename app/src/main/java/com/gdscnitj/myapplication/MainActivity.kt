package com.gdscnitj.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gdscnitj.myapplication.MemeRec.memeAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var memeRecyclerView: RecyclerView
    lateinit var memeList:Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        memeList = arrayOf(

            R.drawable.meme2,
            R.drawable.meme4,
            R.drawable.meme5,
            R.drawable.meme6,
            R.drawable.meme9,
            R.drawable.meme10,
            R.drawable.meme12,
            R.drawable.meme13,
            R.drawable.meme15

        )

        memeRecyclerView = findViewById<RecyclerView>(R.id.memeRecyclerview)
        memeRecyclerView.layoutManager = LinearLayoutManager(this)
        memeRecyclerView.setHasFixedSize(true)

        val adapter = memeAdapter(memeList)
        memeRecyclerView.adapter = adapter


    }
}