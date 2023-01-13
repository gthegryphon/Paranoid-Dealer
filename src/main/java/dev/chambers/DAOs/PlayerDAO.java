package dev.chambers.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlayerDAO{
    public Player createPlayer(Player player){
        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "insert into players values(default, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,"");
            ps.setString(2, player.characterName);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                player.playerID = rs.getInt("player_id");
                return player;
            }else{
                return new Player();
            }
        }catch(SQLException e){
            e.printStackTrace();
            return new Player();
        }
    }
    public boolean updatePlayer(Player player){
        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "update players set hand=?, character_name=? where player_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,player.convertHand(player.hand));
            ps.setString(2,player.characterName);
            ps.setInt(3, player.playerID);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{return false;}
            catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
    }
    public boolean deletePlayer(int playerID){
        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "delete from players where player_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,playerID);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{return false;}
            catch(SQLException e){
                e.printStackTrace();
                return false;
            }
        }
    }
    public Player getPlayerByID(int playerID){
        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "select * from players where player_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, playerID);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Player player = new Player(playerID, null, rs.getString("character_name"));
                ArrayList<Integer> hand = player.convertHand(rs.getString("hand"));
                player.setHand(hand);
                return player;
            }else{
                return new Player();
            }
        }catch(SQLException e){
            e.printStackTrace();
            return new Player();
        }
    }
}