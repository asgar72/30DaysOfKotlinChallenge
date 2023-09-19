package com.asgar72.day_30

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.inputmethod.InputBinding
import android.widget.SeekBar
import com.asgar72.day_30.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    lateinit var mediaPlayer: MediaPlayer
    var totalTime: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        mediaPlayer = MediaPlayer.create(this, R.raw.nuha)
        mediaPlayer.setVolume(1f, 1f)
        totalTime = mediaPlayer.duration

        binding.play.setOnClickListener {
            mediaPlayer.start()
        }

        binding.pause.setOnClickListener {
            mediaPlayer.pause()
        }

        binding.stop.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer.reset()
            mediaPlayer.release()
        }

        // when use change the time stamp of music, reflect that changes
        binding.seekBarMusic.max = totalTime
        binding.seekBarMusic.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                    if (fromUser){
                        mediaPlayer.seekTo(progress)
                    }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        //change the seekbar positions based on the music

        val handler = Handler()
        handler.postDelayed(object : Runnable{
            override fun run() {
                try {
                    binding.seekBarMusic.progress=mediaPlayer.currentPosition
                    handler.postDelayed(this,1000)
                }catch (exception : java.lang.Exception){
                        binding.seekBarMusic.progress = 0
                }
            }

        },0)

    }
}