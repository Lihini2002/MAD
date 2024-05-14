package com.example.attendanceassignment.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.attendanceassignment.R
import com.example.attendanceassignment.ui.theme.ui.theme.AttendanceAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AttendanceAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        ShoeInfoPage()
                }
            }
        }
    }
}

//Get the top app bar composable to add the NIke store
//add an image vector of the show
//Title in one row
//Price and the ratings in one row with five favourites icons
//card with description
//

@Composable
fun Greeting3(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun FiveStarReview()
{

        Icon(
            Icons.Default.Star, // Use your star icon here
            contentDescription = "Star icon",
            tint = Color.Yellow, // Set star color
            modifier = Modifier.size(16.dp) // Set size of the star icon
        )
        Icon(
            Icons.Default.Star, // Use your star icon here
            contentDescription = "Star icon",
            tint = Color.Yellow, // Set star color
            modifier = Modifier.size(16.dp) // Set size of the star icon
        )
        Icon(
            Icons.Default.Star, // Use your star icon here
            contentDescription = "Star icon",
            tint = Color.Yellow, // Set star color
            modifier = Modifier.size(16.dp) // Set size of the star icon
        )
        Icon(
            Icons.Default.Star, // Use your star icon here
            contentDescription = "Star icon",
            tint = Color.Yellow, // Set star color
            modifier = Modifier.size(16.dp) // Set size of the star icon
        )
        Icon(
            Icons.Default.Star, // Use your star icon here
            contentDescription = "Star icon",
            tint = Color.Yellow, // Set star color
            modifier = Modifier.size(16.dp) // Set size of the star icon
        )
    }




@Preview(showBackground = true)
@Composable
fun ShoeInfoPreview(){
    ShoeInfoPage()
}


@Composable
fun ShoeInfoPage() {
    AttendanceAssignmentTheme {
        TopAppBar(title = {
            Text(text = "Your Title")
        })
        Column(
            Modifier
                .padding(8.dp)


        ) {
            Image(
                painter = painterResource(id = R.drawable.shoes),
                contentDescription = "Nike Shoes",
                modifier = Modifier
                    .aspectRatio(0.4f / 0.3f) // Aspect ratio 80:30
                    .weight(1f)
                    .padding(horizontal = 20.dp) // Optional padding
                    .padding(vertical = 8.dp) // Optional padding
            )

            Text(
                text="Nike Air Max (Pink)",
                modifier = Modifier.size(20.dp), //add color here
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Left
                )

            Row()
            {
                Text(
                    text="$1200",
                    textAlign = TextAlign.Left,
                    color = Color.Blue,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.size(20.dp),
                )

                Row(
                    horizontalArrangement = Arrangement.End
                ){
                    FiveStarReview()
                }



            }




            //Description section
            Text(
                text= "Description",
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.size(16.dp)

            )

            Text(
                text="Nike Air Max is a sneakers from the Nike Collection, it has various colors from various sizes that is affordable in all form. Check out for the Original Nike because there are lot of Fake product out there and they seem to pose like Nike but they absolutly not Nike. Always wash with designated washing materials and wash with clean water" ,
                textAlign = TextAlign.Start,
                modifier = Modifier.size(16.dp),
                color = Color.Black


                )

            //Reviews Column
            Row(){

                Text(
                    text= "Reviews",
                    color = Color.Black,
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.size(16.dp)

                )

                Text(
                    text= "See All",
                    color = Color.Gray,
                    textAlign = TextAlign.Right,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.size(15.dp)

                )



            }

            Row(){

                Column() {
                    Text(
                        text= "Sabinus",
                        color = Color.Black,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.ExtraLight,
                        modifier = Modifier.size(16.dp)

                    )

                    Row(
                     horizontalArrangement = Arrangement.Start
                    ){
                        FiveStarReview()
                    }




                }


                Text(
                    text= "2 weeks ago",
                    color = Color.Gray,
                    textAlign = TextAlign.Right,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.size(12.dp)

                )

            }

            //Sabinus's Review Description section
            Text(
                text="The sneakers is really very good and i love the color, i\n" +
                        "will be buying another one very soon for my brother\n" +
                        "and also my sister, i recomend this sneaker to\n" +
                        "anybody. it's great"

                       ,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .size(16.dp)
                    .padding(8.dp),
                color = Color.Black ,
                fontWeight = FontWeight.Normal,


            )








        }











    }
}