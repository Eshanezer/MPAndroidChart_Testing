package com.example.app164chart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BarChart  barChart =findViewById(R.id.bchart);
        ArrayList<BarEntry> list =new ArrayList<>();

        BarEntry barEntry =new BarEntry(0, 20);
        list.add(barEntry);

        BarEntry barEntry2 =new BarEntry(10, 30);
        list.add(barEntry2);

        BarEntry barEntry3 =new BarEntry(20, 40);
        list.add(barEntry3);

        BarEntry barEntry4 =new BarEntry(30, 50);
        list.add(barEntry4);

        BarEntry barEntry5 =new BarEntry(40, 60);
        list.add(barEntry5);

        BarEntry barEntry6 =new BarEntry(50, 90);
        list.add(barEntry6);

        BarDataSet barDataSet =new BarDataSet(list,"Weelly Sales");
        BarData barData =new BarData(barDataSet);
        barChart.setData(barData);
        barChart.invalidate();

        barChart.setDescription(null);
        barData.setBarWidth(8);
        barChart.setFitBars(true);
        barChart.setPinchZoom(false);
        barChart.setScaleYEnabled(false);
        barChart.setScaleXEnabled(false);

        ArrayList<Integer> color =new ArrayList<>();
        color.add(getColor(R.color.c1));
        color.add(getColor(R.color.c2));
        color.add(getColor(R.color.c3));
        color.add(getColor(R.color.c4));
        color.add(getColor(R.color.c5));
        color.add(getColor(R.color.c6));

        barDataSet.setColors(color);

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

        barChart.getLegend().setCustom(legendEntries);
        barChart.getLegend().setWordWrapEnabled(true);
        barChart.getLegend().setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);

        barChart.animateY(2000, Easing.EaseInCirc);
    }
}
