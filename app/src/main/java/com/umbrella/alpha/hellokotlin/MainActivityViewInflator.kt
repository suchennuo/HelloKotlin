package com.umbrella.alpha.hellokotlin

import android.app.Application
import android.content.Context
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by liulin07 on 2018/5/31.
 *
 * @author liulin07
 * @version v7.6
 * @since 2018/5/31
 */
class MainActivityViewInflator (context: Context){


    // 主构造函数 initializer blocks
    init {
        println("Init block")
    }

    // 次构造函数，如果有主构造函数，需要委托， 同一个类的不同构造函数 this
    constructor(context: Context, name: String) : this(context){

        println("Constructor " + name)
    }

    fun inflate(){

    }
}

