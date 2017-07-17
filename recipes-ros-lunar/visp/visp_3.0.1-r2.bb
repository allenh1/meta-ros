# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ViSP standing for Visual Servoing Platform is a modular cross
    platform libra"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "bzip2 cmake doxygen libcoin80-dev libdc1394-dev libdmtx-dev libfreenect-dev libjpeg liblapack-dev libogre-dev libois-dev libpng-dev libusb-dev libv4l-dev libx11-dev libxml2 opencv3 zbar"
SRC_URI = "https://github.com/lagadic/visp-release/archive/release/lunar/visp/3.0.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "64193abaa0999fd6f6da479f78be7a07"
SRC_URI[sha256sum] = "48a4ac8a324a43afbe68842a6fed90d45a067c88c760a86935b74cd8d4c9d534"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
