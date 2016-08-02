package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class CarShop {
    public static void main(String[] args) {
        buy();
    }

    public static void buy() {
        try {
            tryBuyACar(); // пробуем купить машину. Этот метод может выкинуть несколько типов исключений.
            putCarToGarage(); // код который будет выполняется в нормальном режиме
            celebrateWithFriends();
        } catch (NotEnoughMoneyException ex) {
            System.out.println("Вам не хватает денег на покупку машины");
        } catch (NoMoreCarsException ex) {
            System.out.println("Простите, но машины закончились");
        } finally {
            pleaseLeaveYourFeedback(); // мы в любом случае хотим попросить оставить отзыв
        }
    }

    public static void tryBuyACar() throws NotEnoughMoneyException, NoMoreCarsException {

    }

    public static void putCarToGarage() {

    }

    public static void celebrateWithFriends() {

    }

    public static void pleaseLeaveYourFeedback() {

    }

    static class NotEnoughMoneyException extends Exception {

    }

    static class NoMoreCarsException extends Exception {

    }
}
