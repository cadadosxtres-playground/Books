package com.cadadosxtes_playground.books.presentation

import android.widget.Space
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cadadosxtes_playground.books.R
import com.cadadosxtes_playground.books.components.BookCard

@Composable
fun ListBooksScreen(books: List<BookVM>, innerPadding: PaddingValues){

    Column (
        modifier = Modifier
            .padding(innerPadding)
            .padding(horizontal = 8.dp)
            .fillMaxSize()
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            textAlign = TextAlign.Center,
            text = stringResource(id = R.string.main_heading),
            style = TextStyle(fontSize = 32.sp)
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .border(1.dp, color = Color.Blue)
                .fillMaxSize()
        ) {
            item {  }
            books.forEach { book ->
                item {
                    BookCard(book)
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}
