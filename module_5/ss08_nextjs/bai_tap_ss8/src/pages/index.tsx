import Image from 'next/image'
import { Inter } from 'next/font/google'
import Page from "@/pages/components/Home";
import  getStaticProps from '@/pages/index';

const inter = Inter({ subsets: ['latin'] })

export default function Home() {
  return (
    <Page data={getStaticProps} />
  )
}
