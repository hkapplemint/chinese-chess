package com.mint.chinesechess

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    var ogYX:String = ""
    var targetYX:String = ""
    var currentNameCheck:String = ""
    var resourceName = ""

    val tableArray = arrayOf(
        arrayOf("Blk_Chariot","Blk_Horse","Blk_Elephant","Blk_Advisor","Blk_General","Blk_Advisor","Blk_Elephant","Blk_Horse","Blk_Chariot"),
        arrayOf("Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"),
        arrayOf("Empty","Blk_Cannon","Empty","Empty","Empty","Empty","Empty","Blk_Cannon","Empty"),
        arrayOf("Blk_Soldier","Empty","Blk_Soldier","Empty","Blk_Soldier","Empty","Blk_Soldier","Empty","Blk_Soldier"),
        arrayOf("Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"),
        arrayOf("Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"),
        arrayOf("Red_Soldier","Empty","Red_Soldier","Empty","Red_Soldier","Empty","Red_Soldier","Empty","Red_Soldier"),
        arrayOf("Empty","Red_Cannon","Empty","Empty","Empty","Empty","Empty","Red_Cannon","Empty"),
        arrayOf("Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"),
        arrayOf("Red_Chariot","Red_Horse","Red_Elephant","Red_Advisor","Red_General","Red_Advisor","Red_Elephant","Red_Horse","Red_Chariot")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Looping to render the chess piece
        for (row in 0..9){
            for (column in 0..8){
                currentNameCheck = tableArray[row][column]
                resourceName = "iv$row$column"
                val tempView = findViewById<ImageView>(resources.getIdentifier(resourceName, "id", packageName))
                when (currentNameCheck){
                    "Blk_Chariot" -> tempView.setImageResource(R.drawable.black_chariot)
                    "Blk_Soldier" -> tempView.setImageResource(R.drawable.black_soldier)
                }
            }
        }

    }



    val blackChariot1 = PieceClass(false, "Chariot1", 'a',1,false)
    val emptySpace = PieceClass(false,"Empty",'a',9,false)
}