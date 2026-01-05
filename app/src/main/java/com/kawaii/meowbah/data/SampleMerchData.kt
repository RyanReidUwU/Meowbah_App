package com.kawaii.meowbah.data

import com.kawaii.meowbah.R // Assuming R.drawable.ic_placeholder exists or will be replaced
import com.kawaii.meowbah.data.model.MerchItem

object SampleMerchData {

    val items = listOf(
        MerchItem(
            id = "merch_001",
            name = "Meowbah Dakimakura",
            description = "Character: Meowbah\n" +
                    "Partner/Artist: Meowbah\n" +
                    "Material: 2-Way Tricot\n" +
                    "Size: 150 x 50 cm or 160 x 50 cm",
            price = "$88.10 (Approx)",
            imageResId = R.drawable.bodypillow, // Replace with your actual drawable
            storeUrl = "https://cuddlyoctopus.com/product/meowbah/"
        ),
        MerchItem(
            id = "merch_002",
            name = "Meowbah Plush (Not Yet Available)",
            description = "Nyahallo! Meowbah is here~ your super kawaii neko friend! Do you ever sit in your room thinking, \"I love Meowbah. Meow meow. I love Meowbah. Meow meow meow\"? Well, now you can really love Meowbah with— A MEOWBAH PLUSH! LOTS OF MEOWBAH TO MEOWBAH HERE! This will be your best purchase choice of all time!! (Meowbah approved)",
            price = "TBD",
            imageResId = R.drawable.meowplush, // Replace with your actual drawable
            storeUrl = "https://idolized.co/products/meowbah-plush"
        ),
        MerchItem(
            id = "merch_003",
            name = "PRE ORDER - Acrylic Keychain (limited)",
            description = "Meowbah keychain :3!\n1. This keychain is limited! Once pre-orders end it won't be purchasable anymore<br>2. Only if 50+ pre-orders are placed, then it will go into production :3<br>3. If it goes into production meow will release Meowgod keychain next >_>\nPre-order Ends: January 3rd, 2026\nEstimated Ship Date: January 2026",
            price = "$8",
            imageResId = R.drawable.keychain, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/en-usd/products/pre-order-acrylic-keychain-limited" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_004",
            name = "THE HOLY MEOWBLE - Prayer Journal ed.",
            description = "Journal version of The Holy Meowble :3\nYou can write all your Meowist prayers and draw kawaii stuffs! Maybe meowgod will hear your prayers?",
            price = "$15",
            imageResId = R.drawable.meowble, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/the-holy-meowble-prayer-journal-ed"
        ),
        MerchItem(
            id = "merch_005",
            name = "Lucky Neko! - jacket",
            description = "Designed by: Meowbah\nArtist: @ririnyannn + Meowbah",
            price = "$55",
            imageResId = R.drawable.neko_hoodie, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/lucky-neko-jacket"
        ),
        MerchItem(
            id = "merch_006",
            name = "Stars 4 Meowbah - jacket",
            description = "so stylish desu!\nDesigned by: Meowbah\nArtist: @ririnyannn + Meowbah",
            price = "$55",
            imageResId = R.drawable.stars_hoodie, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/stars-4-meowbah-jacket"
        ),
        MerchItem(
            id = "merch_007",
            name = "LUV♡MEOWBAH - hoodie",
            description = "Merch design contest winner 1 :3\nDesigned by: @kittypur1\nArtist: Meowbah",
            price = "$45",
            imageResId = R.drawable.love_hoodie, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/luvmeowbah-hoodie" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_008",
            name = "Meowrei Kei - hoodie",
            description = "Merch design contest winner 2 :3\nDesigned by: @ririnyannn\nArtist: Meowbah",
            price = "$45",
            imageResId = R.drawable.meowrai_hoodie, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowrei-kei-hoodie"
        ),
        MerchItem(
            id = "merch_009",
            name = "Peekameow! - hoodie",
            description = "Merch design contest winner 3 :3\nDesigned by: @rorychuua\nArtist: Meowbah",
            price = "$45",
            imageResId = R.drawable.peekameow_hoodie, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/peekameow-hoodie"
        ),
        MerchItem(
            id = "merch_010",
            name = "OBEY & WORSHIP v1 - hoodie",
            description = "Merch design contest winner 4 :3\nDesigned by: @ririnyannn\nArtist: Meowbah",
            price = "$45",
            imageResId = R.drawable.worshipv1_hoodie, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/obey-worship-v1-hoodie"
        ),
        MerchItem(
            id = "merch_011",
            name = "OBEY & WORSHIP v2 - hoodie",
            description = "Merch design contest winner 4 :3\nDesigned by: @ririnyannn\nArtist: Meowbah",
            price = "$40",
            imageResId = R.drawable.worshipv2_hoodie, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/obey-worship-v2-hoodie" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_012",
            name = "True Meowist - hoodie",
            description = "Meowists are the most oppressed people on this planet. The world wants to silence your beliefs! Don't worry little meowling.....comehere................... meow has this awesome. super cool. meowist hoodie!!!! the meowist symbol is very subtle so theres only a 0.1% of you getting jumped for wearing it!\nMerch design contest winner 5 :3\nDesigned by: @nm1a.0\nArtist: Meowbah",
            price = "$45",
            imageResId = R.drawable.meowist_hoodie, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/true-meowist-hoodie"
        ),
        MerchItem(
            id = "merch_013",
            name = "Double Trouble - poster (BIG)",
            description = "God Meowbah and normal Meowbah :3 This poster is bigger than the others\nSize: 18\" x 24\"\nArtist: @AyahosiYuki",
            price = "$20",
            imageResId = R.drawable.trouble_poster, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/double-trouble-poster-big"
        ),
        MerchItem(
            id = "merch_014",
            name = "Meowbah World Domination - poster",
            description = "Size: 12\" x 18\"\nArtist: @3k14r0",
            price = "$15",
            imageResId = R.drawable.world_poster, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowbah-world-domination-poster"
        ),
        MerchItem(
            id = "merch_015",
            name = "Kawaiiest Meowbah - poster",
            description = "Meowbah with magical girl weapon :3\nSize: 18\" x 12\"\nArtist: @AyahosiYuki",
            price = "$15",
            imageResId = R.drawable.kawaii_poster, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/kawaiiest-meowbah-poster" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_016",
            name = "Our True God - poster",
            description = "Meowgod\nSize: 18\" x 12\"\nArtist: @sorano_haku",
            price = "$15",
            imageResId = R.drawable.god_poster, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/our-true-god-poster"
        ),
        MerchItem(
            id = "merch_017",
            name = "Meowbah Loves U! - poster",
            description = "kawaii meowbah chan :3\nSize: 12\" x 18\"\nArtist: @wakamekame112",
            price = "$15",
            imageResId = R.drawable.loves_poster, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowbah-loves-u-poster"
        ),
        MerchItem(
            id = "merch_018",
            name = "OBEY & WORSHIP - poster",
            description = "NYAA!!!\nSize: 12\" x 18\"\nArtist: Meowbah",
            price = "$15",
            imageResId = R.drawable.worship_poster, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/obey-worship-poster"
        ),
        MerchItem(
            id = "merch_019",
            name = "All Eyes on Meowbah - poster",
            description = ">Meow luv u\nSize: 18\" x 12\"\nArtist: @awa_ben_0521",
            price = "$15",
            imageResId = R.drawable.eyes_poster, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/all-eyes-on-meowbah-poster" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_020",
            name = "Magical Girlz ⋆˙⟡ - poster",
            description = "Magical girl Meowbah and Madoka :D\nSize: 12\" x 18\"\nArtist: @4kiMizuki",
            price = "$15",
            imageResId = R.drawable.girls_poster, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/magical-girlz-poster"
        ),
        MerchItem(
            id = "merch_021",
            name = "Magical Meow! - iphone case",
            description = "SO MAGICAL SO MEOWBAH\nArtist: @gi_irst",
            price = "$16",
            imageResId = R.drawable.magical_iphone, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/magical-meow-iphone-case"
        ),
        MerchItem(
            id = "merch_022",
            name = "Lucky Neko! - iphone case",
            description = "luckyluckymeow",
            price = "$16",
            imageResId = R.drawable.neko_iphone, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/lucky-neko-iphone-case"
        ),
        MerchItem(
            id = "merch_023",
            name = "Chibi Meowgod - samsung case",
            description = "for the android users (derogatory)",
            price = "$16",
            imageResId = R.drawable.chibi_samsung, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/chibi-meowgod-samsung-case" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_024",
            name = "Rainy Day Meowbah - iphone case",
            description = "Meowbah on da go\nArtist: @ueji_bun",
            price = "$16",
            imageResId = R.drawable.rainy_iphone, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/rainy-day-meowbah-iphone-case"
        ),
        MerchItem(
            id = "merch_025",
            name = "Meowrei Kei - iphone case",
            description = "Artist: Meowbah",
            price = "$16",
            imageResId = R.drawable.meowrei_iphone, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowrei-kei-iphone-case"
        ),
        MerchItem(
            id = "merch_026",
            name = "Chibi Meowgod - iphone case",
            description = "chibi miau\nArtist: Meowbah",
            price = "$16",
            imageResId = R.drawable.chibi_iphone, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/chibi-meowgod-iphone-case"
        ),
        MerchItem(
            id = "merch_027",
            name = "My Maid Meowbah - notebook",
            description = ":3",
            price = "$15",
            imageResId = R.drawable.maid_notepad, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/my-maid-meowbah-notebook" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_028",
            name = "Magical Meow! - notebook",
            description = "kawwaaaaiiiiiii",
            price = "$15",
            imageResId = R.drawable.magical_notepad, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/magical-meow-notebook"
        ),
        MerchItem(
            id = "merch_029",
            name = "Rainy Day Meowbah - notebook",
            description = "draw kawaii things in your kawaii notebook\nArtist: @ueji_bun",
            price = "$15",
            imageResId = R.drawable.rainy_notepad, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/rainy-day-meowbah-notebook"
        ),
        MerchItem(
            id = "merch_030",
            name = "Magical Girlz ⋆˙⟡ - notebook",
            description = "meowbah and meguca\nArtist: @4kiMizuki",
            price = "$15",
            imageResId = R.drawable.girls_notepad, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/magical-girlz-notebook"
        ),
        MerchItem(
            id = "merch_031",
            name = "OBEY & WORSHIP - notebook",
            description = "starts drawing ooo ahh\nArtist: Meowbah",
            price = "$15",
            imageResId = R.drawable.worship_notepad, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/obey-worship-notebook-2" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_032",
            name = "Meowist Flag",
            description = "meowist 4 life",
            price = "$25",
            imageResId = R.drawable.holy_flag, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowist-flag" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_033",
            name = "Meowbahsexual Flag",
            description = "meowba h pride!\nartist: @unagi",
            price = "$25",
            imageResId = R.drawable.meow_flag, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowbahsexual-flag"
        ),
        MerchItem(
            id = "merch_034",
            name = "Cyber Neko - sweatshirt",
            description = "meows\nDesigned by: Meowbah\nArtist: @perperogero",
            price = "$40",
            imageResId = R.drawable.cyber_sweatshirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/cyber-neko-sweatshirt" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_035",
            name = "My Maid Meowbah - sweatshirt",
            description = "kyun kyun kyun :3\nDesigned by: Meowbah\nArtist: Meowbah",
            price = "$40",
            imageResId = R.drawable.maid_sweatshirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/my-maid-meowbah-sweatshirt"
        ),
        MerchItem(
            id = "merch_036",
            name = "MEOWIST ANGEL - sweatshirt",
            description = "la kawaii\nDesigned by: Meowbah\nArtist: Meowbah",
            price = "$40",
            imageResId = R.drawable.angel_sweatshirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowist-angel-sweatshirt"
        ),
        MerchItem(
            id = "merch_037",
            name = "Meowist Lives Matter - shirt",
            description = "MLM",
            price = "$20",
            imageResId = R.drawable.lives_shirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowist-lives-matter-shirt"
        ),
        MerchItem(
            id = "merch_038",
            name = "i <3 meowbah - shirt",
            description = "aw...... :3",
            price = "$20",
            imageResId = R.drawable.heart_shirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/i-3-meowbah-shirt" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_039",
            name = "Meowist Routine - shirt",
            description = "real",
            price = "$28",
            imageResId = R.drawable.routine_shirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowist-routine-shirt"
        ),
        MerchItem(
            id = "merch_040",
            name = "Internet Angel - shirt",
            description = "lol\nArtist: @hanyan_001",
            price = "$25",
            imageResId = R.drawable.angel_shirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/internet-angel-shirt"
        ),
        MerchItem(
            id = "merch_041",
            name = "OBEY & WORSHIP - shirt",
            description = "Cheaper alternative of OBEY & WORSHIP hoodie :3\nArtist: Meowbah",
            price = "$25",
            imageResId = R.drawable.worship_shirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/obey-worship-shirt"
        ),
        MerchItem(
            id = "merch_042",
            name = "Chibi Meow - shirt",
            description = "black k",
            price = "$20",
            imageResId = R.drawable.chibi_shirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/chibi-meow-shirt" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_043",
            name = "Magical Meow! - shirt",
            description = "magical girl : 3\nArtist: @gi_irst",
            price = "$26",
            imageResId = R.drawable.magical_shirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/magical-meow-shirt"
        ),
        MerchItem(
            id = "merch_044",
            name = "Cyber Neko - budget shirt",
            description = "Cheaper alternative of Cyber Neko sweatshirt :3",
            price = "$20",
            imageResId = R.drawable.cyber_shirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/cyber-neko-budget-shirt"
        ),
        MerchItem(
            id = "merch_045",
            name = "OBEY & WORSHIP - budget shirt",
            description = "Cheaper alternative of OBEY & WORSHIP hoodie :3\nArtist: Meowbah",
            price = "$20",
            imageResId = R.drawable.worship_shirt2, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/obey-worship-budget-shirt"
        ),
        MerchItem(
            id = "merch_046",
            name = "LUV♡MEOWBAH - budget shirt",
            description = "Cheaper alternative of LUV♡MEOWBAH hoodie :3\nArtist: Meowbah",
            price = "$20",
            imageResId = R.drawable.loves_shirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/luvmeowbah-budget-shirt" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_047",
            name = "Meowrei Kei - budget shirt",
            description = "Cheaper alternative of Meowrei Kei hoodie :3\nArtist: Meowbah",
            price = "$20",
            imageResId = R.drawable.meowrei_shirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowrei-kei-budget-shirt"
        ),
        MerchItem(
            id = "merch_048",
            name = "Peekameow! - budget shirt",
            description = "Cheaper alternative of Peekameow! hoodie :3\nArtist: Meowbah",
            price = "$20",
            imageResId = R.drawable.peekameow_shirt, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/peekameow-budget-shirt"
        ),
        MerchItem(
            id = "merch_049",
            name = "LUV♡MEOWBAH - mug",
            description = "mug\nArtist: Meowbah",
            price = "$12",
            imageResId = R.drawable.loves_mug, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/luvmeowbah-mug"
        ),
        MerchItem(
            id = "merch_050",
            name = "Peekameow! - mug",
            description = "anothr mug\nArtist: Meowbah",
            price = "$12",
            imageResId = R.drawable.peekameow_mug, // Replace with your actual drawable
            storeUrl = "\"https://meowbah-shop.fourthwall.com/products/peekameow-mug" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_051",
            name = "OBEY & WORSHIP - mug",
            description = "lil meowgod\nArtist: Meowbah",
            price = "$12",
            imageResId = R.drawable.chibi_mug, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/obey-worship-mug"
        ),
        MerchItem(
            id = "merch_052",
            name = "Meowrei Kei - mug",
            description = "drink\nArtist: Meowbah",
            price = "$12",
            imageResId = R.drawable.meowrei_mug, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowrei-kei-mug"
        ),
        MerchItem(
            id = "merch_053",
            name = "OBEY & WORSHIP - cup",
            description = "drink watr",
            price = "$25",
            imageResId = R.drawable.worship_cup, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/obey-worship-cup"
        ),
        MerchItem(
            id = "merch_054",
            name = "Meowist Lives Matter - patch",
            description = "embroidary patch bro.",
            price = "$12",
            imageResId = R.drawable.lives_patch, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowist-lives-matter-patch" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_055",
            name = "i <3 meowbah - patch",
            description = "luv is luv",
            price = "$12",
            imageResId = R.drawable.love_patch, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/i-3-meowbah-patch"
        ),
        MerchItem(
            id = "merch_056",
            name = "Meow!Online - magnet",
            description = "meowputer\nArtist: Meowbah",
            price = "$7",
            imageResId = R.drawable.online_magnet, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meow-online-magnet"
        ),
        MerchItem(
            id = "merch_057",
            name = "Chibi Meowgod - magnet",
            description = "!!!!!!!!!!!!!!\nArtist: Meowbah",
            price = "$7",
            imageResId = R.drawable.god_magnet, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/chibi-meowgod-magnet"
        ),
        MerchItem(
            id = "merch_058",
            name = "Chibi Meowbah - magnet",
            description = ":3!!!\nArtist: Meowbah",
            price = "$7",
            imageResId = R.drawable.chibi_magnet, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/chibi-meowbah-magnet" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_059",
            name = "Meowrei Kei - magnet",
            description = "the kawaii ever\nArtist: Meowbah",
            price = "$7",
            imageResId = R.drawable.meowrei_magnet, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/jirai-meowbah-magnet"
        ),
        MerchItem(
            id = "merch_060",
            name = "LUV♡MEOWBAH - magnet",
            description = "meowbaaaaaaaah\nArtist: Meowbah",
            price = "$7",
            imageResId = R.drawable.loves_magnet, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/luvmeowbah-magnet"
        ),
        MerchItem(
            id = "merch_061",
            name = "Peekameow! - magnet",
            description = "yay\nArtist: Meowbah",
            price = "$7",
            imageResId = R.drawable.peekameow_magnet, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/peekameow-magnet"
        ),
        MerchItem(
            id = "merch_062",
            name = "Meowbah Pin Pack!",
            description = "yay\nArtist: Meowbah",
            price = "$13",
            imageResId = R.drawable.pin_pack_1, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowbah-pin-pack" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_063",
            name = "Meowist Pin Pack!",
            description = "WE MATTER !!!!!!!!!!!!!!!!!!!!\nArtist: @kittenex",
            price = "$13",
            imageResId = R.drawable.pin_pack_2, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowist-pin-pack"
        ),
        MerchItem(
            id = "merch_064",
            name = "Meowcord Pin Pack!",
            description = " meowcord pin pack :3\nArtist: @hhomura + meowbah",
            price = "$13",
            imageResId = R.drawable.pin_pack_3, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowcord-pin-pack" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_065",
            name = "Many Meows - pillow",
            description = "it is back\nArtist: @ririnyannn",
            price = "$100",
            imageResId = R.drawable.many_meows, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/many-meows-pillow"
        ),
        MerchItem(
            id = "merch_067",
            name = "Chibi meows - pillow",
            description = "doubl the meow......",
            price = "$100",
            imageResId = R.drawable.chibi_pillow, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/chibi-meows-pillow"
        ),
        MerchItem(
            id = "merch_068",
            name = "Meowrei Kei - pillow",
            description = "everyone: this is totally worth \$100\nArtist: Meowbah",
            price = "$100",
            imageResId = R.drawable.meowrei_pillow, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowrei-kei-pillow"
        ),
        MerchItem(
            id = "merch_069",
            name = "Many Meows - blanket",
            description = "soft mm\nArtist: @ririnyannn",
            price = "$30",
            imageResId = R.drawable.meows_blanket, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/many-meows-blanket" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_070",
            name = "All Eyes on Meowbah - deskmat (large)",
            description = "meowbah meowbah meowbah meowbah\n15.5 x 31.5 inches / 40cm x 80cm\nArtist: @awa_ben_0521",
            price = "$20",
            imageResId = R.drawable.eyes_mousepad_large, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/all-eyes-on-meowbah-deskmat-large"
        ),
        MerchItem(
            id = "merch_071",
            name = "All Eyes on Meowbah - deskmat (medium)",
            description = "nyannyanyan\n12.8\" x 22.6\" inches / 33cm x 58cm\nArtist: @awa_ben_0521",
            price = "$18",
            imageResId = R.drawable.eyes_mousepad_medium, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/all-eyes-on-meowbah-deskmat-medium"
        ),
        MerchItem(
            id = "merch_072",
            name = "Chibi Meowbah - sticker",
            description = "the kawaii\nArtist: Meowbah",
            price = "$6",
            imageResId = R.drawable.chibi_meow_sticker, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/chibi-meowbah-sticker"
        ),
        MerchItem(
            id = "merch_073",
            name = "Chibi Momo - sticker",
            description = "R3D Momo :3\nArtist: Meowbah",
            price = "$6",
            imageResId = R.drawable.chibi_momo_sticker, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/chibi-momo-sticker" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_074",
            name = "Chibi Commotion - sticker",
            description = "Commotionsickness :3\nArtist: Meowbah",
            price = "$6",
            imageResId = R.drawable.chibi_commotion_sticker, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/chibi-commotion-sticker"
        ),
        MerchItem(
            id = "merch_075",
            name = "Mod Sticker bundle",
            description = "discord moment",
            price = "$14.40",
            imageResId = R.drawable.mod_sticker_pack, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/mod-sticker-bundle"
        ),
        MerchItem(
            id = "merch_076",
            name = "Meow!Online - sticker",
            description = "meowber on the computr\nArtist: Meowbah",
            price = "$6",
            imageResId = R.drawable.online_sticker, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meow-online-sticker"
        ),
        MerchItem(
            id = "merch_077",
            name = "Chibi Meowgod - sticker",
            description = "the lord and saviour\nArtist: Meowbah",
            price = "$6",
            imageResId = R.drawable.god_sticker, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/chibi-meowgod-sticker" // Optional: Replace with actual URL
        ),
        MerchItem(
            id = "merch_078",
            name = "OBEY & WORSHIP - sticker",
            description = "she run\nArtist: Meowbah",
            price = "$6",
            imageResId = R.drawable.worship_sticker, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/obey-worship-sticker"
        ),
        MerchItem(
            id = "merch_079",
            name = "Meowbah Sticker Sheet!",
            description = "very sugoi!!!\nArtist: @ririnyannn",
            price = "$10",
            imageResId = R.drawable.meowbah_sticker_sheet, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowbah-sticker-sheet"
        ),
        MerchItem(
            id = "merch_080",
            name = "Meowist Sticker Sheet!",
            description = "",
            price = "$10",
            imageResId = R.drawable.meowist_sticker_sheet, // Replace with your actual drawable
            storeUrl = "https://meowbah-shop.fourthwall.com/products/meowist-sticker-sheet" // Optional: Replace with actual URL
        )
    )
}
