package io.tjohander.micormeter.controller

import io.tjohander.micormeter.service.BookService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/books/v1")
class BooksController(
        private val booksService: BookService
) {

    @GetMapping("/books")
    @ResponseStatus(HttpStatus.OK)
    fun getBooksCount(): Int {
        return booksService.booksCount()
    }
}