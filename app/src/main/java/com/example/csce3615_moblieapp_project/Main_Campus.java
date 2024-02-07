package com.example.csce3615_moblieapp_project;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.media.Image;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.core.content.res.ResourcesCompat;

import com.example.csce3615_moblieapp_project.R;


public class Main_Campus extends SurfaceView {
    private Context context;
    Resources res = context.getResources();
    public Main_Campus(Context context) {
        super(context);
    }
    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable myImage = ResourcesCompat.getDrawable(res, R.drawable.main_campus, null);
    }
}



    /*

    Drawable drawable  = Drawable.createFromPath(image);
    //image.setImageDrawable(drawable);

        public void setDrawable(Drawable drawable) {
            this.drawable = drawable;
        }

        public void setImage(String image) {
            this.image = image;
        }
 */
