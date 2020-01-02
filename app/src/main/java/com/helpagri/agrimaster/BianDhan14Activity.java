package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class BianDhan14Activity extends AppCompatActivity {

    private WebView webView;
    private TextView textView;

    String myText="<html><body><center><h2>জাতের বিবরণ</h2></center>" +
            "<big>" +
            "ফসলের নাম    :<b> বোরো</b><br/>" +
            "জাতের নাম     :<b> ববিনা ধান-১৪ (বোরো মৌসুম)</b><br/><br/>" +
            "<b>বৈশিষ্ট্য:</b> এটি উচ্চ ফলণশীল ও উন্নত গুণাগুণ সম্পন্ন নাবি রোপনোপযোগী ও উচ্চ তাপমাত্রা সহিষ্ণু বোরো ধানের জাত। গাছ খাট ও শক্ত বলে হেলে পড়ে না । পূর্ণ বয়স্ক গাছের উচ্চতা ৯০-১০০ সেঃমিঃ। পাতা গাঢ় সবুজ, লম্বা ও চওড়া। ডিগ পাতা খাড়া। ছড়া ২৪ সেঃমিঃ লম্বা ও গড়ে ১১৫-১৩০ টি ধান ধরে। এটি আগাম পাকে, জীবনকাল- বোরো মৌসুমে ১২০-১৩০ দিন এবং আমন মৌসুমে ১০০ দিন। আমন মৌসুমে আগে লাগালেও চিটা হয় না। যথোপযুক্ত পরিচর্যায় বোরো মৌসুমে হেক্টর প্রতি ৬.৫-৭.০ টন (একরে ৬০-৭০ মন) এবং আমন মৌসুমে ৫.০-৫.৩ টন ফলন দেয়। চাউলে আমিষের পরিমাণ ১০%। রান্নার পর ভাত ঝরঝরে হয় এবং দীর্ঘক্ষণ রাখলে নষ্ট হয় না। বিশেষ গুণ: নাবী বোরো মৌসুমে চাষযোগ্য। অর্থাৎ ফেব্রম্নয়ারীর শেষ সপ্তাহ হতে মার্চের দ্বিতীয় সপ্তাহে রোপন করা যায়। ফলে শীতকালীন ফসল যেমন সরিষা, আলু, মসুর ইত্যাদি চাষ করার পর এ জাতটি লাগানো যায়। ফলে বোরো চাষের আওতায় মোট জমির অর্ধেক জমিতে অর্থাৎ প্রায় ২০ লক্ষ হেক্টর জমিতে সরিষা, আলু আবাদ করা সম্ভব। ফলে ২০ লক্ষ হেক্টর জমিতে সরিষা চাষ করে প্রায় ১৪ লক্ষ টন ভোজ্য তেল পাওয়া যাবে যা চাহিদা মেটাবে। ফলে বিদেশ থেকে ভোজ্য তেল আমদানির প্রয়োজন হবে না।<br/>" +
            "<b>উপযোগী এলাকা:</b> লবণাক্ত এলাকা ছাড়া দেশের প্রায় সকল উচুঁ ও মধ্যম উচুঁ জমিতে বিশেষ করে বৃহত্তম রংপুর, দিনাজপুর, পাবনা, টাঙ্গাইল, যশোহর, ঢাকা এবং ময়মনসিংহ অঞ্চলে জাতটির অধিক ফলন পাওয়া যায়।<br/>" +
            "<b>বপনের সময়:</b> বোরো মৌসুমে অঞ্চল ভেদে জানুয়ারীর দ্বিতীয় সপ্তাহ হতে শেষ সপ্তাহ পর্যন্ত এবং আমন মৌসুমে জুনের প্রথম সপ্তাহ থেকে শেষ সপ্তাহ পর্যন্ত বীজতলায় বীজ ফেলতে হবে। পাঁচ শতাংশ (২০০ বর্গ মিটার) পরিমাণ বীজতলায় ১০ কেজি বীজ ফেলা যায়।<br/> " +
            "<center><img src=\"file:///android_res/drawable/binadhan14.gif\" width=\"150\" height=\"100\" /></center><br/>" +
            "<center><h3> রোগবালাই ও দমন ব্যবস্থা</h3></center>" +
            "<b>রোগবালাই:</b> খোলা ঝলসানো, ব্যাক্টেরিয়াল লিফব্লাইট বা পাতা ঝলসানো, কান্ড পচাঁ রোগ<br/>" +
            "<b>দমন ব্যবস্থা:</b> রোগ বালাই এর আক্রমণ দেখা দিলে নিকটস্থ কৃষি সম্প্রসারণ কর্মকর্তার উপদেশ মোতাবেক প্রয়োজনীয় ব্যবস্থা নিতে হবে। এ ছাড়া খোলা ঝলসানো, ব্যাক্টেরিয়াল লিফব্লাইট বা পাতা ঝলসানো ও অন্যান্য রোগ দেখা দিলে উপযুক্ত ছত্রাকনাশক প্রয়োগ করতে হবে। খোল ঝলসানো, কান্ড পচাঁ রোগ দেখা দিলে বেনলেট, হোমাই, বেভিষ্টিন বা টপসিন মিথাইল মাত্রা অনুযায়ী প্রয়োগ করা যেতে পারে।<br/>" +
            "<center><h3> পোকামাকড় ও দমন ব্যবস্থা</h3></center>" +
            "<b>পোকামাকড়:</b><br/>" +
            "<b>দমন ব্যবস্থা:</b> কীট পতঙ্গের আক্রমণ দেখা দিলে নিকটস্থ কৃষি সম্প্রসারণ কর্মকর্তার উপদেশ মোতাবেক প্রয়োজনীয় ব্যবস্থা নিতে হবে। পোকামাকড়ের আক্রমণ দেখা নিলে প্রচলিত তরল বা আনাদার কীটনাশক ব্যবহার করা যেতে পারে।<br/> " +
            "<center><h3>সার ব্যবস্থাপনা</h3></center>" +
            "বোরো মৌসুম<br/>" +
            " <table border = \"1\">" +
            "         <tr>" +
            "            <td>সারের নাম</td>" +
            "            <td>প্রতি হেক্টরে</td>" +
            "            <td>প্রতি একরে</td>" +
            "            <td>প্রতি শতাংশে</td>" +
            "            <td>প্রতি হেক্টরে</td>" +
            "            <td>প্রতি একরে</td>" +
            "            <td>প্রতি শতাংশে</td>" +
            "         </tr>" +
            "         <tr>" +
            "            <td>ইউরিয়া (কেজি)</td>" +
            "            <td>১০০-১২০</td>" +
            "            <td>৪০-৫০</td>" +
            "            <td>০.৪-০.৫</td>" +
            "            <td>২২০-২৫০</td>" +
            "            <td>৯০-১০০</td>" +
            "            <td>৩০-৩৫</td>" +
            "         </tr>" +
            "         <tr>" +
            "            <td>টিএসপি (কেজি)</td>" +
            "            <td>৮০-১০০</td>" +
            "            <td>৩২-৪০</td>" +
            "            <td>০.৩-০.৪</td>" +
            "            <td>১১০-১২০</td>" +
            "            <td>৪৫-৫০</td>" +
            "            <td>১৪-১৭</td>" +
            "         </tr>" +
            "         <tr>" +
            "            <td>এমপি (কেজি)</td>" +
            "            <td>৩০-৫০</td>" +
            "            <td>১২-২০</td>" +
            "            <td>০.১-০.২</td>" +
            "            <td>১৪০-১৭০</td>" +
            "            <td>৫৫-৬৫</td>" +
            "            <td>১৮-২৩</td>" +
            "         </tr>" +
            "      </table>" +
            "<br/>" +
            "আমন মৌসুম<br/>" +
            " <table border = \"1\">" +
            "         <tr>" +
            "            <td>সারের নাম</td>" +
            "            <td>প্রতি হেক্টরে</td>" +
            "            <td>প্রতি একরে</td>" +
            "            <td>প্রতি শতাংশে</td>" +
            "            <td>প্রতি হেক্টরে</td>" +
            "            <td>প্রতি একরে</td>" +
            "            <td>প্রতি শতাংশে</td>" +
            "         </tr>" +
            "         <tr>" +
            "            <td>ইউরিয়া (কেজি)</td>" +
            "            <td>১০০-১২০</td>" +
            "            <td>৪০-৫০</td>" +
            "            <td>০.৪-০.৫</td>" +
            "            <td>১৫০-১৮০</td>" +
            "            <td>৬০-৭০</td>" +
            "            <td>২০-২৪</td>" +
            "         </tr>" +
            "         <tr>" +
            "            <td>টিএসপি (কেজি)</td>" +
            "            <td>৮০-১০০</td>" +
            "            <td>৩২-৪০</td>" +
            "            <td>০.৩-০.৪</td>" +
            "            <td>১১০-১২০</td>" +
            "            <td>৪৫-৫০</td>" +
            "            <td>১৪-১৭</td>" +
            "         </tr>" +
            "         <tr>" +
            "            <td>এমপি (কেজি)</td>" +
            "            <td>৩০-৫০</td>" +
            "            <td>১২-২০</td>" +
            "            <td>০.১-০.২</td>" +
            "            <td>৫০-৭০</td>" +
            "            <td>২০-৩০</td>" +
            "            <td>৭-১০</td>" +
            "         </tr>" +
            "      </table>" +
            "<br/>" +
            "রোপন জন্য জমি তৈরীর শেষ চাষের আগে সম্পূর্ণ টিএসপি, এমওপি এবং জিপসাম জমিতে সমভাবে ছিটিয়ে চাষের মাধ্যমে মাটির সাথে ভালভাবে মিশিয়ে দিতে হবে। ইউরিয়া সারের অর্ধেক পরিমাণ চারা রোপণের ৭-৮ দিন পর এবং বাঁকী অর্ধেক ৩০-৩৫ দিন পর উপরি প্রয়োগ করতে হবে অথবা এক তৃতীয়াংশ চারা রোপনের ৭-৮ দিন পর, এক তৃতীয়াংশ চারা রোপনের ১৮-২০ দিন পর এবং শেষ তৃতীয়াংশ চারা রোপনের ৩০-৩৫ দিন পর জমির উর্বরতার উপর নির্ভর করে প্রয়োগ করতে হবে। অনুর্বর জমিতে হেক্টর প্রতি বোরাক্স ২-৩ কেজি (একর প্রতি ১ কেজি) এবং দসত্মা সার ৪-৫ কেজি (একর প্রতি ২ কেজি) হারে দেয়া যেতে পারে। ইউরিয়া সার প্রয়োগের ২/১ দিন আগে জমির অতিরিক্ত পানি বের করে দিতে হবে এবং প্রয়োজন হলে আগাছা দমন করতে হবে। জমির উর্বরতা ও ফসলের অবস্থায় উপর নির্ভর করে ইউরিয়া সার প্রয়োগ মাত্রার তারতম্য করা যেতে পারে।" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bian_dhan14);

        webView = (WebView) findViewById(R.id.webViewId);
        textView = (TextView) findViewById(R.id.textViewId);

        webView.loadDataWithBaseURL(null,myText,"text/html","utf-8",null);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BianDhan14Activity.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
