# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ViSP standing for Visual Servoing Platform is a modular cross     platform libra"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "bzip2 cmake doxygen libcoin80-dev libdc1394-dev libdmtx-dev libfreenect-dev libjpeg liblapack-dev libogre-dev libois-dev libpng-dev libusb-dev libv4l-dev libx11-dev libxml2 opencv3 zbar"
SRC_URI = "https://github.com/lagadic/visp-release/archive/release/lunar/visp/3.0.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c034f7df00f934389bc4555d7646a929"
SRC_URI[sha256sum] = "5d8ed9a5d30cca3cac5f11b4b48de2cc37089d99f52e1ba68a858c43bd6a397c"
S = "${WORKDIR}/visp-release-release-lunar-visp-3.0.1-2"

inherit catkin
