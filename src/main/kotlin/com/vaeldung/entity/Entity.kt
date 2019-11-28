package com.vaeldung.entity

data class PageEntity(val title:String, val content:List<ContentEntity>)
data class ContentEntity(val text:String,val imageUrl:String)