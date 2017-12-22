package sttnf.app.pemira.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

import sttnf.app.pemira.R;

/**
 * Created by isfaaghyth on 12/15/17.
 * github: @isfaaghyth
 */

public class GlideUtil {

    private Context context;
    private ImageView imageView;

    public GlideUtil with(Context context) {
        this.context = context;
        return this;
    }

    public GlideUtil into(ImageView img) {
        this.imageView = img;
        return this;
    }

    public void loadImage(String url) {
        Glide.with(context)
                .load(url)
                .asBitmap()
                .error(R.mipmap.ic_user)
                .placeholder(R.mipmap.ic_user)
                .centerCrop()
                .into(new BitmapImageViewTarget(imageView) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable rounded =
                        RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                rounded.setCircular(true);
                imageView.setImageDrawable(rounded);
            }
        });
    }
}
