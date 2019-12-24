# รายงานผลการทดลอง

นายนฤเบศร์  พระโรจน์   603410047-6

## Relative Layout

แสดง Control `title` และ `Detail`

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".RelativeActivity">

    <EditText
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:inputType="textPersonName"
            android:text="Name"
            android:ems="10"
            android:id="@+id/editText4" android:layout_marginTop="28dp" android:layout_alignParentTop="true"
            android:layout_alignParentStart="true" android:layout_marginStart="5dp"/>
    <EditText
            android:layout_width="218dp"
            android:layout_height="wrap_content"
            android:inputType="textPersonName"
            android:text="Name"
            android:ems="10"
            android:id="@+id/editText5" android:layout_alignParentStart="true"
            android:layout_marginStart="3dp" android:layout_alignParentEnd="true" android:layout_marginEnd="190dp"
            android:layout_marginTop="154dp" android:layout_alignParentTop="true"/>
    <EditText
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:inputType="textPersonName"
            android:text="Name"
            android:ems="10"
            android:id="@+id/editText" android:layout_alignParentTop="true" android:layout_marginTop="94dp"
            android:layout_alignStart="@+id/editText5" android:layout_marginStart="0dp"/>
</RelativeLayout>
```

แอดทริบิ้วที่แสดงความสัมพันธ์ระหว่าง control ทั้งสอง

```xml
android:layout_above : เป็นการกำหนดให้ View ไปอยู่ด้านบน ของ View อีกตัวที่เราอ้างอิงถึง
android:layout_below : เป็นการกำหนดให้ View ไปอยู่ที่ตำแหน่งด้านล่างของ View อีกตัวที่อ้างอิงถึง
```

## Linear Layout

แสดง Control `to`, `subject`, `tag` และ `message`

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context=".LinearActivity">
    <EditText
            android:id="@+id/editText"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:ems="10"
            android:inputType="textPersonName"
            android:text="Name"
            tools:layout_editor_absoluteX="14dp"
            tools:layout_editor_absoluteY="20dp" />

    <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

        <EditText
                android:id="@+id/editText2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:ems="10"
                android:inputType="textPersonName"
                android:text="Name"
                tools:layout_editor_absoluteX="16dp"
                tools:layout_editor_absoluteY="86dp" />

        <EditText
                android:id="@+id/editText3"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:inputType="textPersonName"
                android:text="Name"
                tools:layout_editor_absoluteX="14dp"
                tools:layout_editor_absoluteY="151dp" />
    </LinearLayout>

    <EditText
            android:id="@+id/editText4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:ems="10"
            android:gravity="start|top"
            android:inputType="textMultiLine" />

    <Button
            android:id="@+id/button"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Button"
            tools:layout_editor_absoluteX="17dp"
            tools:layout_editor_absoluteY="210dp" />
</LinearLayout>
```

อธิบายความแตกต่างระหว่าง vertical และ horizontal orientation

```
 vertical คือแนวตั้ง  horizontal คือแนวนอน orientation คือตัวกำหนดว่าจะเป็นแนวตั้งหรือแนวนอน
```

## Constrant Layout

จงออกแบบและสร้างหน้า Constrant layout สำหรับแสดงข้อมูลนักศึกษา ประกอบไปด้วย รูปโปรไฟล์ รูปพื้นหลัง ชื่อ-นามสกุล รหัสนักศึกษา และเกรดเฉลี่ยรวม

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".ConstranActivity">
    <ImageView
            android:layout_width="404dp"
            android:layout_height="214dp" app:srcCompat="@drawable/df"
            tools:layout_editor_absoluteX="2dp" android:id="@+id/imageView2" android:scaleType="fitXY"
            app:layout_constraintTop_toTopOf="parent" android:layout_marginTop="4dp"/>
    <ImageView
            android:layout_width="175dp"
            android:layout_height="318dp" app:srcCompat="@drawable/pro"
            android:id="@+id/imageView"
            app:layout_constraintTop_toTopOf="@+id/imageView2" app:layout_constraintStart_toStartOf="@+id/imageView2"
            android:layout_marginStart="116dp" android:layout_marginTop="24dp"/>
    <TextView
            android:text="ชื่อ นายนฤเบศร์ พระโรจน์"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/textView" android:textSize="24sp"
            app:layout_constraintStart_toStartOf="parent"
            android:layout_marginStart="76dp" android:textColor="#050505"
            app:layout_constraintTop_toBottomOf="@+id/textView2" android:layout_marginTop="40dp"/>
    <TextView
            android:text="My Profile"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/textView2"
            android:textSize="36sp"
            app:layout_constraintEnd_toEndOf="parent" android:layout_marginEnd="124dp"
            android:textColor="#3F51B5" android:layout_marginTop="272dp"
            app:layout_constraintTop_toTopOf="@+id/imageView2" app:layout_constraintStart_toStartOf="@+id/imageView2"
            android:layout_marginStart="124dp" app:layout_constraintHorizontal_bias="1.0"/>
    <TextView
            android:text="รหัสนักศึกษา 603410047-6"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/textView3" android:textSize="24sp"
            android:layout_marginStart="64dp" app:layout_constraintStart_toStartOf="parent"
            android:textColor="#030303" android:layout_marginTop="24dp"
            app:layout_constraintTop_toBottomOf="@+id/textView"/>
    <TextView
            android:text="เกรดเฉลี่ยรวม 3.09"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" android:id="@+id/textView4"
            android:textSize="24sp" android:textColor="#000000"
            android:layout_marginTop="20dp" app:layout_constraintTop_toBottomOf="@+id/textView3"
            android:layout_marginStart="108dp" app:layout_constraintStart_toStartOf="parent"/>
    <Button
            android:text="กลับ"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/button5" app:layout_constraintStart_toStartOf="parent" android:layout_marginStart="8dp"
            app:layout_constraintEnd_toEndOf="parent" android:layout_marginEnd="8dp" android:layout_marginBottom="8dp"
            app:layout_constraintBottom_toBottomOf="parent" app:layout_constraintHorizontal_bias="0.498"
            android:textSize="24sp" android:layout_marginTop="8dp"
            app:layout_constraintTop_toBottomOf="@+id/textView4" app:layout_constraintVertical_bias="0.439"/>

    button5.setOnClickListener{
    this.finish()
    }
</androidx.constraintlayout.widget.ConstraintLayout>
```
