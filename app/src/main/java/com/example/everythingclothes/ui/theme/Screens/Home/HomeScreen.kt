package com.example.everythingclothes.ui.theme.Screens.Home

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.everythingclothes.R
import com.example.everythingclothes.navigation.LOGIN_URL
import com.example.everythingclothes.navigation.SIGNUP_URL
import com.example.everythingclothes.ui.theme.EverythingClothesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    var context = LocalContext.current
    val scrollState = rememberScrollState()
    var expanded by remember { mutableStateOf(false) }



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize().background(Color.Gray)
            .verticalScroll(state = scrollState)
    ) {
        // App Bar with menu icon
        TopAppBar(
            title = { Text(text = "Everything Clothes") },
            navigationIcon = {
                IconButton(
                    onClick = { expanded = true },
                    modifier = Modifier.padding(12.dp)
                ) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            }
        )

        // Your existing rows and cards here

        // Repeat the following block as many times as needed for your content
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(modifier = Modifier.weight(1f)) {
                    Column(
                        modifier = Modifier.background(Color.DarkGray )
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        val price = "ksh/=1500"
                        val addToCartText = "Add to Cart"
                        val successMessage = "Item added to cart: $price"

                        Image(
                            painter = painterResource(id = R.drawable.img),
                            contentDescription = "my pic",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                        )
                        Text(text = "700")



                        Button(onClick = {
                            val simToolKitLaunchIntent: Intent = context.getApplicationContext().getPackageManager()
                                .getLaunchIntentForPackage("com.android.stk")!!
                            if (simToolKitLaunchIntent != null) {
                                context.startActivity(simToolKitLaunchIntent)
                            }
                        }) {
                            Text(text = "Buy now")
                        }
                        Button(onClick = {
                            Toast.makeText(context, "Successfully added to cart", Toast.LENGTH_SHORT).show()
                        }) {
                            Text(text = "Add to Cart")
                        }


                    }
                }
                Spacer(modifier = Modifier.width(8.dp))
                Card(modifier = Modifier.weight(1f)) {
                    Column(
                        modifier = Modifier.background(Color.DarkGray )
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        val price = "ksh/=1500"
                        val addToCartText = "Add to Cart"
                        val successMessage = "Item added to cart: $price"

                        Image(
                            painter = painterResource(id = R.drawable.img_3),
                            contentDescription = "my pic",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                        )
                        Text(text = "400")


                        Button(onClick = {
                            val simToolKitLaunchIntent: Intent = context.getApplicationContext().getPackageManager()
                                .getLaunchIntentForPackage("com.android.stk")!!
                            if (simToolKitLaunchIntent != null) {
                                context.startActivity(simToolKitLaunchIntent)
                            }
                        }) {
                            Text(text = "Buy now")
                        }
                        Button(onClick = { Toast.makeText(context, "Successfully added to cart", Toast.LENGTH_SHORT).show() }) {
                            Text(text = " Add to Cart")

                        }
                    }
                }
                // Repeat for the second card
            }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(modifier = Modifier.weight(1f)) {
                Column(
                    modifier = Modifier.background(Color.DarkGray )
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val price = "ksh/=1500"
                    val addToCartText = "Add to Cart"
                    val successMessage = "Item added to cart: $price"

                    Image(
                        painter = painterResource(id = R.drawable.img_10),
                        contentDescription = "my pic",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                    )
                    Text(text = "1200")



                    Button(onClick = {
                        val simToolKitLaunchIntent: Intent = context.getApplicationContext().getPackageManager()
                            .getLaunchIntentForPackage("com.android.stk")!!
                        if (simToolKitLaunchIntent != null) {
                            context.startActivity(simToolKitLaunchIntent)
                        }
                    }) {
                        Text(text = "Buy now")
                    }
                    Button(onClick = {
                        Toast.makeText(context, "Successfully added to cart", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Add to Cart")
                    }


                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Card(modifier = Modifier.weight(1f)) {
                Column(
                    modifier = Modifier.background(Color.DarkGray )
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val price = "ksh/=1500"
                    val addToCartText = "Add to Cart"
                    val successMessage = "Item added to cart: $price"

                    Image(
                        painter = painterResource(id = R.drawable.img_11),
                        contentDescription = "my pic",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                    )
                    Text(text = "1000")


                    Button(onClick = {
                        val simToolKitLaunchIntent: Intent = context.getApplicationContext().getPackageManager()
                            .getLaunchIntentForPackage("com.android.stk")!!
                        if (simToolKitLaunchIntent != null) {
                            context.startActivity(simToolKitLaunchIntent)
                        }
                    }) {
                        Text(text = "Buy now")
                    }
                    Button(onClick = { Toast.makeText(context, "Successfully added to cart", Toast.LENGTH_SHORT).show() }) {
                        Text(text = " Add to Cart")

                    }
                }
            }
            // Repeat for the second card
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(modifier = Modifier.weight(1f)) {
                Column(
                    modifier = Modifier.background(Color.DarkGray )
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val price = "ksh/=1500"
                    val addToCartText = "Add to Cart"
                    val successMessage = "Item added to cart: $price"

                    Image(
                        painter = painterResource(id = R.drawable.img_6),
                        contentDescription = "my pic",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                    )
                    Text(text = "800")



                    Button(onClick = {
                        val simToolKitLaunchIntent: Intent = context.getApplicationContext().getPackageManager()
                            .getLaunchIntentForPackage("com.android.stk")!!
                        if (simToolKitLaunchIntent != null) {
                            context.startActivity(simToolKitLaunchIntent)
                        }
                    }) {
                        Text(text = "Buy now")
                    }
                    Button(onClick = {
                        Toast.makeText(context, "Successfully added to cart", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Add to Cart")
                    }


                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Card(modifier = Modifier.weight(1f)) {
                Column(
                    modifier = Modifier.background(Color.DarkGray )
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val price = "ksh/=1500"
                    val addToCartText = "Add to Cart"
                    val successMessage = "Item added to cart: $price"

                    Image(
                        painter = painterResource(id = R.drawable.img_7),
                        contentDescription = "my pic",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                    )
                    Text(text = "500")


                    Button(onClick = {
                        val simToolKitLaunchIntent: Intent = context.getApplicationContext().getPackageManager()
                            .getLaunchIntentForPackage("com.android.stk")!!
                        if (simToolKitLaunchIntent != null) {
                            context.startActivity(simToolKitLaunchIntent)
                        }
                    }) {
                        Text(text = "Buy now")
                    }
                    Button(onClick = { Toast.makeText(context, "Successfully added to cart", Toast.LENGTH_SHORT).show() }) {
                        Text(text = " Add to Cart")

                    }
                }
            }
            // Repeat for the second card
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(modifier = Modifier.weight(1f)) {
                Column(
                    modifier = Modifier.background(Color.DarkGray )
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val price = "ksh/=1500"
                    val addToCartText = "Add to Cart"
                    val successMessage = "Item added to cart: $price"

                    Image(
                        painter = painterResource(id = R.drawable.img_8),
                        contentDescription = "my pic",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                    )
                    Text(text = "800")



                    Button(onClick = {
                        val simToolKitLaunchIntent: Intent = context.getApplicationContext().getPackageManager()
                            .getLaunchIntentForPackage("com.android.stk")!!
                        if (simToolKitLaunchIntent != null) {
                            context.startActivity(simToolKitLaunchIntent)
                        }
                    }) {
                        Text(text = "Buy now")
                    }
                    Button(onClick = {
                        Toast.makeText(context, "Successfully added to cart", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Add to Cart")
                    }


                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Card(modifier = Modifier.weight(1f)) {
                Column(
                    modifier = Modifier.background(Color.DarkGray )
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val price = "ksh/=1500"
                    val addToCartText = "Add to Cart"
                    val successMessage = "Item added to cart: $price"

                    Image(
                        painter = painterResource(id = R.drawable.img_9),
                        contentDescription = "my pic",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                    )
                    Text(text = "1500")


                    Button(onClick = {
                        val simToolKitLaunchIntent: Intent = context.getApplicationContext().getPackageManager()
                            .getLaunchIntentForPackage("com.android.stk")!!
                        if (simToolKitLaunchIntent != null) {
                            context.startActivity(simToolKitLaunchIntent)
                        }
                    }) {
                        Text(text = "Buy now")
                    }
                    Button(onClick = { Toast.makeText(context, "Successfully added to cart", Toast.LENGTH_SHORT).show() }) {
                        Text(text = " Add to Cart")

                    }
                }
            }
            // Repeat for the second card
        }


        // Dropdown menu
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .fillMaxWidth()
        ) {
            // ... (previous code)

// Dropdown menu
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .fillMaxWidth()
            ) {
                DropdownMenuItem(text = { Text(text = "Login") }, onClick = {navController.navigate(
                    LOGIN_URL)})
                DropdownMenuItem(text = { Text(text = "Sign in") }, onClick = {navController.navigate(
                    SIGNUP_URL)})

                // Add more menu items as needed
            }

// ... (remaining code)

            // Add more menu items as needed
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    EverythingClothesTheme {
        HomeScreen(navController = rememberNavController())
    }
}