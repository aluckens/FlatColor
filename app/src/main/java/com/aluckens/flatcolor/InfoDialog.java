package com.aluckens.flatcolor;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class InfoDialog {


    public void showDialog(final Context context) {
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.infodialogstyle);
        ImageView iv_facebook, iv_instagram, iv_twitter, iv_whatsapp;
        iv_facebook = dialog.findViewById(R.id.iv_facebook);
        iv_instagram = dialog.findViewById(R.id.iv_instagram);
        iv_twitter = dialog.findViewById(R.id.iv_twitter);
        iv_whatsapp = dialog.findViewById(R.id.iv_whatsapp);
        iv_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://api.whatsapp.com/send?phone=+16094593328"));
                context.startActivity(browserIntent);
            }
        });
        iv_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/antoineluckenson"));
                context.startActivity(browserIntent);
            }
        });
        iv_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/kensboujee"));
                context.startActivity(browserIntent);
            }
        });
        iv_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.twitter.com/mrmulatblack"));
                context.startActivity(browserIntent);
            }
        });

        dialog.show();
    }

}
