package unifor.br.testevuforia;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;

import me.dm7.barcodescanner.core.ViewFinderView;

public class CustomViewFinderView extends ViewFinderView {
    public CustomViewFinderView(Context context) {
        super(context);
    }

    public CustomViewFinderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void drawLaser(Canvas canvas) {
        Rect framingRect = this.getFramingRect();
        int middle = framingRect.height() / 2 + framingRect.top;
        Paint paint = new Paint();
        paint.setARGB(0,0,0,0);
        canvas.drawRect((float)(framingRect.left + 2), (float)(middle - 1), (float)(framingRect.right - 1), (float)(middle + 2), paint);
        this.postInvalidateDelayed(80L, framingRect.left - 10, framingRect.top - 10, framingRect.right + 10, framingRect.bottom + 10);
    }
}
