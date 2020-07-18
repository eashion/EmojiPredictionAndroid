package com.hrl.chaui.emoji;

import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hrl.chaui.R;
import com.hrl.chaui.util.EmojiUtils;

import java.util.List;

public class EmojiAdapter extends BaseQuickAdapter< EmojiBean,BaseViewHolder> {

    private ArrayMap<String, Integer> emojiMap = EmojiUtils.getEmojiMap(EmojiUtils.EMOTION_CLASSIC_TYPE);

    public EmojiAdapter( @Nullable List<EmojiBean> data, int index, int pageSize) {
         super(R.layout.item_emoji,  data);
     }

    @Override
    protected void convert(BaseViewHolder helper, EmojiBean item) {
        //判断是否为最后一个item
        if (item.getId().equals("[删除]")) {
             helper.setBackgroundRes(R.id.et_emoji, R.mipmap.rc_icon_emoji_delete );
        } else {
//             helper.setText(R.id.et_emoji,item.getUnicodeInt() );
            helper.setBackgroundRes(R.id.et_emoji, emojiMap.get(item.getId()));
        }
    }
}
