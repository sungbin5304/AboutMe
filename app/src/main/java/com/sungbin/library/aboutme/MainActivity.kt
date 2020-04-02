package com.sungbin.library.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutMe = AboutMe(this)
        aboutMe.setFont(R.font.singleday)
        aboutMe.setIconTint(R.color.colorPrimary)
        aboutMe.setSnsButtonTextColor(R.color.colorGreen)
        aboutMe.setShowFavorite(false)
        aboutMe.setProfileName("SungBin Ji")
        aboutMe.setIntroduceText("This is AboutMe Library Test Application.")
        aboutMe.setProfileDrawable("https://cdn.pixabay.com/photo/2015/10/09/00/55/lotus-978659_960_720.jpg")
        aboutMe.addSnsButton(SnsButtonItem("EMAIL", SnsButtonType.EMAIL, "sungbin.dev@gmail.com"))
        aboutMe.addSnsButton(SnsButtonItem("FACEBOOK", SnsButtonType.FACEBOOK, "https://www.facebook.com/profile.php?id=100013373946772"))
        aboutMe.addSnsButton(SnsButtonItem("GITHUB", SnsButtonType.GITHUB, "https://github.com/sungbin5304"))
        aboutMe.addSnsButton(SnsButtonItem("NAVER CAFE", SnsButtonType.HOME, "https://cafe.naver.com/nameyee"))
        aboutMe.addSnsButton(SnsButtonItem("INSTAGRAM", SnsButtonType.INSTAGRAM, "https://www.instagram.com/sungbin__5304"))
        aboutMe.addSnsButton(SnsButtonItem("KAKAOTALK", SnsButtonType.KAKAOTALK, "https://open.kakao.com/o/sZnSRY4b"))
        aboutMe.addSnsButton(SnsButtonItem("LINKEDIN", SnsButtonType.LINKEDIN, "https://github.com/sungbin5304/AboutMeLinkText/blob/master/linkedin.md"))
        aboutMe.addSnsButton(SnsButtonItem("PAYPAL", SnsButtonType.PAYPAL, "https://github.com/sungbin5304/AboutMeLinkText/blob/master/paypal.md"))
        aboutMe.addSnsButton(SnsButtonItem("SKYPE", SnsButtonType.SKYPE, "https://github.com/sungbin5304/AboutMeLinkText/blob/master/skype.md"))
        aboutMe.addSnsButton(SnsButtonItem("SNAPCHAT", SnsButtonType.SNAPCHAT, "https://github.com/sungbin5304/AboutMeLinkText/blob/master/snapchat.md"))
        aboutMe.addSnsButton(SnsButtonItem("SOUNDCLOUD", SnsButtonType.SOUNDCLOUD, "https://github.com/sungbin5304/AboutMeLinkText/blob/master/soundcloud.md"))
        aboutMe.addSnsButton(SnsButtonItem("SPOTIFY", SnsButtonType.SPOTIFY, "https://github.com/sungbin5304/AboutMeLinkText/blob/master/spotify.md"))
        aboutMe.addSnsButton(SnsButtonItem("STEAM", SnsButtonType.STEAM, "https://steamcommunity.com/id/sungbin5304/"))
        aboutMe.addSnsButton(SnsButtonItem("TELEGRAM", SnsButtonType.TELEGRAM, "https://t.me/sungbin5304"))
        aboutMe.addSnsButton(SnsButtonItem("TWITCH", SnsButtonType.TWITCH, "https://www.twitch.tv/sungbin5304"))
        aboutMe.addSnsButton(SnsButtonItem("TWITTER", SnsButtonType.TWITTER, "https://twitter.com/wltjdqls5304"))
        aboutMe.addSnsButton(SnsButtonItem("YOUTUBE", SnsButtonType.YOUTUBE, "https://www.youtube.com/channel/UCSvfSbfnidDPN6_Pm3wFAzQ"))
        aboutMe.addSnsButton(SnsButtonItem("PLAYSTORE", SnsButtonType.PLAYSTORE, "https://play.google.com/store/apps/dev?id=5527691348431041833&hl=ko"))
        aboutMe.create(animationRes = R.style.DialogAnimation, useChromeTab = true)
    }
}
