package ug.ac.ndejje.ronald

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ug.ac.ndejje.ronald.ui.theme.RonaldTheme

data class Post(
    val id: Int,
    val userName: String,
    val postTime: String,
    val postText: String,
    val likes: Int,
    val comments: Int,
    val shares: Int
)

@Composable
fun PostCard(post: Post, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.padding(8.dp)
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // TODO: Add user avatar image
                Spacer(modifier = Modifier.width(8.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = post.userName, fontWeight = FontWeight.Bold)
                    Text(text = post.postTime, style = MaterialTheme.typography.bodySmall)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More options")
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = post.postText)
            // TODO: Add post image
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "${post.likes} Likes")
                Text(text = "${post.comments} Comments")
                Text(text = "${post.shares} Shares")
            }
            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Like")
                }
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Comment")
                }
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Share")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostCardPreview() {
    RonaldTheme {
        val samplePost = Post(
            id = 1,
            userName = "Ronald",
            postTime = "2 hours ago",
            postText = "This is a sample post. I'm having a great time learning Jetpack Compose! It's so cool!",
            likes = 120,
            comments = 30,
            shares = 15
        )
        PostCard(post = samplePost)
    }
}
