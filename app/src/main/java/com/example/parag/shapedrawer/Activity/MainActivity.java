package com.example.parag.shapedrawer.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.parag.shapedrawer.Classes.DrawShape;
import com.example.parag.shapedrawer.Classes.Shapes;
import com.example.parag.shapedrawer.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// onClick methods to draw custom shapes

    public void drawCircle(View view){
        Shapes.Circle objCircle = new Shapes.Circle(300); // This value can be get from user
        Shapes obj = new Shapes(objCircle);               // by getText method in each case
        obj.shapes = "Circle";
        setContentView(new DrawShape(this,obj));
    }

    public void drawRectangle(View view){
        Shapes.Rect objRec = new Shapes.Rect(50,400,800,800);
        Shapes obj = new Shapes(objRec);
        obj.shapes = "Rectangle";
        setContentView(new DrawShape(this, obj));
    }

    public void drawSquare(View view){
        Shapes.Rect objRec = new Shapes.Rect(200,200,800,800);
        Shapes obj = new Shapes(objRec);
        obj.shapes = "Rectangle";
        setContentView(new DrawShape(this, obj));
    }

    public void drawTriangle(View view){
        Shapes.Triangle objTriangle = new Shapes.Triangle(400,400,200,600,600,600);
        Shapes obj = new Shapes(objTriangle);
        obj.shapes = "Triangle";
        setContentView(new DrawShape(this,obj));
    }

    public void drawEllipse(View view){
        Shapes.Ellipse objEllipse = new Shapes.Ellipse(750,450,50,50);
        Shapes obj = new Shapes(objEllipse);
        obj.shapes = "Ellipse";
        setContentView(new DrawShape(this, obj));
    }

    public void EXIT (View view){
        finish();
    }


    // Recreating activity when back button is pressed
    @Override
    public void onBackPressed()
    {
        recreate();
    }

}
