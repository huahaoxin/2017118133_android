## 目录
#### [Hello world为第一次作业](https://github.com/huahaoxin/2017118133_android/tree/master/HelloWorld)<br>
#### [第二次作业](https://github.com/huahaoxin/2017118133_android/tree/master/work)<br>
#### [第三次作业为第二次的基础上改进](https://github.com/huahaoxin/2017118133_android/tree/master/work)<br>
#### [为第四次：隐式调用浏览器、拨号、题图](https://github.com/huahaoxin/2017118133_android/tree/master/IntentSkip)<br>
#### [第五次作业：Rcycleview](https://github.com/huahaoxin/2017118133_android/tree/dev/RecyclerViewTest)<br>
#### [第六次作业多线程AndroidThreadTest](https://github.com/huahaoxin/2017118133_android/tree/master/AndroidThreadTest)<br>
#### [第七次作业：异步任务AsyncTask ](https://github.com/huahaoxin/2017118133_android/tree/master/AsyncTask)<br>
## 导入课本源代码遇到的问题及解决方法
##### 1.加载时间过长 打开在自己电脑中创建的可运行项目中的文件： “gradle-wrapper.properties” 查看其中的 distributionUrl=https\://services.gradle.org/distributions/gradle-5.4.1-all.zip 将导入项目的相同文件中的该项更改成自己项目中的代码
##### 2.无法运行的问题一 查看可运行项目中的 build.gradle(Project:项目名) 文件，更改classpath。
    dependencies {
      classpath 'com.android.tools.build:gradle:3.5.0'
    }
##### 3.无法运行的问题二 查看可运行项目中的 build.gradle(Module:app) 文件，更改以下代码。
    android {
    compileSdkVersion 29
    buildToolsVersion '29.0.2'
    defaultConfig {
       applicationId "com.example.helloworld"
       minSdkVersion 15
       targetSdkVersion 29
       versionCode 1
       versionName "1.0"
    }

