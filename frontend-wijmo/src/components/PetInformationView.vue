
<template>

    <v-data-table
        :headers="headers"
        :items="petInformation"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'PetInformationView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "memberId", value: "memberId" },
                { text: "allergies", value: "allergies" },
                { text: "neckCircumference", value: "neckCircumference" },
                { text: "chestCircumference", value: "chestCircumference" },
            ],
            petInformation : [],
        }),
        async created() {
            var me = this;
            setInterval(function(){me.load()}, 1000);
        },
        methods: {
            async load() {
                var temp = await axios.get(axios.fixUrl('/petInformations'))

                temp.data._embedded.petInformations.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

                this.petInformation = temp.data._embedded.petInformations;
            }
        }
    }
</script>

