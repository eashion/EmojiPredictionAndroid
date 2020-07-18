package com.hrl.chaui.util;

import android.support.v4.util.ArrayMap;

import com.hrl.chaui.R;

import java.util.ArrayList;
import java.util.List;

public class EmojiUtils {

    /**
     * 表情类型标志符
     */
    public static final int EMOTION_CLASSIC_TYPE=0x0001;//经典表情

    /**
     * key-表情文字;
     * value-表情图片资源
     */
    public static ArrayMap<String, Integer> EMPTY_MAP;
    public static ArrayMap<String, Integer> EMOTION_CLASSIC_MAP;


    static {
        EMPTY_MAP = new ArrayMap<>();
        EMOTION_CLASSIC_MAP = new ArrayMap<>();

        EMOTION_CLASSIC_MAP.put("[呵呵]", R.drawable.d_hehe);
        EMOTION_CLASSIC_MAP.put("[嘻嘻]", R.drawable.d_xixi);
        EMOTION_CLASSIC_MAP.put("[哈哈]", R.drawable.d_haha);
        EMOTION_CLASSIC_MAP.put("[爱你]", R.drawable.d_aini);
        EMOTION_CLASSIC_MAP.put("[挖鼻屎]", R.drawable.d_wabishi);
        EMOTION_CLASSIC_MAP.put("[吃惊]", R.drawable.d_chijing);
        EMOTION_CLASSIC_MAP.put("[晕]", R.drawable.d_yun);
        EMOTION_CLASSIC_MAP.put("[泪]", R.drawable.d_lei);
        EMOTION_CLASSIC_MAP.put("[馋嘴]", R.drawable.d_chanzui);
        EMOTION_CLASSIC_MAP.put("[抓狂]", R.drawable.d_zhuakuang);
        EMOTION_CLASSIC_MAP.put("[哼]", R.drawable.d_heng);
        EMOTION_CLASSIC_MAP.put("[可爱]", R.drawable.d_keai);
        EMOTION_CLASSIC_MAP.put("[怒]", R.drawable.d_nu);
        EMOTION_CLASSIC_MAP.put("[汗]", R.drawable.d_han);
        EMOTION_CLASSIC_MAP.put("[害羞]", R.drawable.d_haixiu);
        EMOTION_CLASSIC_MAP.put("[睡觉]", R.drawable.d_shuijiao);
        EMOTION_CLASSIC_MAP.put("[钱]", R.drawable.d_qian);
        EMOTION_CLASSIC_MAP.put("[偷笑]", R.drawable.d_touxiao);
        EMOTION_CLASSIC_MAP.put("[笑cry]", R.drawable.d_xiaoku);
        EMOTION_CLASSIC_MAP.put("[doge]", R.drawable.d_doge);
        EMOTION_CLASSIC_MAP.put("[喵喵]", R.drawable.d_miao);
        EMOTION_CLASSIC_MAP.put("[酷]", R.drawable.d_ku);
        EMOTION_CLASSIC_MAP.put("[衰]", R.drawable.d_shuai);
        EMOTION_CLASSIC_MAP.put("[闭嘴]", R.drawable.d_bizui);
        EMOTION_CLASSIC_MAP.put("[鄙视]", R.drawable.d_bishi);
        EMOTION_CLASSIC_MAP.put("[花心]", R.drawable.d_huaxin);
        EMOTION_CLASSIC_MAP.put("[鼓掌]", R.drawable.d_guzhang);
        EMOTION_CLASSIC_MAP.put("[悲伤]", R.drawable.d_beishang);
        EMOTION_CLASSIC_MAP.put("[思考]", R.drawable.d_sikao);
        EMOTION_CLASSIC_MAP.put("[生病]", R.drawable.d_shengbing);
        EMOTION_CLASSIC_MAP.put("[亲亲]", R.drawable.d_qinqin);
        EMOTION_CLASSIC_MAP.put("[怒骂]", R.drawable.d_numa);
        EMOTION_CLASSIC_MAP.put("[太开心]", R.drawable.d_taikaixin);
        EMOTION_CLASSIC_MAP.put("[懒得理你]", R.drawable.d_landelini);
        EMOTION_CLASSIC_MAP.put("[右哼哼]", R.drawable.d_youhengheng);
        EMOTION_CLASSIC_MAP.put("[左哼哼]", R.drawable.d_zuohengheng);
        EMOTION_CLASSIC_MAP.put("[嘘]", R.drawable.d_xu);
        EMOTION_CLASSIC_MAP.put("[委屈]", R.drawable.d_weiqu);
        EMOTION_CLASSIC_MAP.put("[吐]", R.drawable.d_tu);
        EMOTION_CLASSIC_MAP.put("[可怜]", R.drawable.d_kelian);
        EMOTION_CLASSIC_MAP.put("[打哈气]", R.drawable.d_dahaqi);
        EMOTION_CLASSIC_MAP.put("[挤眼]", R.drawable.d_jiyan);
        EMOTION_CLASSIC_MAP.put("[失望]", R.drawable.d_shiwang);
        EMOTION_CLASSIC_MAP.put("[顶]", R.drawable.d_ding);
        EMOTION_CLASSIC_MAP.put("[疑问]", R.drawable.d_yiwen);
        EMOTION_CLASSIC_MAP.put("[困]", R.drawable.d_kun);
        EMOTION_CLASSIC_MAP.put("[感冒]", R.drawable.d_ganmao);
        EMOTION_CLASSIC_MAP.put("[拜拜]", R.drawable.d_baibai);
        EMOTION_CLASSIC_MAP.put("[黑线]", R.drawable.d_heixian);
        EMOTION_CLASSIC_MAP.put("[阴险]", R.drawable.d_yinxian);
        EMOTION_CLASSIC_MAP.put("[打脸]", R.drawable.d_dalian);
        EMOTION_CLASSIC_MAP.put("[傻眼]", R.drawable.d_shayan);
        EMOTION_CLASSIC_MAP.put("[猪头]", R.drawable.d_zhutou);
        EMOTION_CLASSIC_MAP.put("[熊猫]", R.drawable.d_xiongmao);
        EMOTION_CLASSIC_MAP.put("[兔子]", R.drawable.d_tuzi);
    }

    /**
     * 根据名称获取当前表情图标R值
     * @param EmotionType 表情类型标志符
     * @param imgName 名称
     * @return
     */
    public static int getImgByName(int EmotionType,String imgName) {
        Integer integer=null;
        switch (EmotionType){
            case EMOTION_CLASSIC_TYPE:
                integer = EMOTION_CLASSIC_MAP.get(imgName);
                break;
            default:
                LogUtil.d("the emojiMap is null!! Handle Yourself ");
                break;
        }
        return integer == null ? -1 : integer;
    }

    /**
     * 根据类型获取表情数据
     * @param EmotionType
     * @return
     */
    public static ArrayMap<String, Integer> getEmojiMap(int EmotionType){
        ArrayMap EmojiMap=null;
        switch (EmotionType){
            case EMOTION_CLASSIC_TYPE:
                EmojiMap=EMOTION_CLASSIC_MAP;
                break;
            default:
                EmojiMap=EMPTY_MAP;
                break;
        }
        return EmojiMap;
    }

//            emojiIds.add("[哈哈]");
//        emojiIds.add("[嘻嘻]");
//        emojiIds.add("[可爱]");
//        emojiIds.add("[害羞]");
//        emojiIds.add("[呵呵]");
//        emojiIds.add("[鼓掌]");
//        emojiIds.add("[爱你]");


//        emojiIds.add("[可爱]");
//        emojiIds.add("[爱你]");
//        emojiIds.add("[馋嘴]");
//        emojiIds.add("[害羞]");
//        emojiIds.add("[哈哈]");
//        emojiIds.add("[鼓掌]");
//        emojiIds.add("[偷笑]");

    public static List<String> getEmojiSuggestionIds(){
        List<String> emojiIds = new ArrayList<>();
        emojiIds.add("[嘻嘻]");
        emojiIds.add("[思考]");
        emojiIds.add("[可爱]");
        emojiIds.add("[爱你]");
        emojiIds.add("[哈哈]");
        emojiIds.add("[太开心]");
        emojiIds.add("[酷]");
        return emojiIds;
    }

    public static List<String> getEmojiIds(){
        List<String> emojiIds = new ArrayList<>();
        emojiIds.add("[呵呵]");
        emojiIds.add("[嘻嘻]");
        emojiIds.add("[哈哈]");
        emojiIds.add("[爱你]");
        emojiIds.add("[挖鼻屎]");
        emojiIds.add("[吃惊]");
        emojiIds.add("[晕]");
        emojiIds.add("[泪]");
        emojiIds.add("[馋嘴]");
        emojiIds.add("[抓狂]");
        emojiIds.add("[哼]");
        emojiIds.add("[可爱]");
        emojiIds.add("[怒]");
        emojiIds.add("[汗]");
        emojiIds.add("[害羞]");
        emojiIds.add("[睡觉]");
        emojiIds.add("[钱]");
        emojiIds.add("[偷笑]");
        emojiIds.add("[笑cry]");
        emojiIds.add("[doge]");
        emojiIds.add("[喵喵]");
        emojiIds.add("[酷]");
        emojiIds.add("[衰]");
        emojiIds.add("[闭嘴]");
        emojiIds.add("[鄙视]");
        emojiIds.add("[花心]");
        emojiIds.add("[鼓掌]");
        emojiIds.add("[悲伤]");
        emojiIds.add("[思考]");
        emojiIds.add("[生病]");
        emojiIds.add("[亲亲]");
        emojiIds.add("[怒骂]");
        emojiIds.add("[太开心]");
        emojiIds.add("[懒得理你]");
        emojiIds.add("[右哼哼]");
        emojiIds.add("[左哼哼]");
        emojiIds.add("[嘘]");
        emojiIds.add("[委屈]");
        emojiIds.add("[吐]");
        emojiIds.add("[可怜]");
        emojiIds.add("[打哈气]");
        emojiIds.add("[挤眼]");
        emojiIds.add("[失望]");
        emojiIds.add("[顶]");
        emojiIds.add("[疑问]");
        emojiIds.add("[困]");
        emojiIds.add("[感冒]");
        emojiIds.add("[拜拜]");
        emojiIds.add("[黑线]");
        emojiIds.add("[阴险]");
        emojiIds.add("[打脸]");
        emojiIds.add("[傻眼]");
        emojiIds.add("[猪头]");
        emojiIds.add("[熊猫]");
        emojiIds.add("[兔子]");
        return emojiIds;
    }
}
