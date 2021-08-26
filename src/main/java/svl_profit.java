/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author diego
 */
@WebServlet(urlPatterns = {"/svl_profit"})
public class svl_profit extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        if (request.getParameter("accion") != null) {
            String accion = request.getParameter("accion").toLowerCase();
            switch(accion){
                case"profit_capasf":{
                    JSONArray resp=new JSONArray();
                    JSONArray receta=new JSONArray("[{\"capa\":\"T4_CAPEITEM_FW_MARTLOCK\",\"corazon\":\"T1_FACTION_HIGHLAND_TOKEN_1\",\"sello\":\"T4_CAPEITEM_FW_MARTLOCK_BP\",\"nombre_capa\":\"CAPA_MART\"},{\"capa\":\"T4_CAPEITEM_FW_BRIDGEWATCH\",\"corazon\":\"T1_FACTION_STEPPE_TOKEN_1\",\"sello\":\"T4_CAPEITEM_FW_BRIDGEWATCH_BP\",\"nombre_capa\":\"CAPA_BRIDGE\"},{\"capa\":\"T4_CAPEITEM_FW_THETFORD\",\"corazon\":\"T1_FACTION_SWAMP_TOKEN_1\",\"sello\":\"T4_CAPEITEM_FW_THETFORD_BP\",\"nombre_capa\":\"CAPA_THET\"},{\"capa\":\"T4_CAPEITEM_FW_FORTSTERLING\",\"corazon\":\"T1_FACTION_MOUNTAIN_TOKEN_1\",\"sello\":\"T4_CAPEITEM_FW_FORTSTERLING_BP\",\"nombre_capa\":\"CAPA_FORT\"},{\"capa\":\"T4_CAPEITEM_FW_LYMHURST\",\"corazon\":\"T1_FACTION_FOREST_TOKEN_1\",\"sello\":\"T4_CAPEITEM_FW_LYMHURST_BP\",\"nombre_capa\":\"CAPA_LYM\"}]");
                    JSONArray ciudades=new JSONArray("[{\"ciudad\":\"Bridgewatch\"},{\"ciudad\":\"Fort Sterling\"},{\"ciudad\":\"Lymhurst\"},{\"ciudad\":\"Martlock\"},{\"ciudad\":\"Thetford\"}]");
                    ConsumirApi consultas=new ConsumirApi();
                    
                    JSONArray consulta_suprema=new JSONArray(consultas.peticionHttpGet("https://www.albion-online-data.com/api/v2/stats/prices/T4_CAPE,T4_CAPEITEM_FW_MARTLOCK,T1_FACTION_HIGHLAND_TOKEN_1,T4_CAPEITEM_FW_MARTLOCK_BP,T4_CAPEITEM_FW_BRIDGEWATCH,T1_FACTION_STEPPE_TOKEN_1,T4_CAPEITEM_FW_BRIDGEWATCH_BP,T4_CAPEITEM_FW_THETFORD,T1_FACTION_SWAMP_TOKEN_1,T4_CAPEITEM_FW_THETFORD_BP,T4_CAPEITEM_FW_FORTSTERLING,T1_FACTION_MOUNTAIN_TOKEN_1,T4_CAPEITEM_FW_FORTSTERLING_BP,T4_CAPEITEM_FW_LYMHURST,T1_FACTION_FOREST_TOKEN_1,T4_CAPEITEM_FW_LYMHURST_BP?locations=Martlock,Bridgewatch,Fortsterling,Thetford,Lymhurst&qualities=1"));
                    //JSONArray consulta_suprema=new JSONArray("[{\"item_id\":\"T1_FACTION_FOREST_TOKEN_1\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":42967,\"sell_price_min_date\":\"2021-08-24T13:30:00\",\"sell_price_max\":80000,\"sell_price_max_date\":\"2021-08-24T13:30:00\",\"buy_price_min\":2,\"buy_price_min_date\":\"2021-08-24T13:30:00\",\"buy_price_max\":41010,\"buy_price_max_date\":\"2021-08-24T13:30:00\"},{\"item_id\":\"T1_FACTION_FOREST_TOKEN_1\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":42693,\"sell_price_min_date\":\"2021-08-24T17:05:00\",\"sell_price_max\":42693,\"sell_price_max_date\":\"2021-08-24T17:05:00\",\"buy_price_min\":2,\"buy_price_min_date\":\"2021-08-24T11:40:00\",\"buy_price_max\":43001,\"buy_price_max_date\":\"2021-08-24T11:40:00\"},{\"item_id\":\"T1_FACTION_FOREST_TOKEN_1\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":43844,\"sell_price_min_date\":\"2021-08-24T20:40:00\",\"sell_price_max\":43844,\"sell_price_max_date\":\"2021-08-24T20:40:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T20:35:00\",\"buy_price_max\":42001,\"buy_price_max_date\":\"2021-08-24T20:35:00\"},{\"item_id\":\"T1_FACTION_FOREST_TOKEN_1\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":47999,\"sell_price_min_date\":\"2021-08-24T19:05:00\",\"sell_price_max\":100000,\"sell_price_max_date\":\"2021-08-24T19:05:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T18:45:00\",\"buy_price_max\":43005,\"buy_price_max_date\":\"2021-08-24T18:45:00\"},{\"item_id\":\"T1_FACTION_FOREST_TOKEN_1\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":0,\"sell_price_min_date\":\"0001-01-01T00:00:00\",\"sell_price_max\":0,\"sell_price_max_date\":\"0001-01-01T00:00:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T1_FACTION_HIGHLAND_TOKEN_1\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":40499,\"sell_price_min_date\":\"2021-08-24T13:30:00\",\"sell_price_max\":44999,\"sell_price_max_date\":\"2021-08-24T13:30:00\",\"buy_price_min\":2,\"buy_price_min_date\":\"2021-08-24T13:30:00\",\"buy_price_max\":37001,\"buy_price_max_date\":\"2021-08-24T13:30:00\"},{\"item_id\":\"T1_FACTION_HIGHLAND_TOKEN_1\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":41193,\"sell_price_min_date\":\"2021-08-24T17:00:00\",\"sell_price_max\":48775,\"sell_price_max_date\":\"2021-08-24T17:00:00\",\"buy_price_min\":2,\"buy_price_min_date\":\"2021-08-24T17:00:00\",\"buy_price_max\":39681,\"buy_price_max_date\":\"2021-08-24T17:00:00\"},{\"item_id\":\"T1_FACTION_HIGHLAND_TOKEN_1\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":40996,\"sell_price_min_date\":\"2021-08-24T20:35:00\",\"sell_price_max\":43150,\"sell_price_max_date\":\"2021-08-24T20:35:00\",\"buy_price_min\":2,\"buy_price_min_date\":\"2021-08-24T13:40:00\",\"buy_price_max\":39504,\"buy_price_max_date\":\"2021-08-24T13:40:00\"},{\"item_id\":\"T1_FACTION_HIGHLAND_TOKEN_1\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":40000,\"sell_price_min_date\":\"2021-08-24T20:40:00\",\"sell_price_max\":40000,\"sell_price_max_date\":\"2021-08-24T20:40:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T20:35:00\",\"buy_price_max\":38716,\"buy_price_max_date\":\"2021-08-24T20:35:00\"},{\"item_id\":\"T1_FACTION_HIGHLAND_TOKEN_1\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":41374,\"sell_price_min_date\":\"2021-08-24T11:30:00\",\"sell_price_max\":46799,\"sell_price_max_date\":\"2021-08-24T11:30:00\",\"buy_price_min\":2,\"buy_price_min_date\":\"2021-08-24T11:30:00\",\"buy_price_max\":39299,\"buy_price_max_date\":\"2021-08-24T11:30:00\"},{\"item_id\":\"T1_FACTION_MOUNTAIN_TOKEN_1\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":46645,\"sell_price_min_date\":\"2021-08-24T14:05:00\",\"sell_price_max\":60000,\"sell_price_max_date\":\"2021-08-24T14:05:00\",\"buy_price_min\":2,\"buy_price_min_date\":\"2021-08-24T14:05:00\",\"buy_price_max\":42206,\"buy_price_max_date\":\"2021-08-24T14:05:00\"},{\"item_id\":\"T1_FACTION_MOUNTAIN_TOKEN_1\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":45852,\"sell_price_min_date\":\"2021-08-24T20:10:00\",\"sell_price_max\":46500,\"sell_price_max_date\":\"2021-08-24T20:10:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T20:15:00\",\"buy_price_max\":1,\"buy_price_max_date\":\"2021-08-24T20:15:00\"},{\"item_id\":\"T1_FACTION_MOUNTAIN_TOKEN_1\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":49870,\"sell_price_min_date\":\"2021-08-24T19:45:00\",\"sell_price_max\":52999,\"sell_price_max_date\":\"2021-08-24T19:45:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T1_FACTION_MOUNTAIN_TOKEN_1\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":49996,\"sell_price_min_date\":\"2021-08-24T18:40:00\",\"sell_price_max\":1200000,\"sell_price_max_date\":\"2021-08-24T18:40:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T19:35:00\",\"buy_price_max\":43300,\"buy_price_max_date\":\"2021-08-24T19:35:00\"},{\"item_id\":\"T1_FACTION_MOUNTAIN_TOKEN_1\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":49996,\"sell_price_min_date\":\"2021-08-24T16:25:00\",\"sell_price_max\":1000000,\"sell_price_max_date\":\"2021-08-24T16:25:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T16:25:00\",\"buy_price_max\":41664,\"buy_price_max_date\":\"2021-08-24T16:25:00\"},{\"item_id\":\"T1_FACTION_STEPPE_TOKEN_1\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":41987,\"sell_price_min_date\":\"2021-08-24T16:50:00\",\"sell_price_max\":41987,\"sell_price_max_date\":\"2021-08-24T16:50:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T20:45:00\",\"buy_price_max\":40065,\"buy_price_max_date\":\"2021-08-24T20:45:00\"},{\"item_id\":\"T1_FACTION_STEPPE_TOKEN_1\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":43992,\"sell_price_min_date\":\"2021-08-24T17:00:00\",\"sell_price_max\":43993,\"sell_price_max_date\":\"2021-08-24T17:00:00\",\"buy_price_min\":2,\"buy_price_min_date\":\"2021-08-24T15:35:00\",\"buy_price_max\":41534,\"buy_price_max_date\":\"2021-08-24T15:35:00\"},{\"item_id\":\"T1_FACTION_STEPPE_TOKEN_1\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":43599,\"sell_price_min_date\":\"2021-08-24T20:35:00\",\"sell_price_max\":50980,\"sell_price_max_date\":\"2021-08-24T20:35:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T13:40:00\",\"buy_price_max\":39145,\"buy_price_max_date\":\"2021-08-24T13:40:00\"},{\"item_id\":\"T1_FACTION_STEPPE_TOKEN_1\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":42745,\"sell_price_min_date\":\"2021-08-24T19:45:00\",\"sell_price_max\":499000,\"sell_price_max_date\":\"2021-08-24T19:45:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T18:55:00\",\"buy_price_max\":40200,\"buy_price_max_date\":\"2021-08-24T18:55:00\"},{\"item_id\":\"T1_FACTION_STEPPE_TOKEN_1\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":0,\"sell_price_min_date\":\"0001-01-01T00:00:00\",\"sell_price_max\":0,\"sell_price_max_date\":\"0001-01-01T00:00:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T1_FACTION_SWAMP_TOKEN_1\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":44000,\"sell_price_min_date\":\"2021-08-24T15:55:00\",\"sell_price_max\":57000,\"sell_price_max_date\":\"2021-08-24T15:55:00\",\"buy_price_min\":42201,\"buy_price_min_date\":\"2021-08-24T06:50:00\",\"buy_price_max\":42600,\"buy_price_max_date\":\"2021-08-24T06:50:00\"},{\"item_id\":\"T1_FACTION_SWAMP_TOKEN_1\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":43499,\"sell_price_min_date\":\"2021-08-24T17:05:00\",\"sell_price_max\":43499,\"sell_price_max_date\":\"2021-08-24T17:05:00\",\"buy_price_min\":2,\"buy_price_min_date\":\"2021-08-24T11:40:00\",\"buy_price_max\":43000,\"buy_price_max_date\":\"2021-08-24T11:40:00\"},{\"item_id\":\"T1_FACTION_SWAMP_TOKEN_1\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":0,\"sell_price_min_date\":\"0001-01-01T00:00:00\",\"sell_price_max\":0,\"sell_price_max_date\":\"0001-01-01T00:00:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T1_FACTION_SWAMP_TOKEN_1\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":42897,\"sell_price_min_date\":\"2021-08-24T18:40:00\",\"sell_price_max\":49999,\"sell_price_max_date\":\"2021-08-24T18:40:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T18:40:00\",\"buy_price_max\":40508,\"buy_price_max_date\":\"2021-08-24T18:40:00\"},{\"item_id\":\"T1_FACTION_SWAMP_TOKEN_1\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":46399,\"sell_price_min_date\":\"2021-08-24T19:05:00\",\"sell_price_max\":46400,\"sell_price_max_date\":\"2021-08-24T19:05:00\",\"buy_price_min\":43300,\"buy_price_min_date\":\"2021-08-24T19:05:00\",\"buy_price_max\":43300,\"buy_price_max_date\":\"2021-08-24T19:05:00\"},{\"item_id\":\"T4_CAPE\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":1062,\"sell_price_min_date\":\"2021-08-24T11:35:00\",\"sell_price_max\":1258,\"sell_price_max_date\":\"2021-08-24T11:35:00\",\"buy_price_min\":465,\"buy_price_min_date\":\"2021-08-24T17:20:00\",\"buy_price_max\":669,\"buy_price_max_date\":\"2021-08-24T17:20:00\"},{\"item_id\":\"T4_CAPE\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":1385,\"sell_price_min_date\":\"2021-08-24T19:35:00\",\"sell_price_max\":1385,\"sell_price_max_date\":\"2021-08-24T19:35:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T17:40:00\",\"buy_price_max\":640,\"buy_price_max_date\":\"2021-08-24T17:40:00\"},{\"item_id\":\"T4_CAPE\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":883,\"sell_price_min_date\":\"2021-08-24T20:35:00\",\"sell_price_max\":897,\"sell_price_max_date\":\"2021-08-24T20:35:00\",\"buy_price_min\":567,\"buy_price_min_date\":\"2021-08-24T18:10:00\",\"buy_price_max\":800,\"buy_price_max_date\":\"2021-08-24T18:10:00\"},{\"item_id\":\"T4_CAPE\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":776,\"sell_price_min_date\":\"2021-08-24T18:45:00\",\"sell_price_max\":791,\"sell_price_max_date\":\"2021-08-24T18:45:00\",\"buy_price_min\":450,\"buy_price_min_date\":\"2021-08-24T17:55:00\",\"buy_price_max\":700,\"buy_price_max_date\":\"2021-08-24T17:55:00\"},{\"item_id\":\"T4_CAPE\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":848,\"sell_price_min_date\":\"2021-08-24T13:40:00\",\"sell_price_max\":975,\"sell_price_max_date\":\"2021-08-24T13:40:00\",\"buy_price_min\":734,\"buy_price_min_date\":\"2021-08-24T16:30:00\",\"buy_price_max\":734,\"buy_price_max_date\":\"2021-08-24T16:30:00\"},{\"item_id\":\"T4_CAPEITEM_FW_BRIDGEWATCH\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":51993,\"sell_price_min_date\":\"2021-08-24T09:30:00\",\"sell_price_max\":53494,\"sell_price_max_date\":\"2021-08-24T09:30:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_BRIDGEWATCH\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":51999,\"sell_price_min_date\":\"2021-08-24T19:35:00\",\"sell_price_max\":59500,\"sell_price_max_date\":\"2021-08-24T19:35:00\",\"buy_price_min\":206,\"buy_price_min_date\":\"2021-08-24T19:35:00\",\"buy_price_max\":45534,\"buy_price_max_date\":\"2021-08-24T19:35:00\"},{\"item_id\":\"T4_CAPEITEM_FW_BRIDGEWATCH\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":53998,\"sell_price_min_date\":\"2021-08-24T04:55:00\",\"sell_price_max\":53999,\"sell_price_max_date\":\"2021-08-24T04:55:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_BRIDGEWATCH\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":53995,\"sell_price_min_date\":\"2021-08-24T07:40:00\",\"sell_price_max\":53998,\"sell_price_max_date\":\"2021-08-24T07:40:00\",\"buy_price_min\":22,\"buy_price_min_date\":\"2021-08-23T21:30:00\",\"buy_price_max\":22,\"buy_price_max_date\":\"2021-08-23T21:30:00\"},{\"item_id\":\"T4_CAPEITEM_FW_BRIDGEWATCH\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":51994,\"sell_price_min_date\":\"2021-08-24T19:50:00\",\"sell_price_max\":51999,\"sell_price_max_date\":\"2021-08-24T19:50:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_BRIDGEWATCH_BP\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":1754,\"sell_price_min_date\":\"2021-08-24T00:30:00\",\"sell_price_max\":1754,\"sell_price_max_date\":\"2021-08-24T00:30:00\",\"buy_price_min\":1501,\"buy_price_min_date\":\"2021-08-24T00:30:00\",\"buy_price_max\":1501,\"buy_price_max_date\":\"2021-08-24T00:30:00\"},{\"item_id\":\"T4_CAPEITEM_FW_BRIDGEWATCH_BP\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":5000,\"sell_price_min_date\":\"2021-08-24T19:55:00\",\"sell_price_max\":9999,\"sell_price_max_date\":\"2021-08-24T19:55:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T20:45:00\",\"buy_price_max\":1,\"buy_price_max_date\":\"2021-08-24T20:45:00\"},{\"item_id\":\"T4_CAPEITEM_FW_BRIDGEWATCH_BP\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":2929,\"sell_price_min_date\":\"2021-08-24T19:45:00\",\"sell_price_max\":3169,\"sell_price_max_date\":\"2021-08-24T19:45:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_BRIDGEWATCH_BP\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":3000,\"sell_price_min_date\":\"2021-08-24T18:45:00\",\"sell_price_max\":9999,\"sell_price_max_date\":\"2021-08-24T18:45:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T19:10:00\",\"buy_price_max\":1111,\"buy_price_max_date\":\"2021-08-24T19:10:00\"},{\"item_id\":\"T4_CAPEITEM_FW_BRIDGEWATCH_BP\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":2349,\"sell_price_min_date\":\"2021-08-24T18:50:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T18:50:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_FORTSTERLING\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":56199,\"sell_price_min_date\":\"2021-08-24T19:20:00\",\"sell_price_max\":61479,\"sell_price_max_date\":\"2021-08-24T19:20:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T14:30:00\",\"buy_price_max\":43015,\"buy_price_max_date\":\"2021-08-24T14:30:00\"},{\"item_id\":\"T4_CAPEITEM_FW_FORTSTERLING\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":55000,\"sell_price_min_date\":\"2021-08-24T19:35:00\",\"sell_price_max\":55000,\"sell_price_max_date\":\"2021-08-24T19:35:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T19:35:00\",\"buy_price_max\":44607,\"buy_price_max_date\":\"2021-08-24T19:35:00\"},{\"item_id\":\"T4_CAPEITEM_FW_FORTSTERLING\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":58999,\"sell_price_min_date\":\"2021-08-24T17:55:00\",\"sell_price_max\":68499,\"sell_price_max_date\":\"2021-08-24T17:55:00\",\"buy_price_min\":10,\"buy_price_min_date\":\"2021-08-24T17:55:00\",\"buy_price_max\":47031,\"buy_price_max_date\":\"2021-08-24T17:55:00\"},{\"item_id\":\"T4_CAPEITEM_FW_FORTSTERLING\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":65000,\"sell_price_min_date\":\"2021-08-24T14:35:00\",\"sell_price_max\":68491,\"sell_price_max_date\":\"2021-08-24T14:35:00\",\"buy_price_min\":45309,\"buy_price_min_date\":\"2021-08-24T11:35:00\",\"buy_price_max\":45309,\"buy_price_max_date\":\"2021-08-24T11:35:00\"},{\"item_id\":\"T4_CAPEITEM_FW_FORTSTERLING\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":57355,\"sell_price_min_date\":\"2021-08-24T16:10:00\",\"sell_price_max\":57355,\"sell_price_max_date\":\"2021-08-24T16:10:00\",\"buy_price_min\":45401,\"buy_price_min_date\":\"2021-08-24T13:50:00\",\"buy_price_max\":45401,\"buy_price_max_date\":\"2021-08-24T13:50:00\"},{\"item_id\":\"T4_CAPEITEM_FW_FORTSTERLING_BP\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":5496,\"sell_price_min_date\":\"2021-08-24T19:20:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T19:20:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_FORTSTERLING_BP\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":5997,\"sell_price_min_date\":\"2021-08-24T19:20:00\",\"sell_price_max\":6794,\"sell_price_max_date\":\"2021-08-24T19:20:00\",\"buy_price_min\":2,\"buy_price_min_date\":\"2021-08-24T10:45:00\",\"buy_price_max\":4500,\"buy_price_max_date\":\"2021-08-24T10:45:00\"},{\"item_id\":\"T4_CAPEITEM_FW_FORTSTERLING_BP\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":6100,\"sell_price_min_date\":\"2021-08-24T14:35:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T14:35:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_FORTSTERLING_BP\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":5986,\"sell_price_min_date\":\"2021-08-24T19:45:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T19:45:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T19:10:00\",\"buy_price_max\":4584,\"buy_price_max_date\":\"2021-08-24T19:10:00\"},{\"item_id\":\"T4_CAPEITEM_FW_FORTSTERLING_BP\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":5794,\"sell_price_min_date\":\"2021-08-24T19:05:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T19:05:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_LYMHURST\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":53068,\"sell_price_min_date\":\"2021-08-24T19:35:00\",\"sell_price_max\":58000,\"sell_price_max_date\":\"2021-08-24T19:35:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_LYMHURST\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":56000,\"sell_price_min_date\":\"2021-08-24T15:40:00\",\"sell_price_max\":56000,\"sell_price_max_date\":\"2021-08-24T15:40:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_LYMHURST\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":54930,\"sell_price_min_date\":\"2021-08-24T18:25:00\",\"sell_price_max\":54937,\"sell_price_max_date\":\"2021-08-24T18:25:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T18:25:00\",\"buy_price_max\":41049,\"buy_price_max_date\":\"2021-08-24T18:25:00\"},{\"item_id\":\"T4_CAPEITEM_FW_LYMHURST\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":55950,\"sell_price_min_date\":\"2021-08-24T17:50:00\",\"sell_price_max\":59969,\"sell_price_max_date\":\"2021-08-24T17:50:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_LYMHURST\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":53998,\"sell_price_min_date\":\"2021-08-24T19:50:00\",\"sell_price_max\":53999,\"sell_price_max_date\":\"2021-08-24T19:50:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_LYMHURST_BP\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":6898,\"sell_price_min_date\":\"2021-08-24T19:35:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T19:35:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_LYMHURST_BP\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":7693,\"sell_price_min_date\":\"2021-08-24T15:40:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T15:40:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_LYMHURST_BP\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":6199,\"sell_price_min_date\":\"2021-08-24T20:20:00\",\"sell_price_max\":8000,\"sell_price_max_date\":\"2021-08-24T20:20:00\",\"buy_price_min\":2,\"buy_price_min_date\":\"2021-08-24T11:40:00\",\"buy_price_max\":6001,\"buy_price_max_date\":\"2021-08-24T11:40:00\"},{\"item_id\":\"T4_CAPEITEM_FW_LYMHURST_BP\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":7060,\"sell_price_min_date\":\"2021-08-24T18:45:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T18:45:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T18:40:00\",\"buy_price_max\":4007,\"buy_price_max_date\":\"2021-08-24T18:40:00\"},{\"item_id\":\"T4_CAPEITEM_FW_LYMHURST_BP\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":7000,\"sell_price_min_date\":\"2021-08-24T05:25:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T05:25:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_MARTLOCK\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":54488,\"sell_price_min_date\":\"2021-08-24T10:55:00\",\"sell_price_max\":55987,\"sell_price_max_date\":\"2021-08-24T10:55:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_MARTLOCK\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":55544,\"sell_price_min_date\":\"2021-08-24T17:00:00\",\"sell_price_max\":58395,\"sell_price_max_date\":\"2021-08-24T17:00:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_MARTLOCK\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":57000,\"sell_price_min_date\":\"2021-08-24T20:35:00\",\"sell_price_max\":58000,\"sell_price_max_date\":\"2021-08-24T20:35:00\",\"buy_price_min\":10,\"buy_price_min_date\":\"2021-08-23T23:35:00\",\"buy_price_max\":46009,\"buy_price_max_date\":\"2021-08-23T23:35:00\"},{\"item_id\":\"T4_CAPEITEM_FW_MARTLOCK\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":53991,\"sell_price_min_date\":\"2021-08-24T20:35:00\",\"sell_price_max\":55838,\"sell_price_max_date\":\"2021-08-24T20:35:00\",\"buy_price_min\":1055,\"buy_price_min_date\":\"2021-08-24T17:25:00\",\"buy_price_max\":45001,\"buy_price_max_date\":\"2021-08-24T17:25:00\"},{\"item_id\":\"T4_CAPEITEM_FW_MARTLOCK\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":53954,\"sell_price_min_date\":\"2021-08-24T19:50:00\",\"sell_price_max\":54000,\"sell_price_max_date\":\"2021-08-24T19:50:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_MARTLOCK_BP\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":6300,\"sell_price_min_date\":\"2021-08-24T19:20:00\",\"sell_price_max\":19997,\"sell_price_max_date\":\"2021-08-24T19:20:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_MARTLOCK_BP\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":7398,\"sell_price_min_date\":\"2021-08-24T17:00:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T17:00:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T20:45:00\",\"buy_price_max\":1,\"buy_price_max_date\":\"2021-08-24T20:45:00\"},{\"item_id\":\"T4_CAPEITEM_FW_MARTLOCK_BP\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":7199,\"sell_price_min_date\":\"2021-08-24T20:35:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T20:35:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_MARTLOCK_BP\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":5484,\"sell_price_min_date\":\"2021-08-24T20:35:00\",\"sell_price_max\":6500,\"sell_price_max_date\":\"2021-08-24T20:35:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T18:45:00\",\"buy_price_max\":5121,\"buy_price_max_date\":\"2021-08-24T18:45:00\"},{\"item_id\":\"T4_CAPEITEM_FW_MARTLOCK_BP\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":0,\"sell_price_min_date\":\"0001-01-01T00:00:00\",\"sell_price_max\":0,\"sell_price_max_date\":\"0001-01-01T00:00:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_THETFORD\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":63998,\"sell_price_min_date\":\"2021-08-24T18:20:00\",\"sell_price_max\":65999,\"sell_price_max_date\":\"2021-08-24T18:20:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_THETFORD\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":61746,\"sell_price_min_date\":\"2021-08-24T19:35:00\",\"sell_price_max\":62960,\"sell_price_max_date\":\"2021-08-24T19:35:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T19:35:00\",\"buy_price_max\":48062,\"buy_price_max_date\":\"2021-08-24T19:35:00\"},{\"item_id\":\"T4_CAPEITEM_FW_THETFORD\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":67499,\"sell_price_min_date\":\"2021-08-24T17:05:00\",\"sell_price_max\":67499,\"sell_price_max_date\":\"2021-08-24T17:05:00\",\"buy_price_min\":10,\"buy_price_min_date\":\"2021-08-24T19:40:00\",\"buy_price_max\":55010,\"buy_price_max_date\":\"2021-08-24T19:40:00\"},{\"item_id\":\"T4_CAPEITEM_FW_THETFORD\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":61950,\"sell_price_min_date\":\"2021-08-24T18:25:00\",\"sell_price_max\":64892,\"sell_price_max_date\":\"2021-08-24T18:25:00\",\"buy_price_min\":22,\"buy_price_min_date\":\"2021-08-23T21:30:00\",\"buy_price_max\":22,\"buy_price_max_date\":\"2021-08-23T21:30:00\"},{\"item_id\":\"T4_CAPEITEM_FW_THETFORD\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":57476,\"sell_price_min_date\":\"2021-08-24T19:55:00\",\"sell_price_max\":60000,\"sell_price_max_date\":\"2021-08-24T19:55:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T19:05:00\",\"buy_price_max\":48204,\"buy_price_max_date\":\"2021-08-24T19:05:00\"},{\"item_id\":\"T4_CAPEITEM_FW_THETFORD_BP\",\"city\":\"Bridgewatch\",\"quality\":1,\"sell_price_min\":7790,\"sell_price_min_date\":\"2021-08-24T18:20:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T18:20:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_THETFORD_BP\",\"city\":\"Fort Sterling\",\"quality\":1,\"sell_price_min\":7476,\"sell_price_min_date\":\"2021-08-24T19:40:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T19:40:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T20:45:00\",\"buy_price_max\":1,\"buy_price_max_date\":\"2021-08-24T20:45:00\"},{\"item_id\":\"T4_CAPEITEM_FW_THETFORD_BP\",\"city\":\"Lymhurst\",\"quality\":1,\"sell_price_min\":7548,\"sell_price_min_date\":\"2021-08-24T17:05:00\",\"sell_price_max\":23695,\"sell_price_max_date\":\"2021-08-24T17:05:00\",\"buy_price_min\":0,\"buy_price_min_date\":\"0001-01-01T00:00:00\",\"buy_price_max\":0,\"buy_price_max_date\":\"0001-01-01T00:00:00\"},{\"item_id\":\"T4_CAPEITEM_FW_THETFORD_BP\",\"city\":\"Martlock\",\"quality\":1,\"sell_price_min\":7683,\"sell_price_min_date\":\"2021-08-24T19:25:00\",\"sell_price_max\":19999,\"sell_price_max_date\":\"2021-08-24T19:25:00\",\"buy_price_min\":1,\"buy_price_min_date\":\"2021-08-24T18:55:00\",\"buy_price_max\":6500,\"buy_price_max_date\":\"2021-08-24T18:55:00\"},{\"item_id\":\"T4_CAPEITEM_FW_THETFORD_BP\",\"city\":\"Thetford\",\"quality\":1,\"sell_price_min\":6387,\"sell_price_min_date\":\"2021-08-24T19:05:00\",\"sell_price_max\":6800,\"sell_price_max_date\":\"2021-08-24T19:05:00\",\"buy_price_min\":6100,\"buy_price_min_date\":\"2021-08-24T20:35:00\",\"buy_price_max\":6122,\"buy_price_max_date\":\"2021-08-24T20:35:00\"}]");
                    
                    for (int city = 0; city < ciudades.length(); city++) {
                        JSONObject profit=new JSONObject();
                        String ciudad=ciudades.getJSONObject(city).getString("ciudad");
                        profit.put("CIUDAD", ciudad);
                        for(int rec=0;rec<receta.length();rec++){
                            String capa="T4_CAPE";
                            String profit_capa=receta.getJSONObject(rec).getString("nombre_capa");
                            String capa_faccion=receta.getJSONObject(rec).getString("capa");
                            String corazon=receta.getJSONObject(rec).getString("corazon");
                            String sello=receta.getJSONObject(rec).getString("sello");
                            Capa crafteo=new Capa();
                            for(int con=0; con<consulta_suprema.length();con++){
                                if(ciudad.equals(consulta_suprema.getJSONObject(con).getString("city"))){
                                    if(consulta_suprema.getJSONObject(con).getString("item_id").equals(capa)){
                                        crafteo.setCompra_capa(consulta_suprema.getJSONObject(con).getInt("sell_price_min"));
                                    }
                                    else if(consulta_suprema.getJSONObject(con).getString("item_id").equals(capa_faccion)){
                                        crafteo.setPrecio_venta(consulta_suprema.getJSONObject(con).getInt("sell_price_min"));
                                    }
                                    else if(consulta_suprema.getJSONObject(con).getString("item_id").equals(corazon)){
                                        crafteo.setCompra_corazon(consulta_suprema.getJSONObject(con).getInt("sell_price_min"));
                                    }
                                    else if(consulta_suprema.getJSONObject(con).getString("item_id").equals(sello)){
                                        crafteo.setCompra_complemento(consulta_suprema.getJSONObject(con).getInt("sell_price_min"));
                                    }
                                }
                            }
                            profit.put(profit_capa, crafteo.calcularProfit());
                        }
                        resp.put(profit);
                    }
                    
                    String resps=resp.toString();
                    response.getWriter().write(resp.toString());
                    response.getWriter().flush();
                    break;
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(svl_profit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(svl_profit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}