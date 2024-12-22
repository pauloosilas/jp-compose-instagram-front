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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sumpaulo.instagram.R

@Composable
fun InstagramToolbar() {
    Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .height(56.dp),

            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Instagram",
                modifier = Modifier
                    .weight(1f),
                style = MaterialTheme.typography.headlineLarge
            )

            Image(
                modifier = Modifier
                    .size(32.dp)
                    .padding(8.dp),
                painter = painterResource(R.drawable.ic_notification),
                contentDescription = "Ícone de notificações na barra de ferramentas."
            )


            Image(
                modifier = Modifier
                    .size(32.dp)
                    .padding(8.dp),
                painter = painterResource(R.drawable.ic_message),
                contentDescription = "Ícone de mensagens diretas na barra de tarefas."
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun instagramToolbarPreview() {
    InstagramToolbar()
}