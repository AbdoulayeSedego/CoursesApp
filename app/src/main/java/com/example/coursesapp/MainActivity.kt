package com.example.coursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coursesapp.data.Datasource
import com.example.coursesapp.model.Courses
import com.example.coursesapp.ui.theme.CoursesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CourseApp()
                }
            }
        }
    }
}
@Composable
fun CourseApp(){
    val context = LocalContext.current
    CoursesAppTheme() {
        CourseList(courseList = Datasource().loadImages())
    }
}
@Composable
fun CoursesCard(courses: Courses, modifier: Modifier = Modifier) {
    Card(modifier = Modifier.padding(8.dp)) {
        Column() {
            Image(
                painter = painterResource(courses.drawableResourceId),
                contentDescription = stringResource(courses.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                contentScale = ContentScale.Crop

            )
            Text(
                text = stringResource(courses.stringResourceId),
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Composable
private fun CourseList(courseList: List<Courses>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 128.dp)
    ) {
        items(courseList) {
            courses -> CoursesCard(courses)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    CoursesAppTheme {
        CourseApp()
    }
}