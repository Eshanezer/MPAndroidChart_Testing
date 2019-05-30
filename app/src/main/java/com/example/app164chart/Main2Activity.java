package com.example.app164chart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        LineChart lineChart = findViewById(R.id.LChart);
        ArrayList<Entry> list =new ArrayList<>();

        list.add(new Entry(10, 30));
        list.add(new Entry(20, 50));
        list.add(new Entry(30, 70));
        list.add(new Entry(40, 90));
        list.add(new Entry(50, 110));
        list.add(new Entry(60, 130));

        LineDataSet lineDataSet =new LineDataSet(list,"Weelly Sales");
        LineData lineData =new LineData(lineDataSet);
        lineChart.setData(lineData);
        lineChart.invalidate();

        lineChart.setDescription(null);
/*
        lineChart.setBarWidth(8);
        lineChart.setFitBars(true);
*/
        lineChart.setPinchZoom(false);
        lineChart.setScaleYEnabled(false);
        lineChart.setScaleXEnabled(false);

        ArrayList<Integer> color =new ArrayList<>();
        color.add(getColor(R.color.c1));
        color.add(getColor(R.color.c2));
        color.add(getColor(R.color.c3));
        color.add(getColor(R.color.c4));
        color.add(getColor(R.color.c5));
        color.add(getColor(R.color.c6));

        lineDataSet.setColors(color);

        ArrayList<LegendEntry> legendEntries =new ArrayList<>();

        LegendEntry legendEntry1 =new LegendEntry("Monday", Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getColor(R.color.c1));
        LegendEntry legendEntry2 =new LegendEntry("Tuesday", Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getColor(R.color.c2));
        LegendEntry legendEntry3 =new LegendEntry("Wednesday", Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getColor(R.color.c3));
        LegendEntry legendEntry4 =new LegendEntry("Thursday", Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getColor(R.color.c4));
        LegendEntry legendEntry5 =new LegendEntry("Friday", Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getColor(R.color.c5));
        LegendEntry legendEntry6 =new LegendEntry("Saturday", Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getColor(R.color.c6));

        legendEntries.add(legendEntry1);
        legendEntries.add(legendEntry2);
        legendEntries.add(legendEntry3);
        legendEntries.add(legendEntry4);
        legendEntries.add(legendEntry5);
        legendEntries.add(legendEntry6);

        lineChart.getLegend().setCustom(legendEntries);
        lineChart.getLegend().setWordWrapEnabled(true);
        lineChart.getLegend().setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);

        lineChart.animateY(2000, Easing.EaseInCirc);
    }
}
