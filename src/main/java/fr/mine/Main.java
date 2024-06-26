package fr.mine;

import fr.mine.events.Message;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;

public class Main implements EventListener {

    static JDA jda1;

    public static void main(String[] args) {

        JDA jda = JDABuilder.createDefault("MTI0MTQxNzMxMjcwODQ2MDcxNQ.GuP1Za.GKCueVHUU6GOvdGPreVnTOE_NsxsCM4uDbpn8c")
                .addEventListeners(new Main())
                .addEventListeners(new Message())
                .build();

        jda1 = jda;
    }


    public String getName(){
        return jda1.getSelfUser().getName();
    }

    @Override
    public void onEvent(GenericEvent event) {
        if (event instanceof ReadyEvent)
            System.out.println("API is ready!");
    }
}