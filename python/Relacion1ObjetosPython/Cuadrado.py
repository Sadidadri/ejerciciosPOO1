# coding=utf8
'''
❏❏
Created on 17 ene. 2019
Definición de la clase Cuadrado
@author: d18momoa
'''
class Cuadrado():
    def __init__(self,la):
        self.__lado = la
        
    def __str__(self):
        resultado = ""
        for i in range (0,self.__lado):
            resultado +="■"
        resultado += "\n"  
        for i in range (1,self.__lado - 1):
            resultado += "■"
            resultado += " "*((self.__lado) - 2)
            resultado += "■\n"
        for i in range (0,self.__lado) :
            resultado += "■"  
        resultado += "\n"
        
        return resultado