
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PetProfileManager from "./components/ui/PetProfileGrid"
import AllergySizeInfoManager from "./components/ui/AllergySizeInfoGrid"

import ProductManager from "./components/ui/ProductGrid"

import MemberManager from "./components/ui/MemberGrid"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/petProfiles',
                name: 'PetProfileManager',
                component: PetProfileManager
            },
            {
                path: '/allergySizeInfos',
                name: 'AllergySizeInfoManager',
                component: AllergySizeInfoManager
            },

            {
                path: '/products',
                name: 'ProductManager',
                component: ProductManager
            },

            {
                path: '/members',
                name: 'MemberManager',
                component: MemberManager
            },



    ]
})
