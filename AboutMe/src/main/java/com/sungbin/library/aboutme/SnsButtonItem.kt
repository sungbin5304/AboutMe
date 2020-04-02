package com.sungbin.library.aboutme

class SnsButtonItem {
    var title: String? = null
    var icon: Int? = null
    var link: String? = null

    constructor(){}
    constructor(title: String?, icon: Int?, link: String?) {
        this.title = title
        this.icon = icon
        this.link = link
    }
}