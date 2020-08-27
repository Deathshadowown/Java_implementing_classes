/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Person.java                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: svan-nie <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/27 17:36:10 by svan-nie          #+#    #+#             */
/*   Updated: 2020/08/27 17:36:10 by svan-nie         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package src.person;

import src.chips.Chips;
import src.interfacee.Packet;

public class Person{
    private byte age;
    private String name;
    private String lastName;
    private String favouriteChips;

    // public Person(byte age, String name, String lastName, String favouriteChips){
    //     this.age = age;
    //     this.name = name;
    //     this.lastName = lastName;
    //     this.favouriteChips = favouriteChips;
    // }

    public byte getAge()
    {
        return age;
    }
    public void setAge(byte age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getLastName(String name)
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getFavouriteChips(String favouriteChips)
    {
        return favouriteChips;
    }
    public void setFavouriteChips(String favouriteChips)
    {
        this.favouriteChips = favouriteChips;
    }
    public void setWelcomeString()
    {
        System.out.println("Welcome: "+name+" "+lastName);
    }
    //override
    public void buyChips(){
        Chips chips = new Chips();
        System.out.print(name+ " ");
        chips.buy();
        System.out.println("flavour "+(favouriteChips)+" ");
    } 

    public void openChips(){
        Chips chips = new Chips();
        System.out.print(name+ " ");
        chips.open();
    }
    public void eatChips(){
        Chips chips = new Chips();
        System.out.print(name+ " ");
        chips.eat();
    }
    public void throwPackatOfChipsInBin()
    {
        Chips chips = new Chips();
        System.out.print(name+ " ");
        chips.throwInBin();
    }
    public void throwPackatOfChipsOntoTheGround(){
        Chips chips = new Chips();
        System.out.print(name + " ");
        chips.throwOnGround();
    }
}