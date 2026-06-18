package com.cadadosxtes_playground.books.components

import androidx.compose.foundation.background
import com.cadadosxtes_playground.books.R
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.ui.Alignment

import androidx.compose.ui.res.stringResource
import com.cadadosxtes_playground.books.presentation.BookVM

@Composable
fun BookCard(book: BookVM){

    Column (modifier = Modifier.border(
        width = 1.dp,
        color = Color.Red
        )
        .fillMaxWidth()
        .background(color = book.bookType.backgroundColor,
            shape = RoundedCornerShape(10.dp))
        .padding(16.dp)

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Text(
                text = book.title ?: "",
                style = TextStyle(
                    fontSize = 32.sp,
                    color = Color.Black,
                    background = book.bookType.foregroundColor
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            if (book.read) {
                Icon(imageVector = Icons.Filled.Check,
                    contentDescription = stringResource(id = R.string.delete)
                )
            }
        }

        Text(
            text = book.author ?: "",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.Black,
                background = book.bookType.foregroundColor
            ),
            maxLines = 10,
            overflow = TextOverflow.Ellipsis
        )
    }
}