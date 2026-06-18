package com.cadadosxtes_playground.books.presentation

import androidx.compose.ui.graphics.Color
import com.cadadosxtes_playground.books.ui.theme.Purple40
import com.cadadosxtes_playground.books.ui.theme.Purple80
import com.cadadosxtes_playground.books.ui.theme.PurpleGrey40
import com.cadadosxtes_playground.books.ui.theme.PurpleGrey80

data class BookVM(
    val title: String? = null,
    val author: String? = null,
    val read: Boolean = false,
    val bookType: BookType = Fiction
)

sealed class BookType(val backgroundColor: Color, val foregroundColor: Color)

//Singleton
data object Fiction: BookType(Purple80, PurpleGrey40)
data object NonFiction: BookType(Purple40, PurpleGrey80)


val books: List<BookVM> = listOf(
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Da Vinci Code", "Dan Brown", false),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Alchemist", "Paulo Coelho", true, bookType = NonFiction),
    BookVM("The Da Vinci Code", "Dan Brown", false),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Da Vinci Code", "Dan Brown", false),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Da Vinci Code", "Dan Brown", false),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Da Vinci Code", "Dan Brown", false),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Da Vinci Code", "Dan Brown", false),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Da Vinci Code", "Dan Brown", false),
    BookVM("The Alchemist", "Paulo Coelho", true),

    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Alchemist", "Paulo Coelho", true),
    BookVM("The Da Vinci Code", "Dan Brown", false),
    BookVM("The Alchemist", "Paulo Coelho", true),
)