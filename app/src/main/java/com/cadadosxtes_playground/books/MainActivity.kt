 package com.cadadosxtes_playground.books

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.cadadosxtes_playground.books.presentation.ListBooksScreen
import com.cadadosxtes_playground.books.presentation.books
import com.cadadosxtes_playground.books.ui.theme.BooksTheme

class MainActivity : ComponentActivity() {
    //Overriding Lifecycle methods
    override fun onStart() {
        super.onStart()
        println("called onStart()")
    }

    override fun onResume() {
        super.onResume()
        println("called onResume()")
    }

    override fun onPause() {
        super.onPause()
        println("called onPause()")
    }

    override fun onStop() {
        super.onStop()
        println("called onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("called onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        println("called onRestart()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BooksTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ListBooksScreen(books,innerPadding)
                }
            }
        }
    }
}

