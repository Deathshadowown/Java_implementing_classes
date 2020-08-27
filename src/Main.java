/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Main.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: svan-nie <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/27 17:31:51 by svan-nie          #+#    #+#             */
/*   Updated: 2020/08/27 17:31:51 by svan-nie         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package src;

import src.person.Person;
import java.util.*;
import src.chips.Chips;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        byte age;
        String name;
        String lastName;
        String favouriteChips;
        System.out.print("Enter name: ");
        System.out.println("Your Name is set to: "+ (name = scan.next()));
        System.out.print("Enter lastName: ");
        System.out.println("Your LastName is set to: "+ (lastName = scan.next()));
        System.out.print("Enter your Age: ");
        System.out.println("Your Age is set to: "+ (age = scan.nextByte()));
        System.out.print("Enter your favouriteChips: ");
        System.out.println("Your FavouriteChips is: "+ (favouriteChips = scan.next()));
        Person person = new Person();
        person.setAge(age);
        person.setName(name);
        person.setLastName(lastName);
        person.setFavouriteChips(favouriteChips);
        int count = 5;
        int[] intarray = {3,1,2};
        int points = 0;
        int growndThrow = 0;
        person.setWelcomeString();
        System.out.println("Please Select a number from 1 to 5, Goal of the game is to pick the correct order. you got 5 chances");
        System.out.println("Need a max of 2 points to win");
        while(count > 2)
        {
            System.out.print("1) eatChips, 2) throwPackatOfChipsInBin, 3) buyChips, 4) throwPackatOfChipsOntoTheGround\n");
            int i = scan.nextInt();
            if (i == 1)
            {
                person.eatChips();
                if(count != 4)
                    points--;
                points++;
            }
            else if (i == 2)
            {
                person.throwPackatOfChipsInBin();
                if (count != 3)
                    points--;
                points++;
            }
            else if (i == 3)
            {
                person.buyChips();
                if (count != 5)
                    points--;
                points++;
            }
            else if (i == 4)
            {
                person.throwPackatOfChipsOntoTheGround();
                points--;
                growndThrow++;
            }
            count--;
        }
        if (points == 3)
        System.out.println(points+" congratulations you won!! you know how to throw away your rubbish after you done with it");
        else if (growndThrow == 1)
        System.out.println(points+" You Loose you really need to look into what to do with your rubbish, once you done with it!!!");
        else
        System.out.println(points+" You Loose Better luck next time");
    }
}