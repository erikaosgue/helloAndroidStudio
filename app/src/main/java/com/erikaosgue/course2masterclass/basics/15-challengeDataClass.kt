package com.erikaosgue.course2masterclass.standardFunctions

import kotlin.random.Random


/**
 * Exercise: Data classes
A network server responds with this information about blog articles
* Title
* Content
* Number of readers
You receive 2 articles from the server.
Update the title to suit your blog but also keep the originals.
Print out all the article information.
 */
fun main() {

    val listOfArticles = arrayListOf<Article>()
    for (i in 1..10) {
        listOfArticles.add(getArticle())
    }

    val newListArticles = arrayListOf<Article>()

    for (article in listOfArticles) {
        newListArticles.add(article)
        val newArticle: Article = article.copy(title=article.title + " for my blog")
        newListArticles.add(newArticle)
    }

    // Printing all the articles at once
    println(newListArticles)
    // Printing separately each one
    newListArticles.forEach { println(it) }
}

fun getArticle(): Article {
    val randomTitle = "Title" + Random.nextInt(100)
    val numberOfReaders = Random.nextInt(1000)
    return Article(randomTitle, "See content", numberOfReaders)
}

data class Article(
        val title: String,
        val content: String,
        val numberReaders: Int
        )