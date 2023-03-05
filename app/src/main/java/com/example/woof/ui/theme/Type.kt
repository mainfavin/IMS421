/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.woof.R

val AbrilFatFace =
    FontFamily(
        Font(R.font.abril_fatface_regular)
    )
val Monserrat =
    FontFamily(
        Font(R.font.montserrat_bold, FontWeight.Bold),
        Font(R.font.montserrat_regular)
    )

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = AbrilFatFace,
        fontSize = 30.sp,
        fontWeight = FontWeight.Normal
    ),
    h2 = TextStyle(
        fontFamily = Monserrat,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    ),
    h3 = TextStyle(
        fontFamily = Monserrat,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    ),
    body1 = TextStyle(
        fontFamily = AbrilFatFace,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    )
)