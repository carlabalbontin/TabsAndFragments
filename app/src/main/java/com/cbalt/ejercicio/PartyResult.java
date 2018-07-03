package com.cbalt.ejercicio;

public class PartyResult extends PartyAnswer {

    public PartyResult(String answer) {
        super(answer);
    }

    public String score(){
        return processing();
    }

    private String processing(){

        String answer = getAnswer();

        if(answer.contains("5")){

            return "Este ejemplo es demasiado estúpido";

        } else if(answer.contains("10")){

            return "Amigx, tranquilx, no tienes nada que probar";

        } else {

            return "Es broma el ejemplo zorrón";

        }
    }

}
