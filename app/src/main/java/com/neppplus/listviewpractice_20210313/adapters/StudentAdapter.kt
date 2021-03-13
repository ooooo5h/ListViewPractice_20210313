package com.neppplus.listviewpractice_20210313.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.listviewpractice_20210313.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mlist : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mlist) {
}