package dev.chambers.DAOs;

import dev.chambers.entities.ActionCard;
import dev.chambers.entities.Card;
import dev.chambers.entities.CardType;
import dev.chambers.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ActionCardDAO implements CardDao{
    @Override
    public boolean deleteCard(int cardID) {
        return false;
    }

    






    public boolean resetCard(int cardID) {
        try(Connection conn= ConnectionUtil.createConnection()){
            String sql = "update action_cards set is_drawn=false, is_played=false where card_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,cardID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
            else return false;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }


    public boolean drawCard(int cardID) {
        //other card types do not need this function as equipment/powers not drawn
        try(Connection conn= ConnectionUtil.createConnection()){
            String sql = "update action_cards set is_drawn=true where card_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,cardID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
            else return false;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean playCard(int cardID){
        //other card types do not need this function as equipment/powers not discarded upon use
        try(Connection conn= ConnectionUtil.createConnection()){
            String sql = "update action_cards set is_played=true where card_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,cardID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
            else return false;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Card getCardByID(int ID){
        if(ID>52){return new ActionCard();}//set to end of ActionCard IDs
        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "select * from cards where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,ID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                ActionCard card =new ActionCard(ID, CardType.ACTION,rs.getString("card_text"),rs.getInt("action_order"),rs.getString("image_link"),rs.getBoolean("is_drawn"),rs.getBoolean("is_played"));
                return card;
            }
            else {
                return new ActionCard();
            }
        }

    catch (SQLException e){
            e.printStackTrace();
            return new ActionCard();
        }
    }

    @Override
    public ArrayList<Card> getCards(int[] IDs) {
        return null;
    }

}
