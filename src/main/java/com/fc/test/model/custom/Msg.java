package com.fc.test.model.custom;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by yangyibo on 17/1/17.
 */
@Setter
@Getter
public class Msg {
        private String title;
        private String content;
        private String etraInfo;

        public Msg(String title, String content, String etraInfo) {
            super();
            this.title = title;
            this.content = content;
            this.etraInfo = etraInfo;
        }
    }
