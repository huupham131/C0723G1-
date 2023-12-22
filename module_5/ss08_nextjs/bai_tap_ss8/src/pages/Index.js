import axios from 'axios';

export async function getStaticProps() {
    return {
        props: {
            data: [
                {
                    "Country": "Viet Nam",
                    "CountryCode": "",
                    "Province": "",
                    "City": "",
                    "CityCode": "",
                    "Lat": "0",
                    "Lon": "0",
                    "Confirmed": 0,
                    "Deaths": 0,
                    "Recovered": 0,
                    "Active": 0,
                    "Date": "2020-01-22T00:00:00Z"
                },
            ],
        },
    };
}

const Page = ({ data }) => {
    return (
        <div>
            <h1>Vietnam COVID-19 Information</h1>
            <table>
                <thead>
                <tr>
                    <th>Date</th>
                    <th>Confirmed</th>
                    <th>Active</th>
                    <th>Recovered</th>
                    <th>Deaths</th>
                </tr>
                </thead>
                <tbody>
                {data.map((props) => (
                    <tr key={props.Date}>
                        <td>{props.Date}</td>
                        <td>{props.Confirmed}</td>
                        <td>{props.Active}</td>
                        <td>{props.Recovered}</td>
                        <td>{props.Deaths}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
};

export default Page;