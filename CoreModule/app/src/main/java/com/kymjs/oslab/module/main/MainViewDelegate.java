/*
 * Copyright (c) 2015, 张涛.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kymjs.oslab.module.main;

import com.kymjs.oslab.R;
import com.kymjs.themvp.view.AppDelegate;


/**
 * View视图层，完全移除与Presenter业务逻辑的耦合
 *
 * @author kymjs (http://www.kymjs.com/) on 10/23/15.
 */
public class MainViewDelegate extends AppDelegate {

    @Override
    public int getRootLayoutId() {
        return R.layout.activity_main;
    }
}