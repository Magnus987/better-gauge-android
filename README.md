# Better Gauge Library

A simple fork of the <a href="https://github.com/Gruzer/simple-gauge-android">original Library</a> to add some stuff I need:

* Value Animations on **all** Gauge types
* Dark mode support

Simple Gauge for Android. Currently available 4 shapes of gauges, you can change (colors of ranges and values)

# Download

If you want to use the Library just clone this repo

```bash
git clone https://github.com/Magnus987/better-gauge-android.git
```

Copy the "gaugelibrary" folder to your projects root folder and follow some of these tutorials to add it to Android Studio:

<a href="https://www.geeksforgeeks.org/android/how-to-add-a-library-project-to-android-studio/">https://www.geeksforgeeks.org/android/how-to-add-a-library-project-to-android-studio/</a>

<a href="https://alexzh.com/import-an-external-module-in-android-studio/">https://alexzh.com/import-an-external-module-in-android-studio/</a>

# What's new

Gauge animations with ValueAnimator on all Gauge Types!

Added support for Dark Mode!

# Simple Usage

```xml
<com.ekn.gruzer.gaugelibrary.HalfGauge
android:id="@+id/halfGauge"
android:layout_width="200dp"
android:layout_height="200dp" />
```

for all gauges, first need to set Color Ranges and set min value and max value

```kotlin
  val range = Range()
        range.color = Color.parseColor("#ce0000")
        range.from = 0.0
        range.to = 50.0
        val range2 = Range()
        range2.color = Color.parseColor("#E3E500")
        range2.from = 50.0
        range2.to = 100.0
        val range3 = Range()
        range3.color = Color.parseColor("#00b20b")
        range3.from = 100.0
        range3.to = 150.0
  //add color ranges to gauge
  halfGauge.addRange(range)
        halfGauge.addRange(range2)
        halfGauge.addRange(range3)
  //set min max and current value
  halfGauge.minValue = 0.0
        halfGauge.maxValue = 150.0
        halfGauge.value = 0.0
```

## All Speedometers, Gauges :

<table style="width:100%">
<tr>
<th>Name</th>
<th>Screenshot</th>
<th>XML Layout</th>
</tr>
<tr>
<td width="24%"> <a href="">1. MultiGauge - Wiki</a></td>
<td width="22%"><img src="images/multigauge.jpg"/></td>
<td>
<pre>
&lt; com.ekn.gruzer.gaugelibrary.MultiGauge
        android:id="@+id/multiGauge"
        android:layout_width="200dp"
        android:layout_height="200dp" />
</pre>
</td>
</tr>
<tr>
<td> <a href="">2. HalfGauge - Wiki</a></td>
<td><img src="images/HalfGauge.jpg"/></td>
<td>
<pre>
&lt; com.ekn.gruzer.gaugelibrary.HalfGauge
        android:id="@+id/halfGauge"
        android:layout_width="200dp"
        android:layout_height="200dp" />
</pre>
</td>
</tr>
<tr>
<td> <a href="">3. FullGauge - Wiki</a></td>
<td><img src="images/FullGauge.jpg"/></td>
<td>
<pre>
&lt; com.ekn.gruzer.gaugelibrary.FullGauge
        android:id="@+id/fullGauge"
        android:layout_width="200dp"
        android:layout_height="200dp" />
</pre>
</td>
</tr>
<tr>
<td> <a href="">4. ArcGauge - Wiki</a></td>
<td><img src="images/ArcGauge.jpg"/></td>
<td>
<pre>
&lt; com.ekn.gruzer.gaugelibrary.ArcGauge
        android:id="@+id/arcGauge"
        android:layout_width="200dp"
        android:layout_height="200dp" />
</pre>
</td>
</tr>
</table>

## License

Copyright 2018 Evstafiev Konstantin

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
