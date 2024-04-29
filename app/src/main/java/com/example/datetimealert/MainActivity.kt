package com.example.datetimealert

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.SimpleTimeZone



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showDatePicker(view: View) {
//        val cal = Calendar.getInstance()
//        val year = cal.get(Calendar.YEAR)
//        val month = cal.get(Calendar.MONTH)
//        val day = cal.get(Calendar.DAY_OF_MONTH)
//
//        DatePickerDialog(this,{_, y, m, d, ->
//            tv_date.text = "$d-$m-$y"
//        }, year, month, day).show()
    }

    fun showTimePicker(view: View) {
//        val cal = Calendar.getInstance()
//        val timeListener = TimePickerDialog.OnTimeSetListener {_, hourOfDay, minute ->
//            cal.set(Calendar.HOUR_OF_DAY, hourOfDay)
//            cal.set(Calendar.MINUTE, minute)
//            tv_time.text = SimpleDateFormat("HH;mm").format(cal.time)
//        }
//        TimePickerDialog(this, timeListener, cal.get(Calendar.HOUR_OF_DAY),
//            cal.get(Calendar.MINUTE), true).show()
    }

        fun showAlertDialog(view: View) {
            AlertDialog.Builder(this)
                .setTitle("INFORMATION")
                .setMessage("Do you want to leave ?")
                .setPositiveButton("Yes", { dialogInterface, i ->
                    Toast.makeText(this, "You Choose Yes", Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton("No", { dialogInterface, i ->
                    Toast.makeText(this, "You Choose No", Toast.LENGTH_SHORT).show()
                })
                .show()
        }
}