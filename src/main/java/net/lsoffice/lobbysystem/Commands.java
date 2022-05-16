package net.lsoffice.lobbysystem;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;
        if (!label.equalsIgnoreCase("hub")) return true;
        if (args.length == 0) player.sendMessage("1.0-SNAPSHOT");

        return false;
    }

}
