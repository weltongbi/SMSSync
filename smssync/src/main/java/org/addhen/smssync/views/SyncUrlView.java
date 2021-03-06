/*
 * Copyright (c) 2010 - 2015 Ushahidi Inc
 * All rights reserved
 * Contact: team@ushahidi.com
 * Website: http://www.ushahidi.com
 * GNU Lesser General Public License Usage
 * This file may be used under the terms of the GNU Lesser
 * General Public License version 3 as published by the Free Software
 * Foundation and appearing in the file LICENSE.LGPL included in the
 * packaging of this file. Please review the following information to
 * ensure the GNU Lesser General Public License version 3 requirements
 * will be met: http://www.gnu.org/licenses/lgpl.html.
 *
 * If you have questions regarding the use of this file, please contact
 * Ushahidi developers at team@ushahidi.com.
 */

package org.addhen.smssync.views;

import android.app.Activity;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.addhen.smssync.R;

public class SyncUrlView extends View {

    @Widget(R.id.start_checkbox)
    public CheckBox enableSmsSync;

    @Widget(R.id.loading_list_progress)
    public ProgressBar listLoadingProgress;

    @Widget(android.R.id.empty)
    public TextView emptyView;

    public SyncUrlView(Activity activity) {
        super(activity);
        emptyView.setText(R.string.no_sync_url);

    }

}
