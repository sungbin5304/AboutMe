package com.sungbin.library.aboutme

import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.res.ResourcesCompat
import com.bumptech.glide.Glide
import com.github.florent37.diagonallayout.DiagonalLayout
import de.hdodenhof.circleimageview.CircleImageView


class AboutMe constructor(ctx: Activity){
    private val context = ctx
    private val items = ArrayList<SnsButtonItem>()
    private var alert: AlertDialog? = null
    private var fontRes = 0
    private var textColorRes = 0
    private var iconTintRes = 0
    private var nameColorRes = 0
    private var introduceColorRes = 0
    private var useChromeTab = false

    private var favoriteLayout: LinearLayout
    private var lineLayout: LinearLayout
    private var diagonalLayout: DiagonalLayout
    private var scrollView: ScrollView
    private var relativeLayout: RelativeLayout
    private var profileBackground: ImageView
    private var profileImage: CircleImageView
    private var profileIntroduce: TextView
    private var profileName: TextView
    private var ageTitle: TextView
    private var age: TextView
    private var favoriteTitle: TextView
    private var favorite: TextView

    private var snsButtonMainLayout1: LinearLayout
    private var snsButtonMainLayout2: LinearLayout
    private var snsButtonMainLayout3: LinearLayout
    private var snsButtonMainLayout4: LinearLayout
    private var snsButtonMainLayout5: LinearLayout
    private var snsButtonMainLayout6: LinearLayout
    private var snsButtonMainLayout7: LinearLayout

    private var snsButtonLayout1: LinearLayout
    private var snsButtonLayout2: LinearLayout
    private var snsButtonLayout3: LinearLayout
    private var snsButtonLayout4: LinearLayout
    private var snsButtonLayout5: LinearLayout
    private var snsButtonLayout6: LinearLayout
    private var snsButtonLayout7: LinearLayout
    private var snsButtonLayout8: LinearLayout
    private var snsButtonLayout9: LinearLayout
    private var snsButtonLayout10: LinearLayout
    private var snsButtonLayout11: LinearLayout
    private var snsButtonLayout12: LinearLayout
    private var snsButtonLayout13: LinearLayout
    private var snsButtonLayout14: LinearLayout
    private var snsButtonLayout15: LinearLayout
    private var snsButtonLayout16: LinearLayout
    private var snsButtonLayout17: LinearLayout
    private var snsButtonLayout18: LinearLayout
    private var snsButtonLayout19: LinearLayout
    private var snsButtonLayout20: LinearLayout
    private var snsButtonLayout21: LinearLayout

    private var snsButtonTitle0: TextView
    private var snsButtonTitle1: TextView
    private var snsButtonTitle2: TextView
    private var snsButtonTitle3: TextView
    private var snsButtonTitle4: TextView
    private var snsButtonTitle5: TextView
    private var snsButtonTitle6: TextView
    private var snsButtonTitle7: TextView
    private var snsButtonTitle8: TextView
    private var snsButtonTitle9: TextView
    private var snsButtonTitle10: TextView
    private var snsButtonTitle11: TextView
    private var snsButtonTitle12: TextView
    private var snsButtonTitle13: TextView
    private var snsButtonTitle14: TextView
    private var snsButtonTitle15: TextView
    private var snsButtonTitle16: TextView
    private var snsButtonTitle17: TextView
    private var snsButtonTitle18: TextView
    private var snsButtonTitle19: TextView
    private var snsButtonTitle20: TextView

    private var snsButtonIcon0: ImageView
    private var snsButtonIcon1: ImageView
    private var snsButtonIcon2: ImageView
    private var snsButtonIcon3: ImageView
    private var snsButtonIcon4: ImageView
    private var snsButtonIcon5: ImageView
    private var snsButtonIcon6: ImageView
    private var snsButtonIcon7: ImageView
    private var snsButtonIcon8: ImageView
    private var snsButtonIcon9: ImageView
    private var snsButtonIcon10: ImageView
    private var snsButtonIcon11: ImageView
    private var snsButtonIcon12: ImageView
    private var snsButtonIcon13: ImageView
    private var snsButtonIcon14: ImageView
    private var snsButtonIcon15: ImageView
    private var snsButtonIcon16: ImageView
    private var snsButtonIcon17: ImageView
    private var snsButtonIcon18: ImageView
    private var snsButtonIcon19: ImageView
    private var snsButtonIcon20: ImageView

    init {
        @SuppressLint("InflateParams")
        val inflater = LayoutInflater.from(context).inflate(R.layout.aboutme_layout, null, false)
        scrollView = inflater.findViewById(R.id.aboutme_scrollview)
        relativeLayout = inflater.findViewById(R.id.aboutme_layout)
        diagonalLayout = relativeLayout.findViewById(R.id.diagonal_layout)
        profileBackground = relativeLayout.findViewById(R.id.background_image)
        profileImage = relativeLayout.findViewById(R.id.profile_image)
        profileIntroduce = relativeLayout.findViewById(R.id.profile_introduce)
        profileName = relativeLayout.findViewById(R.id.profile_name)
        ageTitle = relativeLayout.findViewById(R.id.age_title)
        age = relativeLayout.findViewById(R.id.age)
        favoriteTitle = relativeLayout.findViewById(R.id.favorite_title)
        favorite = relativeLayout.findViewById(R.id.favorite)

        snsButtonMainLayout1 = relativeLayout.findViewById(R.id.layout_snsbutton_main_1)
        snsButtonMainLayout2 = relativeLayout.findViewById(R.id.layout_snsbutton_main_2)
        snsButtonMainLayout3 = relativeLayout.findViewById(R.id.layout_snsbutton_main_3)
        snsButtonMainLayout4 = relativeLayout.findViewById(R.id.layout_snsbutton_main_4)
        snsButtonMainLayout5 = relativeLayout.findViewById(R.id.layout_snsbutton_main_5)
        snsButtonMainLayout6 = relativeLayout.findViewById(R.id.layout_snsbutton_main_6)
        snsButtonMainLayout7 = relativeLayout.findViewById(R.id.layout_snsbutton_main_7)

        snsButtonIcon0 = relativeLayout.findViewById(R.id.sns_icon_1)
        snsButtonIcon1 = relativeLayout.findViewById(R.id.sns_icon_2)
        snsButtonIcon2 = relativeLayout.findViewById(R.id.sns_icon_3)
        snsButtonIcon3 = relativeLayout.findViewById(R.id.sns_icon_4)
        snsButtonIcon4 = relativeLayout.findViewById(R.id.sns_icon_5)
        snsButtonIcon5 = relativeLayout.findViewById(R.id.sns_icon_6)
        snsButtonIcon6 = relativeLayout.findViewById(R.id.sns_icon_7)
        snsButtonIcon7 = relativeLayout.findViewById(R.id.sns_icon_8)
        snsButtonIcon8 = relativeLayout.findViewById(R.id.sns_icon_9)
        snsButtonIcon9 = relativeLayout.findViewById(R.id.sns_icon_10)
        snsButtonIcon10 = relativeLayout.findViewById(R.id.sns_icon_11)
        snsButtonIcon11 = relativeLayout.findViewById(R.id.sns_icon_12)
        snsButtonIcon12 = relativeLayout.findViewById(R.id.sns_icon_13)
        snsButtonIcon13 = relativeLayout.findViewById(R.id.sns_icon_14)
        snsButtonIcon14 = relativeLayout.findViewById(R.id.sns_icon_15)
        snsButtonIcon15 = relativeLayout.findViewById(R.id.sns_icon_16)
        snsButtonIcon16 = relativeLayout.findViewById(R.id.sns_icon_17)
        snsButtonIcon17 = relativeLayout.findViewById(R.id.sns_icon_18)
        snsButtonIcon18 = relativeLayout.findViewById(R.id.sns_icon_19)
        snsButtonIcon19 = relativeLayout.findViewById(R.id.sns_icon_20)
        snsButtonIcon20 = relativeLayout.findViewById(R.id.sns_icon_21)

        snsButtonTitle0 = relativeLayout.findViewById(R.id.sns_title_1)
        snsButtonTitle1 = relativeLayout.findViewById(R.id.sns_title_2)
        snsButtonTitle2 = relativeLayout.findViewById(R.id.sns_title_3)
        snsButtonTitle3 = relativeLayout.findViewById(R.id.sns_title_4)
        snsButtonTitle4 = relativeLayout.findViewById(R.id.sns_title_5)
        snsButtonTitle5 = relativeLayout.findViewById(R.id.sns_title_6)
        snsButtonTitle6 = relativeLayout.findViewById(R.id.sns_title_7)
        snsButtonTitle7 = relativeLayout.findViewById(R.id.sns_title_8)
        snsButtonTitle8 = relativeLayout.findViewById(R.id.sns_title_9)
        snsButtonTitle9 = relativeLayout.findViewById(R.id.sns_title_10)
        snsButtonTitle10 = relativeLayout.findViewById(R.id.sns_title_11)
        snsButtonTitle11 = relativeLayout.findViewById(R.id.sns_title_12)
        snsButtonTitle12 = relativeLayout.findViewById(R.id.sns_title_13)
        snsButtonTitle13 = relativeLayout.findViewById(R.id.sns_title_14)
        snsButtonTitle14 = relativeLayout.findViewById(R.id.sns_title_15)
        snsButtonTitle15 = relativeLayout.findViewById(R.id.sns_title_16)
        snsButtonTitle16 = relativeLayout.findViewById(R.id.sns_title_17)
        snsButtonTitle17 = relativeLayout.findViewById(R.id.sns_title_18)
        snsButtonTitle18 = relativeLayout.findViewById(R.id.sns_title_19)
        snsButtonTitle19 = relativeLayout.findViewById(R.id.sns_title_20)
        snsButtonTitle20 = relativeLayout.findViewById(R.id.sns_title_21)

        snsButtonLayout1 = relativeLayout.findViewById(R.id.layout_snsbutton_1)
        snsButtonLayout2 = relativeLayout.findViewById(R.id.layout_snsbutton_2)
        snsButtonLayout3 = relativeLayout.findViewById(R.id.layout_snsbutton_3)
        snsButtonLayout4 = relativeLayout.findViewById(R.id.layout_snsbutton_4)
        snsButtonLayout5 = relativeLayout.findViewById(R.id.layout_snsbutton_5)
        snsButtonLayout6 = relativeLayout.findViewById(R.id.layout_snsbutton_6)
        snsButtonLayout7 = relativeLayout.findViewById(R.id.layout_snsbutton_7)
        snsButtonLayout8 = relativeLayout.findViewById(R.id.layout_snsbutton_8)
        snsButtonLayout9 = relativeLayout.findViewById(R.id.layout_snsbutton_9)
        snsButtonLayout10 = relativeLayout.findViewById(R.id.layout_snsbutton_10)
        snsButtonLayout11 = relativeLayout.findViewById(R.id.layout_snsbutton_11)
        snsButtonLayout12 = relativeLayout.findViewById(R.id.layout_snsbutton_12)
        snsButtonLayout13 = relativeLayout.findViewById(R.id.layout_snsbutton_13)
        snsButtonLayout14 = relativeLayout.findViewById(R.id.layout_snsbutton_14)
        snsButtonLayout15 = relativeLayout.findViewById(R.id.layout_snsbutton_15)
        snsButtonLayout16 = relativeLayout.findViewById(R.id.layout_snsbutton_16)
        snsButtonLayout17 = relativeLayout.findViewById(R.id.layout_snsbutton_17)
        snsButtonLayout18 = relativeLayout.findViewById(R.id.layout_snsbutton_18)
        snsButtonLayout19 = relativeLayout.findViewById(R.id.layout_snsbutton_19)
        snsButtonLayout20 = relativeLayout.findViewById(R.id.layout_snsbutton_20)
        snsButtonLayout21 = relativeLayout.findViewById(R.id.layout_snsbutton_21)

        lineLayout = relativeLayout.findViewById(R.id.line_layout)
        favoriteLayout = relativeLayout.findViewById(R.id.favorite_layout)
    }

    fun setAge(ageInt: Int){
        age.text = ageInt.toString()
    }

    fun setShowFavorite(isShow: Boolean){
        if(isShow){
            lineLayout.weightSum = 4f
            favoriteLayout.visibility = View.VISIBLE
        }
        else {
            lineLayout.weightSum = 3f
            favoriteLayout.visibility = View.GONE
        }
    }

    fun setFavoriteTitleText(title: String){
        favoriteTitle.text = title
    }

    fun setFavoriteText(text: String){
        favorite.text = text
    }

    fun setDiagonalAngle(angle: Int){
        diagonalLayout.diagonalAngle = angle.toFloat()
    }

    fun setBackgroundDrawable(drawable: Drawable){
        Glide.with(context).load(drawable).into(profileBackground)
    }

    fun setBackgroundDrawable(drawableRes: Int){
        Glide.with(context).load(drawableRes).into(profileBackground)
    }

    fun setBackgroundDrawable(link: String){
        Glide.with(context).load(link).into(profileBackground)
    }

    fun setProfileDrawable(drawable: Drawable){
        Glide.with(context).load(drawable).into(profileImage)
    }

    fun setProfileDrawable(drawableRes: Int){
        Glide.with(context).load(drawableRes).into(profileImage)
    }

    fun setProfileDrawable(link: String){
        Glide.with(context).load(link).into(profileImage)
    }

    fun setProfileDrawableBorder(border: Int){
        profileImage.borderWidth = border
    }

    fun setProfileDrawableBorderColor(color: Int){
        profileImage.borderColor = color
    }

    fun setProfileName(name: String){
        profileName.text = name
    }

    fun setProfileName(nameRes: Int){
        profileName.text = context.getString(nameRes)
    }

    fun setIntroduceText(name: String){
        profileIntroduce.text = name
    }

    fun setIntroduceText(nameRes: Int){
        profileIntroduce.text = context.getString(nameRes)
    }

    fun setProfileNameTextColor(nameColorRes: Int){
        this.nameColorRes = nameColorRes
    }

    fun setIntroduceTextColor(introduceColorRes: Int){
        this.introduceColorRes = introduceColorRes
    }

    fun setIconTint(iconTintRes: Int){
        this.iconTintRes = iconTintRes
    }

    fun setSnsButtonTextColor(textColorRes: Int){
        this.textColorRes = textColorRes
    }

    fun getLayout(): ScrollView{
        setEachTextView(profileName, nameColorRes)
        setEachTextView(profileIntroduce, introduceColorRes)

        setTextView(snsButtonTitle0)
        setTextView(snsButtonTitle1)
        setTextView(snsButtonTitle2)
        setTextView(snsButtonTitle3)
        setTextView(snsButtonTitle4)
        setTextView(snsButtonTitle5)
        setTextView(snsButtonTitle6)
        setTextView(snsButtonTitle7)
        setTextView(snsButtonTitle8)
        setTextView(snsButtonTitle9)
        setTextView(snsButtonTitle10)
        setTextView(snsButtonTitle11)
        setTextView(snsButtonTitle12)
        setTextView(snsButtonTitle13)
        setTextView(snsButtonTitle14)
        setTextView(snsButtonTitle15)
        setTextView(snsButtonTitle16)
        setTextView(snsButtonTitle17)
        setTextView(snsButtonTitle18)
        setTextView(snsButtonTitle19)
        setTextView(snsButtonTitle20)

        setImageView(snsButtonIcon0)
        setImageView(snsButtonIcon1)
        setImageView(snsButtonIcon2)
        setImageView(snsButtonIcon3)
        setImageView(snsButtonIcon4)
        setImageView(snsButtonIcon5)
        setImageView(snsButtonIcon6)
        setImageView(snsButtonIcon7)
        setImageView(snsButtonIcon8)
        setImageView(snsButtonIcon9)
        setImageView(snsButtonIcon10)
        setImageView(snsButtonIcon11)
        setImageView(snsButtonIcon12)
        setImageView(snsButtonIcon13)
        setImageView(snsButtonIcon14)
        setImageView(snsButtonIcon15)
        setImageView(snsButtonIcon16)
        setImageView(snsButtonIcon17)
        setImageView(snsButtonIcon18)
        setImageView(snsButtonIcon19)
        setImageView(snsButtonIcon20)

        if(items.isNotEmpty()){
            val rootLayout = LinearLayout(context)
            rootLayout.orientation = LinearLayout.HORIZONTAL
            rootLayout.weightSum = 3f

            val rootParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT)
            rootLayout.layoutParams = rootParams

            if(items.size > 21) {
                throw Exception("Items size max is 21!\nYour items size : ${items.size}")
            }
            else {
                for (i in 0 until items.size) {
                    val item = items[i]
                    val drawable = when(item.icon){
                        0 -> R.drawable.ic_email
                        1 -> R.drawable.ic_facebook
                        2 -> R.drawable.ic_github
                        3 -> R.drawable.ic_home
                        4 -> R.drawable.ic_instagram
                        5 -> R.drawable.ic_kakaotalk
                        6 -> R.drawable.ic_linkedin
                        7 -> R.drawable.ic_paypal
                        8 -> R.drawable.ic_skype
                        9 -> R.drawable.ic_snapchat
                        10 -> R.drawable.ic_soundcloud
                        11 -> R.drawable.ic_spotify
                        12 -> R.drawable.ic_steam
                        13 -> R.drawable.ic_telegram
                        14 -> R.drawable.ic_tumblr
                        15 -> R.drawable.ic_twitch
                        16 -> R.drawable.ic_twitter
                        17 -> R.drawable.ic_vimeo
                        18 -> R.drawable.ic_whatsapp
                        19 -> R.drawable.ic_youtube
                        else -> R.drawable.ic_playstore
                    }

                    when(i){
                        0 ->{
                            snsButtonTitle0.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon0)
                            snsButtonIcon0.visibility = View.VISIBLE
                            snsButtonTitle0.visibility = View.VISIBLE
                            snsButtonIcon0.setOnClickListener {
                                val email = Intent(Intent.ACTION_SEND)
                                email.type = "plain/text"
                                val address = arrayOf(item.link)
                                email.putExtra(Intent.EXTRA_EMAIL, address)
                                context.startActivity(email)
                            }
                            snsButtonMainLayout1.visibility = View.VISIBLE
                        }
                        1 ->{
                            snsButtonTitle1.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon1)
                            snsButtonIcon1.visibility = View.VISIBLE
                            snsButtonTitle1.visibility = View.VISIBLE
                            snsButtonIcon1.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        2 ->{
                            snsButtonTitle2.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon2)
                            snsButtonIcon2.visibility = View.VISIBLE
                            snsButtonTitle2.visibility = View.VISIBLE
                            snsButtonIcon2.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        3 ->{
                            snsButtonTitle3.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon3)
                            snsButtonIcon3.visibility = View.VISIBLE
                            snsButtonTitle3.visibility = View.VISIBLE
                            snsButtonMainLayout2.visibility = View.VISIBLE
                            snsButtonIcon3.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        4 ->{
                            snsButtonTitle4.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon4)
                            snsButtonIcon4.visibility = View.VISIBLE
                            snsButtonTitle4.visibility = View.VISIBLE
                            snsButtonIcon4.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        5 ->{
                            snsButtonTitle5.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon5)
                            snsButtonIcon5.visibility = View.VISIBLE
                            snsButtonTitle5.visibility = View.VISIBLE
                            snsButtonIcon5.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        6 ->{
                            snsButtonTitle6.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon6)
                            snsButtonIcon6.visibility = View.VISIBLE
                            snsButtonTitle6.visibility = View.VISIBLE
                            snsButtonMainLayout3.visibility = View.VISIBLE
                            snsButtonIcon6.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        7 ->{
                            snsButtonTitle7.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon7)
                            snsButtonIcon7.visibility = View.VISIBLE
                            snsButtonTitle7.visibility = View.VISIBLE
                            snsButtonIcon7.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        8 ->{
                            snsButtonTitle8.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon8)
                            snsButtonIcon8.visibility = View.VISIBLE
                            snsButtonTitle8.visibility = View.VISIBLE
                            snsButtonIcon8.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        9 ->{
                            snsButtonTitle9.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon9)
                            snsButtonIcon9.visibility = View.VISIBLE
                            snsButtonTitle9.visibility = View.VISIBLE
                            snsButtonMainLayout4.visibility = View.VISIBLE
                            snsButtonIcon9.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        10 ->{
                            snsButtonTitle10.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon10)
                            snsButtonIcon10.visibility = View.VISIBLE
                            snsButtonTitle10.visibility = View.VISIBLE
                            snsButtonIcon10.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        11 ->{
                            snsButtonTitle11.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon11)
                            snsButtonIcon11.visibility = View.VISIBLE
                            snsButtonTitle11.visibility = View.VISIBLE
                            snsButtonIcon11.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        12 ->{
                            snsButtonTitle12.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon12)
                            snsButtonIcon12.visibility = View.VISIBLE
                            snsButtonTitle12.visibility = View.VISIBLE
                            snsButtonMainLayout5.visibility = View.VISIBLE
                            snsButtonIcon12.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        13 ->{
                            snsButtonTitle13.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon13)
                            snsButtonIcon13.visibility = View.VISIBLE
                            snsButtonTitle13.visibility = View.VISIBLE
                            snsButtonIcon13.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        14 ->{
                            snsButtonTitle14.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon14)
                            snsButtonIcon14.visibility = View.VISIBLE
                            snsButtonTitle14.visibility = View.VISIBLE
                            snsButtonIcon14.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        15 ->{
                            snsButtonTitle15.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon15)
                            snsButtonIcon15.visibility = View.VISIBLE
                            snsButtonTitle15.visibility = View.VISIBLE
                            snsButtonMainLayout6.visibility = View.VISIBLE
                            snsButtonIcon15.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        16 ->{
                            snsButtonTitle16.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon16)
                            snsButtonIcon16.visibility = View.VISIBLE
                            snsButtonTitle16.visibility = View.VISIBLE
                            snsButtonIcon16.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        17 ->{
                            snsButtonTitle17.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon17)
                            snsButtonIcon17.visibility = View.VISIBLE
                            snsButtonTitle17.visibility = View.VISIBLE
                            snsButtonIcon17.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        18 ->{
                            snsButtonTitle18.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon18)
                            snsButtonIcon18.visibility = View.VISIBLE
                            snsButtonTitle18.visibility = View.VISIBLE
                            snsButtonMainLayout7.visibility = View.VISIBLE
                            snsButtonIcon18.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        19 ->{
                            snsButtonTitle19.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon19)
                            snsButtonIcon19.visibility = View.VISIBLE
                            snsButtonTitle19.visibility = View.VISIBLE
                            snsButtonIcon19.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                        else ->{
                            snsButtonTitle20.text = item.title
                            Glide.with(context).load(drawable).into(snsButtonIcon20)
                            snsButtonIcon20.visibility = View.VISIBLE
                            snsButtonTitle20.visibility = View.VISIBLE
                            snsButtonIcon20.setOnClickListener {
                                showWebTab(item.link)
                            }
                        }
                    }
                }

                when(items.size - 1){
                    0 ->{ //요소 1개
                        snsButtonMainLayout1.weightSum = 1f
                    }

                    1 ->{ //요소 2개
                        snsButtonMainLayout1.weightSum = 2f
                    }

                    3 ->{
                        snsButtonMainLayout2.weightSum = 1f
                    }

                    4 ->{
                        snsButtonMainLayout2.weightSum = 2f
                    }

                    6 ->{
                        snsButtonMainLayout3.weightSum = 1f
                    }

                    7 ->{
                        snsButtonMainLayout3.weightSum = 2f
                    }

                    9 ->{
                        snsButtonMainLayout4.weightSum = 1f
                    }

                    10 ->{
                        snsButtonMainLayout4.weightSum = 2f
                    }

                    12 ->{
                        snsButtonMainLayout5.weightSum = 1f
                    }

                    13 ->{
                        snsButtonMainLayout5.weightSum = 2f
                    }

                    15 ->{
                        snsButtonMainLayout6.weightSum = 1f
                    }

                    16 ->{
                        snsButtonMainLayout6.weightSum = 2f
                    }

                    18 ->{
                        snsButtonMainLayout7.weightSum = 1f
                    }

                    19 ->{
                        snsButtonMainLayout7.weightSum = 2f
                    }
                }
            }
        }

        scrollView.requestLayout()
        scrollView.invalidate()
        return scrollView
    }

    fun addSnsButton(item: SnsButtonItem){
        items.add(item)
    }

    fun setFont(fontRes: Int){
        this.fontRes = fontRes
    }

    fun create(isCancelable: Boolean = true, animationRes: Int = 0, layout: ScrollView = getLayout(), useChromeTab: Boolean = false){
        val dialog = AlertDialog.Builder(context)
        dialog.setView(layout)
        dialog.setCancelable(isCancelable)

        this.useChromeTab = useChromeTab

        alert = dialog.create()
        if(animationRes != 0) alert!!.window!!.setWindowAnimations(animationRes)
        alert!!.show()
    }

    fun cancel(){
        if(alert != null) {
            alert!!.cancel()
        }
        else {
            throw Exception("You need to use .create() method first!")
        }
    }

    private fun setEachTextView(view: TextView, colorRes: Int){
        if(colorRes != 0) {
            view.setTextColor(ContextCompat.getColor(context, colorRes))
        }
        if(fontRes != 0){
            view.typeface = ResourcesCompat.getFont(context, fontRes)
        }
    }

    private fun setTextView(view: TextView){
        if(fontRes != 0){
            view.typeface = ResourcesCompat.getFont(context, fontRes)
        }
        if(textColorRes != 0) {
            view.setTextColor(ContextCompat.getColor(context, textColorRes))
        }
    }

    private fun setImageView(view: ImageView){
        if(iconTintRes != 0) {
            view.setColorFilter(
                ContextCompat.getColor(context, iconTintRes),
                PorterDuff.Mode.SRC_IN
            )
        }
    }

    private fun showWebTab(url: String?) {
        var link = url
        if(!link!!.contains("http")) link = "https://$link"
        try {
            if(useChromeTab) {
                val pm = context.packageManager
                val pi =
                    pm.getPackageInfo("com.android.chrome", PackageManager.GET_META_DATA)

                @Suppress("UNUSED_VARIABLE")
                val appInfo = pi.applicationInfo
                val builder = CustomTabsIntent.Builder()
                if (iconTintRes != 0) {
                    builder.setToolbarColor(ContextCompat.getColor(context, iconTintRes))
                }
                val customTabsIntent = builder.build()
                customTabsIntent.intent.setPackage("com.android.chrome")
                customTabsIntent.launchUrl(context, Uri.parse(link))
            }
            else {
                val intent = Intent(Intent.ACTION_VIEW)
                val uri: Uri = Uri.parse(link)
                intent.data = uri
                context.startActivity(intent)
            }
        } catch (e: PackageManager.NameNotFoundException) {
            try {
                val intent = Intent(Intent.ACTION_VIEW)
                val uri: Uri = Uri.parse(link)
                intent.data = uri
                context.startActivity(intent)
            }
            catch (e: Exception){
                throw e
            }
        }
    }
}