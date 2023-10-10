
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PetProfileManager from "./components/ui/PetProfileGrid"

import ProductManager from "./components/ui/ProductGrid"

import MemberManager from "./components/ui/MemberGrid"

import MarketingManager from "./components/ui/MarketingGrid"

import PetInformationView from "./components/PetInformationView"

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
                path: '/products',
                name: 'ProductManager',
                component: ProductManager
            },

            {
                path: '/members',
                name: 'MemberManager',
                component: MemberManager
            },

            {
                path: '/marketings',
                name: 'MarketingManager',
                component: MarketingManager
            },


            {
                path: '/petInformations',
                name: 'PetInformationView',
                component: PetInformationView
            },


    ]
})
