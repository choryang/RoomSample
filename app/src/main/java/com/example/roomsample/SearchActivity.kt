package com.example.roomsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.example.roomsample.databinding.ActivitySearchBinding
import kotlinx.coroutines.*

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivitySearchBinding>(
            this,
            R.layout.activity_search
        )
        binding.lifecycleOwner = this

        /*val job: Job = CoroutineScope(Dispatchers.IO).launch{
            DatabaseCopier.copyAttachedDatabase(context = applicationContext)
        }

        runBlocking {
            job.join()
        }*/


        // 추가 --
        val db = Room.databaseBuilder(
            applicationContext,
            TodoDatabase::class.java, "to-do"
        ).createFromAsset("databases/locationList.db").build()

        db?.locationListDao()?.getAll()?.observe(this, { locationList ->
            binding.searchGuide.text = locationList.toString()
        })

//        binding.addButton.setOnClickListener {
//            lifecycleScope.launch(Dispatchers.IO) {
//                db?.locationListDao()?.insert(
//                    LocationList(0 ,title = binding.todoEdit.text.toString()))
//            }
//
//            db?.locationListDao()?.getAll()?.observe(this, { todo ->
//                binding.resultText.text = todo.toString()
//            })
//        }





    }
}