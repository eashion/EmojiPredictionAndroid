package com.hrl.chaui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hrl.chaui.R;
import com.hrl.chaui.adapter.ChatAdapter;
import com.hrl.chaui.bean.Message;
import com.hrl.chaui.bean.MsgSendStatus;
import com.hrl.chaui.bean.MsgType;
import com.hrl.chaui.bean.TextMsgBody;
import com.hrl.chaui.util.MomentUiHelper;

import java.util.ArrayList;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MomentActivity extends AppCompatActivity {


    @BindView(R.id.ll_moment_content)
    LinearLayout mLlContent;
    @BindView(R.id.et_emotion)
    EditText mEtContent;
    @BindView(R.id.moment_bottom_layout)
    RelativeLayout mRlBottomLayout;//表情,添加底部布局
    @BindView(R.id.moment_ivEmo)
    ImageView mIvEmo;//表情符号
    @BindView(R.id.moment_rlEmotion)
    LinearLayout mLlEmotion;//表情布局
    @BindView(R.id.rlEmotionSuggestion)
    LinearLayout mLlEmotionSuggestion;//表情推荐布局
    private ChatAdapter mAdapter;
    public static final String mSenderId = "right";
    public static final String mTargetId = "left";
    public static final int REQUEST_CODE_IMAGE = 0000;
    public static final int REQUEST_CODE_VEDIO = 1111;
    public static final int REQUEST_CODE_FILE = 2222;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moment);
        initContent();
    }


    private ImageView ivAudio;

    protected void initContent() {
        ButterKnife.bind(this);
        mAdapter = new ChatAdapter(this, new ArrayList<Message>());
        LinearLayoutManager mLinearLayout = new LinearLayoutManager(this);
        initChatUi();
    }


    private void initChatUi() {
        //mBtnAudio
        final MomentUiHelper mUiHelper = MomentUiHelper.with(this);
        mUiHelper.bindContentLayout(mLlContent)
                .bindEditText(mEtContent)
                .bindBottomLayout(mRlBottomLayout)
                .bindEmojiLayout(mLlEmotion)
                .bindEmojiSuggestionLayout(mLlEmotionSuggestion)
                .bindToEmojiButton(mIvEmo)
                .bindEmojiData(this)
                .bindEmojiSuggestionData(this);
        mUiHelper.showSoftInput();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }


    //文本消息
    private void sendTextMsg(SpannableStringBuilder msg) {
        final Message mMessgae = getBaseSendMessage(MsgType.TEXT);
        TextMsgBody mTextMsgBody = new TextMsgBody();
        mTextMsgBody.setMessage(msg);
        mMessgae.setBody(mTextMsgBody);
        //开始发送
        mAdapter.addData(mMessgae);
        //模拟两秒后发送成功
//        updateMsg(mMessgae);
    }


    private Message getBaseSendMessage(MsgType msgType) {
        Message mMessgae = new Message();
        mMessgae.setUuid(UUID.randomUUID() + "");
        mMessgae.setSenderId(mSenderId);
        mMessgae.setTargetId(mTargetId);
        mMessgae.setSentTime(System.currentTimeMillis());
        mMessgae.setSentStatus(MsgSendStatus.SENDING);
        mMessgae.setMsgType(msgType);
        return mMessgae;
    }


    private Message getBaseReceiveMessage(MsgType msgType) {
        Message mMessgae = new Message();
        mMessgae.setUuid(UUID.randomUUID() + "");
        mMessgae.setSenderId(mTargetId);
        mMessgae.setTargetId(mSenderId);
        mMessgae.setSentTime(System.currentTimeMillis());
        mMessgae.setSentStatus(MsgSendStatus.SENDING);
        mMessgae.setMsgType(msgType);
        return mMessgae;
    }

}
