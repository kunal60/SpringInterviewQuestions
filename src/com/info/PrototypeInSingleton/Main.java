package com.info.PrototypeInSingleton;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		TicketVendingMachine ticketVendingMachine = ctx.getBean("ticketVendingMachine", TicketVendingMachine.class);
		Ticket ticket = ticketVendingMachine.generateTicket();
		System.out.print(ticket.printTicket());
		System.out.println("with hashcode" + ticket.hashCode());

		TicketVendingMachine ticketVendingMachine1 = ctx.getBean("ticketVendingMachine", TicketVendingMachine.class);
		Ticket ticket1 = ticketVendingMachine1.generateTicket();
		System.out.print(ticket1.printTicket());
		System.out.println("with hashcode" + ticket1.hashCode());
		ctx.close();
	}

}
