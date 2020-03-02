package com.example.mvipattern.Utils

import io.reactivex.Observable
import java.util.*

class DataSource(internal var imageList:List<String>) {
    fun getImageLinkFromList(index:Int):Observable<String>
    {
        return Observable.just(imageList[index])
    }
}