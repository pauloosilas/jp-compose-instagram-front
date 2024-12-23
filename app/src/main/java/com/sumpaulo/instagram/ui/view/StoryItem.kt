package com.sumpaulo.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.sumpaulo.instagram.data.Story
import com.sumpaulo.instagram.ui.theme.spacingSmall
import com.sumpaulo.instagram.R
import com.sumpaulo.instagram.ui.theme.storyCircleColor

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun StoryItem(story: Story) {

    val avatarContentDesc = stringResource(id = R.string.content_description_story, story.userNickName)

    Column(
        modifier = Modifier
            .padding(spacingSmall)
            .background(MaterialTheme.colorScheme.background)
    ) {
        GlideImage(
            modifier = Modifier
                .size(64.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxSize()
                .clip(CircleShape)
                .border(2.dp, storyCircleColor, CircleShape),
            model = story.userAvatar,
            contentDescription = avatarContentDesc)

        Text(text = story.userNickName,
            modifier = Modifier
            .size(width = 72.dp, height = 24.dp),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center
            )
    }
}

@Preview(showBackground = true)
@Composable
fun storyItemPreview() {
    StoryItem(story = Story(userNickName = "", userAvatar = ""))
}