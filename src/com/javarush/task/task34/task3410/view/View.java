package com.javarush.task.task34.task3410.view;

import com.javarush.task.task34.task3410.controller.Controller;
import com.javarush.task.task34.task3410.controller.EventListener;
import com.javarush.task.task34.task3410.model.GameObjects;


import javax.swing.*;
import java.awt.*;


public class View extends JFrame {

    private Controller controller;
    private Field field;

    public View(Controller controller) throws HeadlessException {
        this.controller = controller;
    }
    public void setEventListener(EventListener eventListener) {
        field.setEventListener(eventListener);
    }
    public void init() {
        field = new Field(this);
        add(field);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Сокобан");
        setVisible(true);
    }
    public void update() {
        field.repaint();
    }
    public GameObjects getGameObjects() {
        return controller.getGameObjects();
    }
    public void completed(int level) {
        update();
        JOptionPane.showMessageDialog(
                this, "Level " + level + " completed!!!",
                "Вы выйграли", JOptionPane.INFORMATION_MESSAGE);
        controller.startNextLevel();
    }
}
