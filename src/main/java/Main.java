import dungeons.VersionCrack;
import gui.MCVersion;
import kaptainwutax.biomeutils.Biome;


public class Main {
    public static void main(String[] args) {
     System.out.println(new VersionCrack(MCVersion.v1_12,  26562,62, -38874, "101111111001111101011110111111101101110011111110011111101111111").run().toString());
       // System.out.println(new VersionCrack(MCVersion.v1_7, 748,20,476, "001111101111111111111111111111101111111011100000110001101011111").run().toString());


    }

    public static void test1_16() {
        // -720350949281663006
        System.out.println(new VersionCrack(MCVersion.v1_16, -1840, 23, -1275, "1001011111001010111011100110111110101001011101011", Biome.OCEAN).run().toString());
        System.out.println(new VersionCrack(MCVersion.v1_16, -2420, 40, -1693, "1111101100100111101111000011110101110101100111111", Biome.JUNGLE_EDGE).run().toString());

        System.out.println(new VersionCrack(MCVersion.v1_16, -5620, 34, -2062, "111110111101111111100101111111110110011111110111101111111001211011101111001101011", Biome.SWAMP).run().toString());
        System.out.println(new VersionCrack(MCVersion.v1_16, -6799, 61, -1473, "011010011111011111011110011100111011110111011110001011110111011111000011111101011", Biome.DESERT).run().toString());

    }
}
