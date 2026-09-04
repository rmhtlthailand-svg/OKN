package com.okn.dsp


class BP1048P4 {


    /*
      MVSilicon BP1048P4 DSP

      Protocol Layer

      CH1-CH7
      Volume
      Mute
      EQ
      Delay
      Crossover

    */


    fun setVolume(
        channel:Int,
        db:Int
    ){


        val packet =
            byteArrayOf(

                0xAA.toByte(),

                channel.toByte(),

                db.toByte(),

                0x55.toByte()

            )


        BluetoothDSP.send(packet)


    }



    fun mute(
        channel:Int,
        enable:Boolean
    ){


        val packet =
            byteArrayOf(

                0xBB.toByte(),

                channel.toByte(),

                if(enable)
                    1
                else
                    0,

                0x55.toByte()

            )


        BluetoothDSP.send(packet)


    }



    fun setEQ(
        channel:Int,
        band:Int,
        gain:Int
    ){


        val packet =
            byteArrayOf(

                0xCC.toByte(),

                channel.toByte(),

                band.toByte(),

                gain.toByte(),

                0x55.toByte()

            )


        BluetoothDSP.send(packet)

    }



    fun setDelay(
        channel:Int,
        ms:Int
    ){


        val packet =
            byteArrayOf(

                0xDD.toByte(),

                channel.toByte(),

                ms.toByte(),

                0x55.toByte()

            )


        BluetoothDSP.send(packet)

    }



}
