package dambi.datuatzipena.lehen_finala.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Steam_Store_Data")
public class StoreData {

    //Klase nagusia, karpeta berdinean agertzen diren klase guztiak klase honetan erabiltzen dira
    @Id
    public String _id;
    public String type;
    public String name;
    public int steam_appid;
    public int required_age;
    public boolean is_free;
    public String controller_support;
    public int[] dlc;
    public String detailed_description;
    public String about_the_game;
    public String short_description;
    public String supported_languages;
    public String reviews;
    public String header_image;
    public String website;
    public Pc_requirements pc_requirements;
    public String[] mac_requirements;
    public String[] linux_requirements;
    public String legal_notice;
    public String[] developers;
    public String[] publishers;
    public Price_overview price_overview;
    public int[] packages;
    public Packages[] package_groups;
    public Platforms platforms;
    public Metacritic metacritic;
    public Categorie[] categories;
    public Genre[] genres;
    public Screenshot[] screenshots;
    public Recomendation recommendations;
    public Release_date release_date;
    public Support_info support_info;
    public String background;
    public String background_raw;
    public Content_descriptors content_descriptors;
    

    

    //Defektuzko konstruktorea
    public StoreData() {}
    //Konstruuktorea datuguztiekin
    public StoreData(String type, String name, int steam_appid, int required_age, boolean is_free,
            String controller_support, int[] dlc, String detailed_description, String about_the_game,
            String short_description, String supported_languages, String reviews, String header_image, String website,
            Pc_requirements pc_requirements, String[] mac_requirement, String[] linux_requirements,
            String legal_notice, String[] developers, String[] publishers, Price_overview price_overview,
            int[] packages, Packages[] package_group, Platforms platforms, Metacritic metacritic,
            Categorie[] categories, Genre[] genres, Screenshot[] screenshots, Recomendation recomentdations,
            Release_date release_date, Support_info support_info, String background, String backgorund_raw,
            Content_descriptors content_descriptors) {
        this.type = type;
        this.name = name;
        this.steam_appid = steam_appid;
        this.required_age = required_age;
        this.is_free = is_free;
            if(!controller_support.equals(null))
        this.controller_support = controller_support;
        else{
            this.controller_support ="no";
        }
        this.dlc = dlc;
        this.detailed_description = detailed_description;
        this.about_the_game = about_the_game;
        this.short_description = short_description;
        this.supported_languages = supported_languages;
        this.reviews = reviews;
        this.header_image = header_image;
        this.website = website;
        this.pc_requirements = pc_requirements;
        if(!mac_requirement.equals(null))
            this.mac_requirements = mac_requirement;
        else{
            this.mac_requirements = null;
        }
        if(!linux_requirements.equals(null))
            this.linux_requirements = linux_requirements;
        else{
            this.linux_requirements = null;
        }
        this.legal_notice = legal_notice;
        this.developers = developers;
        this.publishers = publishers;
        this.price_overview = price_overview;
        this.packages = packages;
        this.package_groups= package_group;
        this.platforms = platforms;
        this.metacritic = metacritic;
        this.categories = categories;
        this.genres = genres;
        this.screenshots = screenshots;
        this.recommendations = recomentdations;
        this.release_date = release_date;
        this.support_info = support_info;
        this.background = background;
        this.background_raw = backgorund_raw;
        this.content_descriptors = content_descriptors;
    }

    //Puntu honetatik bera, klaseko eremu guztien getter eta setter-ak daude.
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSteam_appid() {
        return steam_appid;
    }
    public void setSteam_appid(int steam_appid) {
        this.steam_appid = steam_appid;
    }
    public int getRequired_age() {
        return required_age;
    }
    public void setRequired_age(int required_age) {
        this.required_age = required_age;
    }
    public boolean isIs_free() {
        return is_free;
    }
    public void setIs_free(boolean is_free) {
        this.is_free = is_free;
    }
    public String getController_support() {
        return controller_support;
    }
    public void setController_support(String controller_support) {
        this.controller_support = controller_support;
    }
    public int[] getDlc() {
        return dlc;
    }
    public void setDlc(int[] dlc) {
        this.dlc = dlc;
    }
    public String getDetailed_description() {
        return detailed_description;
    }
    public void setDetailed_description(String detailed_description) {
        this.detailed_description = detailed_description;
    }
    public String getAbout_the_game() {
        return about_the_game;
    }
    public void setAbout_the_game(String about_the_game) {
        this.about_the_game = about_the_game;
    }
    public String getShort_description() {
        return short_description;
    }
    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }
    public String getSupported_languages() {
        return supported_languages;
    }
    public void setSupported_languages(String supported_languages) {
        this.supported_languages = supported_languages;
    }
    public String getReviews() {
        return reviews;
    }
    public void setReviews(String reviews) {
        this.reviews = reviews;
    }
    public String getHeader_image() {
        return header_image;
    }
    public void setHeader_image(String header_image) {
        this.header_image = header_image;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public Pc_requirements getPc_requirements() {
        return pc_requirements;
    }
    public void setPc_requirements(Pc_requirements pc_requirements) {
        this.pc_requirements = pc_requirements;
    }
    public String[] getMac_requirements() {
        return mac_requirements;
    }
    public void setMac_requirements(String[] mac_requirement) {
        this.mac_requirements = mac_requirement;
    }
    public String[] getLinux_requirements() {
        return linux_requirements;
    }
    public void setLinux_requirements(String[] linux_requirements) {
        this.linux_requirements = linux_requirements;
    }
    public String getLegal_notice() {
        return legal_notice;
    }
    public void setLegal_notice(String legal_notice) {
        this.legal_notice = legal_notice;
    }
    public String[] getDevelopers() {
        return developers;
    }
    public void setDevelopers(String[] developers) {
        this.developers = developers;
    }
    public String[] getPublishers() {
        return publishers;
    }
    public void setPublishers(String[] publishers) {
        this.publishers = publishers;
    }
    public Price_overview getPrice_overview() {
        return price_overview;
    }
    public void setPrice_overview(Price_overview price_overview) {
        this.price_overview = price_overview;
    }
    public int[] getPackages() {
        return packages;
    }
    public void setPackages(int[] packages) {
        this.packages = packages;
    }
    public Packages[] getPackage_groups() {
        return package_groups;
    }
    public void setPackage_groups(Packages[] package_group) {
        this.package_groups = package_group;
    }
    public Platforms getPlatforms() {
        return platforms;
    }
    public void setPlatforms(Platforms platforms) {
        this.platforms = platforms;
    }
    public Metacritic getMetacritic() {
        return metacritic;
    }
    public void setMetacritic(Metacritic metacritic) {
        this.metacritic = metacritic;
    }
    public Categorie[] getCategories() {
        return categories;
    }
    public void setCategories(Categorie[] categories) {
        this.categories = categories;
    }
    public Genre[] getGenres() {
        return genres;
    }
    public void setGenres(Genre[] genres) {
        this.genres = genres;
    }
    public Screenshot[] getScreenshots() {
        return screenshots;
    }
    public void setScreenshots(Screenshot[] screenshots) {
        this.screenshots = screenshots;
    }
    public Recomendation getRecomentdations() {
        return recommendations;
    }
    public void setRecomentdations(Recomendation recomentdations) {
        this.recommendations = recomentdations;
    }
    public Release_date getRelease_date() {
        return release_date;
    }
    public void setRelease_date(Release_date release_date) {
        this.release_date = release_date;
    }
    public Support_info getSupport_info() {
        return support_info;
    }
    public void setSupport_info(Support_info support_info) {
        this.support_info = support_info;
    }
    public String getBackground() {
        return background;
    }
    public void setBackground(String background) {
        this.background = background;
    }
    public String getBackgorund_raw() {
        return background_raw;
    }
    public void setBackgorund_raw(String backgorund_raw) {
        this.background_raw = backgorund_raw;
    }
    public Content_descriptors getContent_descriptors() {
        return content_descriptors;
    }
    public void setContent_descriptors(Content_descriptors content_descriptors) {
        this.content_descriptors = content_descriptors;
    }

    
}
