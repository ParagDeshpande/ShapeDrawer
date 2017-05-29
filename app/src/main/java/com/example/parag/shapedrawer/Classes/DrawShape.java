package com.example.parag.shapedrawer.Classes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by parag on 29/05/2017.
 */

public class DrawShape extends View {
    Shapes  obj;
    public DrawShape(Context context, Shapes  obj1) {
        super(context);
        obj = obj1;

    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(android.graphics.Color.RED);
        paint.setTextSize(50);

        switch (obj.shapes){
            case "Rectangle":{
                canvas.drawRect(obj.objRect.x2,obj.objRect.y2,obj.objRect.x1,obj.objRect.y1,paint);
                canvas.drawText("AREA = "+obj.objRect.GetArea()+"  sq.cm", 75, 75, paint);
                canvas.drawText("PERIMETER = "+obj.objRect.getParam()+"  cm", 75, 175, paint);
                break;
            }
            case "Circle":{
                int radius = obj.objCir.rad;
                canvas.drawCircle(getPivotX(),getPivotY(),radius,paint);
                canvas.drawText("AREA = "+obj.objCir.getArea()+"  sq.cm", 75, 75, paint);
                canvas.drawText("PERIMETER = "+obj.objCir.getParam()+"  cm", 75, 175, paint);
                break;
            }
            case "Ellipse":{
                RectF oval1 = new RectF( obj.ellipse.x2, obj.ellipse.y2, obj.ellipse.x1,obj.ellipse.y1);
                canvas.drawText("AREA = "+obj.ellipse.getArea()+"  sq.cm", 75, 675, paint);
                canvas.drawText("PERIMETER = (apx)"+obj.ellipse.getParam()+"  cm", 75, 775, paint);
                canvas.drawOval(oval1, paint);
                break;
            }
            case "Triangle":{
                paint.setStrokeWidth(4);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setAntiAlias(true);
                Point a = new Point(obj.triangle.x1, obj.triangle.y1);
                Point b = new Point(obj.triangle.x2, obj.triangle.y2);
                Point c = new Point(obj.triangle.x3, obj.triangle.y3);

                Path path = new Path();
                path.setFillType(Path.FillType.EVEN_ODD);
                path.moveTo(obj.triangle.x1, obj.triangle.y1);
                path.lineTo(a.x, a.y);
                path.lineTo(b.x, b.y);
                path.lineTo(c.x, c.y);
                path.close();
                canvas.drawPath(path, paint);
                canvas.drawText("AREA = "+obj.triangle.getArea()+"  sq.cm", 75, 675, paint);
                break;
            }
            default:{
                break;
            }



        }

    }
}
