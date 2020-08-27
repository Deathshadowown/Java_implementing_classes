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

        person.setWelcomeString();
        person.buyChips();
        person.eatChips();
        person.throwPackatOfChipsInBin();
        person.throwPackatOfChipsOntoTheGround();

    }
}