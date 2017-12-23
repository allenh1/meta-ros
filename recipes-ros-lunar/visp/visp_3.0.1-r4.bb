# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ViSP standing for Visual Servoing Platform is a modular cross     platform libra"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "bzip2 cmake doxygen libcoin80-dev libdc1394-dev libdmtx-dev libfreenect-dev libjpeg liblapack-dev libogre-dev libois-dev libpng-dev libusb-dev libv4l-dev libx11-dev libxml2 opencv3 zbar"
SRC_URI = "https://github.com/lagadic/${PN}-release/archive/release/lunar/${PN}/3.0.1-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "29ce9601c8ef01abcea9b22485d169e8"
SRC_URI[sha256sum] = "dd029aa9afe99d6c5e64796960f7f790407de3d1f02aef034d311263f0b58e19"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-3.0.1-4"

inherit catkin
