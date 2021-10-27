package com.example.recyclerview_vinantimaulidyafazri_33

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant-Man",
                "loren lipsum"
            ),
            Superhero(
                R.drawable.black,
                "Black Panter",
                "loren lipsum"
            ),
            Superhero(
                R.drawable.gamora,
                "Gamora Marvel",
                "lore lipsum"
            ),
            Superhero(
                R.drawable.hawkeye,
                "Hawkeye Marvel",
                "lore lipsum"
            ),
            Superhero(
                R.drawable.hulk,
                "Green Hulk",
                "lore lipsum"
            ),
            Superhero(
                R.drawable.ironman,
                "Captain Ironman",
                "lore lipsum"
            ),
            Superhero(
                R.drawable.marvel,
                "Captain Marvel",
                "lore lipsum"
            ),
            Superhero(
                R.drawable.loki,
                "Loki Marvel",
                "lore lipsum"
            ),
            Superhero(
                R.drawable.doctor,
                "Doctor Marvel",
                "lore lipsum"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent(this,DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}