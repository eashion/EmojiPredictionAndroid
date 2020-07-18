package com.hrl.chaui.bean;


import android.text.SpannableString;
import android.text.SpannableStringBuilder;

public class TextMsgBody extends MsgBody {
     private SpannableStringBuilder message;
     private String extra;

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    public TextMsgBody() {
    }

    public TextMsgBody(SpannableStringBuilder message) {
        this.message = message;
    }

    public SpannableStringBuilder getMessage() {
        return message;
    }

    public void setMessage(SpannableStringBuilder message) {
        this.message = message;
    }



    @Override
    public String toString() {
        return "TextMsgBody{" +
                "message='" + message + '\'' +
                ", extra='" + extra + '\'' +
                '}';
    }
}
