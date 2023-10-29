package com.example.randomnamegenerator.generator.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class Baby(
    val year: Int,
    val gender: String,
    val ethnicity: String,
    val name: String,
    val count: Int ,
    val rank: Int
): Parcelable


//[
//{
//    "year": 2016,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Olivia",
//    "count": 172,
//    "rank": 1
//},
//{
//    "year": 2016,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Chloe",
//    "count": 112,
//    "rank": 2
//},
//{
//    "year": 2016,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Ava",
//    "count": 109,
//    "rank": 1
//},
//{
//    "year": 2016,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Madison",
//    "count": 104,
//    "rank": 2
//},
//{
//    "year": 2016,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "Isabella",
//    "count": 276,
//    "rank": 1
//},
//{
//    "year": 2016,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "Sophia",
//    "count": 261,
//    "rank": 2
//},
//{
//    "year": 2016,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Olivia",
//    "count": 230,
//    "rank": 1
//},
//{
//    "year": 2016,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Rachel",
//    "count": 221,
//    "rank": 2
//},
//{
//    "year": 2016,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Ethan",
//    "count": 193,
//    "rank": 1
//},
//{
//    "year": 2016,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Ryan",
//    "count": 160,
//    "rank": 2
//},
//{
//    "year": 2016,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Noah",
//    "count": 148,
//    "rank": 1
//},
//{
//    "year": 2016,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Aiden",
//    "count": 137,
//    "rank": 2
//},
//{
//    "year": 2016,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "Liam",
//    "count": 387,
//    "rank": 1
//},
//{
//    "year": 2016,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "Jacob",
//    "count": 351,
//    "rank": 2
//},
//{
//    "year": 2016,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Joseph",
//    "count": 261,
//    "rank": 1
//},
//{
//    "year": 2016,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Michael",
//    "count": 260,
//    "rank": 2
//},
//{
//    "year": 2015,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Olivia",
//    "count": 188,
//    "rank": 1
//},
//{
//    "year": 2015,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Chloe",
//    "count": 119,
//    "rank": 2
//},
//{
//    "year": 2015,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Madison",
//    "count": 128,
//    "rank": 1
//},
//{
//    "year": 2015,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Skylar",
//    "count": 91,
//    "rank": 2
//},
//{
//    "year": 2015,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "Isabella",
//    "count": 307,
//    "rank": 1
//},
//{
//    "year": 2015,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "Sophia",
//    "count": 269,
//    "rank": 2
//},
//{
//    "year": 2015,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Emma",
//    "count": 225,
//    "rank": 1
//},
//{
//    "year": 2015,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Olivia",
//    "count": 225,
//    "rank": 1
//},
//{
//    "year": 2015,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Leah",
//    "count": 220,
//    "rank": 2
//},
//{
//    "year": 2015,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Jayden",
//    "count": 190,
//    "rank": 1
//},
//{
//    "year": 2015,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Ethan",
//    "count": 172,
//    "rank": 2
//},
//{
//    "year": 2015,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Noah",
//    "count": 163,
//    "rank": 1
//},
//{
//    "year": 2015,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Liam",
//    "count": 129,
//    "rank": 2
//},
//{
//    "year": 2015,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "Liam",
//    "count": 356,
//    "rank": 1
//},
//{
//    "year": 2015,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "Dylan",
//    "count": 339,
//    "rank": 2
//},
//{
//    "year": 2015,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "David",
//    "count": 299,
//    "rank": 1
//},
//{
//    "year": 2015,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Joseph",
//    "count": 279,
//    "rank": 2
//},
//{
//    "year": 2014,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Olivia",
//    "count": 141,
//    "rank": 1
//},
//{
//    "year": 2014,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Chloe",
//    "count": 111,
//    "rank": 2
//},
//{
//    "year": 2014,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Sophia",
//    "count": 111,
//    "rank": 2
//},
//{
//    "year": 2014,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Madison",
//    "count": 130,
//    "rank": 1
//},
//{
//    "year": 2014,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Ava",
//    "count": 78,
//    "rank": 2
//},
//{
//    "year": 2014,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "Isabella",
//    "count": 331,
//    "rank": 1
//},
//{
//    "year": 2014,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "Sophia",
//    "count": 259,
//    "rank": 2
//},
//{
//    "year": 2014,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Olivia",
//    "count": 248,
//    "rank": 1
//},
//{
//    "year": 2014,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Esther",
//    "count": 233,
//    "rank": 2
//},
//{
//    "year": 2014,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Jayden",
//    "count": 187,
//    "rank": 1
//},
//{
//    "year": 2014,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Ethan",
//    "count": 179,
//    "rank": 2
//},
//{
//    "year": 2014,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Ethan",
//    "count": 138,
//    "rank": 1
//},
//{
//    "year": 2014,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Noah",
//    "count": 128,
//    "rank": 2
//},
//{
//    "year": 2014,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "Liam",
//    "count": 312,
//    "rank": 1
//},
//{
//    "year": 2014,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "Dylan",
//    "count": 292,
//    "rank": 2
//},
//{
//    "year": 2014,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "Jacob",
//    "count": 292,
//    "rank": 2
//},
//{
//    "year": 2014,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Joseph",
//    "count": 300,
//    "rank": 1
//},
//{
//    "year": 2014,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "David",
//    "count": 272,
//    "rank": 2
//},
//{
//    "year": 2013,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Sophia",
//    "count": 124,
//    "rank": 1
//},
//{
//    "year": 2013,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Chloe",
//    "count": 122,
//    "rank": 2
//},
//{
//    "year": 2013,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Madison",
//    "count": 134,
//    "rank": 1
//},
//{
//    "year": 2013,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "London",
//    "count": 76,
//    "rank": 2
//},
//{
//    "year": 2013,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "Isabella",
//    "count": 326,
//    "rank": 1
//},
//{
//    "year": 2013,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "Sophia",
//    "count": 291,
//    "rank": 2
//},
//{
//    "year": 2013,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Olivia",
//    "count": 233,
//    "rank": 1
//},
//{
//    "year": 2013,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Emma",
//    "count": 228,
//    "rank": 2
//},
//{
//    "year": 2013,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Jayden",
//    "count": 220,
//    "rank": 1
//},
//{
//    "year": 2013,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "Ethan",
//    "count": 165,
//    "rank": 2
//},
//{
//    "year": 2013,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Ethan",
//    "count": 146,
//    "rank": 1
//},
//{
//    "year": 2013,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "Jayden",
//    "count": 138,
//    "rank": 2
//},
//{
//    "year": 2013,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "Jayden",
//    "count": 352,
//    "rank": 1
//},
//{
//    "year": 2013,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "Jacob",
//    "count": 297,
//    "rank": 2
//},
//{
//    "year": 2013,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "David",
//    "count": 304,
//    "rank": 1
//},
//{
//    "year": 2013,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "Joseph",
//    "count": 283,
//    "rank": 2
//},
//{
//    "year": 2012,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACI",
//    "name": "CHLOE",
//    "count": 172,
//    "rank": 1
//},
//{
//    "year": 2012,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACI",
//    "name": "SOPHIA",
//    "count": 144,
//    "rank": 2
//},
//{
//    "year": 2012,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISP",
//    "name": "MADISON",
//    "count": 159,
//    "rank": 1
//},
//{
//    "year": 2012,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISP",
//    "name": "LONDON",
//    "count": 87,
//    "rank": 2
//},
//{
//    "year": 2012,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "ISABELLA",
//    "count": 327,
//    "rank": 1
//},
//{
//    "year": 2012,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "SOPHIA",
//    "count": 236,
//    "rank": 2
//},
//{
//    "year": 2012,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISP",
//    "name": "EMMA",
//    "count": 228,
//    "rank": 1
//},
//{
//    "year": 2012,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISP",
//    "name": "LEAH",
//    "count": 219,
//    "rank": 2
//},
//{
//    "year": 2012,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACI",
//    "name": "RYAN",
//    "count": 197,
//    "rank": 1
//},
//{
//    "year": 2012,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACI",
//    "name": "JAYDEN",
//    "count": 187,
//    "rank": 2
//},
//{
//    "year": 2012,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACI",
//    "name": "ETHAN",
//    "count": 187,
//    "rank": 2
//},
//{
//    "year": 2012,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISP",
//    "name": "JAYDEN",
//    "count": 171,
//    "rank": 1
//},
//{
//    "year": 2012,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISP",
//    "name": "AIDEN",
//    "count": 156,
//    "rank": 2
//},
//{
//    "year": 2012,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "JAYDEN",
//    "count": 364,
//    "rank": 1
//},
//{
//    "year": 2012,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "JACOB",
//    "count": 293,
//    "rank": 2
//},
//{
//    "year": 2012,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISP",
//    "name": "JOSEPH",
//    "count": 300,
//    "rank": 1
//},
//{
//    "year": 2012,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISP",
//    "name": "DAVID",
//    "count": 289,
//    "rank": 2
//},
//{
//    "year": 2011,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "SOPHIA",
//    "count": 119,
//    "rank": 1
//},
//{
//    "year": 2011,
//    "gender": "FEMALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "CHLOE",
//    "count": 106,
//    "rank": 2
//},
//{
//    "year": 2011,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "MADISON",
//    "count": 176,
//    "rank": 1
//},
//{
//    "year": 2011,
//    "gender": "FEMALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "LONDON",
//    "count": 92,
//    "rank": 2
//},
//{
//    "year": 2011,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "ISABELLA",
//    "count": 331,
//    "rank": 1
//},
//{
//    "year": 2011,
//    "gender": "FEMALE",
//    "ethnicity": "HISPANIC",
//    "name": "MIA",
//    "count": 229,
//    "rank": 2
//},
//{
//    "year": 2011,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "ESTHER",
//    "count": 224,
//    "rank": 1
//},
//{
//    "year": 2011,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "OLIVIA",
//    "count": 213,
//    "rank": 2
//},
//{
//    "year": 2011,
//    "gender": "FEMALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "EMMA",
//    "count": 213,
//    "rank": 2
//},
//{
//    "year": 2011,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "ETHAN",
//    "count": 177,
//    "rank": 1
//},
//{
//    "year": 2011,
//    "gender": "MALE",
//    "ethnicity": "ASIAN AND PACIFIC ISLANDER",
//    "name": "JAYDEN",
//    "count": 173,
//    "rank": 2
//},
//{
//    "year": 2011,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "JAYDEN",
//    "count": 184,
//    "rank": 1
//},
//{
//    "year": 2011,
//    "gender": "MALE",
//    "ethnicity": "BLACK NON HISPANIC",
//    "name": "AIDEN",
//    "count": 167,
//    "rank": 2
//},
//{
//    "year": 2011,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "JAYDEN",
//    "count": 426,
//    "rank": 1
//},
//{
//    "year": 2011,
//    "gender": "MALE",
//    "ethnicity": "HISPANIC",
//    "name": "JUSTIN",
//    "count": 310,
//    "rank": 2
//},
//{
//    "year": 2011,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "MICHAEL",
//    "count": 292,
//    "rank": 1
//},
//{
//    "year": 2011,
//    "gender": "MALE",
//    "ethnicity": "WHITE NON HISPANIC",
//    "name": "JOSEPH",
//    "count": 281,
//    "rank": 2
//}
//]