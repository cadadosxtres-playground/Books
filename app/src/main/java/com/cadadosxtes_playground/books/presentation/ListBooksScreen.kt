package com.cadadosxtes_playground.books.presentation

import android.widget.Space
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.cadadosxtes_playground.books.components.BookCard

@Composable
fun ListBooksScreen(innerPadding: PaddingValues){

    LazyColumn(modifier = Modifier
        .padding(innerPadding)
        .border(1.dp, color = Color.Blue)

        .fillMaxSize()
    ){

        books.forEach {
            book -> item {
            BookCard(book)
            Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}
