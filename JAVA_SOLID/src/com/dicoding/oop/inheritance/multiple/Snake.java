package com.dicoding.oop.inheritance.multiple;

//mengatur ketergantungan dari 2 (dua) SuperClass-nya dengan menerapkan interfaces

interface Ovipar{ }

interface Vivipar{ }

interface Ovovivipar extends Ovipar, Vivipar{}

public class Snake implements Ovovivipar{
}
