![Logo](https://raw.githubusercontent.com/sungbin5304/AboutMe/master/About%20ME%20(1).png)

-----

# Preview [[Google PlayStore]](https://play.google.com/store/apps/details?id=com.sungbin.library.myapplication) [[APK]](https://github.com/sungbin5304/AboutMe/raw/master/app-debug.apk)
<div>
<img src="https://raw.githubusercontent.com/sungbin5304/AboutMe/master/KakaoTalk_20200402_231932836.png" width="400" height="650">
<img src="https://raw.githubusercontent.com/sungbin5304/AboutMe/master/KakaoTalk_20200402_225702055.png" width="400" height="650">
</div>

# Download [![](https://jitpack.io/v/sungbin5304/AboutMe.svg)](https://jitpack.io/#sungbin5304/AboutMe)

```Gradle
repositories {
  mavenCentral()
  google()
  maven { 
    url 'https://jitpack.io' 
  }
}

dependencies {
  implementation 'com.github.sungbin5304:AboutMe:{version}'
  
  implementation 'com.github.bumptech.glide:glide:4.11.0'
  implementation 'de.hdodenhof:circleimageview:3.0.0'
  implementation 'com.github.florent37:diagonallayout:1.1.1'
  
  //noinspection GradleCompatible
  implementation 'com.android.support:customtabs:28.0.0' (optional)
  
  annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'
}
```

# Usage

## Init
```kotlin
val aboutMe = AboutMe(this)
```

## Set Default Information
```kotlin
aboutMe.setProfileName("SungBin Ji")
aboutMe.setIntroduceText("This is AboutMe Library Test Application.")
aboutMe.setProfileDrawable("https://cdn.pixabay.com/photo/2015/10/09/00/55/lotus-978659_960_720.jpg")
```

## Add SNS Buttons
```kotlin
aboutMe.addSnsButton(SnsButtonItem("EMAIL", SnsButtonType.EMAIL, "sungbin.dev@gmail.com"))
aboutMe.addSnsButton(SnsButtonItem("TELEGRAM", SnsButtonType.TELEGRAM, "https://t.me/sungbin5304"))
aboutMe.addSnsButton(SnsButtonItem("KAKAOTALK", SnsButtonType.KAKAOTALK, "https://open.kakao.com/o/sZnSRY4b"))
aboutMe.addSnsButton(SnsButtonItem("GITHUB", SnsButtonType.GITHUB, "https://github.com/sungbin5304"))
```

## Create
```kotlin
aboutMe.create(animationRes = R.style.DialogAnimation, useChromeTab = true)
```

### If you set `useChromeTab` parameter true,<br>you need to implementation customtabs library.

## All Methods
```kotlin
setAge(ageInt: Int)
setFont(fontRes: Int)
setDiagonalAngle(angle: Int)
setIconTint(iconTintRes: Int)
setShowFavorite(isShow: Boolean)

addSnsButton(item: SnsButtonItem)
setSnsButtonTextColor(textColorRes: Int)

setFavoriteText(text: String
setFavoriteTitleText(title: String)

setIntroduceText(name: String)
setIntroduceText(nameRes: Int)
setIntroduceTextColor(introduceColorRes: Int)

setBackgroundDrawable(drawable: Drawable)
setBackgroundDrawable(drawableRes: Int)
setBackgroundDrawable(link: String)

setProfileDrawable(drawable: Drawable)
setProfileDrawable(drawableRes: Int)
setProfileDrawable(link: String)
setProfileDrawableBorder(border: Int)
setProfileDrawableBorderColor(color: Int)

setProfileName(name: String)
setProfileName(nameRes: Int)
setProfileNameTextColor(nameColorRes: Int)

create(isCancelable: Boolean = true, animationRes: Int = 0, layout: ScrollView = getLayout(), useChromeTab: Boolean = false)
cancel()

getLayout(): ScrollView
```

# SnsButtonItem 
## Usage
```kotlin
SnsButtonItem(title: String?, icon: Int?, link: String?)
```

# SnsButtonType<br>(can use SnsButtonItem icon parameter)
## Lists
```kotlin
EMAIL = 0
FACEBOOK = 1
GITHUB = 2
HOME = 3
INSTAGRAM = 4
KAKAOTALK = 5
LINKEDIN = 6
PAYPAL = 7
SKYPE = 8
SNAPCHAT = 9
SOUNDCLOUD = 10
SPOTIFY = 11
STEAM = 12
TELEGRAM = 13
TUMBLR = 14
TWITCH = 15
TWITTER = 16
VIMEO = 17
WHATSAPP = 18
YOUTUBE = 19
PLAYSTORE = 20
```

### View Ids for getLayout()
You can see view ids in [[this]](https://github.com/sungbin5304/AboutMe/blob/master/library/src/main/res/layout/aboutme_layout.xml).

### Kotlin Syntax Create() use in Java.
```kotlin
create(animationRes = R.style.DialogAnimation, useChromeTab = true)
```
to
```java
create(true, R.style.DialogAnimation, getLayout(), true)
               or 
create(true, 0, getLayout(), true)
```

# [[Example]](https://github.com/sungbin5304/AboutMe/blob/master/app/src/main/java/com/sungbin/library/aboutme/MainActivity.kt#L11)

-----

## License
```
                      Copyright 2020 SungBin

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

              http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   ```
