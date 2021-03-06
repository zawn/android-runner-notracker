# android-runner-notracker

[ ![Download](https://api.bintray.com/packages/zhangzhenli/maven/android-runner-notracker/images/download.svg) ](https://bintray.com/zhangzhenli/maven/android-runner-notracker/_latestVersion)


##目的
关闭AndroidJUnitRunner的使用统计,避免在没有网络或者无法访问www.google-analytics.com的时候进行单元测试出现网络错误提示.
 

##Android Testing Support Library
 
 参考:https://google.github.io/android-testing-support-library/
 
 其中:https://google.github.io/android-testing-support-library/docs/espresso/setup/index.html页面有如下描述:

 In order to make sure we are on the right track with each new release, the test runner collects analytics. More specifically, it uploads a hash of the package name of the application under test for each invocation. This allows us to measure both the count of unique packages using Espresso as well as the volume of usage.

If you do not wish to upload this data, you can opt out by passing the following argument to the test runner: `disableAnalytics "true"` (see [how to pass custom arguments](https://github.com/googlesamples/android-testing-templates/tree/master/AndroidTestingBlueprint#custom-gradle-command-line-arguments)).

 >但是Android Studio目前(1.4版以及前)不支持附加参数,故而覆写AndroidJUnitRunner
 
 >参见:
 >Android Studio: pass extra parameters to custom test runner
 >https://code.google.com/p/android/issues/detail?id=191551


## 用法
 1. 引入依赖.

    在build.gradle中添加依赖:
    ``` groovy
    androidTestCompile 'com.house365.build:android-runner-notracker:0.1'
    ```

 3. 在build.gradle的android.defaultConfig下加入如下代码.

    ``` groovy
    testInstrumentationRunner "android.support.test.runner.AndroidTestRunner"
    ```
    
