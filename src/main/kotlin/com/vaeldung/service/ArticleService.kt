package com.vaeldung.service

import org.springframework.stereotype.Service
import software.amazon.awssdk.services.s3.S3Client
import software.amazon.awssdk.services.s3.model.PutObjectRequest
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*
import kotlin.reflect.typeOf

@Service
class ArticleService {

    val directory = System.getProperty("user.dir")
    fun saveImage(byteArray: String, s3Client: S3Client) {
        val path = Paths.get(directory,UUID.randomUUID().toString()+".jpg")
        Files.createFile(path)
        path.toFile().writeBytes(Base64.getDecoder().decode(byteArray))
    }
}