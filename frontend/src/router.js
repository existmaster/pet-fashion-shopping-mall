
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PetFashionMemberManagementPetProfileManager from "./components/listers/PetFashionMemberManagementPetProfileCards"
import PetFashionMemberManagementPetProfileDetail from "./components/listers/PetFashionMemberManagementPetProfileDetail"

import ProductManagementProductManager from "./components/listers/ProductManagementProductCards"
import ProductManagementProductDetail from "./components/listers/ProductManagementProductDetail"

import MembershipManagementMemberManager from "./components/listers/MembershipManagementMemberCards"
import MembershipManagementMemberDetail from "./components/listers/MembershipManagementMemberDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/petFashionMemberManagements/petProfiles',
                name: 'PetFashionMemberManagementPetProfileManager',
                component: PetFashionMemberManagementPetProfileManager
            },
            {
                path: '/petFashionMemberManagements/petProfiles/:id',
                name: 'PetFashionMemberManagementPetProfileDetail',
                component: PetFashionMemberManagementPetProfileDetail
            },

            {
                path: '/productManagements/products',
                name: 'ProductManagementProductManager',
                component: ProductManagementProductManager
            },
            {
                path: '/productManagements/products/:id',
                name: 'ProductManagementProductDetail',
                component: ProductManagementProductDetail
            },

            {
                path: '/membershipManagements/members',
                name: 'MembershipManagementMemberManager',
                component: MembershipManagementMemberManager
            },
            {
                path: '/membershipManagements/members/:id',
                name: 'MembershipManagementMemberDetail',
                component: MembershipManagementMemberDetail
            },




    ]
})
