# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ViSP standing for Visual Servoing Platform is a modular cross     platform libra"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "bzip2 cmake doxygen libcoin80-dev libdc1394-dev libdmtx-dev libfreenect-dev libjpeg liblapack-dev libogre-dev libois-dev libpng12-dev libusb-dev libv4l-dev libx11-dev libxml2 opencv3 zbar"
SRC_URI = "https://github.com/lagadic/${PN}-release/archive/release/kinetic/${PN}/3.0.1-6.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "79fb9b3b09ac6f3540561d351be828d4"
SRC_URI[sha256sum] = "cecf0bdcbdd4f968327bfe29cf3eb9076888ab5df13cf0c484a16900d0c43fcc"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-3.0.1-6"

inherit catkin
