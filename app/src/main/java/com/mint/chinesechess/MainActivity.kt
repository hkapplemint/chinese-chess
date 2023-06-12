package com.mint.chinesechess

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iv00: ImageView = findViewById(R.id.iv00)
        val iv01: ImageView = findViewById(R.id.iv01)
        val iv02: ImageView = findViewById(R.id.iv02)
        val iv03: ImageView = findViewById(R.id.iv03)
        val iv04: ImageView = findViewById(R.id.iv04)
        val iv05: ImageView = findViewById(R.id.iv05)
        val iv06: ImageView = findViewById(R.id.iv06)
        val iv07: ImageView = findViewById(R.id.iv07)
        val iv08: ImageView = findViewById(R.id.iv08)
        val iv10: ImageView = findViewById(R.id.iv10)
        val iv11: ImageView = findViewById(R.id.iv11)
        val iv12: ImageView = findViewById(R.id.iv12)
        val iv13: ImageView = findViewById(R.id.iv13)
        val iv14: ImageView = findViewById(R.id.iv14)
        val iv15: ImageView = findViewById(R.id.iv15)
        val iv16: ImageView = findViewById(R.id.iv16)
        val iv17: ImageView = findViewById(R.id.iv17)
        val iv18: ImageView = findViewById(R.id.iv18)
        val iv20: ImageView = findViewById(R.id.iv20)
        val iv21: ImageView = findViewById(R.id.iv21)
        val iv22: ImageView = findViewById(R.id.iv22)
        val iv23: ImageView = findViewById(R.id.iv23)
        val iv24: ImageView = findViewById(R.id.iv24)
        val iv25: ImageView = findViewById(R.id.iv25)
        val iv26: ImageView = findViewById(R.id.iv26)
        val iv27: ImageView = findViewById(R.id.iv27)
        val iv28: ImageView = findViewById(R.id.iv28)
        val iv30: ImageView = findViewById(R.id.iv30)
        val iv31: ImageView = findViewById(R.id.iv31)
        val iv32: ImageView = findViewById(R.id.iv32)
        val iv33: ImageView = findViewById(R.id.iv33)
        val iv34: ImageView = findViewById(R.id.iv34)
        val iv35: ImageView = findViewById(R.id.iv35)
        val iv36: ImageView = findViewById(R.id.iv36)
        val iv37: ImageView = findViewById(R.id.iv37)
        val iv38: ImageView = findViewById(R.id.iv38)
        val iv40: ImageView = findViewById(R.id.iv40)
        val iv41: ImageView = findViewById(R.id.iv41)
        val iv42: ImageView = findViewById(R.id.iv42)
        val iv43: ImageView = findViewById(R.id.iv43)
        val iv44: ImageView = findViewById(R.id.iv44)
        val iv45: ImageView = findViewById(R.id.iv45)
        val iv46: ImageView = findViewById(R.id.iv46)
        val iv47: ImageView = findViewById(R.id.iv47)
        val iv48: ImageView = findViewById(R.id.iv48)
        val iv50: ImageView = findViewById(R.id.iv50)
        val iv51: ImageView = findViewById(R.id.iv51)
        val iv52: ImageView = findViewById(R.id.iv52)
        val iv53: ImageView = findViewById(R.id.iv53)
        val iv54: ImageView = findViewById(R.id.iv54)
        val iv55: ImageView = findViewById(R.id.iv55)
        val iv56: ImageView = findViewById(R.id.iv56)
        val iv57: ImageView = findViewById(R.id.iv57)
        val iv58: ImageView = findViewById(R.id.iv58)
        val iv60: ImageView = findViewById(R.id.iv60)
        val iv61: ImageView = findViewById(R.id.iv61)
        val iv62: ImageView = findViewById(R.id.iv62)
        val iv63: ImageView = findViewById(R.id.iv63)
        val iv64: ImageView = findViewById(R.id.iv64)
        val iv65: ImageView = findViewById(R.id.iv65)
        val iv66: ImageView = findViewById(R.id.iv66)
        val iv67: ImageView = findViewById(R.id.iv67)
        val iv68: ImageView = findViewById(R.id.iv68)
        val iv70: ImageView = findViewById(R.id.iv70)
        val iv71: ImageView = findViewById(R.id.iv71)
        val iv72: ImageView = findViewById(R.id.iv72)
        val iv73: ImageView = findViewById(R.id.iv73)
        val iv74: ImageView = findViewById(R.id.iv74)
        val iv75: ImageView = findViewById(R.id.iv75)
        val iv76: ImageView = findViewById(R.id.iv76)
        val iv77: ImageView = findViewById(R.id.iv77)
        val iv78: ImageView = findViewById(R.id.iv78)
        val iv80: ImageView = findViewById(R.id.iv80)
        val iv81: ImageView = findViewById(R.id.iv81)
        val iv82: ImageView = findViewById(R.id.iv82)
        val iv83: ImageView = findViewById(R.id.iv83)
        val iv84: ImageView = findViewById(R.id.iv84)
        val iv85: ImageView = findViewById(R.id.iv85)
        val iv86: ImageView = findViewById(R.id.iv86)
        val iv87: ImageView = findViewById(R.id.iv87)
        val iv88: ImageView = findViewById(R.id.iv88)
        val iv90: ImageView = findViewById(R.id.iv90)
        val iv91: ImageView = findViewById(R.id.iv91)
        val iv92: ImageView = findViewById(R.id.iv92)
        val iv93: ImageView = findViewById(R.id.iv93)
        val iv94: ImageView = findViewById(R.id.iv94)
        val iv95: ImageView = findViewById(R.id.iv95)
        val iv96: ImageView = findViewById(R.id.iv96)
        val iv97: ImageView = findViewById(R.id.iv97)
        val iv98: ImageView = findViewById(R.id.iv98)

        val tvDebug: TextView = findViewById(R.id.tvDebug)

        val listOfImageViews = listOf(
            iv00, iv01, iv02, iv03, iv04, iv05, iv06, iv07, iv08,
            iv10, iv11, iv12, iv13, iv14, iv15, iv16, iv17, iv18,
            iv20, iv21, iv22, iv23, iv24, iv25, iv26, iv27, iv28,
            iv30, iv31, iv32, iv33, iv34, iv35, iv36, iv37, iv38,
            iv40, iv41, iv42, iv43, iv44, iv45, iv46, iv47, iv48,
            iv50, iv51, iv52, iv53, iv54, iv55, iv56, iv57, iv58,
            iv60, iv61, iv62, iv63, iv64, iv65, iv66, iv67, iv68,
            iv70, iv71, iv72, iv73, iv74, iv75, iv76, iv77, iv78,
            iv80, iv81, iv82, iv83, iv84, iv85, iv86, iv87, iv88,
            iv90, iv91, iv92, iv93, iv94, iv95, iv96, iv97, iv98
        )


        //Calling this to render all chess piece
        updateBoardRender()

//        tvDebug.setOnClickListener {
//            tvDebug.text = "$ogYX, $targetYX, $clickStage, $selectedPieceType"
//        }

        val tvRestart:TextView = findViewById(R.id.tvRestart)
        tvRestart.setOnClickListener {
            if(clickStage==0){
                restart()
                tvDebug.text = "Red's turn"
                tvDebug.setTextColor(ContextCompat.getColor(this,R.color.black))
                for (ivYX in listOfImageViews){
                    ivYX.setBackgroundColor(Color.TRANSPARENT)
                }
            }

        }

        for (ivYX in listOfImageViews) {
            ivYX.setOnClickListener {
                val idOfiv = ivYX.id
                val nameOfiv = resources.getResourceEntryName(idOfiv)           //e.g. iv46
                val ivY = nameOfiv.substring(2, 3).toInt()              //4
                val ivX = nameOfiv.substring(3).toInt()        //6

                //Black player turn
                if (!playerTurnIsRed && tableArray[ivY][ivX].substring(0,3) == "Blk" && clickStage!=0) {
                    ogYX = nameOfiv.substring(2)                      //46
                    selectedPieceType = tableArray[ivY][ivX].substring(4)
                    clickStage = 2

                    ivYX.setBackgroundColor(ContextCompat.getColor(this, R.color.selected_background_color_semitransparent))
                    for (otherIV in listOfImageViews) {
                        if (otherIV != ivYX) {
                            otherIV.setBackgroundColor(Color.TRANSPARENT)
                        }
                    }
                }
                if (!playerTurnIsRed && tableArray[ivY][ivX].substring(0,3) != "Blk" && clickStage == 2) {
                    targetYX = nameOfiv.substring(2)
                    if(targetYX!=""){
                        when(selectedPieceType){
                            "Chariot" -> {if(chariotMovement(ogYX, targetYX)){
                                tvDebug.text = "Red's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "Cannon" -> {if(cannonMovement(ogYX, targetYX)){
                                tvDebug.text = "Red's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "Horse" -> {if(horseMovement(ogYX, targetYX)){
                                tvDebug.text = "Red's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "Elephant" -> {if(elephantMovement(ogYX, targetYX, !playerTurnIsRed)){
                                tvDebug.text = "Red's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "Soldier" -> {if(soldierMovement(ogYX, targetYX, !playerTurnIsRed)){
                                tvDebug.text = "Red's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "Advisor" -> {if(advisorMovement(ogYX, targetYX, !playerTurnIsRed)){
                                tvDebug.text = "Red's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "General" -> {if(generalMovement(ogYX, targetYX, !playerTurnIsRed)){
                                tvDebug.text = "Red's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                        }
                    }
                }

                //Red player turn
                if (playerTurnIsRed && tableArray[ivY][ivX].substring(0,3) == "Red" && clickStage!=0) {
                    ogYX = nameOfiv.substring(2)                      //46
                    selectedPieceType = tableArray[ivY][ivX].substring(4)
                    clickStage = 2

                    ivYX.setBackgroundColor(ContextCompat.getColor(this, R.color.selected_background_color_semitransparent))
                    for (otherIV in listOfImageViews) {
                        if (otherIV != ivYX) {
                            otherIV.setBackgroundColor(Color.TRANSPARENT)
                        }
                    }
                }
                if (playerTurnIsRed && tableArray[ivY][ivX].substring(0,3) != "Red" && clickStage == 2) {
                    targetYX = nameOfiv.substring(2)
                    if(targetYX!=""){
                        when(selectedPieceType){
                            "Chariot" -> {if(chariotMovement(ogYX, targetYX)){
                                tvDebug.text = "Black's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "Cannon" -> {if(cannonMovement(ogYX, targetYX)){
                                tvDebug.text = "Black's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "Horse" -> {if(horseMovement(ogYX, targetYX)){
                                tvDebug.text = "Black's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "Elephant" -> {if(elephantMovement(ogYX, targetYX, !playerTurnIsRed)){
                                tvDebug.text = "Black's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "Soldier" -> {if(soldierMovement(ogYX, targetYX, !playerTurnIsRed)){
                                tvDebug.text = "Black's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "Advisor" -> {if(advisorMovement(ogYX, targetYX, !playerTurnIsRed)){
                                tvDebug.text = "Black's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                            "General" -> {if(generalMovement(ogYX, targetYX, !playerTurnIsRed)){
                                tvDebug.text = "Black's turn"
                                clickStage = 1
                                movePiece(ogYX, targetYX)
                                playerTurnIsRed = !playerTurnIsRed
                            }}
                        }
                    }
                }
            }
        }
    }

    //Setting up the variables
    var ogYX: String = ""
    var targetYX: String = ""
    var clickStage: Int = 1
    var selectedPieceType:String  = ""
    var playerTurnIsRed: Boolean = true
    var currentNameCheck: String = ""
    var resourceName = ""
    var tableArray = arrayOf(
        arrayOf(
            "Blk_Chariot",
            "Blk_Horse",
            "Blk_Elephant",
            "Blk_Advisor",
            "Blk_General",
            "Blk_Advisor",
            "Blk_Elephant",
            "Blk_Horse",
            "Blk_Chariot"
        ),
        arrayOf("Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"),
        arrayOf(
            "Empty",
            "Blk_Cannon",
            "Empty",
            "Empty",
            "Empty",
            "Empty",
            "Empty",
            "Blk_Cannon",
            "Empty"
        ),
        arrayOf(
            "Blk_Soldier",
            "Empty",
            "Blk_Soldier",
            "Empty",
            "Blk_Soldier",
            "Empty",
            "Blk_Soldier",
            "Empty",
            "Blk_Soldier"
        ),
        arrayOf("Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"),
        arrayOf("Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"),
        arrayOf(
            "Red_Soldier",
            "Empty",
            "Red_Soldier",
            "Empty",
            "Red_Soldier",
            "Empty",
            "Red_Soldier",
            "Empty",
            "Red_Soldier"
        ),
        arrayOf(
            "Empty",
            "Red_Cannon",
            "Empty",
            "Empty",
            "Empty",
            "Empty",
            "Empty",
            "Red_Cannon",
            "Empty"
        ),
        arrayOf("Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"),
        arrayOf(
            "Red_Chariot",
            "Red_Horse",
            "Red_Elephant",
            "Red_Advisor",
            "Red_General",
            "Red_Advisor",
            "Red_Elephant",
            "Red_Horse",
            "Red_Chariot"
        )
    )

    val tableArrayCopy = arrayOf(
        arrayOf(
            "Blk_Chariot",
            "Blk_Horse",
            "Blk_Elephant",
            "Blk_Advisor",
            "Blk_General",
            "Blk_Advisor",
            "Blk_Elephant",
            "Blk_Horse",
            "Blk_Chariot"
        ),
        arrayOf("Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"),
        arrayOf(
            "Empty",
            "Blk_Cannon",
            "Empty",
            "Empty",
            "Empty",
            "Empty",
            "Empty",
            "Blk_Cannon",
            "Empty"
        ),
        arrayOf(
            "Blk_Soldier",
            "Empty",
            "Blk_Soldier",
            "Empty",
            "Blk_Soldier",
            "Empty",
            "Blk_Soldier",
            "Empty",
            "Blk_Soldier"
        ),
        arrayOf("Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"),
        arrayOf("Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"),
        arrayOf(
            "Red_Soldier",
            "Empty",
            "Red_Soldier",
            "Empty",
            "Red_Soldier",
            "Empty",
            "Red_Soldier",
            "Empty",
            "Red_Soldier"
        ),
        arrayOf(
            "Empty",
            "Red_Cannon",
            "Empty",
            "Empty",
            "Empty",
            "Empty",
            "Empty",
            "Red_Cannon",
            "Empty"
        ),
        arrayOf("Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty", "Empty"),
        arrayOf(
            "Red_Chariot",
            "Red_Horse",
            "Red_Elephant",
            "Red_Advisor",
            "Red_General",
            "Red_Advisor",
            "Red_Elephant",
            "Red_Horse",
            "Red_Chariot"
        )
    )

    fun restart(){
        tableArray = tableArrayCopy
        clickStage = 1
        playerTurnIsRed = true
        updateBoardRender()
    }

    fun updateBoardRender() {

        //Looping to render the chess piece
        for (row in 0..9) {
            for (column in 0..8) {
                currentNameCheck = tableArray[row][column]
                resourceName = "iv$row$column"
                val tempView = findViewById<ImageView>(
                    resources.getIdentifier(
                        resourceName,
                        "id",
                        packageName
                    )
                )
                when (currentNameCheck) {
                    "Blk_Chariot" -> tempView.setImageResource(R.drawable.black_chariot)
                    "Blk_Horse" -> tempView.setImageResource(R.drawable.black_horse)
                    "Blk_Elephant" -> tempView.setImageResource(R.drawable.black_elephant)
                    "Blk_Advisor" -> tempView.setImageResource(R.drawable.black_advisor)
                    "Blk_General" -> tempView.setImageResource(R.drawable.black_general)
                    "Blk_Cannon" -> tempView.setImageResource(R.drawable.black_cannon)
                    "Blk_Soldier" -> tempView.setImageResource(R.drawable.black_soldier)
                    "Red_Chariot" -> tempView.setImageResource(R.drawable.red_chariot)
                    "Red_Horse" -> tempView.setImageResource(R.drawable.red_horse)
                    "Red_Elephant" -> tempView.setImageResource(R.drawable.red_elephant)
                    "Red_Advisor" -> tempView.setImageResource(R.drawable.red_advisor)
                    "Red_General" -> tempView.setImageResource(R.drawable.red_general)
                    "Red_Cannon" -> tempView.setImageResource(R.drawable.red_cannon)
                    "Red_Soldier" -> tempView.setImageResource(R.drawable.red_soldier)
                    "Empty" -> tempView.setImageResource(R.drawable.empty_piece)
                }
            }
        }
    }

    fun movePiece(ogYX:String, targetYX: String){
        val ogY = ogYX.substring(0,1).toInt()
        val ogX = ogYX.substring(1).toInt()
        var targetY = 0
        var targetX = 0
        if(targetYX != ""){
            targetY = targetYX.substring(0,1).toInt()
            targetX = targetYX.substring(1).toInt()

            val tvDebug:TextView = findViewById(R.id.tvDebug)
            if(tableArray[targetY][targetX]=="Red_General"){
                tvDebug.text = "Black Wins!"
                tvDebug.setTextColor(ContextCompat.getColor(this,R.color.lime_green))
                clickStage = 0
            }
            if(tableArray[targetY][targetX]=="Blk_General"){
                tvDebug.text = "Red Wins!"
                tvDebug.setTextColor(ContextCompat.getColor(this,R.color.lime_green))
                clickStage = 0
            }

            tableArray[targetY][targetX] = tableArray[ogY][ogX]
            tableArray[ogY][ogX] = "Empty"

            updateBoardRender()
        }

    }

    fun chariotMovement(ogYX:String, targetYX:String): Boolean{
        val ogY = ogYX.substring(0,1).toInt()
        val ogX = ogYX.substring(1).toInt()
        var targetY = 0
        var targetX = 0
        if(targetYX != ""){
            targetY = targetYX.substring(0,1).toInt()
            targetX = targetYX.substring(1).toInt()
        }

        val movementArray = arrayListOf<String>()
        var editedList = listOf<String>()

        if(targetYX != ""){
            //Horizontal move
            if (ogY == targetY) {
                if (ogX < targetX) {                                          //e.g Black_Chariot
                    for (column in ogX..targetX) {
                        movementArray.add(tableArray[ogY][column])           //e.g. Black_Chariot, Empty, Empty, Red_Chariot    or Black_Chariot, Empty
                    }
                } else {
                    for (column in targetX..ogX) {
                        movementArray.add(tableArray[ogY][column])           //e.g. Black_Chariot, Empty, Empty, Red_Chariot    or Black_Chariot, Empty
                    }
                }
                editedList = movementArray.drop(1).dropLast(1)
                val tvDebug:TextView = findViewById(R.id.tvDebug)
                return editedList.toSet().size <= 1
            }

            //Vertical move
            if(ogX == targetX){
                if(ogY < targetY){                      //moving down
                    for (row in ogY..targetY){
                        movementArray.add(tableArray[row][ogX])
                    }
                } else {
                    for (row in targetY..ogY){
                        movementArray.add(tableArray[row][ogX])
                    }
                }
                editedList = movementArray.drop(1).dropLast(1)
                val tvDebug:TextView = findViewById(R.id.tvDebug)
                return editedList.toSet().size <= 1
            }


        }

        return false
    }

    fun cannonMovement(ogYX: String, targetYX: String): Boolean{
        val ogY = ogYX.substring(0,1).toInt()
        val ogX = ogYX.substring(1).toInt()
        var targetY = 0
        var targetX = 0
        if(targetYX != ""){
            targetY = targetYX.substring(0,1).toInt()
            targetX = targetYX.substring(1).toInt()
        }

        val movementArray = arrayListOf<String>()
        var editedList = listOf<String>()

        if (tableArray[targetY][targetX] == "Empty"){             //for
            if(ogY == targetY){                                   //horizontal move in "Empty" move
                if(ogX < targetX){
                    for (column in ogX..targetX){
                        movementArray.add(tableArray[ogY][column])
                    }
                } else {
                    for (column in targetX..ogX){
                        movementArray.add(tableArray[ogY][column])
                    }
                }
                editedList = movementArray.drop(1).dropLast(1)
                if(editedList.toSet().size == 1 && "Empty" in editedList.toSet()){
                    return true
                } else if (editedList.toSet().size == 0){
                    return true
                }
                return false
            }
            if(ogX == targetX){
                if(ogY < targetY){
                    for (row in ogY..targetY){
                        movementArray.add(tableArray[row][ogX])
                    }
                } else {
                    for (row in targetY..ogY){
                        movementArray.add(tableArray[row][ogX])
                    }
                }
                editedList = movementArray.drop(1).dropLast(1)

                if(editedList.toSet().size == 1 && "Empty" in editedList.toSet()){
                    return true
                } else if (editedList.toSet().size == 0){
                    return true
                }
                return false
            }
        }

        if (tableArray[targetY][targetX] != "Empty"){
            if(ogY == targetY){                                   //horizontal move in "Empty" move
                if(ogX < targetX){
                    for (column in ogX..targetX){
                        movementArray.add(tableArray[ogY][column])
                    }
                } else {
                    for (column in targetX..ogX){
                        movementArray.add(tableArray[ogY][column])
                    }
                }
                editedList = movementArray.drop(1).dropLast(1)
                if(editedList.toSet().size == 2 && "Empty" in editedList.toSet()){
                    return true
                } else if (editedList.toSet().size == 1 && "Empty" !in editedList.toSet()){
                    return true
                }
                return false
            }
            if(ogX == targetX){
                if(ogY < targetY){
                    for (row in ogY..targetY){
                        movementArray.add(tableArray[row][ogX])
                    }
                } else {
                    for (row in targetY..ogY){
                        movementArray.add(tableArray[row][ogX])
                    }
                }
                editedList = movementArray.drop(1).dropLast(1)

                if(editedList.toSet().size == 2 && "Empty" in editedList.toSet()){
                    return true
                } else if (editedList.toSet().size == 1 && "Empty" !in editedList.toSet()){
                    return true
                }
                return false
            }
        }
        return false
    }

    fun horseMovement(ogYX: String, targetYX: String): Boolean{
        val ogY = ogYX.substring(0,1).toInt()
        val ogX = ogYX.substring(1).toInt()
        var targetY = 0
        var targetX = 0
        if(targetYX != ""){
            targetY = targetYX.substring(0,1).toInt()
            targetX = targetYX.substring(1).toInt()
        }

        if(ogX+2 == targetX && ogY+1 == targetY && tableArray[ogY][ogX+1] == "Empty"){
            return true
        }
        if(ogX+2 == targetX && ogY-1 == targetY && tableArray[ogY][ogX+1] == "Empty"){
            return true
        }

        if(targetX+2 == ogX && ogY+1 == targetY && tableArray[ogY][ogX-1] == "Empty"){
            return true
        }
        if(targetX+2 == ogX && ogY-1 == targetY && tableArray[ogY][ogX-1] == "Empty"){
            return true
        }

        if(ogY+2 == targetY && ogX+1 == targetX && tableArray[ogY+1][ogX] == "Empty"){
            return true
        }
        if(ogY+2 == targetY && ogX-1 == targetX && tableArray[ogY+1][ogX] == "Empty"){
            return true
        }

        if(targetY+2 == ogY && ogX+1 == targetX && tableArray[ogY-1][ogX] == "Empty"){
            return true
        }
        if(targetY+2 == ogY && ogX-1 == targetX && tableArray[ogY-1][ogX] == "Empty"){
            return true
        }


        return false
    }

    fun elephantMovement(ogYX: String, targetYX: String, isBlack:Boolean): Boolean {
        val ogY = ogYX.substring(0, 1).toInt()
        val ogX = ogYX.substring(1).toInt()
        var targetY = 0
        var targetX = 0
        if (targetYX != "") {
            targetY = targetYX.substring(0, 1).toInt()
            targetX = targetYX.substring(1).toInt()
        }

        val tvDebug: TextView = findViewById(R.id.tvDebug)

        if (ogX + 2 == targetX && ogY + 2 == targetY && tableArray[ogY + 1][ogX + 1] == "Empty") {
            if(!isBlack && targetY>=5){
                return true
            }
            if(isBlack && targetY<=4){
                tvDebug.text = "Case1"
                return true
            }
        }

        if (ogX - 2 == targetX && ogY + 2 == targetY && tableArray[ogY + 1][ogX - 1] == "Empty") {
            if(!isBlack && targetY>=5){
                return true
            }
            if(isBlack && targetY<=4){
                tvDebug.text = "Case2"
                return true
            }
        }

        if (ogX + 2 == targetX && ogY - 2 == targetY && tableArray[ogY - 1][ogX + 1] == "Empty") {
            if(!isBlack && targetY>=5){
                return true
            }
            if(isBlack && targetY<=4){
                tvDebug.text = "Case3"
                return true
            }
        }

        if (ogX - 2 == targetX && ogY - 2 == targetY && tableArray[ogY - 1][ogX - 1] == "Empty") {
            if(!isBlack && targetY>=5){
                return true
            }
            if(isBlack && targetY<=4){
                tvDebug.text = "Case4"
                return true
            }
        }

        return false
    }

    fun soldierMovement(ogYX: String, targetYX: String, isBlack:Boolean): Boolean {
        val ogY = ogYX.substring(0, 1).toInt()
        val ogX = ogYX.substring(1).toInt()
        var targetY = 0
        var targetX = 0
        if (targetYX != "") {
            targetY = targetYX.substring(0, 1).toInt()
            targetX = targetYX.substring(1).toInt()
        }

        if(isBlack){
            if(ogY<=4 && ogY+1==targetY && ogX==targetX){
                return true
            }
            if(ogY>=5 && ogY+1==targetY && ogX==targetX){
                return true
            }
            if(ogY>=5 && ogX+1==targetX && ogY==targetY){
                return true
            }
            if(ogY>=5 && ogX-1==targetX && ogY==targetY){
                return true
            }
        } else {
            if(ogY>=5 && ogY-1==targetY && ogX==targetX){
                return true
            }
            if(ogY<=4 && ogY-1==targetY && ogX==targetX){
                return true
            }
            if(ogY<=4 && ogX+1==targetX && ogY==targetY){
                return true
            }
            if(ogY<=4 && ogX-1==targetX && ogY==targetY){
                return true
            }
        }



        return false
    }

    fun advisorMovement(ogYX: String, targetYX: String, isBlack:Boolean): Boolean {
        val ogY = ogYX.substring(0, 1).toInt()
        val ogX = ogYX.substring(1).toInt()
        var targetY = 0
        var targetX = 0
        if (targetYX != "") {
            targetY = targetYX.substring(0, 1).toInt()
            targetX = targetYX.substring(1).toInt()
        }

        if(isBlack){
            if(targetY<=2 && 3<=targetX && targetX<=5){
                if(ogY+1==targetY && ogX+1==targetX){
                    return true
                }
                if(ogY-1==targetY && ogX+1==targetX){
                    return true
                }
                if(ogY+1==targetY && ogX-1==targetX){
                    return true
                }
                if(ogY-1==targetY && ogX-1==targetX){
                    return true
                }
            }
        } else {
            if(7<=targetY && targetY<=9 && 3<=targetX && targetX<=5){
                if(ogY+1==targetY && ogX+1==targetX){
                    return true
                }
                if(ogY-1==targetY && ogX+1==targetX){
                    return true
                }
                if(ogY+1==targetY && ogX-1==targetX){
                    return true
                }
                if(ogY-1==targetY && ogX-1==targetX){
                    return true
                }
            }
        }
        return false
    }

    fun generalMovement(ogYX: String, targetYX: String, isBlack:Boolean): Boolean {
        val ogY = ogYX.substring(0, 1).toInt()
        val ogX = ogYX.substring(1).toInt()
        var targetY = 0
        var targetX = 0
        if (targetYX != "") {
            targetY = targetYX.substring(0, 1).toInt()
            targetX = targetYX.substring(1).toInt()
        }

        if(isBlack){
            if(targetY<=2 && 3<=targetX && targetX<=5){
                if(ogY-1==targetY && ogX==targetX){
                    return true
                }
                if(ogY+1==targetY && ogX==targetX){
                    return true
                }
                if(ogY==targetY && ogX-1==targetX){
                    return true
                }
                if(ogY==targetY && ogX+1==targetX){
                    return true
                }
            }
        } else {
            if(7<=targetY && targetY<=9 && 3<=targetX && targetX<=5){
                if(ogY-1==targetY && ogX==targetX){
                    return true
                }
                if(ogY+1==targetY && ogX==targetX){
                    return true
                }
                if(ogY==targetY && ogX-1==targetX){
                    return true
                }
                if(ogY==targetY && ogX+1==targetX){
                    return true
                }
            }
        }
        return false
    }

}