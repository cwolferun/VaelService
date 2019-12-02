package com.vaeldung.controller

import com.vaeldung.model.Entry
import com.vaeldung.model.Page
import com.vaeldung.service.ArticleService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
@RestController
class ArticleController(val articleService: ArticleService) {

    @PostMapping("/upload")
    fun savweImage(@RequestBody page: Page) = articleService.saveImage(page.content[0].imageString)

    @PostMapping("/quick")
    fun quickImage(@RequestBody entry: Entry) = articleService.saveImage(entry.imageString)
}