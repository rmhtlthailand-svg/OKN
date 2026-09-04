package com.okn.dsp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.okn.dsp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        setupDSP()

    }


    private fun setupDSP(){

        binding.deviceName.text =
            "BP1048P4 7CH DSP\nFW:1.2.6"


        binding.masterValue.text =
            "-12.5 dB"


        val channels = arrayOf(
            "CH1\nFront L",
            "CH2\nFront R",
            "CH3\nSUB",
            "CH4\nRear L",
            "CH5\nRear R",
            "CH6\nAUX L",
            "CH7\nAUX R"
        )


        binding.ch1Name.text = channels[0]
        binding.ch2Name.text = channels[1]
        binding.ch3Name.text = channels[2]
        binding.ch4Name.text = channels[3]
        binding.ch5Name.text = channels[4]
        binding.ch6Name.text = channels[5]
        binding.ch7Name.text = channels[6]


    }

}
