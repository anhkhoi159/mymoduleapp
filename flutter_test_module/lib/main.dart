import 'package:flutter/material.dart';
import 'package:native_webview/native_webview.dart';
void main() async {
  runApp(const MaterialApp(
    debugShowCheckedModeBanner: false,
    home: MyApp(),
  ));
}
class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const Scaffold(
      body: Center(
        child: WebView(
          initialUrl: "https://flutter.dev",
        ),
      ),
    );
  }
}

