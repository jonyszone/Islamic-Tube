package com.shafi.islamictube.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.shafi.islamictube.R
import com.shafi.islamictube.data.DemoDataProvider
import com.shafi.islamictube.data.Videocam

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YoutubeHome() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Youtube") },
                navigationIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_youtube),
                        contentDescription = null,
                        tint = Color.Red,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                },
                actions = {
                    Icon(
                        imageVector = Icons.Default.Videocam,
                        contentDescription = null,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.p3),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(vertical = 4.dp, horizontal = 8.dp)
                            .size(24.dp)
                            .clip(CircleShape)
                    )
                }
            )
        },
        content = { paddingValues ->
            Surface(
                modifier = Modifier.padding(paddingValues)
            ) {
                YoutubeContent()
            }
        }
    )
}

@Composable
fun YoutubeContent() {
    val tweets = remember { DemoDataProvider.tweetList.filter { it.tweetImageId > 0 } }
    Column {
        Divider()
        LazyRow(
            modifier = Modifier.padding(vertical = 8.dp),
            contentPadding = PaddingValues(horizontal = 12.dp),
        ) {
            items(
                items = tweets,
                itemContent = {
                    YoutubeChip(
                        selected = it.id == 2,
                        text = it.author,
                        modifier = Modifier.padding(
                            horizontal = 4.dp,
                        )
                    )
                }
            )
        }
        LazyColumn {
            items(
                items = tweets,
                itemContent = { item -> YoutubeListItem(item) }
            )
        }
    }
}