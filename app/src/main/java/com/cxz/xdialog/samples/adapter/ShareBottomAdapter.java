package com.cxz.xdialog.samples.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cxz.xdialog.samples.R;
import com.cxz.xdialog.samples.bean.ItemBean;

import java.util.List;

/**
 * @author chenxz
 * @date 2018/9/10
 * @desc
 */
public class ShareBottomAdapter extends BaseQuickAdapter<ItemBean, BaseViewHolder> {

    public ShareBottomAdapter(@Nullable List<ItemBean> data) {
        super(R.layout.item_share_bottom_list, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ItemBean item) {
        helper.setText(R.id.tv_share_text, item.getText())
                .setImageResource(R.id.iv_share_icon, item.getIconId());
    }
}
