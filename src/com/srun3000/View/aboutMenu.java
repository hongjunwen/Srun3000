package com.srun3000.View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xbc922 on 2016/8/14.
 */
public class aboutMenu extends JTextArea {
    public aboutMenu() {
        setFont(new Font("宋体", Font.BOLD, 40));
        setText("小白菜：\n工科男一枚，热爱技术，喜欢专研。\n英语很渣，很渣，很渣。\n感谢：此作品受AnotherKnife的作品启发开发而来\n微信号(FunnyWu1026)欢迎骚扰。");
        setLineWrap(true);
        setEditable(false);
        setWrapStyleWord(true);
    }
}
