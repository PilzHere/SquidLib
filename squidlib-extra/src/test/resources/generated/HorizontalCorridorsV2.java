/* File generated automatically by TilesetsGenerator.java. Do not edit. This file is committed for convenience. */
package squidpony.tileset;

import squidpony.squidgrid.mapping.styled.*;

/** @author TilesetsGenerator.java */
public class HorizontalCorridorsV2 {

  public static final Tileset INSTANCE = new Tileset();

  static {
    /* Initialize #INSTANCE */ 
    INSTANCE.config.is_corner=true;
    INSTANCE.config.num_x_variants=1;
    INSTANCE.config.num_y_variants=1;
    INSTANCE.config.short_side_length=13;
    INSTANCE.config.num_colors[0]=3;
    INSTANCE.config.num_colors[1]=1;
    INSTANCE.config.num_colors[2]=3;
    INSTANCE.config.num_colors[3]=1;
    INSTANCE.max_tiles.h=27;
    INSTANCE.max_tiles.v=27;
    INSTANCE.h_tiles = new Tile[27];
    /* Build h_tiles #0 */
    INSTANCE.h_tiles[0] =  new Tile(0,0,0,0,0,0
    ,"#######...........########"
    ,"#######...........########"
    ,"###########...############"
    ,"###########...############"
    ,"..............############"
    ,".........................."
    ,".........................."
    ,"######...................."
    ,"######........#########..."
    ,"######........####........"
    ,"...###........####........"
    ,"...###........####........"
    ,"...###........####........"
);
    /* Build h_tiles #1 */
    INSTANCE.h_tiles[1] =  new Tile(0,1,0,0,0,0
    ,"####################...###"
    ,"###########............###"
    ,"###########............###"
    ,"###########............###"
    ,".......................###"
    ,".........................."
    ,".........................."
    ,"###########..............."
    ,"###########..............."
    ,"###########..............."
    ,"..##################......"
    ,"..##################......"
    ,"..####################...."
);
    /* Build h_tiles #2 */
    INSTANCE.h_tiles[2] =  new Tile(0,2,0,0,0,0
    ,"###.............##########"
    ,"###.............##########"
    ,"###.............##########"
    ,"###.............##########"
    ,"................##########"
    ,".........................."
    ,".........................."
    ,"###......................."
    ,"#######################..."
    ,"#######################..."
    ,"..#################......."
    ,"..#################......."
    ,"..#################......."
);
    /* Build h_tiles #3 */
    INSTANCE.h_tiles[3] =  new Tile(0,0,0,1,0,0
    ,"########.........#########"
    ,"########.........#########"
    ,"########.........#########"
    ,"###########...############"
    ,"###########...############"
    ,".........................."
    ,".........................."
    ,".........................."
    ,"###########...#########..."
    ,"###########...#########..."
    ,"#####............##......."
    ,"#####............##......."
    ,"#####............##......."
);
    /* Build h_tiles #4 */
    INSTANCE.h_tiles[4] =  new Tile(0,1,0,1,0,0
    ,"####################...###"
    ,"######.......#######...###"
    ,"######.......#######...###"
    ,"######.......#######...###"
    ,".............#######...###"
    ,".........................."
    ,".........................."
    ,".........................."
    ,".............##########..."
    ,"######.......##########..."
    ,"#####........#####........"
    ,"#####........#####........"
    ,"#####...##########........"
);
    /* Build h_tiles #5 */
    INSTANCE.h_tiles[5] =  new Tile(0,2,0,1,0,0
    ,"###...####################"
    ,"###...####################"
    ,"#........#################"
    ,"#........#################"
    ,"#........#################"
    ,".........................."
    ,".........................."
    ,".........................."
    ,"#........##############..."
    ,"#........##############..."
    ,"#........############....."
    ,"#........############....."
    ,"#####...#############....."
);
    /* Build h_tiles #6 */
    INSTANCE.h_tiles[6] =  new Tile(0,0,0,2,0,0
    ,"##########.....###########"
    ,"##########.....###########"
    ,"...............###########"
    ,"...............###########"
    ,"...............###########"
    ,"##........................"
    ,"##........................"
    ,"##........................"
    ,"##...........##########..."
    ,"##...........##########..."
    ,"##...........########....."
    ,"##...........########....."
    ,"#####################....."
);
    /* Build h_tiles #7 */
    INSTANCE.h_tiles[7] =  new Tile(0,1,0,2,0,0
    ,"####################...###"
    ,"####################...###"
    ,".......................###"
    ,".......................###"
    ,".......................###"
    ,"#############............."
    ,"#############............."
    ,"#############............."
    ,"#############............."
    ,"#############............."
    ,"#############............."
    ,"#############............."
    ,"#################........."
);
    /* Build h_tiles #8 */
    INSTANCE.h_tiles[8] =  new Tile(0,2,0,2,0,0
    ,"###...####################"
    ,"###...####################"
    ,".........................#"
    ,".........................#"
    ,".........................#"
    ,"###...##############......"
    ,"#..........#########......"
    ,"#..........#########......"
    ,"#..........#########......"
    ,"#..........###########...."
    ,"#..........###########...."
    ,"#..........###########...."
    ,"######################...."
);
    /* Build h_tiles #9 */
    INSTANCE.h_tiles[9] =  new Tile(0,0,0,0,0,1
    ,"########.........#########"
    ,"########.........#########"
    ,"########.........#########"
    ,"########.........#########"
    ,".................#########"
    ,".................#########"
    ,".........................."
    ,"########.................."
    ,"########.................."
    ,"########.........#########"
    ,"..######.........#########"
    ,"..########################"
    ,"..########################"
);
    /* Build h_tiles #10 */
    INSTANCE.h_tiles[10] =  new Tile(0,1,0,0,0,1
    ,"####################...###"
    ,"..........##########...###"
    ,"..........##########...###"
    ,"..........##########...###"
    ,".......................###"
    ,".......................###"
    ,".........................."
    ,".........................."
    ,".........................."
    ,"..........################"
    ,"..........################"
    ,"..........################"
    ,"...#######################"
);
    /* Build h_tiles #11 */
    INSTANCE.h_tiles[11] =  new Tile(0,2,0,0,0,1
    ,"###...####################"
    ,"###...#######........#####"
    ,"###...#######........#####"
    ,"###...#######........#####"
    ,".....................#####"
    ,".....................#####"
    ,".........................."
    ,"#############............."
    ,"#############............."
    ,"#############........#####"
    ,"..###########........#####"
    ,"..###########........#####"
    ,"..########################"
);
    /* Build h_tiles #12 */
    INSTANCE.h_tiles[12] =  new Tile(0,0,0,1,0,1
    ,"########.......###########"
    ,"########.......###########"
    ,"########.......###########"
    ,"...............###########"
    ,"...............###########"
    ,"...............###########"
    ,".........................."
    ,".........................."
    ,".........................."
    ,"#####...##################"
    ,"#####...##################"
    ,"#####...##################"
    ,"#####...##################"
);
    /* Build h_tiles #13 */
    INSTANCE.h_tiles[13] =  new Tile(0,1,0,1,0,1
    ,"####################...###"
    ,"####################...###"
    ,"....################...###"
    ,"....#########..........###"
    ,"....#########..........###"
    ,"....#########..........###"
    ,".........................."
    ,".........................."
    ,".........................."
    ,"....#...#####.........####"
    ,"....#...#####.........####"
    ,"#####...#####.........####"
    ,"#####...##################"
);
    /* Build h_tiles #14 */
    INSTANCE.h_tiles[14] =  new Tile(0,2,0,1,0,1
    ,"###...####################"
    ,"###...####################"
    ,"......####################"
    ,"......#########.........##"
    ,"......#########.........##"
    ,"......#########.........##"
    ,".........................."
    ,".........................."
    ,".........................."
    ,"..........#####.........##"
    ,"..........#####.........##"
    ,"#####...#######.........##"
    ,"#####...##################"
);
    /* Build h_tiles #15 */
    INSTANCE.h_tiles[15] =  new Tile(0,0,0,2,0,1
    ,"#########.......##########"
    ,"#########.......##########"
    ,"................##########"
    ,"..................########"
    ,"..................########"
    ,"#######...........########"
    ,"#######..................."
    ,"#######..................."
    ,"#######..................."
    ,"#####...............######"
    ,"#####...............######"
    ,"#####...............######"
    ,"##########################"
);
    /* Build h_tiles #16 */
    INSTANCE.h_tiles[16] =  new Tile(0,1,0,2,0,1
    ,"####################...###"
    ,"####################...###"
    ,"..................##...###"
    ,"..................##...###"
    ,"..................##...###"
    ,"#####.............##...###"
    ,"#####....................."
    ,"#####....................."
    ,"#####....................."
    ,"#####.............########"
    ,"#####.............########"
    ,"##########################"
    ,"##########################"
);
    /* Build h_tiles #17 */
    INSTANCE.h_tiles[17] =  new Tile(0,2,0,2,0,1
    ,"###...####################"
    ,"###.....................##"
    ,"........................##"
    ,"........................##"
    ,"........................##"
    ,"###.....................##"
    ,"###......................."
    ,"###......................."
    ,"###......................."
    ,"###.....................##"
    ,"###.....................##"
    ,"###.....................##"
    ,"##########################"
);
    /* Build h_tiles #18 */
    INSTANCE.h_tiles[18] =  new Tile(0,0,0,0,0,2
    ,"##########.....###########"
    ,"##########.....###########"
    ,"##########.....###########"
    ,"##########.....###########"
    ,".........................."
    ,".........................."
    ,".........................."
    ,"##########.....#...#######"
    ,"##########.....#...#######"
    ,"##########.....#...#######"
    ,"..##############...#######"
    ,"..##############...#######"
    ,"..##############...#######"
);
    /* Build h_tiles #19 */
    INSTANCE.h_tiles[19] =  new Tile(0,1,0,0,0,2
    ,"####################...###"
    ,"####################...###"
    ,"########..........##...###"
    ,"########..........##...###"
    ,".........................."
    ,".........................."
    ,".........................."
    ,"########...........#######"
    ,"########...........#######"
    ,"########...........#######"
    ,"..######...........#######"
    ,"..##############...#######"
    ,"..##############...#######"
);
    /* Build h_tiles #20 */
    INSTANCE.h_tiles[20] =  new Tile(0,2,0,0,0,2
    ,"###...####################"
    ,"###...####............####"
    ,"###...####............####"
    ,"###...####............####"
    ,".........................."
    ,".........................."
    ,".........................."
    ,"##########............####"
    ,"##########............####"
    ,"##########............####"
    ,"...#######............####"
    ,"...#############...#######"
    ,"...#############...#######"
);
    /* Build h_tiles #21 */
    INSTANCE.h_tiles[21] =  new Tile(0,0,0,1,0,2
    ,"##########.....###########"
    ,"##########.....###########"
    ,"##########.....###########"
    ,"###########...############"
    ,"###########..............."
    ,"###########..............."
    ,".........................."
    ,"..............##...#######"
    ,"..............##...#######"
    ,"#####...########...#######"
    ,"#####...########...#######"
    ,"#####...########...#######"
    ,"#####...########...#######"
);
    /* Build h_tiles #22 */
    INSTANCE.h_tiles[22] =  new Tile(0,1,0,1,0,2
    ,"####################...###"
    ,"..........##########...###"
    ,"..........######.......###"
    ,"..........######.......###"
    ,".........................."
    ,".........................."
    ,".........................."
    ,"..........######.......###"
    ,"..........######.......###"
    ,"..........######.......###"
    ,"..........######.......###"
    ,"..........######...#######"
    ,"#####...########...#######"
);
    /* Build h_tiles #23 */
    INSTANCE.h_tiles[23] =  new Tile(0,2,0,1,0,2
    ,"###...####################"
    ,"###...####################"
    ,"###...##########...#######"
    ,".........#######...#######"
    ,".........................."
    ,".........................."
    ,".........................."
    ,".........#######.........#"
    ,".........#######.........#"
    ,".........#######.........#"
    ,".........#######.........#"
    ,"#####...########.........#"
    ,"#####...########...#######"
);
    /* Build h_tiles #24 */
    INSTANCE.h_tiles[24] =  new Tile(0,0,0,2,0,2
    ,"##########.....###########"
    ,"##########.....###########"
    ,"...............###########"
    ,"...............###########"
    ,".........................."
    ,"##........................"
    ,"##........................"
    ,"##.............#...#######"
    ,"##.............#...#######"
    ,"##.............#...#######"
    ,"##.............#...#######"
    ,"################...#######"
    ,"################...#######"
);
    /* Build h_tiles #25 */
    INSTANCE.h_tiles[25] =  new Tile(0,1,0,2,0,2
    ,"####################...###"
    ,"##.........#########...###"
    ,"........................##"
    ,"........................##"
    ,".........................."
    ,"##.........###............"
    ,"##.........###............"
    ,"##.........###..........##"
    ,"##.........###..........##"
    ,"##.........###..........##"
    ,"##.........#####...#######"
    ,"################...#######"
    ,"################...#######"
);
    /* Build h_tiles #26 */
    INSTANCE.h_tiles[26] =  new Tile(0,2,0,2,0,2
    ,"###...####################"
    ,"###...####################"
    ,"..............############"
    ,"..............############"
    ,".........................."
    ,"#...####.................."
    ,"#...####.................."
    ,"#...####......##...#######"
    ,"#...####......##...#######"
    ,"#...####......##...#######"
    ,"#...####......##...#######"
    ,"#...####......##...#######"
    ,"################...#######"
);
    INSTANCE.v_tiles = new Tile[27];
    /* Build v_tiles #0 */
    INSTANCE.v_tiles[0] =  new Tile(0,0,0,0,0,0
    ,"..###########"
    ,"..#.......###"
    ,"###.......###"
    ,"###.......###"
    ,"###...#......"
    ,"###...#......"
    ,"......#......"
    ,"......####..."
    ,"......####..."
    ,"########....."
    ,"########....."
    ,"########....."
    ,"########....."
    ,"########....."
    ,"########....."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"............."
    ,"............."
    ,"............."
    ,"##########..."
    ,"#############"
    ,"..###########"
    ,"..###########"
    ,"..###########"
);
    /* Build v_tiles #1 */
    INSTANCE.v_tiles[1] =  new Tile(1,0,0,0,0,0
    ,"#####...#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"............."
    ,"............."
    ,"............."
    ,"##########..."
    ,"##########..."
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"............."
    ,"............."
    ,"............."
    ,"##########..."
    ,"#############"
    ,"..###########"
    ,"..###########"
    ,"..###########"
);
    /* Build v_tiles #2 */
    INSTANCE.v_tiles[2] =  new Tile(2,0,0,0,0,0
    ,"#############"
    ,"#############"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"............."
    ,"............."
    ,"............."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"........##..."
    ,"............."
    ,"............."
    ,"#####........"
    ,"#############"
    ,"..###########"
    ,"..###########"
    ,"..###########"
);
    /* Build v_tiles #3 */
    INSTANCE.v_tiles[3] =  new Tile(0,0,1,0,0,0
    ,"..###########"
    ,"..###########"
    ,"#############"
    ,"#############"
    ,"#............"
    ,"#............"
    ,"............."
    ,"....######..."
    ,"....######..."
    ,"##########..."
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"............."
    ,"............."
    ,"............."
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
);
    /* Build v_tiles #4 */
    INSTANCE.v_tiles[4] =  new Tile(1,0,1,0,0,0
    ,"#####...#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"............."
    ,"............."
    ,"............."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"#............"
    ,"#............"
    ,"#............"
    ,"#............"
    ,"#............"
    ,"#............"
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"............."
    ,"............."
    ,"............."
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
);
    /* Build v_tiles #5 */
    INSTANCE.v_tiles[5] =  new Tile(2,0,1,0,0,0
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"##..........."
    ,"##..........."
    ,"##..........."
    ,"##...#####..."
    ,".....#####..."
    ,".....#####..."
    ,".....##......"
    ,"#######......"
    ,"#######......"
    ,"###.........."
    ,"###.........."
    ,"###.........."
    ,"###.........."
    ,"##########..."
    ,"##########..."
    ,"............."
    ,"............."
    ,"............."
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
);
    /* Build v_tiles #6 */
    INSTANCE.v_tiles[6] =  new Tile(0,0,2,0,0,0
    ,"..###########"
    ,"..###########"
    ,"#############"
    ,"#############"
    ,"##########..."
    ,"##########..."
    ,"............."
    ,"............."
    ,"............."
    ,"##########..."
    ,"#####........"
    ,"#####........"
    ,"#####........"
    ,"#####........"
    ,"#####........"
    ,"#####........"
    ,"##########..."
    ,"............."
    ,"............."
    ,"............."
    ,"##......###.."
    ,"##......###.."
    ,"##......#####"
    ,"##......#####"
    ,"##......#####"
    ,"#############"
);
    /* Build v_tiles #7 */
    INSTANCE.v_tiles[7] =  new Tile(1,0,2,0,0,0
    ,"#####...#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"............."
    ,"............."
    ,"............."
    ,"##########..."
    ,"##########..."
    ,"########....."
    ,"########....."
    ,"########....."
    ,"########....."
    ,"########....."
    ,"########....."
    ,"########....."
    ,"##########..."
    ,"............."
    ,"............."
    ,"............."
    ,"##########..."
    ,"##########..."
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
);
    /* Build v_tiles #8 */
    INSTANCE.v_tiles[8] =  new Tile(2,0,2,0,0,0
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"............."
    ,"............."
    ,"............."
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"##########..."
    ,"......####..."
    ,"......####..."
    ,"............."
    ,"###.........."
    ,"###.........."
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
);
    /* Build v_tiles #9 */
    INSTANCE.v_tiles[9] =  new Tile(0,0,0,0,1,0
    ,"..###########"
    ,"..###########"
    ,"#############"
    ,"#############"
    ,"##########..."
    ,"##########..."
    ,"............."
    ,"............."
    ,"............."
    ,"##......#####"
    ,"##......#####"
    ,"##......#####"
    ,"##.........##"
    ,"##.........##"
    ,"##.........##"
    ,"####.......##"
    ,"####.......##"
    ,"####........."
    ,"............."
    ,"............."
    ,"...........##"
    ,"#############"
    ,"#############"
    ,"..###########"
    ,"..###########"
    ,"..###########"
);
    /* Build v_tiles #10 */
    INSTANCE.v_tiles[10] =  new Tile(1,0,0,0,1,0
    ,"#####...#####"
    ,"#####...#####"
    ,"###.........."
    ,"###.........."
    ,"............."
    ,"............."
    ,"............."
    ,"###.........."
    ,"###.........."
    ,"###.........."
    ,"###.....#####"
    ,"###.....#####"
    ,"###.....#####"
    ,"###.....#####"
    ,"###.....#####"
    ,"#############"
    ,"#############"
    ,"#########...."
    ,".......##...."
    ,".......##...."
    ,".......##...#"
    ,"####........#"
    ,"####........#"
    ,"..##........#"
    ,"..###########"
    ,"..###########"
);
    /* Build v_tiles #11 */
    INSTANCE.v_tiles[11] =  new Tile(2,0,0,0,1,0
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#########...."
    ,"............."
    ,"............."
    ,"............."
    ,"...######...."
    ,"...##########"
    ,"...##########"
    ,"#############"
    ,"#############"
    ,"###........##"
    ,"###........##"
    ,"###........##"
    ,"###...##...##"
    ,"###...##....."
    ,"......##....."
    ,"......##....."
    ,"......#######"
    ,"#############"
    ,"#############"
    ,"..###########"
    ,"..###########"
    ,"..###########"
);
    /* Build v_tiles #12 */
    INSTANCE.v_tiles[12] =  new Tile(0,0,1,0,1,0
    ,"..###########"
    ,"..#.......###"
    ,"###.......###"
    ,"###.......###"
    ,"###.........."
    ,"###.........."
    ,"............."
    ,"............."
    ,"............."
    ,"###.........."
    ,"###.......###"
    ,"###.......###"
    ,"###.......###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######......"
    ,"#######......"
    ,"............."
    ,"..........###"
    ,"..........###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
);
    /* Build v_tiles #13 */
    INSTANCE.v_tiles[13] =  new Tile(1,0,1,0,1,0
    ,"#####...#####"
    ,"##..........."
    ,"##..........."
    ,"##..........."
    ,"............."
    ,"............."
    ,"............."
    ,"##..........."
    ,"##..........."
    ,"##..........."
    ,"##..........."
    ,"##..........."
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#######......"
    ,"#######......"
    ,"............."
    ,"..........###"
    ,"..........###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
);
    /* Build v_tiles #14 */
    INSTANCE.v_tiles[14] =  new Tile(2,0,1,0,1,0
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"########....."
    ,"########....."
    ,"########....."
    ,"########....."
    ,"............."
    ,"...........##"
    ,"...........##"
    ,"#...#########"
    ,"#...#########"
    ,"#...#########"
    ,"#...#########"
    ,"#...#########"
    ,"#...#########"
    ,"#...###......"
    ,"#...###......"
    ,"............."
    ,"..........###"
    ,"..........###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
);
    /* Build v_tiles #15 */
    INSTANCE.v_tiles[15] =  new Tile(0,0,2,0,1,0
    ,"..###########"
    ,"..###########"
    ,"#############"
    ,"#############"
    ,"####........."
    ,"####........."
    ,"............."
    ,"............."
    ,"............."
    ,"####........."
    ,"####........."
    ,"####.......##"
    ,"####.......##"
    ,"####.......##"
    ,"####.......##"
    ,"####.......##"
    ,"####.......##"
    ,"............."
    ,"............."
    ,"............."
    ,"####.......##"
    ,"####.......##"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
);
    /* Build v_tiles #16 */
    INSTANCE.v_tiles[16] =  new Tile(1,0,2,0,1,0
    ,"#####...#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"............."
    ,"............."
    ,"............."
    ,"########....."
    ,"########....."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"##########..."
    ,"............."
    ,"............."
    ,"............."
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
);
    /* Build v_tiles #17 */
    INSTANCE.v_tiles[17] =  new Tile(2,0,2,0,1,0
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"#######......"
    ,"............."
    ,"............."
    ,"............."
    ,"#######......"
    ,"#######......"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"............."
    ,"............."
    ,"............."
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
    ,"#############"
);
    /* Build v_tiles #18 */
    INSTANCE.v_tiles[18] =  new Tile(0,0,0,0,2,0
    ,"..###########"
    ,"..###########"
    ,"#####........"
    ,"#####........"
    ,"#####........"
    ,"#####...#####"
    ,"............."
    ,"............."
    ,"............."
    ,"#########...."
    ,"#########...."
    ,"#########...."
    ,"###.........."
    ,"###.........."
    ,"###.........."
    ,"###.........."
    ,"###.........."
    ,"###.........#"
    ,"............#"
    ,"............#"
    ,".........####"
    ,"######......."
    ,"######......."
    ,"..####......."
    ,"..###########"
    ,"..###########"
);
    /* Build v_tiles #19 */
    INSTANCE.v_tiles[19] =  new Tile(1,0,0,0,2,0
    ,"#####...#####"
    ,"#####...#####"
    ,"#####........"
    ,"#####........"
    ,"............."
    ,"........#####"
    ,"........#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"........#####"
    ,"........#####"
    ,"........#####"
    ,"........#####"
    ,"........#####"
    ,"........#####"
    ,"........#####"
    ,"##...########"
    ,"##...########"
    ,"..........###"
    ,"..........###"
    ,"..........###"
    ,"#######......"
    ,"#######......"
    ,"..#####......"
    ,"..###########"
    ,"..###########"
);
    /* Build v_tiles #20 */
    INSTANCE.v_tiles[20] =  new Tile(2,0,0,0,2,0
    ,"##.........##"
    ,"##.........##"
    ,"##..........."
    ,"##..........."
    ,"##..........."
    ,"##.........##"
    ,"##.........##"
    ,"##.........##"
    ,"...........##"
    ,"...........##"
    ,"...........##"
    ,"##.........##"
    ,"##.........##"
    ,"#####...#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"#####...#####"
    ,"........#####"
    ,"........#####"
    ,"........#####"
    ,"#####........"
    ,"....#........"
    ,"....#........"
    ,"....#########"
    ,"....#########"
);
    /* Build v_tiles #21 */
    INSTANCE.v_tiles[21] =  new Tile(0,0,1,0,2,0
    ,"..###########"
    ,"..###########"
    ,"#####........"
    ,"#####........"
    ,"#####........"
    ,"#####.......#"
    ,"............#"
    ,"............#"
    ,"............#"
    ,"#####.......#"
    ,"#####.......#"
    ,"#####.......#"
    ,"#####.......#"
    ,"#####.......#"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"..........###"
    ,"..........###"
    ,"............."
    ,"#######......"
    ,"#######......"
    ,"#######...###"
    ,"#######...###"
);
    /* Build v_tiles #22 */
    INSTANCE.v_tiles[22] =  new Tile(1,0,1,0,2,0
    ,"#####...#####"
    ,"#####...#####"
    ,"###.........."
    ,"###.........."
    ,"............."
    ,"............#"
    ,"............#"
    ,"###.........#"
    ,"###.........#"
    ,"###.........#"
    ,"###.........#"
    ,"###.........#"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"..........###"
    ,"..........###"
    ,"............."
    ,"#######......"
    ,"#######......"
    ,"#######...###"
    ,"#######...###"
);
    /* Build v_tiles #23 */
    INSTANCE.v_tiles[23] =  new Tile(2,0,1,0,2,0
    ,"#############"
    ,"#############"
    ,"##..........."
    ,"##..........."
    ,"##..........."
    ,"##........###"
    ,"##........###"
    ,"##........###"
    ,"..........###"
    ,"..........###"
    ,"..........###"
    ,"##........###"
    ,"##........###"
    ,"##........###"
    ,"##........###"
    ,"##........###"
    ,"##........###"
    ,"##........###"
    ,"##........###"
    ,"..........###"
    ,"..........###"
    ,"............."
    ,"#######......"
    ,"#######......"
    ,"#######...###"
    ,"#######...###"
);
    /* Build v_tiles #24 */
    INSTANCE.v_tiles[24] =  new Tile(0,0,2,0,2,0
    ,"..###########"
    ,"..###########"
    ,"#########...."
    ,"#########...."
    ,"#########...."
    ,"#########...#"
    ,"............#"
    ,"............#"
    ,"............#"
    ,"######...####"
    ,"######...####"
    ,"######...####"
    ,"###........##"
    ,"###........##"
    ,"###........##"
    ,"###........##"
    ,"###........##"
    ,"...........##"
    ,"...........##"
    ,"...........##"
    ,"###........##"
    ,"###.........."
    ,"###.........."
    ,"###.........."
    ,"###........##"
    ,"#############"
);
    /* Build v_tiles #25 */
    INSTANCE.v_tiles[25] =  new Tile(1,0,2,0,2,0
    ,"#..........##"
    ,"#..........##"
    ,"#............"
    ,"#............"
    ,"............."
    ,"...........##"
    ,"...........##"
    ,"#..........##"
    ,"#..........##"
    ,"#######...###"
    ,"#######...###"
    ,"#######...###"
    ,"###.......###"
    ,"###.......###"
    ,"###.......###"
    ,"###...#######"
    ,"###...#######"
    ,"......#######"
    ,"......#######"
    ,"......#######"
    ,"###...#######"
    ,"###.........."
    ,"###.........."
    ,"###.........."
    ,"#############"
    ,"#############"
);
    /* Build v_tiles #26 */
    INSTANCE.v_tiles[26] =  new Tile(2,0,2,0,2,0
    ,"#############"
    ,"#############"
    ,"#............"
    ,"#............"
    ,"#............"
    ,"#...#########"
    ,"#...#########"
    ,"#...#########"
    ,".........####"
    ,".........####"
    ,"............."
    ,"######......."
    ,"######......."
    ,"######......."
    ,"######......."
    ,"######......."
    ,"######......."
    ,"............#"
    ,"............#"
    ,"............#"
    ,"#########...#"
    ,"#########...."
    ,"#########...."
    ,"#########...."
    ,"#############"
    ,"#############"
);
  }

}