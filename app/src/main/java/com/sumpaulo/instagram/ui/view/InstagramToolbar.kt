package com.sumpaulo.instagram.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sumpaulo.instagram.R
import com.sumpaulo.instagram.ui.theme.spacingLarge
import com.sumpaulo.instagram.ui.theme.spacingMedium

@Composable
fun InstagramToolbar() {
    val instagramLabel = stringResource(id = R.string.app_name)
    Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
        Row(
            modifier = Modifier
                .padding(horizontal = spacingLarge)
                .height(56.dp),

            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = instagramLabel,
                modifier = Modifier
                    .weight(1f),
                style = MaterialTheme.typography.headlineLarge
            )

            Image(
                modifier = Modifier
                    .size(32.dp)
                    .padding(spacingMedium),
                painter = painterResource(R.drawable.ic_notification),
                contentDescription = stringResource(R.string.content_description_notification_icon)
            )


            Image(
                modifier = Modifier
                    .size(32.dp)
                    .padding(spacingMedium),
                painter = painterResource(R.drawable.ic_message),
                contentDescription = stringResource(R.string.content_description_message_icon)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun instagramToolbarPreview() {
    InstagramToolbar()
}