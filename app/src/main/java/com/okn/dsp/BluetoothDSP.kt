package com.okn.dsp

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import java.util.UUID


object BluetoothDSP {


    private var socket: BluetoothSocket? = null


    private val uuid: UUID =
        UUID.fromString(
            "00001101-0000-1000-8000-00805F9B34FB"
        )


    fun connect(device: BluetoothDevice): Boolean {


        return try {

            socket =
                device.createRfcommSocketToServiceRecord(uuid)


            socket?.connect()

            true


        } catch(e:Exception){

            false

        }

    }



    fun send(data:ByteArray){


        try {

            socket?.outputStream?.write(data)


        }catch(e:Exception){


        }


    }



    fun receive():ByteArray?{


        return try {

            val buffer =
                ByteArray(64)


            val size =
                socket?.inputStream?.read(buffer)


            buffer.copyOf(size ?: 0)


        }catch(e:Exception){

            null

        }


    }



    fun disconnect(){

        socket?.close()

    }


}
