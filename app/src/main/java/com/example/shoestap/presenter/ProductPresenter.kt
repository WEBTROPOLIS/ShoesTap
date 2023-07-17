package com.example.shoestap.presenter

import com.example.shoestap.model.Item
import com.example.shoestap.view.ProductContract

class ProductPresenter(private val view: ProductContract.View) : ProductContract.Presenter {
    private val itemList: MutableList<Item> = mutableListOf()

    override fun getProducts() {
        itemList.addAll(creaDatos())
        view.showProducts(itemList)
    }

    private fun creaDatos(): List<Item> {
        val dataList = mutableListOf<Item>()

        dataList.add(Item("https://store.bluepadel.cl/cdn/shop/products/asics-zapatillas-pro-5-1041a302-401-gel-padel.jpg", "Zapatilla Azul", "Padel Men Nuevas sin olor", 40.0f))
        dataList.add(Item("https://store.bluepadel.cl/cdn/shop/files/3_1_d1824488-5aa2-451e-adfb-08a5183578fa.png", "Zapatilla Mujer", "Padel Woman Nuevas sin olor", 80.0f))
        dataList.add(Item("https://store.bluepadel.cl/cdn/shop/files/ezgif-2-3ddad07dfe.jpg", "Zapatilla 3", "Padel Unisex Nuevas sin olor", 20.6f))
        dataList.add(Item("https://traukochile.cl/cdn/shop/products/Sanhattan_Cafe_1_1f41acb3-6ad6-4e2e-960b-82180a237dea_1484x1484.png", "Zapato Cuero", "Casi Nuevo con olor", 10.0f))
        dataList.add(Item("https://traukochile.cl/cdn/shop/products/Milano_Negro_1_647c07db-3f03-4eda-8b42-1b08ee797714_700x.png", "Zapato Cuero Alto", "Nuevos sin olor", 89.0f))
        dataList.add(Item("https://traukochile.cl/cdn/shop/files/DSC07191_700x.png", "Confort Line", "Nuevas sin olor", 50.0f))
        dataList.add(Item("https://traukochile.cl/cdn/shop/files/DSC07194_86c28f57-1ed9-4633-9bfd-1e65a3a163f1_1482x1482.png", "Botin Mujer", "Nuevas sin olor", 79.0f))
        dataList.add(Item("https://traukochile.cl/cdn/shop/files/DSC07193_700x.png", "Botin Torino Mujer", "Casi Nuevos con olor", 67.0f))
        dataList.add(Item("https://www.pz.cl/89030-thickbox_default/botin-nino-22-al-27.jpg", "Panama Jack Niño ", "Nuevas sin olor", 23.0f))
        dataList.add(Item("https://www.pz.cl/87493-thickbox_default/bota-nina-22-al-27.jpg", "Bota Panama Jack Niña ", "Nuevas sin olor", 45.0f))

        return dataList
    }

}

