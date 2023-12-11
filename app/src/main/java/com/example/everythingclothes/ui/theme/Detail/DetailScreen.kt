package com.example.everythingclothes.ui.theme.Detail

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.everythingclothes.R
import com.example.everythingclothes.navigation.DETAIL_URL
import com.example.everythingclothes.ui.theme.EverythingClothesTheme

@Composable
fun Details(navController: NavController) {
    var context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Card(modifier = Modifier.weight(1f)) {
            Column(
                modifier = Modifier
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
                        .height(150.dp)
                        .width(200.dp)
                )
                Text(text = price)

            }

        }
        Spacer(modifier = Modifier.width(8.dp))

        Card(modifier = Modifier.weight(1f)) {
            Column(
                modifier = Modifier
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
                Text(text = price)


                Button(onClick = {
                    val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "0700163630" +
                            "saf 0718882685"))
                    if (ContextCompat.checkSelfPermission(
                            context,
                            android.Manifest.permission.CALL_PHONE
                        ) != PackageManager.PERMISSION_GRANTED
                    ) {
                        ActivityCompat.requestPermissions(
                            context as Activity,
                            arrayOf<String>(android.Manifest.permission.CALL_PHONE),
                            1
                        )
                    } else {
                        context.startActivity(intent)
                    }
                }) {
                    Text(text = "contact")
                }
                Button(onClick = { Toast.makeText(context, "Successfully added to cart", Toast.LENGTH_SHORT).show() }) {
                    Text(text = " Add to Cart")

                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DetailPreview() {
    EverythingClothesTheme {
        Details(navController = rememberNavController())
    }
}
