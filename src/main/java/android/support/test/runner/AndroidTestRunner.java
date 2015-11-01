/*
 * Copyright 2015 ZhangZhenli <zhangzhenli@live.com>.
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
package android.support.test.runner;

import android.os.Bundle;

/**
 * Many times we can not access www.google-analytics.com, I do not want to see
 * this network error.
 * 
 * @author ZhangZhenli
 */
public class AndroidTestRunner extends AndroidJUnitRunner {

    @Override
    public void onCreate(final Bundle arguments) {
        arguments.putString("disableAnalytics", "true"); // Don't need espresso calling home for this
        super.onCreate(arguments);
    }
}
