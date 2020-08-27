/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Chips.java                                         :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: svan-nie <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/27 18:45:58 by svan-nie          #+#    #+#             */
/*   Updated: 2020/08/27 18:45:58 by svan-nie         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package src.chips;

import src.interfacee.Packet ;

public class Chips implements Packet{
    public void buy(){
        System.out.print("Buy's Chips");
    } 
    public void open(){
        System.out.println("Open packet of Chips");
    }
    public void eat(){
        System.out.println("Eat packet of chips");
    }
    public void throwInBin(){
        System.out.println("Throw chip packet into the bin");
    }
    public void throwOnGround()
    {
        System.out.println("Throw chip packet onto the Ground");
    }

}