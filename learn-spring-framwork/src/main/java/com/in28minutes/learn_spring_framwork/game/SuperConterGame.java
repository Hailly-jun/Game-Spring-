package com.in28minutes.learn_spring_framwork.game;

	public class SuperConterGame implements GamingConsole{
		public void up() {
			System.out.println("up");
		}
		public void down() {
			System.out.println("Sit down");
		}
		public void left() {
			System.out.println("Go back");
		}
		public void right() {
			System.out.println("Ghoot a bullet");
		}
	}