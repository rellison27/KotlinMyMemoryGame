package com.rellidev.mymemorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.rellidev.mymemorygame.models.BoardSize
import com.rellidev.mymemorygame.utils.EXTRA_BOARD_SIZE

class CreateActvity : AppCompatActivity() {

    private lateinit var boardSize: BoardSize
    private var numImagesRequired = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_actvity)

        boardSize = intent.getSerializableExtra(EXTRA_BOARD_SIZE) as BoardSize

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        numImagesRequired = boardSize.getNumPairs()
        supportActionBar?.title = "Choose pics (0 / $numImagesRequired)"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}