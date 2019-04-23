package com.mygdx.game;

import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.ControllerListener;
import com.badlogic.gdx.controllers.Controllers;
import com.badlogic.gdx.controllers.PovDirection;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.mygdx.game.Objects.Player;


public class Gamepad {

    Player player;

    private Array<Controller> controllerList = Controllers.getControllers();
    public Controller controller;



    public Gamepad(Player player){
        this.player = player;

        if (!controllerList.isEmpty()) {
            controller = controllerList.first();
        }
    }



    public void setGamepadListener(){

        Controllers.addListener(new ControllerListener() {
            @Override
            public void connected(Controller controller) {

            }

            @Override
            public void disconnected(Controller controller) {

            }

            @Override
            public boolean buttonDown(Controller controller, int buttonCode) {
                return false;
            }

            @Override
            public boolean buttonUp(Controller controller, int buttonCode) {
                return false;
            }

            @Override
            public boolean axisMoved(Controller controller, int axisCode, float value) {
//                System.out.println("Code: " + axisCode);
//                System.out.println("Value" + value);

                switch (axisCode){
                    case 0:
                        player.speed.x = player.maxSpeed * value;
                        break;
                    case 1:
                        player.speed.y = player.maxSpeed * value;
                        break;
                }

                return false;
            }

            @Override
            public boolean povMoved(Controller controller, int povCode, PovDirection value) {
                return false;
            }

            @Override
            public boolean xSliderMoved(Controller controller, int sliderCode, boolean value) {
                return false;
            }

            @Override
            public boolean ySliderMoved(Controller controller, int sliderCode, boolean value) {
                return false;
            }

            @Override
            public boolean accelerometerMoved(Controller controller, int accelerometerCode, Vector3 value) {
                return false;
            }
        });
    }



}
