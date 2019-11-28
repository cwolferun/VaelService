package com.vaeldung.model

data class Page(val title:String, val content:List<Entry>)

data class Entry(val text:String, val imageBytes: String)
