package com.example.attendanceassignment.ui.theme
import android.accounts.Account
import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.res.vectorResource
import androidx.compose.material3.TopAppBarDefaults

import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.attendanceassignment.R
import com.example.attendanceassignment.ui.theme.ui.theme.AttendanceAssignmentTheme
import org.w3c.dom.Text

class Settings : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AttendanceAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),

                ) {
                    AttendanceAssignmentTheme {

                        // TopAppBar("My Profile")
//        FloatingButton(onClick: () -> Unit)
                        Column(){

                            AccountInfo(Heading = "Name", SubTitle = "Michonne" )
                            AccountInfo(Heading = "Account Level", SubTitle = "10" )

                        }

                        Image(
                            painter = painterResource(R.drawable.sample_avatar),
                            contentDescription = "avatar",
                            contentScale = ContentScale.Crop,            // crop the image if it's not a square
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape)                       // clip to the circle shape
                                .border(2.dp, Color.Gray, CircleShape)   // add a border (optional)
                        )


                        HorizontalDivider(thickness = 1.dp, color = Color.Gray)

                        Column()
                        {
                            ExpandableList()
                        }

                        FloatingButton(
                            onClick = {
                                // Handle button click action here
                                // For example, navigate to another screen
                            }
                        )



                    }
                }
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(title: String) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = MaterialTheme.colorScheme.primary,

                title = {
                    Text(text = title)
                }
            )
        },
    ) {
//            innerPadding ->
//        ScrollContent(innerPadding)

        Text("hiiii")
    }
}

//@Composable
//fun FloatingActionButtonEx(onClick: () -> Unit) {
//    FloatingActionButton(
//        onClick = { onClick() },
//    ) {
//        Icon(Icons.Filled.Add, "Floating action button.")
//    }
//}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccountInfo(Heading: String, SubTitle: String) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .size(width = 240.dp, height = 100.dp)
    ) {
        Text(
            text = Heading,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Left,


            )

        Text(
            text = SubTitle,
            modifier = Modifier.size(20.dp), //add color here
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Left,
        )
    }
}
//
//@Composable
//fun FloatingButton(onClick: () -> Unit) {
//    Column {
//        SmallFloatingActionButton(
//            onClick = { onClick() },
//            containerColor = MaterialTheme.colorScheme.secondaryContainer,
//            contentColor = MaterialTheme.colorScheme.secondary
//        ) {
//            Icon(Icons.Filled.Add, "Small floating action button.")
//        }
//    }
//}
//
@Composable
fun FloatingButton(onClick: () -> Unit) {
    Column {
        SmallFloatingActionButton(
            onClick = { onClick() },
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            contentColor = MaterialTheme.colorScheme.secondary,
            shape = CircleShape // Specify the shape explicitly
        ) {
            Icon(Icons.Filled.Add, "Small floating action button.")
        }
    }
}





@Composable
fun ScrollContent(innerPadding: PaddingValues) {
    val range = 1..100

    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = innerPadding,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(range.count()) { index ->
            Text(text = "- List item number ${index + 1}")
        }
    }
}


@Composable
fun Greeting2(name: String) {
    Column {
        Text("Alfred Sisley")
        Text("3 minutes ago")
    }
}


//lets have a header to say "My profile"
//""avatar to put a picture  on
//name and account level as inputs and cards
//accordian jetcompose
//bottom navigation plus button
@Composable
fun ExpandableList() {


    LazyColumn {

        item{
            ExpandableListItem("Personal Details ", Icons.Default.Person)
        }
        item{
            ExpandableListItem("My Card", Icons.Default.AddCircle)
        }

        item{   ExpandableListItem("My Orders", Icons.Default.FavoriteBorder)}
        item{     ExpandableListItem("Settings", Icons.Default.Settings)}
        item{  ExpandableListItem("FAQs", Icons.Default.Info)}
        item{   ExpandableListItem("Privacy Policy", Icons.Default.Add)}
        item{  ExpandableListItem("Terms and Conditions", Icons.Default.Done)}

    }
}

//@Composable
//fun ExpandableListItemView(item: ExpandableListItem) {
//    var expanded by remember { mutableStateOf(false) }
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .clickable { expanded = !expanded }
//            .padding(horizontal = 16.dp, vertical = 8.dp),
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Icon(
//            painter = vectorResource(id = item.icon),
//            contentDescription = item.title,
//            modifier = Modifier.size(24.dp)
//        )
//        Spacer(modifier = Modifier.width(16.dp))
//        Text(text = item.title)
//        Spacer(modifier = Modifier.weight(1f))
//        Icon(
//            imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
//            contentDescription = "Expand",
//            modifier = Modifier.size(24.dp)
//        )
//    }
//
//    if (expanded) {
//        // Add your expandable content here
//        Text(
//            text = "Expanded content for ${item.title}",
//            modifier = Modifier.padding(start = 40.dp) // Adjust indentation as needed
//        )
//    }
//}


@Composable
fun ExpandableListItemView(item: ExpandableListItem) {
//    var expanded by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
//            .clickable { expanded = !expanded }
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            item.iconName,
            contentDescription = item.title,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = item.title)
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            Icons.Default.KeyboardArrowUp,
            contentDescription = "Expand",
            modifier = Modifier.size(24.dp)
        )
    }


    }





data class ExpandableListItem(val title: String, val iconName: ImageVector)

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    AttendanceAssignmentTheme {

       // TopAppBar("My Profile")
//        FloatingButton(onClick: () -> Unit)
        Column(){

            AccountInfo(Heading = "Name", SubTitle = "Michonne" )
            AccountInfo(Heading = "Account Level", SubTitle = "10" )

        }

        Image(
            painter = painterResource(R.drawable.sample_avatar),
            contentDescription = "avatar",
            contentScale = ContentScale.Crop,            // crop the image if it's not a square
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)                       // clip to the circle shape
                .border(2.dp, Color.Gray, CircleShape)   // add a border (optional)
        )


        HorizontalDivider(thickness = 1.dp, color = Color.Gray)

        Column()
        {
            ExpandableList()
        }

        FloatingButton(
            onClick = {
                // Handle button click action here
                // For example, navigate to another screen
            }
        )



    }
}