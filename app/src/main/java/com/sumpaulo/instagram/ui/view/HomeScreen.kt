package com.sumpaulo.instagram.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sumpaulo.instagram.R
import com.sumpaulo.instagram.data.Story
import com.sumpaulo.instagram.ui.theme.spacingMedium

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        InstagramToolbar()

        val stories = listOf<Story>(
            Story(
                userNickName = "janedoe",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4IaDTwdkqf3m-2RqnUAnR3usA1Hk6usf0yA&s"
            ),
            Story(
                userNickName = "juremagpt",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4IaDTwdkqf3m-2RqnUAnR3usA1Hk6usf0yA&s"
            ),
            Story(
                userNickName = "devdoido",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4IaDTwdkqf3m-2RqnUAnR3usA1Hk6usf0yA&s"
            ),
            Story(
                userNickName = "kkkkkkkkburrao",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4IaDTwdkqf3m-2RqnUAnR3usA1Hk6usf0yA&s"
            ),
            Story(
                userNickName = "janedoe",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4IaDTwdkqf3m-2RqnUAnR3usA1Hk6usf0yA&s"
            ),
            Story(
                userNickName = "juremagpt",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4IaDTwdkqf3m-2RqnUAnR3usA1Hk6usf0yA&s"
            ),
            Story(
                userNickName = "devdoido",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4IaDTwdkqf3m-2RqnUAnR3usA1Hk6usf0yA&s"
            ),
            Story(
                userNickName = "kkkkkkkkburrao",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4IaDTwdkqf3m-2RqnUAnR3usA1Hk6usf0yA&s"
            )
        )

        StoryList(stories = stories)
    }
}

@Composable
fun StoryList(stories: List<Story>) {
    LazyRow(
        modifier = Modifier
            .padding(top = spacingMedium)
    )
    {
        itemsIndexed(stories) { _, item ->
            StoryItem(story = item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}