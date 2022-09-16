package com.isc.mychinaapp


import android.content.Intent
import com.isc.mychinaapp.Information
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugins.GeneratedPluginRegistrant


class MyFlutter : FlutterActivity() {

    private val myMapToken: MutableMap<String, String> = mutableMapOf()

    override fun onResume() {
        super.onResume()

//        myMapToken["id_token_hint"] = intent.getStringExtra("tokenLogout").toString()
//        myMapToken["post_logout_redirect_uri"] = "https://ftelsso-stag.fpt.vn/sso/home/LoginCallback"
//
//
//        val getChannel = intent.getStringExtra("ChanNel")
//        val arguments: String = if (getChannel == "login") {
//            "DataFromNative"
//        } else {
//            "DataFromNativeLogout"
//        }
//        flutterEngine?.dartExecutor?.binaryMessenger?.let {
//            MethodChannel(it, "lamSO")
//                .invokeMethod("sentData", arguments)
//        }

    }


    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
//        super.configureFlutterEngine(flutterEngine)
//        GeneratedPluginRegistrant.registerWith(flutterEngine)
        /*Truyền các input cần thiết để thực hiện login SSO*/
//        val myMap: Map<String, String> = mapOf(
//            "responeType" to "code",
//            "client_id" to "fcamera-client",
//            "client_secret" to "secret",
//            "redirect_uri" to "https://ftelsso-stag.fpt.vn/sso/home/LoginCallback",
//            "scope" to "openid+email+profile+offline",
//            "state" to "13a5sd69a123",
//            "client_secret" to "Fcam@Client@123",
//        )
//
//
//        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, "lamSO")
//            .setMethodCallHandler { call, result ->
//                when (call.method) {
//                    "exitFlutter" -> {
//                        /*Xu ly thoat SSO*/
//                        finish()
//                    }
//                    "getCode" -> {
//                        val intent = Intent(this, Information::class.java)
//                        call.argument<String>("information")?.let {
//                            intent.putExtra("information", it)
//                            /*Nhận information sau khi login thành công tại đây*/
//                        }
//                        call.argument<String>("token")?.let {
//                            intent.putExtra("token", it)
//                            /*Nhận token tại đây*/
//
//                        }
//                        call.argument<String>("tokenAccess")?.let {
//                            intent.putExtra("tokenA", it)
//                            /*Nhận token id dùng để logout tại đây*/
//                        }
//                        startActivity(intent)
//                    }
//                    "sentData" -> {
//                        /*myMap là dữ liệu input để thực hiệ login SSO theo dạng Map ngoai nhưng param Login truyền thêm dữ liệu với "client_secret"*/
//                        result.success(myMap)
//
//                    }
//                    "sentDataLogOut" -> {
//                        result.success(myMapToken)
//                        /*Default thực hiện chức năng CheckOut truyền theo dạng Map*/
//                    }
//
//                }
//            }
    }


}