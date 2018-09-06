package com.cxz.xdialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * @author chenxz
 * @date 2018/9/6
 * @desc
 */
public class XDialog extends Dialog {
    public XDialog(@NonNull Context context) {
        super(context);
    }

    public XDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected XDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}
