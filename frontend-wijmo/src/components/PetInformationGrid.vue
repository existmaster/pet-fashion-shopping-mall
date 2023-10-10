<template>
    <div>
        <v-data-table
                :headers="headers"
                :items="value"
                :items-per-page="5"
                class="elevation-1"
        ></v-data-table>
    </div>
</template>

<script>
    import BaseUIGrid from './base-ui/BaseUIGrid';

    export default {
        mixins: [BaseUIGrid],
        name: 'PetInformation-PetInformation',
        data: () => ({
            headers: [
                {
                    text: 'id',
                    value: 'id'
                },
                {
                    text: 'memberId',
                    value: 'memberId'
                },
                {
                    text: 'allergies',
                    value: 'allergies'
                },
                {
                    text: 'neckCircumference',
                    value: 'neckCircumference'
                },
                {
                    text: 'chestCircumference',
                    value: 'chestCircumference'
                },
                {
                    text: 'Allergies',
                    value: 'Allergies'
                },
            ],
        }),
        async created() {
            const path = "petInformations"
            await this.getValue(path);
        },
    }
</script>

