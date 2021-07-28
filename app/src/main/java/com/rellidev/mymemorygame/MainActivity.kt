package com.rellidev.mymemorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rellidev.mymemorygame.models.BoardSize
import com.rellidev.mymemorygame.models.MemoryCard
import com.rellidev.mymemorygame.models.MemoryGame
import com.rellidev.mymemorygame.utils.DEFAULT_ICONS

class MainActivity : AppCompatActivity() {

    private lateinit var rvBoard: RecyclerView
    private lateinit var tvNumMoves: TextView
    private lateinit var tvNumPairs: TextView

    private var boardSize: BoardSize = BoardSize.EASY

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBoard = findViewById(R.id.rvBoard)
        tvNumMoves = findViewById(R.id.tvNumMoves)
        tvNumPairs = findViewById(R.id.tvNumPairs)

        val memoryGame = MemoryGame(boardSize)

        rvBoard.adapter = MemoryBoardAdapter(this, boardSize, memoryGame.cards, object: MemoryBoardAdapter.CardClickListener {
            override fun onCardClicked(position: Int) {
                Log.i("MainActivity", "Card clicked $position")

            }

        })
        rvBoard.setHasFixedSize(true)
        rvBoard.layoutManager = GridLayoutManager(this, boardSize.getWidth())
    }


}