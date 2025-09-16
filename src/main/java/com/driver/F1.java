package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,isManual);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate

        if(rate<0){
            int speedRate = getCurrentSpeed()*(rate/100);
            newSpeed=getCurrentSpeed()-speedRate;
        }
        int speedRate = getCurrentSpeed()*(rate/100);
        newSpeed=getCurrentSpeed()-speedRate;

        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            changeGear(1);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
            switch (newSpeed/50){
                case 0:
                    changeGear(1);
                    break;
                case 1:
                    changeGear(2);
                    break;
                case 2:
                    changeGear(3);
                    break;
                case 3:
                    changeGear(4);
                    break;
                case 4:
                    changeGear(5);
                    break;
                default:
                    changeGear(6);
                    break;
            }
        }
    }
}
