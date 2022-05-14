package se.udemy.elmira.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> emptyOpt = Optional.empty();
        Optional<String> nameOPt = Optional.of("Kathryn");

        /*
        if(nameOPt.isPresent()){
            System.out.println("Hi " + nameOPt.get());
        }else {
            System.out.println("Hi");
        }
         */

        System.out.println("Hi " + nameOPt.orElse(""));
        System.out.println("Hi " + emptyOpt.orElse(""));
    }
}
