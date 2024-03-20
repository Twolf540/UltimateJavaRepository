# Text Similarity

In this assignment we will explore the Apache Commons Text library to measure the similarity between two pieces of text.

There are many ways to measure how similar two pieces of text are. In this assignment we will explore two algorithms: the [Levenshtein distance](https://commons.apache.org/proper/commons-text/apidocs/org/apache/commons/text/similarity/LevenshteinDistance.html) and the [Fuzzy score](https://commons.apache.org/proper/commons-text/apidocs/org/apache/commons/text/similarity/FuzzyScore.html).

1. `GettingStarted.java`

   Write a program that uses `Scanner` and asks the use to type in two words. It should then display the Fuzzy score between those two words, and the Levenshtein distance between those two words.

   For example:

   ```
   Please enter your first word:
   participate
   Please enter your second word:
   articulate
   The Fuzzy Score between 'participate' and 'articulate' is: 13
   The Levenshtein Distance between 'participate' and 'articulate' is: 3
   ```

2. `UsingDictionary.java`

   Write a program that uses `Scanner` and asks the user to type in a word. It should calculate the Fuzzy score and LevenshteinDistance between each word in an English dictionary (which you can load using the `getEnglishWords` method provided) and the word itself. Display the best fuzzy score match, and the best Levenshtein distance match.

   For example:

   ```
   Please enter your word:
   edep
   Closest word using fuzzy algorithm was: depart
   Closest word using Levenshtein algorithm was: adept
   ```

3. `ChooseFont.java`

   _Note: the `Utils.java` file is a place to store any code (as static methods) that you want to re-use between the different parts of the assignment_

   You can get an array of all the fonts available to Java's graphics environment using:

   ```java
   String[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
   ```

   Display all the fonts available to the user, and ask them to type a font name. They shouldn't have to spell the font name perfectly with matching spaces and case etc. Based on what they typed in, show them the top 3 fonts that match the text they typed in.

   For example:

   ```
   Available fonts:
   .AppleSystemUIFont
   Academy Engraved LET
   Al Bayan
   Al Nile
   Al Tarikh
   American Typewriter
   Andale Mono
   Apple Braille
   Apple Chancery
   Apple Color Emoji
   Apple SD Gothic Neo
   Apple Symbols
   AppleGothic
   AppleMyungjo
   Arial
   Arial Black
   Arial Hebrew
   Arial Hebrew Scholar
   Arial Narrow
   Arial Rounded MT Bold
   Arial Unicode MS
   Avenir
   Avenir Next
   Avenir Next Condensed
   Ayuthaya
   Baghdad
   Bangla MN
   Bangla Sangam MN
   Baskerville
   Beirut
   Big Caslon
   Bodoni 72
   Bodoni 72 Oldstyle
   Bodoni 72 Smallcaps
   Bodoni Ornaments
   Bradley Hand
   Brush Script MT
   Chalkboard
   Chalkboard SE
   Chalkduster
   Charter
   Cochin
   Comic Sans MS
   Copperplate
   Corsiva Hebrew
   Courier New
   Damascus
   DecoType Naskh
   Devanagari MT
   Devanagari Sangam MN
   Dialog
   DialogInput
   Didot
   DIN Alternate
   DIN Condensed
   Diwan Kufi
   Diwan Thuluth
   Euphemia UCAS
   Farah
   Farisi
   Futura
   Galvji
   GB18030 Bitmap
   Geeza Pro
   Geneva
   Georgia
   Gill Sans
   Grantha Sangam MN
   Gujarati MT
   Gujarati Sangam MN
   Gurmukhi MN
   Gurmukhi MT
   Gurmukhi Sangam MN
   Heiti SC
   Heiti TC
   Helvetica
   Helvetica Neue
   Herculanum
   Hiragino Maru Gothic ProN
   Hiragino Mincho ProN
   Hiragino Sans
   Hiragino Sans GB
   Hoefler Text
   Impact
   InaiMathi
   ITF Devanagari
   ITF Devanagari Marathi
   Kailasa
   Kannada MN
   Kannada Sangam MN
   Kefa
   Khmer MN
   Khmer Sangam MN
   Kohinoor Bangla
   Kohinoor Devanagari
   Kohinoor Gujarati
   Kohinoor Telugu
   Kokonor
   Krungthep
   KufiStandardGK
   Lao MN
   Lao Sangam MN
   Lucida Grande
   Luminari
   Malayalam MN
   Malayalam Sangam MN
   Marker Felt
   Menlo
   Microsoft Sans Serif
   Mishafi
   Mishafi Gold
   Monaco
   Monospaced
   Mshtakan
   Mukta Mahee
   Muna
   Myanmar MN
   Myanmar Sangam MN
   Nadeem
   New Peninim MT
   Noteworthy
   Noto Nastaliq Urdu
   Noto Sans Batak
   Noto Sans Kannada
   Noto Sans Myanmar
   Noto Sans NKo
   Noto Sans Oriya
   Noto Sans Tagalog
   Noto Serif Myanmar
   Optima
   Oriya MN
   Oriya Sangam MN
   Palatino
   Papyrus
   Party LET
   Phosphate
   PingFang HK
   PingFang SC
   PingFang TC
   Plantagenet Cherokee
   PT Mono
   PT Sans
   PT Sans Caption
   PT Sans Narrow
   PT Serif
   PT Serif Caption
   Raanana
   Rockwell
   Sana
   SansSerif
   Sathu
   Savoye LET
   Serif
   Shree Devanagari 714
   SignPainter
   Silom
   Sinhala MN
   Sinhala Sangam MN
   Skia
   Snell Roundhand
   Songti SC
   Songti TC
   STIX Two Math
   STIX Two Text
   STSong
   Sukhumvit Set
   Symbol
   Tahoma
   Tamil MN
   Tamil Sangam MN
   Telugu MN
   Telugu Sangam MN
   Thonburi
   Times New Roman
   Trattatello
   Trebuchet MS
   Verdana
   Waseem
   Webdings
   Wingdings
   Wingdings 2
   Wingdings 3
   Zapf Dingbats
   Zapfino
   --------------------
   Choose a font:
   bodon old
   --------------------
   Top 3 matches:
   Bodoni 72 Oldstyle
   Bodoni Ornaments
   Bodoni 72
   ```
