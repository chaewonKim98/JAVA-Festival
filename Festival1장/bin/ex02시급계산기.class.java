����   4 P  ex02시급계산기  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lex02시급계산기; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   !일한시간을 입력하세요: 
 " $ # java/io/PrintStream % & print (Ljava/lang/String;)V
  ( ) * nextInt ()I  �@ - java/lang/StringBuilder / 총 임금은 
 , 1  &
 , 3 4 5 append (I)Ljava/lang/StringBuilder; 7 원 입니다.
 , 9 4 : -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 , < = > toString ()Ljava/lang/String;
 " @ A & println args [Ljava/lang/String; scan Ljava/util/Scanner; time I bonus money num result StackMapTable C 
SourceFile ex02시급계산기.java !               /     *� �    
                    	           _� Y� � L� � !+� '=L>�6+66� h6� dh`6� � ,Y.� 0� 26� 8� ;� ?�    
   6          	  
 !  %  (  .  4  7  B  ^     H    _ B C    T D E   G F G   C H G  ! > I G  % : J G  ( 7 K G  L    � 7  M   
  N    O