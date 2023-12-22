import Image from 'next/image'
import { Inter } from 'next/font/google'
import  getStaticProps from '@/pages/index';
import Covid from "@/pages/components/Covid";

const inter = Inter({ subsets: ['latin'] })

export default function Home() {
  return (
    <Covid data={getStaticProps} />
  )
}
