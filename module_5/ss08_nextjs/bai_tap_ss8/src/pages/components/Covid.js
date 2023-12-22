import axios from 'axios';

export async function getStaticProps() {
    try {
        const response = await axios.get('https://api.covid19api.com/total/country/vietnam');
        const covids = response.data                    ;


        return {
            props: {
                covids: covids
            },
        };
    } catch (error) {
        console.error('Dữ liệu ko có', error.message);
        return {
            props: {
                covids: [],
            },
        };
    }
}

const Covid = ({ data }) => {
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

export default Covid;