package br.com.ddmsoftware.sorocabaguide;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by douglimar on 21/12/17.
 * not default file
 */

class Place {

    private String


            PlaceName;
    private String PlaceSmallDescription;
    private String PlaceFullDescription;
    private String PlaceAddress;
    private int PlaceThumb;
    private int[] PlacePictures;

    public String getPlaceAddress() {
        return PlaceAddress;
    }

    private void setPlaceAddress(String PlaceAddress) {
        this.PlaceAddress = PlaceAddress;
    }

    public String getPlaceName() {
        return PlaceName;
    }

    private void setPlaceName(String PlaceName) {
        this.PlaceName = PlaceName;
    }

    public String getPlaceSmallDescription() {
        return PlaceSmallDescription;
    }

    private void setPlaceSmallDescription(String PlaceSmallDescription) {
        this.PlaceSmallDescription = PlaceSmallDescription;
    }

    public int getPlaceThumb() {
        return PlaceThumb;
    }

    private void setPlaceThumb(int PlaceThumb) {
        this.PlaceThumb = PlaceThumb;
    }

    public int[] getPlacePictures() {
        return PlacePictures;
    }

    private void setPlacePictures(int[] PlacePictures) {
        this.PlacePictures = PlacePictures;
    }


    public String getPlaceFullDescription() {
        return PlaceFullDescription;
    }

    private void setPlaceFullDescription(String PlaceFullDescription) {
        this.PlaceFullDescription = PlaceFullDescription;
    }


    public ArrayList<Place> getAllParks(Context context) {

        ArrayList<Place> listPlaces = new ArrayList<>();

        int[] iPlacePictures;

        Place place = new Place();

        place.setPlaceName(context.getString(R.string.pq_aguas_name));
        place.setPlaceThumb(R.drawable.ic_parque_das_aguas_thumb);
        place.setPlaceSmallDescription(context.getString(R.string.pq_aguas_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.pq_aguas_fulldescr));
        place.setPlaceAddress(context.getString(R.string.pq_aguas_address));
        iPlacePictures = new int[]{R.drawable.pic_parque_das_aguas1,R.drawable.pic_parque_das_aguas2,R.drawable.pic_parque_das_aguas3,
                R.drawable.pic_parque_das_aguas4,R.drawable.pic_parque_das_aguas5,R.drawable.pic_parque_das_aguas6,
                R.drawable.pic_parque_das_aguas7,R.drawable.pic_parque_das_aguas8,R.drawable.pic_parque_das_aguas9};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.chicomendes_name));
        place.setPlaceThumb(R.drawable.ic_chicomendes_thumb);
        place.setPlaceSmallDescription(context.getString(R.string.chicomendes_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.chicomendes_fulldescr));
        place.setPlaceAddress(context.getString(R.string.chicomendes_address));

        iPlacePictures = new int[]{R.drawable.pic_chico_mendes1, R.drawable.pic_chico_mendes2, R.drawable.pic_chico_mendes3,
                R.drawable.pic_chico_mendes4, R.drawable.pic_chico_mendes5, R.drawable.pic_chico_mendes6,
                R.drawable.pic_chico_mendes7, R.drawable.pic_chico_mendes8 };
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();
        place.setPlaceName(context.getString(R.string.quinzinho_name));
        place.setPlaceThumb(R.drawable.ic_zoologico_thumb);
        place.setPlaceSmallDescription(context.getString(R.string.quinzinho_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.quinzinho_fulldescr));

        place.setPlaceAddress(context.getString(R.string.quinzinho_address));

        iPlacePictures = new int[]{R.drawable.pic_quinzinho1,R.drawable.pic_quinzinho2,R.drawable.pic_quinzinho3,
                R.drawable.pic_quinzinho4,R.drawable.pic_quinzinho5, R.drawable.pic_quinzinho6, R.drawable.pic_quinzinho7};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);


        // New Item
        place = new Place();
        place.setPlaceName(context.getString(R.string.flona_name));
        place.setPlaceThumb(R.drawable.ic_thumb_fazendaipanema);
        place.setPlaceSmallDescription(context.getString(R.string.flona_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.flona_fulldescr));

        place.setPlaceAddress(context.getString(R.string.flona_address));

        iPlacePictures = new int[]{R.drawable.pic_fazendaipanema1,R.drawable.pic_fazendaipanema2,R.drawable.pic_fazendaipanema3,
                R.drawable.pic_fazendaipanema4,R.drawable.pic_fazendaipanema5,R.drawable.pic_fazendaipanema6, R.drawable.pic_fazendaipanema7,
                R.drawable.pic_fazendaipanema8,R.drawable.pic_fazendaipanema9,R.drawable.pic_fazendaipanema10,R.drawable.pic_fazendaipanema11,
                R.drawable.pic_fazendaipanema12,R.drawable.pic_fazendaipanema13};

        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        // New Item
        place = new Place();
        place.setPlaceName(context.getString(R.string.paco_name));
        place.setPlaceThumb(R.drawable.ic_thumb_paco);
        place.setPlaceSmallDescription(context.getString(R.string.paco_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.paco_fulldescr));

        place.setPlaceAddress(context.getString(R.string.paco_address));

        iPlacePictures = new int[]{R.drawable.pic_paco1,R.drawable.pic_paco2,R.drawable.pic_paco3,R.drawable.pic_paco4,R.drawable.pic_paco5,
                R.drawable.pic_paco6,R.drawable.pic_paco7,R.drawable.pic_paco8,R.drawable.pic_paco9,R.drawable.pic_paco10};

        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        // New Item
        place = new Place();
        place.setPlaceName(context.getString(R.string.jdbotanico_name));
        place.setPlaceThumb(R.drawable.ic_thumb_jardim_botanico);
        place.setPlaceSmallDescription(context.getString(R.string.jdbotanico_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.jdbotanico_fulldecr));

        place.setPlaceAddress(context.getString(R.string.jdbotanico_address));

        iPlacePictures = new int[]{R.drawable.pic_jardimbotanico1,R.drawable.pic_jardimbotanico2, R.drawable.pic_jardimbotanico3,
                R.drawable.pic_jardimbotanico4,R.drawable.pic_jardimbotanico5,R.drawable.pic_jardimbotanico6};

        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        // New Item
        place = new Place();
        place.setPlaceName(context.getString(R.string.campolim_name));
        place.setPlaceThumb(R.drawable.ic_thumb_campolim);
        place.setPlaceSmallDescription(context.getString(R.string.campolim_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.campolim_fulldescr));

        place.setPlaceAddress(context.getString(R.string.campolim_address));

        iPlacePictures = new int[]{R.drawable.pic_campolim1,R.drawable.pic_campolim2,R.drawable.pic_campolim3,R.drawable.pic_campolim4,
                R.drawable.pic_campolim5,R.drawable.pic_campolim6,R.drawable.pic_campolim7,R.drawable.pic_campolim8,R.drawable.pic_campolim9,
                R.drawable.pic_campolim10,R.drawable.pic_campolim11,R.drawable.pic_campolim12};

        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        // New Item
        place = new Place();
        place.setPlaceName(context.getString(R.string.ipiranga_name));
        place.setPlaceThumb(R.drawable.ic_thumb_ipiranga);
        place.setPlaceSmallDescription(context.getString(R.string.ipiranga_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.ipiranga_fulldescr));

        place.setPlaceAddress(context.getString(R.string.ipiranga_address));

        iPlacePictures = new int[]{R.drawable.pic_ipiranga1,R.drawable.pic_ipiranga2,R.drawable.pic_ipiranga3,R.drawable.pic_ipiranga4,
                R.drawable.pic_ipiranga5,R.drawable.pic_ipiranga6,R.drawable.pic_ipiranga7};

        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        // New Item
        place = new Place();
        place.setPlaceName(context.getString(R.string.agua_vermelha_name));
        place.setPlaceThumb(R.drawable.ic_thumb_aguavermelha);
        place.setPlaceSmallDescription(context.getString(R.string.agua_vermelha_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.agua_vermelha_fulldescr));

        place.setPlaceAddress(context.getString(R.string.agua_vermelha_address));

        iPlacePictures = new int[]{R.drawable.pic_aguavermelha1,R.drawable.pic_aguavermelha2,R.drawable.pic_aguavermelha3,
                R.drawable.pic_aguavermelha4,R.drawable.pic_aguavermelha5,R.drawable.pic_aguavermelha6};

        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        // New Item
        place = new Place();
        place.setPlaceName(context.getString(R.string.biquinha_name));
        place.setPlaceThumb(R.drawable.ic_thumb_biquinha);
        place.setPlaceSmallDescription(context.getString(R.string.biquinha_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.biquinha_fulldecr));

        place.setPlaceAddress(context.getString(R.string.biquinha_address));

        iPlacePictures = new int[]{R.drawable.pic_biquinha1,R.drawable.pic_biquinha2,R.drawable.pic_biquinha3,
                R.drawable.pic_biquinha4,R.drawable.pic_biquinha5,R.drawable.pic_biquinha6,R.drawable.pic_biquinha7};

        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        // New Item
        place = new Place();
        place.setPlaceName(context.getString(R.string.ourofino_name));
        place.setPlaceThumb(R.drawable.ic_thumb_ourofino);
        place.setPlaceSmallDescription(context.getString(R.string.ourofino_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.ourofino_fulldescr));

        place.setPlaceAddress(context.getString(R.string.ourofino_address));

        iPlacePictures = new int[]{R.drawable.pic_ourofino1,R.drawable.pic_ourofino2,R.drawable.pic_ourofino3,
                R.drawable.pic_ourofino4,R.drawable.pic_ourofino5,R.drawable.pic_ourofino6,R.drawable.pic_ourofino7};

        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        // New Item
        place = new Place();
        place.setPlaceName(context.getString(R.string.maru_name));
        place.setPlaceThumb(R.drawable.ic_thumb_kasatumaru);
        place.setPlaceSmallDescription(context.getString(R.string.maru_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.maru_fulldescr));

        place.setPlaceAddress(context.getString(R.string.maru_address));

        iPlacePictures = new int[]{R.drawable.pic_kasatumaru1,R.drawable.pic_kasatumaru2,R.drawable.pic_kasatumaru3,R.drawable.pic_kasatumaru4,
                R.drawable.pic_kasatumaru5,R.drawable.pic_kasatumaru6,R.drawable.pic_kasatumaru7,R.drawable.pic_kasatumaru8};

        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        // New Item
        place = new Place();
        place.setPlaceName(context.getString(R.string.stabarbara_name));
        place.setPlaceThumb(R.drawable.ic_thumb_santabarbara);
        place.setPlaceSmallDescription(context.getString(R.string.stabarbara_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.stabarbara_fulldescr));

        place.setPlaceAddress(context.getString(R.string.stabarbara_address));

        iPlacePictures = new int[]{R.drawable.pic_santabarbara1,R.drawable.pic_santabarbara2,R.drawable.pic_santabarbara3,
                R.drawable.pic_santabarbara4,R.drawable.pic_santabarbara5,R.drawable.pic_santabarbara6,R.drawable.pic_santabarbara7,
                R.drawable.pic_santabarbara8,R.drawable.pic_santabarbara9};

        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);


        return listPlaces;
    }

    public ArrayList<Place> getAllCulturePlaces(Context context) {

        ArrayList<Place> listPlaces = new ArrayList<>();

        int[] iPlacePictures;

        Place place = new Place();

        place.setPlaceName(context.getString(R.string.teatro_arena_name));
        place.setPlaceThumb(R.drawable.ic_thumb_teatro_arena);
        place.setPlaceSmallDescription(context.getString(R.string.teatro_arena_small_desc));
        place.setPlaceFullDescription(context.getString(R.string.teatro_arena_full_desc));
        place.setPlaceAddress(context.getString(R.string.teatro_arena_address));
        iPlacePictures = new int[]{R.drawable.pic_teatro_arena1, R.drawable.pic_teatro_arena2};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.tmtv_name));
        place.setPlaceThumb(R.drawable.ic_thumb_tmtv);
        place.setPlaceSmallDescription(context.getString(R.string.tmtv_small_desc));
        place.setPlaceFullDescription(context.getString(R.string.tmtv_full_desc));
        place.setPlaceAddress(context.getString(R.string.tmtv_address));
        iPlacePictures = new int[]{R.drawable.pic_tmtv1,R.drawable.pic_tmtv2,R.drawable.pic_tmtv3};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);


        place = new Place();

        place.setPlaceName(context.getString(R.string.gabinete_name));
        place.setPlaceThumb(R.drawable.pic_gabinete_leitura);
        place.setPlaceSmallDescription(context.getString(R.string.gabinete_smalldesc));
        place.setPlaceAddress(context.getString(R.string.gabinete_address));
        place.setPlaceFullDescription(context.getString(R.string.gabinete_fulldescr));
        iPlacePictures = new int[]{R.drawable.pic_gabinete_leitura};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);


        place = new Place();

        place.setPlaceName(context.getString(R.string.sesc_name));
        place.setPlaceThumb(R.drawable.pic_sesc1);
        place.setPlaceSmallDescription(context.getString(R.string.sesc_smalldesc));
        place.setPlaceFullDescription(context.getString(R.string.sesc_fulldesc));
        place.setPlaceAddress(context.getString(R.string.sesc_address));
        iPlacePictures = new int[]{R.drawable.pic_sesc1,R.drawable.pic_sesc2,R.drawable.pic_sesc3};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);


        place = new Place();

        place.setPlaceName(context.getString(R.string.sesi_name));
        place.setPlaceThumb(R.drawable.pic_sesi1);
        place.setPlaceSmallDescription(context.getString(R.string.sesi_smalldesc));
        place.setPlaceFullDescription(context.getString(R.string.sesi_fulldesc));
        place.setPlaceAddress(context.getString(R.string.sesi_address));
        iPlacePictures = new int[]{R.drawable.pic_sesi2,R.drawable.pic_sesi1,R.drawable.pic_sesi3,R.drawable.pic_sesi4};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);


        place = new Place();

        place.setPlaceName(context.getString(R.string.macs_name));
        place.setPlaceThumb(R.drawable.pic_macs1);
        place.setPlaceSmallDescription(context.getString(R.string.macs_smalldesc));
        place.setPlaceFullDescription(context.getString(R.string.macs_fulldesc));
        place.setPlaceAddress(context.getString(R.string.macs_address));
        iPlacePictures = new int[]{R.drawable.pic_macs1,R.drawable.pic_macs2,R.drawable.pic_macs3,R.drawable.pic_macs4};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);


        place = new Place();

        place.setPlaceName(context.getString(R.string.oficina_name));
        place.setPlaceThumb(R.drawable.pic_oficinacultural1);
        place.setPlaceSmallDescription(context.getString(R.string.oficina_smalldesc));
        place.setPlaceFullDescription(context.getString(R.string.oficina_fulldesc));
        place.setPlaceAddress(context.getString(R.string.oficina_address));
        iPlacePictures = new int[]{R.drawable.pic_oficinacultural1,R.drawable.pic_oficinacultural2};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);


        place = new Place();

        place.setPlaceName(context.getString(R.string.fundec_name));
        place.setPlaceThumb(R.drawable.pic_fundec1);
        place.setPlaceSmallDescription(context.getString(R.string.fundec_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.fundec_fulldescr));
        place.setPlaceAddress(context.getString(R.string.fundec_address));
        iPlacePictures = new int[]{R.drawable.pic_fundec1,R.drawable.pic_fundec2,R.drawable.pic_fundec3,R.drawable.pic_fundec4};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);


        place = new Place();

        place.setPlaceName(context.getString(R.string.bibliotecainfantil_name));
        place.setPlaceThumb(R.drawable.pic_bibliotaca_infantil1);
        place.setPlaceSmallDescription(context.getString(R.string.bibliotecainfantil_smallname));
        place.setPlaceFullDescription(context.getString(R.string.bibliotecainfantil_fulldescr));
        place.setPlaceAddress(context.getString(R.string.biliotecainfantil_address));
        iPlacePictures = new int[]{R.drawable.pic_bibliotaca_infantil1,R.drawable.pic_bibliotaca_infantil2,
                R.drawable.pic_bibliotaca_infantil3,R.drawable.pic_bibliotaca_infantil4};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.biblioteca_name));
        place.setPlaceThumb(R.drawable.biblioteca_municipal);
        place.setPlaceSmallDescription(context.getString(R.string.biblioteca_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.biblioteca_fulldesc));
        place.setPlaceAddress(context.getString(R.string.biblioteca_address));
        iPlacePictures = new int[]{R.drawable.pic_biblioteca1,R.drawable.pic_biblioteca2,R.drawable.pic_biblioteca3,
                R.drawable.pic_biblioteca4,R.drawable.pic_biblioteca5};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);


        place = new Place();

        place.setPlaceName(context.getString(R.string.cineplay_name));
        place.setPlaceThumb(R.drawable.cineplay);
        place.setPlaceSmallDescription(context.getString(R.string.cineplay_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.cineplay_fulldescr));
        place.setPlaceAddress(context.getString(R.string.cineplay_address));
        iPlacePictures = new int[]{R.drawable.cineplay};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.cinearaujo_name));
        place.setPlaceThumb(R.drawable.cinearaujo);
        place.setPlaceSmallDescription(context.getString(R.string.cinearaujo_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.cinearaujo_fulldescr));
        place.setPlaceAddress(context.getString(R.string.cinearaujo_address));
        iPlacePictures = new int[]{R.drawable.cinearaujo};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.multiplex_name));
        place.setPlaceThumb(R.drawable.multiplex_ciane);
        place.setPlaceSmallDescription(context.getString(R.string.multiplex_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.multiplex_fulldescr));
        place.setPlaceAddress(context.getString(R.string.multiplex_address));
        iPlacePictures = new int[]{R.drawable.multiplex_ciane};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.cinepolis_name));
        place.setPlaceThumb(R.drawable.cinepolis);
        place.setPlaceSmallDescription(context.getString(R.string.cinepolis_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.cinepolis_fulldescr));
        place.setPlaceAddress(context.getString(R.string.cinepolis_address));
        iPlacePictures = new int[]{R.drawable.cinepolis, R.drawable.cinepolis2};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        return listPlaces;
    }

    public ArrayList<Place> getAllHistoricalPlaces(Context context) {

        ArrayList<Place> listPlaces = new ArrayList<>();

        int[] iPlacePictures;

        Place place = new Place();

        place.setPlaceName(context.getString(R.string.scarpa_name));
        place.setPlaceThumb(R.drawable.pic_palacete_scarpa1);
        place.setPlaceSmallDescription(context.getString(R.string.scarpa_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.scarpa_fulldescr));
        place.setPlaceAddress(context.getString(R.string.scarpa_address));
        iPlacePictures = new int[]{R.drawable.pic_palacete_scarpa1,R.drawable.pic_palacete_scarpa2,R.drawable.pic_palacete_scarpa3};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.saobento_name));
        place.setPlaceThumb(R.drawable.mosteiro_saobento);
        place.setPlaceSmallDescription(context.getString(R.string.saobento_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.saobento_fulldescr));
        place.setPlaceAddress(context.getString(R.string.saobento_address));
        iPlacePictures = new int[]{R.drawable.mosteiro_saobento,R.drawable.mosteiro_saobento2,R.drawable.mosteiro_saobento3,
                R.drawable.mosteiro_saobento4,R.drawable.mosteiro_saobento5,};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.joao_camargo_name));
        place.setPlaceThumb(R.drawable.igreja_joao_de_camargo1);
        place.setPlaceSmallDescription(context.getString(R.string.joao_camargo_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.joao_camargo_fulldescr));
        place.setPlaceAddress(context.getString(R.string.joao_camargo_address));
        iPlacePictures = new int[]{R.drawable.igreja_joao_de_camargo1};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.catedral_name));
        place.setPlaceThumb(R.drawable.pic_catedral1);
        place.setPlaceSmallDescription(context.getString(R.string.catedral_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.catedral_fulldescr));
        place.setPlaceAddress(context.getString(R.string.catedral_address));
        iPlacePictures = new int[]{R.drawable.pic_catedral1,R.drawable.pic_catedral2,R.drawable.pic_catedral3,R.drawable.pic_catedral4,
                R.drawable.pic_catedral5,R.drawable.pic_catedral6,R.drawable.pic_catedral7};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.divino_name));
        place.setPlaceThumb(R.drawable.pic_divino1);
        place.setPlaceSmallDescription(context.getString(R.string.divino_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.divino_fulldescr));
        place.setPlaceAddress(context.getString(R.string.divino_address));
        iPlacePictures = new int[]{R.drawable.pic_divino2,R.drawable.pic_divino1,R.drawable.pic_divino3 };
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.moinho_name));
        place.setPlaceThumb(R.drawable.chacara_moinhovelho);
        place.setPlaceSmallDescription(context.getString(R.string.moinho_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.moinho_fulldescr));
        place.setPlaceAddress(context.getString(R.string.moinho_address));
        iPlacePictures = new int[]{R.drawable.chacara_moinhovelho};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.ciane_name));
        place.setPlaceThumb(R.drawable.pic_ciane1);
        place.setPlaceSmallDescription(context.getString(R.string.ciane_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.ciane_fulldescr));
        place.setPlaceAddress(context.getString(R.string.ciane_address));
        iPlacePictures = new int[]{R.drawable.pic_ciane1,R.drawable.pic_ciane2,R.drawable.pic_ciane3};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.museu_name));
        place.setPlaceThumb(R.drawable.pic_museuhistorico2);
        place.setPlaceSmallDescription(context.getString(R.string.museu_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.museu_fulldescr));
        place.setPlaceAddress(context.getString(R.string.museu_address));
        iPlacePictures = new int[]{R.drawable.pic_museuhistorico1,R.drawable.pic_museuhistorico2,R.drawable.pic_museuhistorico3,R.drawable.pic_museuhistorico4,
                R.drawable.pic_museuhistorico5,R.drawable.pic_museuhistorico6,R.drawable.pic_museuhistorico7};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.usina_name));
        place.setPlaceThumb(R.drawable.pic_usina1);
        place.setPlaceSmallDescription(context.getString(R.string.usina_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.usina_fulldescr));
        place.setPlaceAddress(context.getString(R.string.usina_address));
        iPlacePictures = new int[]{R.drawable.pic_usina1, R.drawable.pic_usina2, R.drawable.pic_usina3};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        place = new Place();

        place.setPlaceName(context.getString(R.string.estacao_name));
        place.setPlaceThumb(R.drawable.pic_ferroviaria1);
        place.setPlaceSmallDescription(context.getString(R.string.estacao_smalldescr));
        place.setPlaceFullDescription(context.getString(R.string.estacao_fulldescr));
        place.setPlaceAddress(context.getString(R.string.estacao_address));
        iPlacePictures = new int[]{R.drawable.pic_ferroviaria1, R.drawable.pic_ferroviaria2, R.drawable.pic_ferroviaria3,
                R.drawable.pic_ferroviaria4, R.drawable.pic_ferroviaria5,R.drawable.pic_ferroviaria6};
        place.setPlacePictures(iPlacePictures);

        listPlaces.add(place);

        return listPlaces;
    }

}
